package com.fivebb.selfcare.mvp.views

import android.content.Context
import com.fivebb.selfcare.network.requests.GetNotiIdRequest
import com.fivebb.selfcare.network.requests.NotiIdRequest
import com.fivebb.shared.mvp.views.BaseView
import com.fivebb.shared.vos.NotificationVO

interface NotificationListView : BaseView {
    fun getContext(): Context
    fun showNotificationList(notificationList: List<NotificationVO>)
    fun showLoading()
    fun hideLoading()
    fun onNotiSuccesss (IDList:List<GetNotiIdRequest>)
    fun showMessage(message: String)
    fun displayErrorMessage(message: String)
    fun onDeleteAllNotification()
    fun onSelectedDelete()
    fun isReadNotiId(noti: NotificationVO?)
}