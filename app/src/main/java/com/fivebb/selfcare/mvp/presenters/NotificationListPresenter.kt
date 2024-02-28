package com.fivebb.selfcare.mvp.presenters

import com.fivebb.selfcare.delegates.NotificationActionDelegate
import com.fivebb.selfcare.models.UserModel
import com.fivebb.selfcare.models.UserModelImpl
import com.fivebb.selfcare.mvp.views.NotificationListView
import com.fivebb.selfcare.network.requests.GetNotiIdRequest
import com.fivebb.selfcare.network.requests.NotiIdRequest
import com.fivebb.shared.mvp.presenters.BasePresenter
import com.fivebb.shared.vos.NotificationVO

class NotificationListPresenter: BasePresenter<NotificationListView, UserModel>() {

    init {
        mModel = UserModelImpl.getInstance()
    }

    fun onUiReady() {

        mView.showLoading()

        mModel.getNotiList(
            context = mView.getContext(),
            success = {
                mView.hideLoading()
                mView.showNotificationList(it)
            },
            failure = {
                mView.hideLoading()
                mView.displayErrorMessage(it)
            }
        )
    }

    fun IsReadNotiDetail(request: NotiIdRequest)
    {
        mView.showLoading()
        mModel.updateNoti(
            context = mView.getContext(),
            request = request,
            success = {
                mView.hideLoading()
                mView.onNotiSuccesss(request.NotiList)
                mView.showMessage(it)},
            failure = {
                mView.hideLoading()
                mView.showMessage(it)
            }
        )
    }

    fun deleteNotiID(request :NotiIdRequest,deleteAll:Boolean,singleDelete:Boolean) {
        mView.showLoading()
        mModel.deleteNoti(
            context = mView.getContext(),
            request =request,
            success = {
                mView.hideLoading()
                when {
                    deleteAll -> {
                        mView.onDeleteAllNotification()
                    }
                    singleDelete -> {
                        mView.onNotiSuccesss(request.NotiList)
                    }
                    else -> {
                        mView.onSelectedDelete()
                    }
                }

                mView.showMessage(it)
            },
            failure = {
                mView.hideLoading()
                mView.showMessage(it)
            }
        )
    }
}