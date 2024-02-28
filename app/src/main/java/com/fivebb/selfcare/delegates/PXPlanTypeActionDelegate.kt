package com.fivebb.selfcare.delegates

import com.fivebb.shared.vos.PXPlanVO

interface PXPlanTypeActionDelegate {

    fun onTapPXPlan(pxPlanVO: PXPlanVO)
}