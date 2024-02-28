package com.fivebb.shared.vos

import com.google.gson.annotations.SerializedName

data class UserLoginVO (

    @SerializedName("externalUserDetails")
    val externalUserDetails: ExternalUserDetailsVO?,

    @SerializedName("staffName")
    val staffName: String?,

    @SerializedName("token")
    val token: String?

)