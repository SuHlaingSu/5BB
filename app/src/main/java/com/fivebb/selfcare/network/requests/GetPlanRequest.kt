package com.fivebb.selfcare.network.requests

import com.google.gson.annotations.SerializedName

data class GetPlanRequest (
    @SerializedName("ServiceType")
    var serviceType: String = "",

    @SerializedName("PlanFullName")
    var planFullName: String = "",

    @SerializedName("CustAccNo")
    var custAccNo: String = ""
)