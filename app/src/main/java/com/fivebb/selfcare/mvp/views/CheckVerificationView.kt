package com.fivebb.selfcare.mvp.views

import android.content.Context
import com.fivebb.shared.mvp.views.BaseView
import com.fivebb.shared.vos.CheckVericationVO

interface CheckVerificationView :BaseView {
    fun getContext(): Context

    fun onSuccessVerification(data:CheckVericationVO)
}