package com.fivebb.selfcare.activities

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import com.fivebb.selfcare.R
import com.fivebb.selfcare.adapters.BankAdapter
import com.fivebb.selfcare.mvp.presenters.AdvTopUpPresenter
import com.fivebb.selfcare.mvp.views.AdvTopUpView
import com.fivebb.selfcare.mvp.views.BankListView
import com.fivebb.selfcare.network.requests.AYAPayRequest
import com.fivebb.selfcare.network.requests.CitizenPayRequest
import com.fivebb.selfcare.network.requests.KBZPreCreateRequest
import com.fivebb.selfcare.network.requests.WavePayRequest
import com.fivebb.selfcare.network.responses.*
import com.fivebb.selfcare.utils.*
import com.fivebb.shared.vos.AdvPlanListVO
import com.fivebb.shared.vos.BankVO
import com.fivebb.shared.vos.CurrentPlanVO
import com.fivebb.shared.vos.PlanPriceListVO
import com.google.android.material.snackbar.Snackbar
import com.kbzbank.payment.KBZPay
import io.reactivex.Flowable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_invoice_payment.*
import kotlinx.android.synthetic.main.aty_choose_adv_month.rvBank
import kotlinx.android.synthetic.main.aty_choose_bank.*
import kotlinx.android.synthetic.main.aty_choose_bank.btnOpenMobileBankingApp
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*
import java.util.concurrent.TimeUnit


class ChooseBankActivity : ApplicationBaseActivity() ,AdvTopUpView,BankListView{
    private lateinit var mBankAdapter: BankAdapter
    private lateinit var mPresenter: AdvTopUpPresenter
    private  var mCurrentPlan: CurrentPlanVO = CurrentPlanVO()
    private var timeStamp : String = ""
    private var advID: String = ""
    private var mUnpaidAmount: String = ""
    private var billNo: String = ""
    private var orderID: String = ""
    private var totalAmt : Double = 0.0
    var disposables: CompositeDisposable ?= null

    companion object {
        fun newIntent(context: Context, advPlanListVO: AdvPlanListVO)
        {
            val intent = Intent(context, ChooseBankActivity::class.java)
            intent.putExtra("plan_list", advPlanListVO)
            context.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.aty_choose_bank)
        initListeners()
        initPresenter()
        btnOpenMobileBankingApp.visibility = View.INVISIBLE
        setUpRecyclerView()
        mPresenter.getAdvPayMonth()
        mPresenter.loadBankList()

    }

    private fun showData()
    {
        val advPlanListVO = SharedPreferenceUtils.getAdvPlanVO(this)
        if(mCurrentPlan.adv_id != 0)
        {
                lblPlan.text = mCurrentPlan.promo_name_eng
                txtAmount.text = mCurrentPlan.totAmt
                mUnpaidAmount = mCurrentPlan.totAmt.toString()

        }else{
            // val advPlanListVO = intent.getParcelableExtra<AdvPlanListVO>("plan_list")

            lblPlan.text = advPlanListVO?.promo_name_eng
            txtAmount.text = advPlanListVO?.totAmt
            mUnpaidAmount = advPlanListVO?.calTotAmt.toString()
            totalAmt = mUnpaidAmount.toDouble()
            /*  Log.i("mUnpaidAmount", "showData: " + mUnpaidAmount)
              Log.i("TotalAmount", "showData: " + totalAmt)*/
        }
    }

    override fun onBackPressed() {

    }
    private fun setUpRecyclerView() {
        mBankAdapter = BankAdapter(mPresenter)
        rvBank.layoutManager = GridLayoutManager(
            applicationContext,
            3,
            GridLayoutManager.VERTICAL,
            false
        )
        rvBank.adapter = mBankAdapter
    }

    private fun initPresenter() {
        mPresenter = ViewModelProviders.of(this).get(AdvTopUpPresenter::class.java)
        mPresenter.initPresenter(this)
    }

    private fun initListeners() {

        btnEdit.setOnClickListener {
            finish()
        }
        btnCancel.setOnClickListener {
            val actionType = "Cancel"
            SharedPreferenceUtils.saveActionType(this, actionType)
            mPresenter.takePlanAction()
          /*  SharedPreferenceUtils.deleteActionType(this)
            SharedPreferenceUtils.deleteBankForPayment(this)
            SharedPreferenceUtils.deleteAdvID(this)
            SharedPreferenceUtils.deletePlanID(this)
            SharedPreferenceUtils.deleteAdvPlan(this)
            val intent = Intent(applicationContext, HomeActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK //or Intent.FLAG_ACTIVITY_NEW_TASK
            finish()
            startActivity(intent)*/
        }

    }

