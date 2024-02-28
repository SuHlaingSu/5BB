package com.fivebb.selfcare.network.requests

import com.google.gson.annotations.SerializedName

data class GetTopicRequest(
    @SerializedName("CustAccNo")
    var customerAccountNumber: String = "",
    @SerializedName("Token")
    var token: String = "",
    @SerializedName("DeviceID")
    var deviceId: String = "",
    @SerializedName("AppVersion")
    var appVersion : String = "",
    @SerializedName("Platform")
    var platform : String = ""
)