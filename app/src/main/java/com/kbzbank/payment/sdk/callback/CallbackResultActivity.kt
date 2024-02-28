package com.kbzbank.payment.sdk.callback

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import com.fivebb.selfcare.FiveBBApp
import com.fivebb.selfcare.R
import com.fivebb.selfcare.activities.ApplicationBaseActivity
import com.fivebb.selfcare.activities.HomeActivity
import com.fivebb.selfcare.mvp.presenters.AdvTopUpPresenter
import com.fivebb.selfcare.mvp.views.AdvTopUpView
import com.fivebb.selfcare.network.requests.AYAPayRequest
import com.fivebb.selfcare.network.requests.CitizenPayRequest
import com.fivebb.selfcare.network.requests.WavePayRequest
import com.fivebb.selfcare.network.responses.*
import com.fivebb.selfcare.utils.SharedPreferenceUtils
import com.fivebb.shared.vos.BankVO
import com.fivebb.shared.vos.PlanPriceListVO
import com.kbzbank.payment.KBZPay
import io.reactivex.Flowable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_callback_result.*
import java.util.*
import kotlin.concurrent.schedule


class CallbackResultActivity : ApplicationBaseActivity(),AdvTopUpView{

    private lateinit var mPresenter: AdvTopUpPresenter

    @SuppressLint("CheckResult")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_callback_result)
        initPresenter()
        showLoadingDialog()
        Flowable.timer(3,java.util.concurrent.TimeUnit.SECONDS)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(){
                Log.d("IntervalDelay","Delay 5 sec")
                iv_success.visibility = View.VISIBLE
                txtSuccessMessage.visibility = View.VISIBLE
                btnGoToMain.visibility = View.VISIBLE
                hideLoadingDialog()
            }

        val intent = intent
        val result = intent.getIntExtra(KBZPay.EXTRA_RESULT, 0)
        if (result == KBZPay.COMPLETED) {
            Log.d(FiveBBApp.TAG, "pay success! ")
            //mPresenter.takePlanAction()
            SharedPreferenceUtils.deleteAdvID(this)
            SharedPreferenceUtils.deletePlanID(this)
            SharedPreferenceUtils.deleteOrderID(this)
            SharedPreferenceUtils.deleteAdvPlan(this)
            SharedPreferenceUtils.deleteBankForPayment(this)

        } else {
            val failMsg = intent.getStringExtra(KBZPay.EXTRA_FAIL_MSG)
            Log.d(FiveBBApp.TAG, "pay fail, fail reason = $failMsg")
        }
        btnGoToMain.setOnClickListener {
            val newIntent =  HomeActivity.newIntent(
                this,
                SharedPreferenceUtils.getServiceType(applicationContext)
            )
            newIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(newIntent)
            finish()
        }
    }

    private fun initPresenter() {
        mPresenter = ViewModelProviders.of(this).get(AdvTopUpPresenter::class.java)
        mPresenter.initPresenter(this)
    }

    override fun onBackPressed() {
    }

    companion object{
        const val REQUEST_CODE = 1001
        fun newIntent(context: Context):Intent{
            return Intent(context,CallbackResultActivity::class.java)
        }
    }

    override fun getContext(): Context {
       // TODO("Not yet implemented")
        return applicationContext
    }

    override fun showAllBank(data: MutableList<BankVO>) {
        //TODO("Not yet implemented")
    }

    override fun showSelectedBankInfo(data: BankVO) {
        //TODO("Not yet implemented")
    }

    override fun showKBZPayAPP(data: KBZOrderInfoResponse) {
       // TODO("Not yet implemented")
    }

    override fun getPlanPriceList(data: PlanPriceListVO) {
        //TODO("Not yet implemented")
    }

    override fun goToBank() {
        //TODO("Not yet implemented")
    }

    override fun status(status: String) {
        //TODO("Not yet implemented")
    }

    override fun chooseToPlan() {
        //TODO("Not yet implemented")
    }

    override fun ayaPayLink(data: AYARequestPushPaymentResponse) {
        TODO("Not yet implemented")
    }

    override fun requestQueryOrderAYAPay(data: AYAPayRequest) {
        TODO("Not yet implemented")
    }

    override fun responseOfAYAPay(message: String) {
        TODO("Not yet implemented")
    }

    override fun queryOrderAYAPay(data: AYAQueryOrderResponse) {
        TODO("Not yet implemented")
    }

    override fun mcfPayPaymentLink(data: CitizenPayResponse) {
        //TODO("Not yet implemented")
    }

    override fun citizenPaymentRetrieveStatus(response: CitizenRetrieveResponse) {
        //TODO("Not yet implemented")
    }

    override fun callPayRetrieveStatus(status: CitizenPayRequest) {
        //TODO("Not yet implemented")
    }

    override fun requestWavePayResponse(data: WavePayResponse) {
        TODO("Not yet implemented")
    }

    override fun requestQueryOrderWPay(data: WavePayRequest) {
        TODO("Not yet implemented")
    }

    override fun queryOrderWPay(data: WaveQueryOrderResponse) {
        TODO("Not yet implemented")
    }

}