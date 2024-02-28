package com.fivebb.selfcare.mvp.views

import android.content.Context
import com.fivebb.shared.mvp.views.BaseView
import com.fivebb.shared.vos.CustomerBasicViewDetailsVO
import com.fivebb.shared.vos.PlanVO
import com.fivebb.shared.vos.ServiceInstanceDetailsVO

interface PlanChangeView : BaseView{
    fun getContext() : Context

    fun dataReady(customerBasicViewDetails: CustomerBasicViewDetailsVO?, serviceInstanceDetailsVO: ServiceInstanceDetailsVO?, planList: MutableList<PlanVO>)

    fun refreshPlanList(planList: MutableList<PlanVO>,plan: PlanVO)

    fun sendEmailSuccess(successMessage: String)
    fun showChooseDate(calendar: String)
    fun showDatePickerFragment()
}