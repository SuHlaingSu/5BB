package com.fivebb.shared.vos

import com.google.gson.annotations.SerializedName

data class AppImageVO (

    @SerializedName("ID")
    val id: Int = 0,

    @SerializedName("BillingArea")
    val billingArea: String = "",

    @SerializedName("ImageType")
    val imageType: String = "",

    @SerializedName("ImageUrl")
    val imageUrl: String? = null,

    @SerializedName("Description")
    val description: String? = null,

    @SerializedName("LearnMoreUrl")
    val learnMoreUrl: String? = null
)