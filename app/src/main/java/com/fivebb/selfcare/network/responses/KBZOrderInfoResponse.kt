package com.fivebb.selfcare.network.responses

import com.fivebb.shared.vos.OrderInfoVO
import com.google.gson.annotations.SerializedName

data class KBZOrderInfoResponse(

    @SerializedName("orderinfo")
    val orderInfo:OrderInfoVO?=null,

    @SerializedName("sign")
    val sign:String,

    @SerializedName("sign_type")
    val signType:String,

    @SerializedName("timestamp")
    val timestamp:String
) {
}