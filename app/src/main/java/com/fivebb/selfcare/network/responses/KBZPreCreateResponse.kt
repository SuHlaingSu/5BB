package com.fivebb.selfcare.network.responses

import com.google.gson.annotations.SerializedName

data class KBZPreCreateResponse (
    @SerializedName("prepay_id")
    val prepayID:String
){
}