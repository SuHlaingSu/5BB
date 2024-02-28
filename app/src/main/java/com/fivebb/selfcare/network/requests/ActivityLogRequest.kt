package com.fivebb.selfcare.network.requests

import com.google.gson.annotations.SerializedName

data class ActivityLogRequest (
    @SerializedName("CustomerAccountNo")
    var customerAccountNo: String = ""
)