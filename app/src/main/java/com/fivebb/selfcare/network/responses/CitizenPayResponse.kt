package com.fivebb.selfcare.network.responses

import com.google.gson.annotations.SerializedName

data class CitizenPayResponse (
    @SerializedName("paymentGatewayUrl")
    val paymentGatewayUrl:String
){
}