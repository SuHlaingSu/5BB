package com.fivebb.selfcare.mvp.presenters

import android.content.Context
import android.util.Log
import android.widget.Toast
import com.fivebb.selfcare.models.UserModel
import com.fivebb.selfcare.models.UserModelImpl
import com.fivebb.selfcare.mvp.views.EmailVerifyView
import com.fivebb.selfcare.network.requests.EmailCheckRequest
import com.fivebb.selfcare.network.requests.EmailRequest
import com.fivebb.selfcare.network.requests.UpdateEmailRequest
import com.fivebb.selfcare.network.responses.EmailListResponse
import com.fivebb.selfcare.utils.SharedPreferenceUtils
import com.fivebb.shared.mvp.presenters.BasePresenter

class EmailVerifyPresenter: BasePresenter<EmailVerifyView, UserModel>(){

    init {
        mModel = UserModelImpl.getInstance()
    }

    fun changeEmail(context: Context)
    {
        mShowProgressLoadingDialogLiveData.postValue(true)
        val verifyType = "Email"
        val verifyAccount = SharedPreferenceUtils.getEmailVerifyAcc(context)
        val remark = "Android Email Change - Verification"

        val changeRequest = EmailRequest(
            SharedPreferenceUtils.getAccountId(context),
            verifyType,
            verifyAccount,
            remark
        )
        mModel.changeEmail(
            context,
            changeRequest,
            {successMessage ->
                mHideProgressLoadingDialogLiveData.postValue(true)
                 mView.showMsgVerify(successMessage)
            }, {errorMessage ->
                mHideProgressLoadingDialogLiveData.postValue(true)
                _errorLiveData.postValue(errorMessage)
            }
        )
    }

    fun emailList(context: Context)
    {
        mShowProgressLoadingDialogLiveData.postValue(true)
        val request = EmailRequest(
            SharedPreferenceUtils.getAccountId(context)
        )
        mModel.emailList(context,request,
            success = {
                mHideProgressLoadingDialogLiveData.postValue(true)
                mView.showEmailList(it)
            }, failure = {
                mHideProgressLoadingDialogLiveData.postValue(true)
                _errorLiveData.postValue(it)
            })
    }

    fun verifyEmail (context: Context,code:String)
    {
        mShowProgressLoadingDialogLiveData.postValue(true)
        val verifyType = "Email"
        val verifyAccount = SharedPreferenceUtils.getEmailVerifyAcc(context)
        val code = code

        val request = EmailCheckRequest(
            SharedPreferenceUtils.getAccountId(context),
            verifyType,verifyAccount,code
        )
        mModel.checkEmail(context,request,
            {
                mHideProgressLoadingDialogLiveData.postValue(true)
                mView.checkVerify(it)

            },{
                mHideProgressLoadingDialogLiveData.postValue(true)
                _errorLiveData.postValue(it)
            })
    }

    fun updateCusInfoEmail(context: Context,emailFromEditText : String,elist:MutableList<String>)
    {
        mShowProgressLoadingDialogLiveData.postValue(true)

        val verifyType = "Email"
        val verifyAccount:String
        var split_string = elist.toString()// SharedPreferenceUtils.getEmailList(context)
        split_string = split_string.replace("[", "").replace(", ",",").replace("]", "");
        if(split_string!= "")
        {
             verifyAccount = "$emailFromEditText,$split_string"
        }else{
             verifyAccount = emailFromEditText
        }

        val updateRequest = UpdateEmailRequest(
            SharedPreferenceUtils.getAccountId(context),verifyType,verifyAccount
        )
        mModel.updateEmailInfo(context,updateRequest,
            {
                mHideProgressLoadingDialogLiveData.postValue(true)
                mView.updateEmailInfo(it)
            },{
                mHideProgressLoadingDialogLiveData.postValue(true)
                _errorLiveData.postValue(it)
            })
    }

    fun deleteSingleEmail(response: List<EmailListResponse>) {
        mShowProgressLoadingDialogLiveData.postValue(true)
        val entrees = mutableListOf<String>()
        val verifyType = "Email"
        response.forEach {
            if (!it.isPrimary && !it.isBSSPrimary)
            {
                entrees.add(it.email)
            }
        }
        //Log.i("After delete email List", "deleteSingleEmail: $splitString")
        var accountString = entrees.toString()
        accountString = accountString.replace("[", "").replace(", ",",").replace("]", "");
        val verifyAccount = accountString
        val updateRequest = UpdateEmailRequest(
            SharedPreferenceUtils.getAccountId(mView.getContext()),verifyType,verifyAccount
        )
        mModel.updateEmailInfo(
            context = mView.getContext(),
            request =updateRequest,
            success = {
                mHideProgressLoadingDialogLiveData.postValue(true)
                mView.deleteEmail(it)
            },
            failure = {
                mHideProgressLoadingDialogLiveData.postValue(true)
               _errorLiveData.postValue(it)
            }
        )
    }
}

