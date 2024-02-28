package com.fivebb.shared.vos

import com.google.gson.annotations.SerializedName

data class GetServiceBalanceVO(
    @SerializedName("nonMonentryBalance")
    val nonMonentryBalanceVO: ArrayList<NonMonentryBalanceVO>
)