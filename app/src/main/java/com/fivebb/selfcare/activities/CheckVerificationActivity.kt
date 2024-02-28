package com.fivebb.selfcare.activities

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.lifecycle.ViewModelProviders
import com.fivebb.selfcare.R
import com.fivebb.selfcare.mvp.presenters.CheckVerificationPresenter
import com.fivebb.selfcare.mvp.views.CheckVerificationView
import com.fivebb.selfcare.utils.SharedPreferenceUtils
import com.fivebb.shared.activities.BaseActivity
import com.fivebb.shared.utils.SharedConstants
import com.fivebb.shared.vos.CheckVericationVO
import com.fivebb.shared.vos.NotificationVO
import io.reactivex.Flowable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_callback_result.*

class CheckVerificationActivity : BaseActivity(),CheckVerificationView {
    private lateinit var webView: WebView
    private lateinit var mPresenter: CheckVerificationPresenter

    companion object {
        fun newIntent(context: Context): Intent {
            return Intent(context, CheckVerificationActivity::class.java)
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.check_verification)
        setUpPresenter()
        webView = findViewById(R.id.webview)
        webView.settings.javaScriptEnabled = true
        webView.settings.loadWithOverviewMode = true
        webView.settings.useWideViewPort = true
        webView.settings.domStorageEnabled = true
        webView.settings.javaScriptCanOpenWindowsAutomatically = true
        webView.webViewClient = object : WebViewClient() {
            @Deprecated("Deprecated in Java")
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                if (url != null) {
                    view?.loadUrl(url)
                }
                return true
            }
        }
        //dev
        webView.loadUrl("https://uatgtg.5bb.com.mm/Forms/Lvl2Form?CustAccNo=" + SharedPreferenceUtils.getAccountId(this))
        //prod
       //webView.loadUrl("https://www.5bb.com.mm/Forms/Lvl2Form?CustAccNo=" + SharedPreferenceUtils.getAccountId(this))

        mPresenter.onCallCheckVerification()
    }

    fun setUpPresenter() {
        mPresenter = ViewModelProviders.of(this).get(CheckVerificationPresenter::class.java)
        mPresenter.initPresenter(this)
    }

    override fun getContext(): Context {
        return applicationContext
    }

    @SuppressLint("CheckResult")
    override fun onSuccessVerification(data: CheckVericationVO) {
        val step = data.Step
        if(step == 10)
        {
            SharedPreferenceUtils.saveCusStep(applicationContext, true)
            val intent =  HomeActivity.newIntent(
                this,
                SharedPreferenceUtils.getServiceType(applicationContext)
            )
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
            finish()
        }else{
            Flowable.timer(3,java.util.concurrent.TimeUnit.SECONDS)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(){
                    Log.d("IntervalDelay","Delay 3 sec")
                    mPresenter.onCallCheckVerification()
                }

        }
    }
}