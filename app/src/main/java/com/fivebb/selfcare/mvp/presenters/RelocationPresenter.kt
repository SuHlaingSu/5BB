package com.fivebb.selfcare.mvp.presenters

import com.fivebb.selfcare.R
import com.fivebb.selfcare.models.UserModel
import com.fivebb.selfcare.models.UserModelImpl
import com.fivebb.selfcare.mvp.views.RelocationView
import com.fivebb.selfcare.network.requests.SaveActivityLogRequest
import com.fivebb.selfcare.network.requests.SendEmailRequest
import com.fivebb.selfcare.utils.SharedPreferenceUtils
import com.fivebb.shared.mvp.presenters.BasePresenter
import com.fivebb.shared.utils.SharedConstants
import com.fivebb.shared.utils.SharedUtils

class RelocationPresenter : BasePresenter<RelocationView, UserModel>() {

    init {
        mModel = UserModelImpl.getInstance()
    }

    fun onUiReady() {

        if (mModel.getLoadedCustomerDetails() != null) {
            mModel.getLoadedCustomerDetails()?.let {
                mView.showCustomerBasicViewDetails(it)
            }
        } else {
            mShowProgressLoadingDialogLiveData.postValue(true)
            mModel.getCustomerBasicViewDetails(
                mView.getContext(),
                success = {
                    mHideProgressLoadingDialogLiveData.postValue(true)
                    mView.showCustomerBasicViewDetails(it)
                },
                failure = {
                    mHideProgressLoadingDialogLiveData.postValue(true)
                    _errorLiveData.postValue(it)
                }
            )
        }
    }

    fun sendEmailAndSaveActivity(changeAddress: String) {

        mShowProgressLoadingDialogLiveData.postValue(true)

            if (mModel.getLoadedCustomerDetails() != null) {

                mModel.getLoadedCustomerDetails()?.let {

                    /*val body = mView.getContext().getString(
                        R.string.format_relocation_request,
                        SharedPreferenceUtils.getAccountId(mView.getContext()),
                        SharedPreferenceUtils.getName(mView.getContext()),
                        it.customerAccountDetails.values.first().emailAddress,
                        "${it.customerAccountDetails.values.first().mobileNumber}, ${it.customerAccountDetails.values.first().multipleMobileNumber ?: ""}",
                        it.customerAccountDetails.values.first().address,
                        changeAddress)


                    val emailRequest = SendEmailRequest(
                        SharedPreferenceUtils.getAccountId(mView.getContext()),
                        mModel.getEmailByBillingArea(mView.getContext()), // will insert email from api in UserModelImpl
                        SharedConstants.RELOCATION_FORM,
                        mView.getContext().getString(R.string.email_subject_relocation),
                        body
                    )*/

                    val activityLogDesc = mView.getContext().getString(R.string.format_activity_log_relocation,
                        it.customerAccountDetails.values.first().address,
                        changeAddress,
                        SharedUtils.getTodayDateByFormat(SharedConstants.FORMAT_DATE_D_MMMM_YYYY))

                    val saveActivityRequest = SaveActivityLogRequest(
                        SharedPreferenceUtils.getAccountId(mView.getContext()),
                        SharedConstants.RELOCATION,
                        activityLogDesc
                    )

                    mModel.sendEmailAndSaveActivityLog(
                        mView.getContext(),
                        //emailRequest,
                        saveActivityRequest,
                        {successMessage ->
                            mHideProgressLoadingDialogLiveData.postValue(true)
                            mView.showSendEmailSuccess(successMessage)
                        }, {errorMessage ->
                            mHideProgressLoadingDialogLiveData.postValue(true)
                            _errorLiveData.postValue(errorMessage)
                        }
                    )

                }

            } else {
                mHideProgressLoadingDialogLiveData.postValue(true)
                _errorLiveData.postValue(SharedConstants.UNAUTHORIZED_REQUEST)
            }

    }
}