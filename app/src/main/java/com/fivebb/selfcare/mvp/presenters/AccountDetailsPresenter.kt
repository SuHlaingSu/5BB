package com.fivebb.selfcare.mvp.presenters

import android.content.Context
import com.fivebb.selfcare.models.UserModel
import com.fivebb.selfcare.models.UserModelImpl
import com.fivebb.selfcare.mvp.views.AccountDetailsView
import com.fivebb.selfcare.network.requests.EmailRequest
import com.fivebb.selfcare.utils.SharedPreferenceUtils
import com.fivebb.shared.mvp.presenters.BasePresenter

class AccountDetailsPresenter: BasePresenter<AccountDetailsView, UserModel>() {

    init {
        mModel = UserModelImpl.getInstance()
    }

    fun onUiReady() {
        mModel.getLoadedCustomerDetails()?.let {
            mView.showCustomerBasicViewDetail(it)
        }
    }

    fun reloadCustomerDetails(context: Context) {

        mShowProgressLoadingDialogLiveData.postValue(true)

        mModel.getCustomerBasicViewDetails(
            context,
            success = {
                mHideProgressLoadingDialogLiveData.postValue(true)
                mView.showCustomerBasicViewDetail(it)
            },
            failure = {
                mHideProgressLoadingDialogLiveData.postValue(true)
                _errorLiveData.postValue(it)
            })
    }

    fun onTapCustomerInfoExpend(){
        mView.showCustomerInfoExpend()
    }

    /*fun onTapContactInfoExpend(){
        mView.showContactInfoExpend()
    }*/

    fun onTapBillingInfoExpend(){
        mView.showBillingInfoExpend()
    }

   /* fun onTapPlanInfoExpend(){
        mView.showPlanInfoExpend()
    }*/


}