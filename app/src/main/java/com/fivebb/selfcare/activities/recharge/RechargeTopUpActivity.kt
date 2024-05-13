package com.fivebb.selfcare.activities.recharge

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.util.Patterns
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
import com.fivebb.selfcare.activities.ApplicationBaseActivity
import com.fivebb.selfcare.activities.HomeActivity
import com.fivebb.selfcare.adapters.BankAdapter
import com.fivebb.selfcare.mvp.presenters.RechargeTopUpPresenter
import com.fivebb.selfcare.mvp.views.BankListView
import com.fivebb.selfcare.mvp.views.RechargeTopUpView
import com.fivebb.selfcare.network.requests.AYAPayRequest
import com.fivebb.selfcare.network.requests.CitizenPayRequest
import com.fivebb.selfcare.network.requests.KBZPreCreateRequest
import com.fivebb.selfcare.network.requests.WavePayRequest
import com.fivebb.selfcare.network.responses.*
import com.fivebb.selfcare.utils.*
import com.fivebb.shared.vos.*
import com.google.android.material.snackbar.Snackbar
import com.kbzbank.payment.KBZPay
import io.reactivex.Flowable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.aty_choose_adv_month.rvBank
import kotlinx.android.synthetic.main.aty_choose_bank.btnOpenMobileBankingApp
import kotlinx.android.synthetic.main.aty_choose_bank.txtAmount
import kotlinx.android.synthetic.main.recharge_choose_bank.*
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*
import java.util.concurrent.TimeUnit

class RechargeTopUpActivity : ApplicationBaseActivity() ,RechargeTopUpView,BankListView{
    private lateinit var mBankAdapter: BankAdapter
    private lateinit var mPresenter: RechargeTopUpPresenter
    private var  rechargeVO:RechargeVO?=null

    private var timeStamp : String = ""
    private var totalAmt : Double = 0.0
    private var billNo : String = ""
    private var orderID  : String = ""
    private var cusPh  : String = ""

    private var disposables: CompositeDisposable?= null

    companion object {
        fun newIntent(context: Context, rechargeVO: RechargeVO)
        {
            val intent = Intent(context, RechargeTopUpActivity::class.java)
            intent.putExtra("recharge_list",rechargeVO)
            context.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recharge_choose_bank)
        initListeners()
        initPresenter()
        getIntentExtraData()
        btnOpenMobileBankingApp.visibility = View.INVISIBLE
        setUpRecyclerView()
        mPresenter.loadBankList()
    }

