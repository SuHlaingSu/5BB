package com.fivebb.selfcare.delegates

import com.fivebb.shared.vos.PXPlanVO

interface PrepaidActionDelegate {

    fun onTapTopUp()

    fun onItemClick(pxPlanVO: PXPlanVO)

}