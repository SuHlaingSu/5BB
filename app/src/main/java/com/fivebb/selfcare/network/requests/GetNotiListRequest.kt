package com.fivebb.selfcare.network.requests

import com.google.gson.annotations.SerializedName

data class GetNotiListRequest(
    @SerializedName("CustAccNo")
    val customerAccountNo: String = "",
    @SerializedName("DeviceID")
    val deviceId : String = ""
)