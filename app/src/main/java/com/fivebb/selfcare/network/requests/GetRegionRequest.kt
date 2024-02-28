package com.fivebb.selfcare.network.requests

import com.google.gson.annotations.SerializedName

data class GetRegionRequest (

    @SerializedName("BillingArea")
    var billingArea: String = "",

    @SerializedName("ActionType")
    var actionType: String = ""
)