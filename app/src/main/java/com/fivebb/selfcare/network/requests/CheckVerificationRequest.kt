package com.fivebb.selfcare.network.requests

import com.google.gson.annotations.SerializedName

data class CheckVerificationRequest (
    @SerializedName("CustAccNo")
    var customerAccountNo: String = ""
)