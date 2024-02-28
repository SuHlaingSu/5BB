package com.fivebb.selfcare.network.requests

import com.google.gson.annotations.SerializedName

data class AppImageRequest (
    @SerializedName("BillingArea")
    var billingArea: String = ""
)