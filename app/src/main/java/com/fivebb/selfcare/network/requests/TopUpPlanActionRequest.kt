package com.fivebb.selfcare.network.requests

import com.google.gson.annotations.SerializedName

data class TopUpPlanActionRequest (
    @SerializedName ("AdvancePaymentID")
    val advPayID :String ?= null,
    @SerializedName ("PromoPlanID")
    val planID : String ?= null,
    @SerializedName ("CustomerAccountNo")
    val cusAccNo : String ?= null,
    @SerializedName ("BankForPayment")
    val bankFromPayment : String ?= null,
    @SerializedName ("OrderCode")
    val orderCode : String ?= null,
    @SerializedName ("ActionType")
    val actionType :String ?= null
)
