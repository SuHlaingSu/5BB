package com.fivebb.selfcare.mvp.views

import android.content.Context
import android.provider.ContactsContract.CommonDataKinds.Email
import com.fivebb.selfcare.network.responses.EmailList
import com.fivebb.selfcare.network.responses.EmailListResponse
import com.fivebb.shared.mvp.views.BaseView
import com.fivebb.shared.vos.CustomerBasicViewDetailsVO

interface EmailVerifyView: BaseView {

    fun getContext() : Context

    fun showEmailList(emailList:List<EmailListResponse>)

    fun showMsgVerify(msg:String)

    fun addNewEmail()

    fun checkVerify(msg: String)

    fun updateEmailInfo(msg: String)

    //fun deleteEmail(list: List<EmailListResponse>)
    fun deleteEmail(msg: String)
}