package com.fivebb.selfcare.mvp.presenters

import com.fivebb.selfcare.models.UserModel
import com.fivebb.selfcare.models.UserModelImpl
import com.fivebb.selfcare.mvp.views.ChangePasswordView
import com.fivebb.selfcare.network.requests.ChangePasswordRequest
import com.fivebb.shared.mvp.presenters.BasePresenter

class ChangePasswordPresenter: BasePresenter<ChangePasswordView, UserModel>() {

    init {
        mModel = UserModelImpl.getInstance()
    }

    fun changePassword(newPassword: String, oldPassword: String, confPassword: String) {

        val changePasswordRequest = ChangePasswordRequest(newPassword, oldPassword, confPassword)

        mShowProgressLoadingDialogLiveData.postValue(true)

        mModel.changePassword(
            mView.getContext(),
            changePasswordRequest,
            success = {
                mHideProgressLoadingDialogLiveData.postValue(true)
                mView.showPasswordChangeSuccess(it)
            },
            failure = {
                mHideProgressLoadingDialogLiveData.postValue(true)
                _errorLiveData.postValue(it)
            }
        )

    }
}