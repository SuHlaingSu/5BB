package com.fivebb.selfcare.network.requests

import com.google.gson.annotations.SerializedName

data class RechargedHistoryRequest (
    @SerializedName("serviceInstanceNumber")
    var serviceInstanceNumber: String,

    @SerializedName("fromDate")
    var fromDate: String,

    @SerializedName("toDate")
    var toDate: String,

    @SerializedName("rechargeType")
    var rechargeType: String
)