package com.fivebb.selfcare.network.responses

import com.google.gson.annotations.SerializedName

data class WaveQueryOrderResponse (
    @SerializedName("status")
    val status:String

){
}