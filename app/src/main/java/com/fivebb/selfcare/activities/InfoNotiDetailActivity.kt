package com.fivebb.selfcare.activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import com.bumptech.glide.Glide
import com.fivebb.selfcare.R
import com.fivebb.selfcare.delegates.NotificationActionDelegate
import com.fivebb.selfcare.mvp.presenters.NotificationListPresenter
import com.fivebb.selfcare.mvp.views.NotificationListView
import com.fivebb.selfcare.network.requests.GetNotiIdRequest
import com.fivebb.selfcare.network.requests.NotiIdRequest
import com.fivebb.selfcare.services.GlideImageLoadingService
import com.fivebb.selfcare.viewholders.formatDate
import com.fivebb.selfcare.viewholders.formatTime
import com.fivebb.shared.activities.BaseActivity
import com.fivebb.shared.utils.SharedConstants
import com.fivebb.shared.utils.SharedUtils
import com.fivebb.shared.vos.NotificationVO
import kotlinx.android.synthetic.main.activity_invoice_payment.*
import kotlinx.android.synthetic.main.activity_notification.*
import kotlinx.android.synthetic.main.activity_notification.ivBack
import kotlinx.android.synthetic.main.info_noti_detail.*
import kotlinx.android.synthetic.main.view_holder_bank.view.*
import java.text.SimpleDateFormat

const val  DATA = "data"
class InfoNotiDetailActivity : BaseActivity(),NotificationActionDelegate,NotificationListView{
    private lateinit var mPresenter: NotificationListPresenter
     private var  notificationVO:NotificationVO?=null
    companion object {
        fun newIntent(context: AppCompatActivity, data:NotificationVO,requestCode:Int) {
            val intent = Intent(context, InfoNotiDetailActivity::class.java)
            intent.putExtra(DATA,data)
            context.startActivityForResult(intent,requestCode)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.info_noti_detail)

        setUpPresenter()
        getIntentExtraData()
        setUpListeners()
    }
    private fun setUpListeners() {
        ivBack.setOnClickListener {
            finish()
        }
    }

    fun setUpPresenter() {
        mPresenter = ViewModelProviders.of(this).get(NotificationListPresenter::class.java)
        mPresenter.initPresenter(this)
    }

    private fun getIntentExtraData() {
        notificationVO = intent.getParcelableExtra(DATA)
        isReadNotiId(notificationVO)
        notificationVO?.let {
            title_info.text= it.title
            description.text = it.description
            txtDate.text = SharedUtils.formatDateT("${it.sentDate}")
                //"${it.sentDate.formatDate(it)} at ${it.sentDate.formatTime(it)}"
            if(it.image_url=="")
            {
                Glide.with(this).load(R.drawable.fivebb_logo).into(ivNotification)

            }else{
                Glide.with(this).load(it.image_url).into(ivNotification)
            }
        }
        img_recycle.setOnClickListener {
            val list = mutableListOf<GetNotiIdRequest>()
            list.add(GetNotiIdRequest(notificationVO?.id?:0))
            mPresenter.deleteNotiID(NotiIdRequest(list),false,singleDelete = false)

        }
    }

    override fun onClickNotiInbox(noti: NotificationVO) {


    }

    override fun onSingleDelete(noti: NotificationVO) {
    }

    override fun onLongPressed() {

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
        val intent = intent
        intent.putExtra(DATA, notificationVO)
        setResult(RESULT_OK, intent)
        finish()
    }

    override fun isReadNotiId(noti: NotificationVO?) {
        val list = mutableListOf<GetNotiIdRequest>()
        list.add(GetNotiIdRequest(noti?.id?:0))
        mPresenter.IsReadNotiDetail(NotiIdRequest(list))
    }


}