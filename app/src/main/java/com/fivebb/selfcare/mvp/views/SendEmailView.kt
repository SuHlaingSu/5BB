package com.fivebb.selfcare.mvp.views

import android.content.Context
import com.fivebb.shared.mvp.views.BaseView

interface SendEmailView: BaseView {

    fun getContext(): Context

    fun showSendEmailSuccessfully(message: String)

}