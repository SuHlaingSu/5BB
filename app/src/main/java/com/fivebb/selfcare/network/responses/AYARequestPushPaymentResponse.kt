package com.fivebb.selfcare.network.responses

import com.google.gson.annotations.SerializedName

data class AYARequestPushPaymentResponse (
    @SerializedName("referenceNumber")
    val referenceNo:String,
    @SerializedName("paymentGatewayUrl")
    val url:String
){
}