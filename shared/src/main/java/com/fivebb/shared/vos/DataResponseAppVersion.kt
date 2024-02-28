package com.fivebb.shared.vos

import com.google.gson.annotations.SerializedName

data class DataResponseAppVersion(

    @SerializedName("code")
    var code: String = "",

    @SerializedName("message")
    var message: String = "",

    @SerializedName("data")
    var data: AppVersionVO? = null
)
{
    //5BB api success code is 600.
    fun isResponseOk(): Boolean{
        return code.toIntOrNull() == 600 && data != null
    }
}