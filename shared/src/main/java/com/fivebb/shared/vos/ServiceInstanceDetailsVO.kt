package com.fivebb.shared.vos

import com.google.gson.annotations.SerializedName

data class ServiceInstanceDetailsVO (

    @SerializedName("serviceInstanceNumber")
    var serviceInstanceNumber: String?,

    @SerializedName("serviceAccountNumber")
    var serviceAccountNumber: String,

    @SerializedName("billingAccountNumber")
    var billingAccountNumber: String,

    @SerializedName("customerAccountNumber")
    var customerAccountNumber: String,

    @SerializedName("name")
    var name: String?,

    @SerializedName("type")
    var type: String?,

    @SerializedName("status")
    var status: String?,

    @SerializedName("price")
    var price: String?,

    @SerializedName("safeCustody")
    var safeCustody: String?,

    @SerializedName("userId")
    var userId: String?,

    @SerializedName("customerType")
    var customerType: String?,

    @SerializedName("billingStatus")
    var billingStatus: String?,

    @SerializedName("dunningExcluded")
    var dunningExcluded: String?,

    @SerializedName("currencyId")
    var currencyId: String?,

    @SerializedName("leafNode")
    var leafNode: String?,

    @SerializedName("currencyName")
    var currencyName: String?,

    @SerializedName("currencyCode")
    var currencyCode: String?,

    @SerializedName("password")
    var password: String?,

    @SerializedName("promoName")
    var promoName: String?,

    @SerializedName("promoStartDate")
    var promoStartDate: String?,

    @SerializedName("promoEndDate")
    var promoEndDate: String?,

    @SerializedName("expiryDate")
    var expiryDate: String?
)