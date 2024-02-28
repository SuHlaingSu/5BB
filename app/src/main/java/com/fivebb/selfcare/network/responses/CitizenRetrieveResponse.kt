package com.fivebb.selfcare.network.responses

import com.google.gson.annotations.SerializedName

data class CitizenRetrieveResponse(
    @SerializedName("contextId")
    val contextID:String,

    @SerializedName("merchantId")
    val merchantID:String,

    @SerializedName("paymentGatewayUrl")
    val paymentUrl:String,

    @SerializedName("redirectUrl")
    val redirectUrl:String,

    @SerializedName("contextStatus")
    val contextStatus:String,

    @SerializedName("merchantPaymentRef")
    val merchantPaymentRef:String,

    @SerializedName("expiryTime")
    val expiryTime : Long

){

}