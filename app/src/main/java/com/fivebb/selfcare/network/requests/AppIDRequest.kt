package com.fivebb.selfcare.network.requests

import com.fivebb.selfcare.BuildConfig
import com.google.gson.annotations.SerializedName

data class AppIDRequest(
    @SerializedName("AppID")
    val appID:String = "",
    @SerializedName("AppVersion")
    val appVersion:String =""
)