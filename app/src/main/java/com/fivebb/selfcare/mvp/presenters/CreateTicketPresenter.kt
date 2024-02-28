package com.fivebb.selfcare.mvp.presenters

import com.fivebb.selfcare.R
import com.fivebb.selfcare.models.UserModel
import com.fivebb.selfcare.models.UserModelImpl
import com.fivebb.selfcare.mvp.views.CreateTicketView
import com.fivebb.selfcare.network.requests.SaveActivityLogRequest
import com.fivebb.selfcare.network.requests.SendEmailRequest
import com.fivebb.selfcare.utils.SharedPreferenceUtils
import com.fivebb.shared.mvp.presenters.BasePresenter
import com.fivebb.shared.utils.SharedConstants
import com.fivebb.shared.utils.SharedUtils

class CreateTicketPresenter: BasePresenter<CreateTicketView, UserModel>() {
    init {
        mModel = UserModelImpl.getInstance()
    }

    fun onUiReady() {

        if (mModel.getLoadedCustomerDetails() != null) {
            mModel.getLoadedCustomerDetails()?.let {
                mView.showCustomerBasicDetail(it)
            }
        } else {
            mShowProgressLoadingDialogLiveData.postValue(true)
            mModel.getCustomerBasicViewDetails(
                mView.getContext(),
                success = {
                    mHideProgressLoadingDialogLiveData.postValue(true)
                    mView.showCustomerBasicDetail(it)
                },
                failure = {
                    mHideProgressLoadingDialogLiveData.postValue(true)
                    _errorLiveData.postValue(it)
                }
            )
        }
    }

    fun sendEmailAndSaveActivity(ticketType: String, category: String, summary: String) {

        mShowProgressLoadingDialogLiveData.postValue(true)

        if (mModel.getLoadedCustomerDetails() != null) {

            mModel.getLoadedCustomerDetails()?.let {

               /* val complainDetail = mView.getContext().getString(R.string.ticket_detail,
                    ticketType,
                    category,
                    summary)

                    val ticket = mView.getContext().getString(R.string.format_ticket,
                        SharedUtils.getTodayDateByFormat(SharedConstants.FORMAT_DATE_M_D_Y_HH_mm_ss),
                        it.customerAccountDetails.values.first().name ?: "",
                        it.serviceInstanceDetails.values.first().userId ?: SharedConstants.UNDEFINED,
                        it.serviceInstanceDetails.values.first().name ?: SharedConstants.UNDEFINED,
                        ticketType,
                        complainDetail,
                        it.serviceAccountDetails.values.first().installationAddress ?: "",
                        it.serviceAccountDetails.values.first().mobileNumber ?: "",
                        it.serviceAccountDetails.values.first().name ?: "")

                val emailRequest = SendEmailRequest(
                    SharedPreferenceUtils.getAccountId(mView.getContext()),
                    mModel.getCallCenterEmailByBillingArea(mView.getContext()),
                    SharedConstants.TICKET_FORM,
                    mView.getContext().getString(R.string.email_subject_relocation),
                    ticket
                )*/

                var activityLogDesc = ""

                if (summary.isNotEmpty())  {
                     activityLogDesc = mView.getContext().getString(R.string.format_activity_log_ticket,
                        ticketType,
                        category,
                        summary)
                } else {
                     activityLogDesc = mView.getContext().getString(R.string.format_activity_log_ticket_no_summary,
                        ticketType,
                        category)
                }

                val saveActivityRequest = SaveActivityLogRequest(
                    SharedPreferenceUtils.getAccountId(mView.getContext()),
                    SharedConstants.TICKET,
                    activityLogDesc
                )

                mModel.sendEmailAndSaveActivityLog(
                    mView.getContext(),
                   // emailRequest,
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