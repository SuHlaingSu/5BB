package com.fivebb.shared.vos

import com.google.gson.annotations.SerializedName

data class PXPlanListVO (
    @SerializedName("PlanPriceList")
    var planPriceList:MutableList<PXPlanVO>? = null,

   /* @SerializedName("CurrentPlan")
    var currentPlanVO: CurrentPlanVO? = null,*/

    @SerializedName("Note")
    var noteVo: PXNoteVo? = null,

    @SerializedName("isSelected")
    var isSelected: Boolean = false

)