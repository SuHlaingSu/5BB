package com.fivebb.shared.vos

import com.google.gson.annotations.SerializedName

data class OrderInfoVO (
    @SerializedName("appid")
    val appID:String,

    @SerializedName("merch_code")
    val merchCode:String,

    @SerializedName("nonce_str")
    val nonceStr:String,

    @SerializedName("prepay_id")
    val prepayID:String
){
}