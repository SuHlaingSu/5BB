package com.fivebb.selfcare.mvp.views

import android.content.Context
import com.fivebb.shared.mvp.views.BaseView
import com.fivebb.shared.vos.AdvancePaymentVO
import com.fivebb.shared.vos.CheckVericationVO
import com.fivebb.shared.vos.TopicVO

interface LoginView : BaseView {

    fun getContext(): Context

    fun navigateToHome(serviceType: String)

    fun callLevel2Form()

    fun fillPreviousAccountIdAndRememberMe(accountId: String, password: String, checkedRememberMe: Boolean)

    fun navigateToForgetPassword()

    fun onSuccessVerification(data: CheckVericationVO)

    fun level2Form(advancePaymentVO: AdvancePaymentVO)
}