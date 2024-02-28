package com.fivebb.shared.vos

import com.google.gson.annotations.SerializedName

data class CheckVericationVO (
    @SerializedName("CustAccNo")
    val CustAccNo : String ?= null,
    @SerializedName("MobileNo")
    val MobileNo : String ?= null,
    @SerializedName("UpdateMobileNo")
    val UpdateMobileNo : String ?= null,
    @SerializedName("UpdateNRC")
    val UpdateNRC : String ?= null,
    @SerializedName("Step")
    val Step : Int ?= 0,
    @SerializedName("VerifiedDate")
    val VerifiedDate : String ?= null,
    @SerializedName("UpdateNRCCode")
    val UpdateNRCCode : String ?= null,
    @SerializedName("UpdateNRCTownship")
    val UpdateNRCTownship : String ?= null,
    @SerializedName("UpdateNRCA")
    val UpdateNRCA : String ?= null,
    @SerializedName("UpdateNRCNo")
    val UpdateNRCNo : String ?= null
)

