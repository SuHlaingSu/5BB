package com.fivebb.selfcare.mvp.views

import android.content.Context
import com.fivebb.shared.mvp.views.BaseView
import com.fivebb.shared.vos.CustomerBasicViewDetailsVO
import com.fivebb.shared.vos.PXPlanVO
import com.fivebb.shared.vos.PlanVO
import com.fivebb.shared.vos.ServiceInstanceDetailsVO

interface PXPlanChangeView : BaseView{
    fun getContext() : Context

    fun dataReady(customerBasicViewDetails: CustomerBasicViewDetailsVO?, serviceInstanceDetailsVO: ServiceInstanceDetailsVO?, pxPlanList: MutableList<PXPlanVO>)

    fun refreshPlanList(planList: MutableList<PXPlanVO>,plan: PXPlanVO)

    fun sendEmailSuccess(successMessage: String)
    fun showChooseDate(calendar: String)
    fun showDatePickerFragment()
}