package com.fivebb.shared.vos

import com.google.gson.annotations.SerializedName

data class NonMonentryBalanceVO(
    @SerializedName("balanceAvailable")
    val balanceAvailable : String = "",
    @SerializedName("balanceConsumed")
    val balanceConsumed : String ="",
    @SerializedName("totalBalance")
    val totalBalance: String = "",
    @SerializedName("usageLimitType")
    val usageLimitType: String? = ""
)