    override fun showSelectedBankInfo(data: BankVO) {
        btnOpenMobileBankingApp.visibility = View.VISIBLE
        btnOpenMobileBankingApp.text = resources.getString(data.actionText)
        btnOpenMobileBankingApp.setOnClickListener {
            btnOpenMobileBankingApp.isClickable = false
            timeStamp = createTimestamp()
            val objRecharge = SharedPreferenceUtils.getRechargePlan(this)
            billNo = objRecharge?.plan_id.toString()
            Log.d("Bill No",billNo)
            totalAmt = objRecharge?.cal_price!!
            orderID = SharedPreferenceUtils.getAccountId(this) + timeStamp

            Log.d("Bill No & Order ID", "$billNo and $orderID")
            when (data.code) {
                KBZ_PAY -> {
                    SharedPreferenceUtils.saveBankForPayment(this, "KBZ_PAY")
                }
                AYA_PAY -> {
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

            when {
                data.packageName == KBZ_PAY_PACKAGE_NAME || data.code == K_PAY ->
                    mPresenter.onTapPayWithKBZPay(
                        KBZPreCreateRequest(
                            SharedPreferenceUtils.getAccountId(this),
                            SharedPreferenceUtils.getName(this),
                            SharedPreferenceUtils.getBillMonth(this),
                            billNo,
                            orderID,
                            totalAmt
                        ),this
                    )
                data.packageName == AYA_PAY || data.code == AYA_PAY->
                    showPhBoxForAYAPay()

                data.packageName == CITIZEN_PACKAGE_NAME || data.code == CITIZEN_PAY->
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
                data.packageName == WAVE_MONEY_PACKAGE_NAME || data.code == WAVE_PAY->
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

    override fun ayaPayLink(data: AYARequestPushPaymentResponse) {
        val openLinkIntent = Intent(Intent.ACTION_VIEW, Uri.parse(data.url))
        startActivity(openLinkIntent)
    }

    override fun responseOfAYAPay(message: String) {
        Toast.makeText(this,message, Toast.LENGTH_SHORT).show()
    }

    @SuppressLint("CheckResult")
    override fun requestQueryOrderAYAPay(data: AYAPayRequest) {
        Flowable.interval(5,15,TimeUnit.SECONDS)
            .take(6)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(){
                mPresenter.ayaPayQueryOrder(data)
            }
    }

    @SuppressLint("CheckResult")
    override fun queryOrderAYAPay(data: AYAQueryOrderResponse) {
        when(data.status){
            "done" -> {
                Flowable.timer(3,TimeUnit.SECONDS)
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

    @SuppressLint("SetJavaScriptEnabled")
    override fun mcfPayPaymentLink(data: CitizenPayResponse) {
        webViewPayRecharge.visibility = View.VISIBLE
        webViewPayRecharge.settings.javaScriptEnabled = true
        webViewPayRecharge.settings.loadWithOverviewMode = true
        webViewPayRecharge.settings.useWideViewPort = true
        webViewPayRecharge.settings.domStorageEnabled = true
        webViewPayRecharge.settings.builtInZoomControls = true;
        webViewPayRecharge.settings.displayZoomControls = false;
        webViewPayRecharge.settings.javaScriptCanOpenWindowsAutomatically = true
        webViewPayRecharge.webViewClient = object : WebViewClient() {
            @Deprecated("Deprecated in Java")
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                if (url != null) {
                    view?.loadUrl(url)
                }
                return true
            }
        }
        webViewPayRecharge.loadUrl(data.paymentGatewayUrl)
    }

    @SuppressLint("CheckResult")
    override fun citizenPaymentRetrieveStatus(response: CitizenRetrieveResponse) {
        Log.i("Status", "citizenPaymentRetrieveStatus: " + response.tranHis)
       /* val expiredTime  = response.expiryTime
        val systemCurrentTime = System.currentTimeMillis()*/
        val transStatus = response.tranHis
        if (transStatus!!.isNotEmpty()) {
            when(transStatus[0].tranStatus){
                "Success" -> Flowable.timer(3, TimeUnit.SECONDS)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe() {
                        val newIntent =  HomeActivity.newIntent(
                            this,
                            SharedPreferenceUtils.getServiceType(applicationContext)
                        )
                        newIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
                        startActivity(newIntent)
                        finish()
                       /* SharedPreferenceUtils.deleteActionType(this)
                        SharedPreferenceUtils.deleteBankForPayment(this)
                        SharedPreferenceUtils.deleteAdvID(this)
                        SharedPreferenceUtils.deletePlanID(this)
                        SharedPreferenceUtils.deleteOrderID(this)
                        SharedPreferenceUtils.deleteAdvPlan(this)*/
                       disposables?.dispose()
                    }

               /* "CANCELLED" -> Flowable.timer(3, TimeUnit.SECONDS)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe() {
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
                }*/
            }
        }else{
            Flowable.timer(3, TimeUnit.SECONDS)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe() {
                  disposables?.dispose()
                }
        }
    }

    @SuppressLint("CheckResult")
    override fun callPayRetrieveStatus(status: CitizenPayRequest) {
        Flowable.interval(10,20 ,TimeUnit.SECONDS)
            .take(5)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(){
                Log.d("Interval recall", "10 sec")
                mPresenter.citizenPaymentRetrieve(status)
            }
    }

    @SuppressLint("SetJavaScriptEnabled","CheckResult")
    override fun requestWavePayResponse(data: WavePayResponse) {
        webViewPayRecharge.visibility = View.VISIBLE
        webViewPayRecharge.settings.javaScriptEnabled = true
        webViewPayRecharge.settings.loadWithOverviewMode = true
        webViewPayRecharge.settings.useWideViewPort = true
        webViewPayRecharge.settings.domStorageEnabled = true
        webViewPayRecharge.settings.builtInZoomControls = true;
        webViewPayRecharge.settings.displayZoomControls = false;
        webViewPayRecharge.settings.javaScriptCanOpenWindowsAutomatically = true
        webViewPayRecharge.webViewClient = object : WebViewClient() {
            @Deprecated("Deprecated in Java")
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                if (url != null) {
                    view?.loadUrl(url)
                }
                return true
            }
        }
        webViewPayRecharge.loadUrl(data.paymentGatewayUrl)
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
                    }
            }
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        disposables?.clear()
    }

    override fun showAllBank(data: MutableList<BankVO>) {
        mBankAdapter.setNewData(data)
    }

    private fun initListeners() {

        ivBack.setOnClickListener {
            finish()
        }
    }

    private fun initPresenter() {
        mPresenter = ViewModelProviders.of(this).get(RechargeTopUpPresenter::class.java)
        mPresenter.initPresenter(this)
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

    private fun getIntentExtraData() {
        rechargeVO = intent.getParcelableExtra("recharge_list")
        rechargeVO?.let { SharedPreferenceUtils.saveRechargePlan(this, it)
            txtAmount.text = it.price
            lblRPlan.text = it.fullname
        }
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