    override fun status(status: String) {
        if (status == "Already Received Payment! Not allowed to cancel.") {
            val alertDialog: AlertDialog = AlertDialog.Builder(this)
                .setIcon(R.drawable.ic_error_outline_24dp)
                .setTitle(R.string.lbl_app_title)
                .setMessage(R.string.cancel_status)
                .setPositiveButton(
                    "OK"
                ) { dialog, i ->
                    SharedPreferenceUtils.deleteActionType(this)
                    SharedPreferenceUtils.deleteBankForPayment(this)
                    SharedPreferenceUtils.deleteAdvID(this)
                    SharedPreferenceUtils.deletePlanID(this)
                    SharedPreferenceUtils.deleteAdvPlan(this)//set what would happen when positive button is clicked
                    val intent = Intent(applicationContext, HomeActivity::class.java)
                    intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK //or Intent.FLAG_ACTIVITY_NEW_TASK
                    finish()
                    startActivity(intent)
                }
                .show()
        }else if (status =="Cancel Successful!"){
            SharedPreferenceUtils.deleteActionType(this)
            SharedPreferenceUtils.deleteBankForPayment(this)
            SharedPreferenceUtils.deleteAdvID(this)
            SharedPreferenceUtils.deletePlanID(this)
            SharedPreferenceUtils.deleteAdvPlan(this)
            val intent = Intent(applicationContext, HomeActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK //or Intent.FLAG_ACTIVITY_NEW_TASK
            finish()
            startActivity(intent)
        }
    }

    override fun getContext(): Context {
       return applicationContext
    }

    override fun showAllBank(data: MutableList<BankVO>) {
        mBankAdapter.setNewData(data)
    }

    override fun showSelectedBankInfo(data: BankVO) {
        btnOpenMobileBankingApp.visibility = View.VISIBLE
        btnOpenMobileBankingApp.text = resources.getString(data.actionText)
        btnOpenMobileBankingApp.setOnClickListener {
            btnOpenMobileBankingApp.isClickable = false
            timeStamp = createTimestamp()
            advID =  SharedPreferenceUtils.getAdvPaymentId(this)
             billNo =advID + timeStamp
            val strDate = getCurrentDateString()
             orderID = advID + timeStamp + strDate

            when (data.code) {
                KBZ_PAY -> {
                    SharedPreferenceUtils.saveBankForPayment(this, "KBZ_PAY")
                }
                AYA_PAY->{
                    SharedPreferenceUtils.saveBankForPayment(this, "AYA_PAY")
                }
                CITIZEN_PAY -> {
                    SharedPreferenceUtils.saveBankForPayment(this, "CITIZENS_PAY")
                }
                WAVE_PAY -> {
                    SharedPreferenceUtils.saveBankForPayment(this, "WAVE_PAY")
                }
                else -> {
                    SharedPreferenceUtils.saveBankForPayment(this, "")
                }
            }
            SharedPreferenceUtils.saveOrderId(this, billNo)
            mPresenter.takePlanAction()

            when {
                data.packageName == KBZ_PAY_PACKAGE_NAME || data.code == KBZ_PAY ->
                    mPresenter.onTapPayWithKBZPay(
                        KBZPreCreateRequest(
                            SharedPreferenceUtils.getAccountId(this),
                            SharedPreferenceUtils.getName(this),
                            SharedPreferenceUtils.getBillMonth(this),
                            billNo,
                            orderID,
                            totalAmt
                        )
                    )
                data.packageName == AYA_PAY || data.code == AYA_PAY->
                    showPhBoxForAYAPay()

                data.packageName == CITIZEN_PACKAGE_NAME || data.code == CITIZEN_PAY ->
                    mPresenter.onPayWithCitizen(
                        CitizenPayRequest(
                            SharedPreferenceUtils.getAccountId(this),
                            SharedPreferenceUtils.getName(this),
                            SharedPreferenceUtils.getBillMonth(this),
                            billNo,
                            orderID,
                            totalAmt
                        )
                    )

                data.packageName == WAVE_MONEY_PACKAGE_NAME || data.code == WAVE_PAY ->
                    mPresenter.onTapWavePayRequest(
                        WavePayRequest(
                            SharedPreferenceUtils.getAccountId(this),
                            SharedPreferenceUtils.getName(this),
                            SharedPreferenceUtils.getBillMonth(this),
                            billNo,
                            orderID,
                            totalAmt
                        )
                    )

                else -> { // Note the block
                        try {
                            startActivity(packageManager.getLaunchIntentForPackage(data.packageName))
                            btnOpenMobileBankingApp.isClickable = true

                        } catch (e: Exception) {
                            Snackbar.make(
                                btnOpenMobileBankingApp,
                                getString(R.string.msg_app_not_found),
                                Snackbar.LENGTH_SHORT
                            ).show()
                            btnOpenMobileBankingApp.isClickable = true
                        }
                }

            }
        }
    }
    private fun showPhBoxForAYAPay()
    {
        //Toast.makeText(applicationContext,"Clicked Add/New",Toast.LENGTH_SHORT).show()
        val alertDialog = AlertDialog.Builder(this)
        val customLayout: View = LayoutInflater.from(this).inflate(R.layout.add_aya_pay_phno, null)
        alertDialog.setView(customLayout)
        val alert = alertDialog.create()
        alert.setIcon(R.drawable.logo)
        alert.setTitle("5BB")
        alert.setCancelable(false)
        alert.setCanceledOnTouchOutside(false)

        val editText = customLayout.findViewById<EditText>(R.id.etMessage)
        val submitBtn: Button = customLayout.findViewById(R.id.btnOK)
        val cancelBtn: Button = customLayout.findViewById(R.id.btnCancel)
        submitBtn.setOnClickListener {
            if (editText.text.isNotEmpty() && editText.text.startsWith("0")) {
                val ayaPh = editText.text.toString()
                mPresenter.onTapPayWithAYAPay(
                    AYAPayRequest(
                        SharedPreferenceUtils.getAccountId(this),
                        SharedPreferenceUtils.getName(this),
                        SharedPreferenceUtils.getBillMonth(this),
                        billNo,
                        orderID,
                        totalAmt,
                        ayaPh
                    )
                )
            } else{
                Toast.makeText(this, getString(R.string.you_need_to_fill_aya_pay_no), Toast.LENGTH_SHORT).show()
            }
            //  Log.i("TAG", "Email Response: $userText")
            alert.dismiss()
        }
        cancelBtn.setOnClickListener {
            alert.dismiss()
        }
        alert.show()
    }

   private fun createTimestamp(): String {
        val cal = Calendar.getInstance()
        val time = cal.time.time / 1000
        return time.toString()
    }

    private fun getCurrentDateString():String {

        val date = Calendar.getInstance().time
        val dateFormat: DateFormat = SimpleDateFormat("yyMMddHHmmss", Locale.ENGLISH)
        return dateFormat.format(date)
        Log.i("date", dateFormat.format(date))
    }

    override fun showKBZPayAPP(data: KBZOrderInfoResponse) {
        data.orderInfo?.let {
            val orderInfo = createOrderInfo(data)
            Log.e("Mi4c_startpay_orderInfo", orderInfo)
            Log.e("Mi4c_startpay_sign", data.sign)
            Log.e("Mi4c_startpay_signType", data.signType)
            Log.e("Mi4C_decrypt", orderInfo + "-----" + data.sign + "-----" + data.signType)
            Log.e(
                "Mi4C_decrypt",
                "------------------------------------------------------------------------------------"
            )
            KBZPay.startPay(this, orderInfo, data.sign, data.signType)
        }
    }

    @SuppressLint("SetTextI18n")
    override fun getPlanPriceList(data: PlanPriceListVO) {
       mCurrentPlan = data.currentPlanVO!!
        Log.i("Adv ID", mCurrentPlan.adv_id.toString())
        lblPlan.text = mCurrentPlan.promo_name_eng
        txtAmount.text = mCurrentPlan.totAmt
        if(mCurrentPlan.taxPercentage != 0)
        {
           // lblTaxNote.text = mCurrentPlan.taxAmt + "-" + mCurrentPlan.taxPercentage.toString() + "% commercial Tax"
            lblTaxNote.text = mCurrentPlan.taxPercentage.toString() + "% Commercial Tax" + " - " + mCurrentPlan.taxAmt
        }else{
            lblTaxNote.visibility = View.GONE
        }

        val amt = mCurrentPlan.totAmt
        var splitAmt = amt?.substringBefore(" MMK");
        val replace: String = splitAmt!!.replace(",", "")
        totalAmt = replace.toDouble()
//        SharedPreferenceUtils.saveAdvCurrentPlanVO(this,mCurrentPlan)
        SharedPreferenceUtils.savePlanIdForAdvance(this, mCurrentPlan.id.toString())
        SharedPreferenceUtils.saveAdvPaymentId(this, mCurrentPlan.adv_id.toString())
    }

    override fun goToBank() {
    }

    override fun chooseToPlan() {
        val intent = Intent(this, ChooseAdvMonthActivity::class.java)
        intent.putExtra("data", mCurrentPlan)
        startActivity(intent)
    }

    override fun ayaPayLink(data: AYARequestPushPaymentResponse) {
        val openLinkIntent = Intent(Intent.ACTION_VIEW, Uri.parse(data.url))
        startActivity(openLinkIntent)
    }

    @SuppressLint("CheckResult")
    override fun requestQueryOrderAYAPay(data: AYAPayRequest) {
        Flowable.interval(7,TimeUnit.SECONDS)
            .take(5)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(){
                mPresenter.aYAPayQueryOrder(data)
            }
    }

    override fun responseOfAYAPay(message: String) {
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show()
    }

    @SuppressLint("CheckResult")
    override fun queryOrderAYAPay(data: AYAQueryOrderResponse) {
       if(data.status == "done")
       {
           Flowable.timer(1,TimeUnit.SECONDS)
               .subscribeOn(Schedulers.io())
               .observeOn(AndroidSchedulers.mainThread())
               .subscribe(){
                   Log.d("IntervalDelay","Delay 3 sec")
                   finish()
                   disposables?.dispose()
               }
       }
    }

    @SuppressLint("SetJavaScriptEnabled")
    override fun mcfPayPaymentLink(data: CitizenPayResponse) {
        webViewPay.visibility = View.VISIBLE
        webViewPay.settings.javaScriptEnabled = true
        webViewPay.settings.loadWithOverviewMode = true
        webViewPay.settings.useWideViewPort = true
        webViewPay.settings.domStorageEnabled = true
        webViewPay.settings.builtInZoomControls = true;
        webViewPay.settings.displayZoomControls = false;
        webViewPay.settings.javaScriptCanOpenWindowsAutomatically = true
        webViewPay.webViewClient = object : WebViewClient() {
            @Deprecated("Deprecated in Java")
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                if (url != null) {
                    view?.loadUrl(url)
                }
                return true
            }
        }
        webViewPay.loadUrl(data.paymentGatewayUrl)
    }

