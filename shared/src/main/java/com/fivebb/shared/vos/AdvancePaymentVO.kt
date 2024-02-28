package com.fivebb.shared.vos

import com.google.gson.annotations.SerializedName

data class AdvancePaymentVO(
    @SerializedName("Configuration")
    val configuration: ConfigurationVO,

    @SerializedName("Info")
    val info:BSInfoVO,

    @SerializedName("RemainingAdjustedBalance")
    val adjustedBalanceVO: RemainingAdjustedBalanceVO?,

    @SerializedName("GetServiceBalance")
    val getServiceBalanceVO: GetServiceBalanceVO?
)