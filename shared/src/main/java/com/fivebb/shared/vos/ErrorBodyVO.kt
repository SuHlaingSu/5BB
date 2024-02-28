package com.fivebb.shared.vos

import com.google.gson.annotations.SerializedName

data class ErrorBodyVO(
        @SerializedName("phone_number")
        val phoneNumberRelatedError : String? = null,

        @SerializedName("nrc")
        val nrcRelatedError : String? = null,

        @SerializedName("otp")
        val otpRelatedError : String? = null,

        @SerializedName("phone")
        val phoneRelatedError : String? = null
)