package com.fivebb.shared.vos

import com.google.gson.annotations.SerializedName

data class RemainingAdjustedBalanceVO(
    @SerializedName("customerAccountNumber")
    val cusAccNo : String = "",
    @SerializedName("remainingAdjustedBalance")
    val balance:String ="",
    @SerializedName("PlanName")
    val planName:String ="",
    @SerializedName("IsSufficient")
    val IsSufficient: Boolean = false,
    @SerializedName("Message")
    val msg: String? = "",
    @SerializedName("ToDate")
    val expireDate: String? = "",
    @SerializedName("ExpireIn")
    val expireIn : String = ""

)