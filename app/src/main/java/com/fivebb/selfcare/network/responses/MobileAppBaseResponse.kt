package com.fivebb.selfcare.network.responses

import com.google.gson.annotations.SerializedName

data class MobileAppBaseResponse (
    @SerializedName("code")
    var code: Int = 0,

    @SerializedName("message")
    var message: String = ""
)