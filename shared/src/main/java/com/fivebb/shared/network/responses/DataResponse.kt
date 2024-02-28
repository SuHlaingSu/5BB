package com.fivebb.shared.network.responses
import com.google.gson.annotations.SerializedName

data class DataResponse<T>(

    @SerializedName("code")
    var code: Int = 0,

    @SerializedName("message")
    var message: String = "",

    @SerializedName("data")
    var data: T? = null
)
{
    //5BB api success code is 600.
    fun isResponseOk(): Boolean{
        return code == 600 && data != null
    }
}