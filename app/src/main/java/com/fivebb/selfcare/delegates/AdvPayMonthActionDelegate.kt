package com.fivebb.selfcare.delegates

import com.fivebb.shared.vos.AdvPlanListVO
import com.fivebb.shared.vos.PlanPriceListVO

interface AdvPayMonthActionDelegate {
    fun onSelectClick (item: AdvPlanListVO)
}