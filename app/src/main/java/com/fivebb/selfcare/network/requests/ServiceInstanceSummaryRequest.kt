package com.fivebb.selfcare.network.requests

import com.google.gson.annotations.SerializedName

data class ServiceInstanceSummaryRequest (
    @SerializedName("serviceInstanceNumber")
    var serviceInstanceNumber: String = ""
)