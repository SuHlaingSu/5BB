package com.fivebb.selfcare.activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView
import com.fivebb.selfcare.R
import com.fivebb.selfcare.adapters.noti.NotificationListAdapter
import com.fivebb.selfcare.delegates.NotificationActionDelegate
import com.fivebb.selfcare.mvp.presenters.NotificationListPresenter
import com.fivebb.selfcare.mvp.views.NotificationListView
import com.fivebb.selfcare.network.requests.GetNotiIdRequest
import com.fivebb.selfcare.network.requests.NotiIdRequest
import com.fivebb.selfcare.utils.SwipeToDeleteCallback
import com.fivebb.shared.activities.BaseActivity
import com.fivebb.shared.vos.NotificationVO
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_change_password.*
import kotlinx.android.synthetic.main.activity_notification.*
import kotlinx.android.synthetic.main.activity_notification.ivBack


class NotificationActivity : BaseActivity(), NotificationActionDelegate, NotificationListView {

    private lateinit var mNotificationAdapter: NotificationListAdapter
    private lateinit var mPresenter: NotificationListPresenter
    lateinit var mDelegate: NotificationActionDelegate
    val notiList= ArrayList<NotificationVO>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notification)

        setUpPresenter()
        setUpListeners()
        setUpRecyclerView()

        mPresenter.onUiReady()

    }

    private fun setUpRecyclerView() {
        mNotificationAdapter = NotificationListAdapter(this)
        rvNotification.adapter = mNotificationAdapter
        rvNotification.setHasFixedSize(true)
        val swipeHandler = object : SwipeToDeleteCallback(this) {
            override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
                val list = mutableListOf<GetNotiIdRequest>()
                list.add(GetNotiIdRequest(notiList[viewHolder.adapterPosition].id))
                mPresenter.deleteNotiID(NotiIdRequest(list), false, singleDelete = true)
                notiList.removeAt(viewHolder.adapterPosition)
                mNotificationAdapter.notifyDataSetChanged()
            }

            override fun getSwipeDirs(
                recyclerView: RecyclerView,
                viewHolder: RecyclerView.ViewHolder
            ): Int {
                return if( notiList[viewHolder.adapterPosition].category=="Transaction"){
                    0
                }else{
                    super.getSwipeDirs(recyclerView, viewHolder)
                }
            }
        }
        val itemTouchHelper = ItemTouchHelper(swipeHandler)
        itemTouchHelper.attachToRecyclerView(rvNotification)
    }

    override fun onResume() {
        super.onResume()
        mPresenter.onUiReady()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when (requestCode) {
            200 -> {
                if (resultCode == RESULT_OK) {
                    val noti = data?.getParcelableExtra<NotificationVO>(DATA)
                    noti?.let {
                        notiList.remove(it)
                        mNotificationAdapter.submitList(notiList)
                        mNotificationAdapter.notifyDataSetChanged()
                    }
                }
            }
        }
    }

    override fun displayErrorMessage(message: String) {

        //showErrorMessage(message)
        lbl_empty.visibility = View.VISIBLE
    }

    override fun onDeleteAllNotification() {
        val temp = mutableListOf<NotificationVO>()
        temp.addAll(notiList)
        temp.forEach {
            if (it.category == "Information" || it.category == "Promotion") {
                notiList.remove(it)
            }
        }
        mNotificationAdapter.notifyDataSetChanged()

    }

    override fun onSelectedDelete() {
        val temp = mutableListOf<NotificationVO>()
        temp.addAll(notiList)
        temp.forEach {
            if(it.isSelected){
                notiList.remove(it)
            }
        }
        mNotificationAdapter.submitList(notiList)
        mNotificationAdapter.notifyDataSetChanged()
    }

    override fun isReadNotiId(noti: NotificationVO?) {
        val list = mutableListOf<GetNotiIdRequest>()
        list.add(GetNotiIdRequest(noti?.id?:0))
        mPresenter.IsReadNotiDetail(NotiIdRequest(list))
    }

    override fun getContext(): Context {
        return applicationContext
    }

    fun setUpPresenter() {
        mPresenter = ViewModelProviders.of(this).get(NotificationListPresenter::class.java)
        mPresenter.initPresenter(this)
    }

    private fun setUpListeners() {
        swipeRefresh.setOnRefreshListener {
            notiList.clear()
            mNotificationAdapter.notifyDataSetChanged()
            mPresenter.onUiReady()
        }

        ivBack.setOnClickListener {
            finish()
        }
    }

    override fun showNotificationList(notificationList: List<NotificationVO>) {
        if(notificationList.isNotEmpty())
        {
            notiList.clear()
            notiList.addAll(notificationList)
            mNotificationAdapter.submitList(notiList)
            mNotificationAdapter.notifyDataSetChanged()
        }else
        {
            lbl_empty.visibility = View.VISIBLE
        }

    }

    override fun showLoading() {
        swipeRefresh.isRefreshing = true
    }

    override fun hideLoading() {
        swipeRefresh.isRefreshing = false
    }

    override fun onNotiSuccesss(IDList: List<GetNotiIdRequest>) {
        mNotificationAdapter.deleteItem(IDList)
        mNotificationAdapter.notifyDataSetChanged()
    }


    override fun showMessage(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT)
    }

    companion object {
        fun newIntent(context: Context): Intent {
            return Intent(context, NotificationActivity::class.java)
        }
    }

    override fun onClickNotiInbox(noti: NotificationVO) {

        when (noti.category) {
            "Information" -> {
                InfoNotiDetailActivity.newIntent(this@NotificationActivity, noti,200)
            }
            "Transaction" -> {
                TransNotiDetailActivity.newIntent(this@NotificationActivity, noti)
            }
            else -> {
                PromoNotiDetailActivity.newIntent(this@NotificationActivity, noti)
            }

        }

    }
    override fun onSingleDelete(noti: NotificationVO) {
        val list = mutableListOf<GetNotiIdRequest>()
        list.add(GetNotiIdRequest(noti.id))
        mPresenter.deleteNotiID(NotiIdRequest(list), false, singleDelete = true)
    }

    override fun onLongPressed() {
        mNotificationAdapter.onPressed=true
        mNotificationAdapter.notifyDataSetChanged()
    }

    fun onDeleteAll(view: View) {
        var deleteAll = true
        for (data in notiList) {
            if(data.isSelected){
                deleteAll=false
                break
            }
        }
        confirmDialog(
            "Are you sure want to delete all messages?\nIt will be deleted permanently.",
            clickOk = {
                val list = mutableListOf<GetNotiIdRequest>()
                for (data in notiList) {
                    if (data.category == "Information" || data.category == "Promotion") {
                        if (deleteAll) {
                            list.add(GetNotiIdRequest(data.id))
                        } else {
                            if (data.isSelected) {
                                list.add(GetNotiIdRequest(data.id))
                            }
                        }
                    }
                }
                Log.d("Data Payload", "${NotiIdRequest(list)}")
                //Delete Function
                mPresenter.deleteNotiID(NotiIdRequest(list), deleteAll, false)
                mNotificationAdapter.onPressed= false
                mNotificationAdapter.notifyDataSetChanged()
                /* if(deleteAll){
                onDeleteAllNotification()
            }else{
                onSelectedDelete()
            }*/
            })
        Snackbar.make(view,"Item removed from the list.", Snackbar.LENGTH_LONG)

    }

}
