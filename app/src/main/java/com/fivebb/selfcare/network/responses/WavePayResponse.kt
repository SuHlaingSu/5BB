package com.fivebb.selfcare.network.responses

import com.google.gson.annotations.SerializedName

data class WavePayResponse (
    @SerializedName("transaction_id")
    val transactionId:String,

    @SerializedName("paymentGatewayUrl")
    val paymentGatewayUrl:String
){
}