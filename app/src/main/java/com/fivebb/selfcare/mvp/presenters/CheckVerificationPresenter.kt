package com.fivebb.selfcare.mvp.presenters

import com.fivebb.selfcare.models.UserModel
import com.fivebb.selfcare.models.UserModelImpl
import com.fivebb.selfcare.mvp.views.CheckVerificationView
import com.fivebb.shared.mvp.presenters.BasePresenter

class CheckVerificationPresenter : BasePresenter<CheckVerificationView, UserModel>() {
    init {
        mModel = UserModelImpl.getInstance()
    }

    fun onCallCheckVerification()
    {
        mShowProgressLoadingDialogLiveData.postValue(true)
        mModel.checkVerication(
            mView.getContext(),
            success = {
                mHideProgressLoadingDialogLiveData.postValue(true)
                mView.onSuccessVerification(it)
            },
            failure = {
                mHideProgressLoadingDialogLiveData.postValue(true)
                _errorLiveData.postValue(it)
            }
        )
    }
}