package com.fivebb.selfcare.network.requests

import com.google.gson.annotations.SerializedName

data class EncryptDataRequest(
    @SerializedName("EncData")
    val encData : String
) {
}