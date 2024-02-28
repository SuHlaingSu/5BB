package com.fivebb.shared.vos

import com.google.gson.annotations.SerializedName

data class PlanPriceListVO (
    @SerializedName("PlanPriceList")
    var planPriceList:MutableList<AdvPlanListVO>? = null,

    @SerializedName("CurrentPlan")
    var currentPlanVO: CurrentPlanVO? = null,

    @SerializedName("Note")
    var noteVo: NoteVo? = null,

    @SerializedName("isSelected")
    var isSelected: Boolean = false

)