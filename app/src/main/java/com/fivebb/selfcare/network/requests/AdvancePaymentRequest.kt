package com.fivebb.selfcare.network.requests

import com.google.gson.annotations.SerializedName

data class AdvancePaymentRequest(
    @SerializedName("customerAccountNumber")
    var customerAccountNumber: String = ""

)