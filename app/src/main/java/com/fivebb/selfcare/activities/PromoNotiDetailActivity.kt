package com.fivebb.selfcare.activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.ImageView
import androidx.lifecycle.ViewModelProviders
import com.fivebb.selfcare.R
import com.fivebb.selfcare.mvp.presenters.NotificationListPresenter
import com.fivebb.selfcare.mvp.views.NotificationListView
import com.fivebb.selfcare.network.requests.GetNotiIdRequest
import com.fivebb.selfcare.network.requests.NotiIdRequest
import com.fivebb.shared.activities.BaseActivity
import com.fivebb.shared.vos.NotificationVO
import kotlinx.android.synthetic.main.activity_notification.*
import kotlinx.android.synthetic.main.info_noti_detail.*
import kotlinx.android.synthetic.main.promo_noti_detail.*

class PromoNotiDetailActivity : BaseActivity(), NotificationListView {
    private lateinit var webView: WebView
    private lateinit var img_recycle: ImageView
    private var  notificationVO:NotificationVO?=null
    private lateinit var mPresenter: NotificationListPresenter
    companion object {
        fun newIntent(context: Context,promoUrl:NotificationVO) {
            val intent = Intent(context, PromoNotiDetailActivity::class.java)
            intent.putExtra(DATA, promoUrl)
            context.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.promo_noti_detail)
        setUpListeners()
        setUpPresenter()
        webView = findViewById(R.id.webview)
        img_recycle= findViewById(R.id.imgRecycle)
        val notificationVO = intent.getParcelableExtra<NotificationVO>(DATA)
        //Log.i("TAG", "onCreate: " + mPromoUrl)
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

        if (notificationVO != null) {
            if(notificationVO.promo_url!="")
            {
                webView.loadUrl(notificationVO.promo_url)
            }else{
                webView.loadUrl("https://www.5bb.com.mm")
            }
        }
        img_recycle.setOnClickListener {
            val list = mutableListOf<GetNotiIdRequest>()
            list.add(GetNotiIdRequest(notificationVO?.id?:0))
            mPresenter.deleteNotiID(NotiIdRequest(list),false,singleDelete = false)
            finish()
        }
        isReadNotiId(notificationVO)
    }
    private fun setUpListeners() {
        imgBack.setOnClickListener {
            finish()
        }
    }

    fun setUpPresenter() {
        mPresenter = ViewModelProviders.of(this).get(NotificationListPresenter::class.java)
        mPresenter.initPresenter(this)
    }

    override fun getContext(): Context {
        return applicationContext
    }

    override fun showNotificationList(notificationList: List<NotificationVO>) {

    }

    override fun showLoading() {

    }

    override fun hideLoading() {

    }

    override fun onNotiSuccesss(IDList: List<GetNotiIdRequest>) {

    }

    override fun showMessage(message: String) {

    }

    override fun displayErrorMessage(message: String) {

    }

    override fun onDeleteAllNotification() {

    }

    override fun onSelectedDelete() {

    }

    override fun isReadNotiId(noti: NotificationVO?) {
        val list = mutableListOf<GetNotiIdRequest>()
        list.add(GetNotiIdRequest(noti?.id?:0))
        mPresenter.IsReadNotiDetail(NotiIdRequest(list))
    }
}