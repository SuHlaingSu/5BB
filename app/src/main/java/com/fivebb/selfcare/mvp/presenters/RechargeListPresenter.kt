package com.fivebb.selfcare.mvp.presenters

import com.fivebb.selfcare.delegates.RechargeDelegate
import com.fivebb.selfcare.delegates.RechargeTopUpDelegate
import com.fivebb.selfcare.models.StaticDataModel
import com.fivebb.selfcare.models.UserModel
import com.fivebb.selfcare.models.UserModelImpl
import com.fivebb.selfcare.mvp.views.RechargeTopUpView
import com.fivebb.selfcare.mvp.views.RechargeView
import com.fivebb.shared.mvp.presenters.BasePresenter
import com.fivebb.shared.vos.BankVO
import com.fivebb.shared.vos.RechargeVO
import java.util.*

class RechargeListPresenter: BasePresenter<RechargeView, UserModel>() {
    init {
        mModel = UserModelImpl.getInstance()
    }

    fun onUiReady() {

        mShowProgressLoadingDialogLiveData
        mModel.getRechargeList(
            context = mView.getContext(),
            success = {
                mHideProgressLoadingDialogLiveData
                mView.showData(it)
            },
            failure = {
                mHideProgressLoadingDialogLiveData
                mView.showMessage(it)
            }
        )
    }
}