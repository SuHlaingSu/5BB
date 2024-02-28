package com.fivebb.selfcare.mvp.presenters

import com.fivebb.selfcare.models.UserModelImpl
import com.fivebb.selfcare.mvp.views.SendEmailView
import com.fivebb.selfcare.network.requests.SendEmailRequest
import com.fivebb.selfcare.utils.SharedPreferenceUtils
import com.fivebb.shared.mvp.presenters.BasePresenter
import com.fivebb.shared.utils.SharedConstants

class SendEmailPresenter : BasePresenter<SendEmailView, UserModelImpl>() {

    init {
        mModel = UserModelImpl.getInstance()
    }

    fun sendEmail(toEmail: String, emailSubject: String, emailBody: String) {
        mShowProgressLoadingDialogLiveData.postValue(true)

        val sendEmailRequest = SendEmailRequest(
            SharedPreferenceUtils.getAccountId(mView.getContext()),
            toEmail,
            SharedConstants.HELP_FORM,
            emailSubject,
            emailBody
        )

        mModel.sendEmail(
            mView.getContext(),
            sendEmailRequest
            , success = {
                mHideProgressLoadingDialogLiveData.postValue(true)
                mView.showSendEmailSuccessfully(it)
            },
            failure = {
                mHideProgressLoadingDialogLiveData.postValue(true)
                _errorLiveData.postValue(it)
            }
        )
    }
}