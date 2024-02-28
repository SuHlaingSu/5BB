package com.fivebb.selfcare.network.requests

import com.google.gson.annotations.SerializedName

data class EmailCheckRequest(
    @SerializedName("CustAccNo")
    var customerAccountNo: String = "",
    @SerializedName("VerifyType")
    var verifyType: String = "",
    @SerializedName("VerifyAccount")
    var verifyAcc: String = "",
    @SerializedName("VerificationCode")
    var verifyCode: String = ""
)