    @SuppressLint("CheckResult")
    override fun citizenPaymentRetrieveStatus(response: CitizenRetrieveResponse) {
        Log.i("Status", "citizenPaymentRetrieveStatus: " + response.contextStatus)
        val expiredTime  = response.expiryTime
        val systemCurrentTime = System.currentTimeMillis()
        when(response.contextStatus){
            "APPROVED" -> Flowable.timer(3, TimeUnit.SECONDS)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe() {
                    mPresenter.takePlanAction()
                    SharedPreferenceUtils.deleteActionType(this)
                    SharedPreferenceUtils.deleteBankForPayment(this)
                    SharedPreferenceUtils.deleteAdvID(this)
                    SharedPreferenceUtils.deletePlanID(this)
                    SharedPreferenceUtils.deleteOrderID(this)
                    SharedPreferenceUtils.deleteAdvPlan(this)
                    onDestroy()
                }

            "CANCELLED" -> Flowable.timer(3, TimeUnit.SECONDS)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe() {
                    val actionType = "Cancel"
                    SharedPreferenceUtils.saveActionType(this, actionType)
                    mPresenter.takePlanAction()
                    SharedPreferenceUtils.deleteActionType(this)
                    SharedPreferenceUtils.deleteBankForPayment(this)
                    SharedPreferenceUtils.deleteAdvID(this)
                    SharedPreferenceUtils.deletePlanID(this)
                    SharedPreferenceUtils.deleteOrderID(this)
                    SharedPreferenceUtils.deleteAdvPlan(this)
                    onDestroy()
                }
            else->{
                if(expiredTime < systemCurrentTime)
                {
                    Flowable.timer(3, TimeUnit.SECONDS)
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(){
                           onDestroy()
                        }
                }
            }
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        disposables?.clear()
    }

    @SuppressLint("CheckResult")
    override fun callPayRetrieveStatus(status: CitizenPayRequest) {
         Flowable.interval(10, TimeUnit.SECONDS)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(){
                Log.d("Interval recall", "10 sec")
               mPresenter.citizenPaymentRetrieve(status)
            }
    }

    @SuppressLint("CheckResult","SetJavaScriptEnabled")
    override fun requestWavePayResponse(data: WavePayResponse) {
        webViewPay.visibility = View.VISIBLE
        webViewPay.settings.javaScriptEnabled = true
        webViewPay.settings.loadWithOverviewMode = true
        webViewPay.settings.useWideViewPort = true
        webViewPay.settings.domStorageEnabled = true
        webViewPay.settings.javaScriptCanOpenWindowsAutomatically = true
        webViewPay.webViewClient = object : WebViewClient() {
            @Deprecated("Deprecated in Java")
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                if (url != null) {
                    view?.loadUrl(url)
                }
                return true
            }
        }
        webViewPay.loadUrl(data.paymentGatewayUrl)
    }

