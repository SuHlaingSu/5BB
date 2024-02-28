package com.fivebb.selfcare.mvp.presenters

import com.fivebb.selfcare.models.UserModel
import com.fivebb.selfcare.models.UserModelImpl
import com.fivebb.selfcare.mvp.views.HelpView
import com.fivebb.shared.mvp.presenters.BasePresenter

class HelpPresenter : BasePresenter<HelpView, UserModel>() {

    init {
        mModel = UserModelImpl.getInstance()
    }

    fun onUiReady() {

        mShowProgressLoadingDialogLiveData.postValue(true)

        mModel.getRegion(
            mView.getContext(),
            "Request",
            {
                mHideProgressLoadingDialogLiveData.postValue(true)
                mView.bindData(it)
            }, {
                mHideProgressLoadingDialogLiveData.postValue(true)
                _errorLiveData.postValue(it)
            }
        )
    }

    fun onDataList() {

        mShowProgressLoadingDialogLiveData.postValue(true)

        mModel.getRegionByShowroom(
            mView.getContext(),
            "Request",
            success = {
                mHideProgressLoadingDialogLiveData.postValue(true)
                it[0].isSelected = true
                mView.bindDataList(it)
            },
            failure = {
                mHideProgressLoadingDialogLiveData.postValue(true)
                _errorLiveData.postValue(it)
            }

        )
    }

    fun onTapEmailButton(email: String){
        mView.navigateToSendEmailActivity(email)
    }

}