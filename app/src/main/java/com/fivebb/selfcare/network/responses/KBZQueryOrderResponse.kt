package com.fivebb.selfcare.network.responses

import com.google.gson.annotations.SerializedName

data class KBZQueryOrderResponse(
    @SerializedName("result")
    val result:String,

    @SerializedName("code")
    val code:String,

    @SerializedName("msg")
    val msg:String,

    @SerializedName("merch_order_id")
    val merchOrderID:String,

    @SerializedName("prepay_id")
    val prepayID:String,

    @SerializedName("nonce_str")
    val nonceStr:String,

    @SerializedName("sign_type")
    val signType:String,

    @SerializedName("sign")
    val sign:String
) {
}