package com.fivebb.selfcare.activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProviders
import com.fivebb.selfcare.R
import com.fivebb.selfcare.mvp.presenters.NotificationListPresenter
import com.fivebb.selfcare.mvp.views.NotificationListView
import com.fivebb.selfcare.network.requests.GetNotiIdRequest
import com.fivebb.selfcare.network.requests.NotiIdRequest
import com.fivebb.selfcare.viewholders.formatDate
import com.fivebb.selfcare.viewholders.formatTime
import com.fivebb.shared.activities.BaseActivity
import com.fivebb.shared.utils.SharedConstants
import com.fivebb.shared.utils.SharedUtils
import com.fivebb.shared.vos.NotificationVO
import kotlinx.android.synthetic.main.activity_notification.ivBack
import kotlinx.android.synthetic.main.info_noti_detail.*
import kotlinx.android.synthetic.main.transaction_noti_detail.*
import java.text.SimpleDateFormat

class TransNotiDetailActivity : BaseActivity(),NotificationListView {
    private lateinit var mPresenter: NotificationListPresenter

    companion object {
        fun newIntent(context: Context, notificationVO: NotificationVO) {
            val intent = Intent(context, TransNotiDetailActivity::class.java)
            intent.putExtra(DATA, notificationVO)
            context.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.transaction_noti_detail)
        setUpPresenter()
        setUpListeners()
        initUi()
    }

    private fun initUi() {
        val notificationVO = intent.getParcelableExtra<NotificationVO>(DATA)
        isReadNotiId(notificationVO)
        notificationVO?.let {
            try {
                if (it.item!=null) {
                    txtTransaction_time.text = SharedUtils.formatDate("${it.item?.transaction_time}")
                    txtAccountNo.text = it.item?.accountNo
                    txtAmt.text = it.item?.amount +" "+ it.item?.currency_alias
                    txtPaymentMethod.text = it.item?.payment
                    txtType.text = it.item?.type
                    if (txtType.text == "Recharge Payment"){
                        lblBillMonth.visibility = View.GONE
                        txtBillMonth.visibility=View.GONE
                        lblBillInv.visibility = View.GONE
                        txtBillInv.visibility = View.GONE
                        txtPackage.text = it.item?.bill_invoice

                    }else if(txtType.text == "Debit note"){
                        lblBillMonth.visibility = View.GONE
                        txtBillMonth.visibility=View.GONE
                        lblPackage.visibility = View.GONE
                        txtPackage.visibility = View.GONE
                        txtBillInv.text = it.item?.bill_invoice
                    }else if( txtType.text == "Prepaid Payment"){
                        lblBillMonth.visibility = View.GONE
                        txtBillMonth.visibility=View.GONE
                        lblBillInv.visibility = View.GONE
                        txtBillInv.visibility = View.GONE
                        txtPackage.text = it.item?.bill_invoice
                    }
                    else{
                        txtBillMonth.text = it.item?.bill_month
                        txtBillInv.text = it.item?.bill_invoice
                        lblPackage.visibility = View.GONE
                        txtPackage.visibility = View.GONE
                    }
                }
            }catch (e: Exception){
            }
        }
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