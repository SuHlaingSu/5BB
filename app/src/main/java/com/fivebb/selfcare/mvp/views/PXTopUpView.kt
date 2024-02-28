package com.fivebb.selfcare.mvp.views

import android.content.Context
import com.fivebb.selfcare.network.requests.CitizenPayRequest
import com.fivebb.selfcare.network.requests.WavePayRequest
import com.fivebb.selfcare.network.responses.*
import com.fivebb.shared.mvp.views.BaseView
import com.fivebb.shared.vos.*

interface PXTopUpView :BaseView {
    fun getContext(): Context

    fun getPlanPriceList(data:PXPlanListVO)
}