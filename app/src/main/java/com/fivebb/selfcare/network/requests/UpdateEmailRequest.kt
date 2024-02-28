package com.fivebb.selfcare.network.requests

import com.google.gson.annotations.SerializedName

data class UpdateEmailRequest(
    @SerializedName("CustAccNo")
    var customerAccountNo: String = "",
    @SerializedName("Type")
    var verifyType: String = "",
    @SerializedName("SecondaryAccount")
    var verifyAcc: String = ""
)
