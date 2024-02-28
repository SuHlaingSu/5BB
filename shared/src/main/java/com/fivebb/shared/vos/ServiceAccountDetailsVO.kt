package com.fivebb.shared.vos

import com.google.gson.annotations.SerializedName

data class ServiceAccountDetailsVO (

    @SerializedName("serviceAccountNumber")
    var serviceAccountNumber: String?,

    @SerializedName("")
    var customerAccountNumber: String?,

    @SerializedName("name")
    var name: String?,

    @SerializedName("creationDate")
    var creationDate: String?,

    @SerializedName("mobileNumber")
    var mobileNumber: String?,

    @SerializedName("emailAddress")
    var emailAddress: String?,

    @SerializedName("installationAddress")
    var installationAddress: String?,

    @SerializedName("geoId")
    var geoId: String?,

    @SerializedName("serviceType")
    var serviceType: String?
)