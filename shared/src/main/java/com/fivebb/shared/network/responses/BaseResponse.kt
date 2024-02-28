package com.fivebb.shared.network.responses
import com.google.gson.annotations.SerializedName

data class BaseResponse(

    @SerializedName("code")
    val code: Int = 0,

    @SerializedName("status")
    val status: String?,

    @SerializedName("message")
    val message: String = ""
){
    //5BB api success code is 600.
    fun isResponseOK() = code == 600
}