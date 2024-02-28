package com.fivebb.shared.vos

import com.google.gson.annotations.SerializedName

data class PXDetailVO(
    @SerializedName("Configuration")
    val configuration: ConfigurationVO,

    @SerializedName("RemainingAdjustedBalance")
    val adjustedBalanceVO: RemainingAdjustedBalanceVO?,

    @SerializedName("CurrentPlan")
    val pXcurrentPlanVO: PXCurrentPlanVO,

    @SerializedName("NextPlan")
    val nextPlanVO: PXNextPlanVO
)