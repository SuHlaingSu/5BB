package com.fivebb.selfcare.network.requests

import com.google.gson.annotations.SerializedName

data class GetRechargePlanListRequest(
    @SerializedName("CustAccNo")
    val customerAccountNo: String = ""

)