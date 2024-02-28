package com.fivebb.shared.vos

import com.google.gson.annotations.SerializedName

data class ConfigurationVO(
    @SerializedName("IsEnable_Lvl2Form")
    val isEnable_Lvl2Form : Boolean = false
)