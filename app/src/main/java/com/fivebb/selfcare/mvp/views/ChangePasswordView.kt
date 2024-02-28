package com.fivebb.selfcare.mvp.views

import android.content.Context
import com.fivebb.shared.mvp.views.BaseView

interface ChangePasswordView: BaseView {

    fun getContext() : Context

    fun showPasswordChangeSuccess(message: String)
}