    @SuppressLint("CheckResult")
    override fun requestQueryOrderWPay(data: WavePayRequest) {
        Flowable.interval(20,70,java.util.concurrent.TimeUnit.SECONDS)
            .take(6)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(){
                mPresenter.wPayQueryOrder(data)
            }
    }

    @SuppressLint("CheckResult")
    override fun queryOrderWPay(data: WaveQueryOrderResponse) {
        when(data.status){
            "PAYMENT_CONFIRMED"->{
                Flowable.timer(3,java.util.concurrent.TimeUnit.SECONDS)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(){
                        Log.d("IntervalDelay","Delay 3 sec")
                        finish()
                        disposables?.dispose()
                    }
            }
            "TRANSACTION_TIMED_OUT"->{
                Flowable.timer(3,java.util.concurrent.TimeUnit.SECONDS)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(){
                        Log.d("IntervalDelay","Delay 3 sec")
                        finish()
                        disposables?.dispose()
                    }
            }
            "INSUFFICIENT_BALANCE"->{
                Flowable.timer(3,java.util.concurrent.TimeUnit.SECONDS)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(){
                        Log.d("IntervalDelay","Delay 3 sec")
                        finish()
                        disposables?.dispose()
                    }
            }
            "ACCOUNT_LOCKED"->{
                Flowable.timer(3,java.util.concurrent.TimeUnit.SECONDS)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(){
                        Log.d("IntervalDelay","Delay 3 sec")
                        finish()
                        disposables?.dispose()
                    }
            }
            "BILL_COLLECTION_FAILED"->{
                Flowable.timer(3,java.util.concurrent.TimeUnit.SECONDS)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(){
                        Log.d("IntervalDelay","Delay 3 sec")
                        finish()
                        disposables?.dispose()
                    }
            }
            "PAYMENT_REQUEST_CANCELLED"->{
                Flowable.timer(3,java.util.concurrent.TimeUnit.SECONDS)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(){
                        Log.d("IntervalDelay","Delay 3 sec")
                        finish()
                        disposables?.dispose()
                    }
            }
            "SCHEDULER_TRANSACTION_TIMED_OUT"->{
                Flowable.timer(3,java.util.concurrent.TimeUnit.SECONDS)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(){
                        Log.d("IntervalDelay","Delay 3 sec")
                        finish()
                        disposables?.dispose()
                    }
            }
        }
    }
    private fun createOrderInfo(data: KBZOrderInfoResponse):String{

        val prepayID = data.orderInfo?.prepayID
        val merchCode = data.orderInfo?.merchCode
        val appID = data.orderInfo?.appID
        val nonceStr = data.orderInfo?.nonceStr

        return "appid=" + appID +
                "&merch_code=" + merchCode +
                "&nonce_str=" + nonceStr +
                "&prepay_id=" + prepayID +
                "&timestamp=" + data.timestamp
    }

    override fun onResume() {
        super.onResume()
        btnOpenMobileBankingApp.isClickable = true

    }
}




