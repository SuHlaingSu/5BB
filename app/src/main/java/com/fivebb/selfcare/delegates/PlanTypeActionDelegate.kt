package com.fivebb.selfcare.delegates

import com.fivebb.shared.vos.PlanVO

interface PlanTypeActionDelegate {

    fun onTapPlan(plan: PlanVO)
}