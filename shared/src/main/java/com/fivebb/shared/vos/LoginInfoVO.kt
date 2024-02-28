package com.fivebb.shared.vos

import com.google.gson.annotations.SerializedName

data class LoginInfoVO (

    @SerializedName("ipAddress")
    val ipAddress: String?,

    @SerializedName("createdDate")
    val createdDate: Long?,

    @SerializedName("lastModifiedDate")
    val lastModifiedDate: Long?
)