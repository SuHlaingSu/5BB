package com.fivebb.shared.vos

import com.google.gson.annotations.SerializedName

data class BillingAccountDetailsVO (

    @SerializedName("billingAccountNumber")
    var billingAccountNumber: String?,

    @SerializedName("customerAccountNumber")
    var customerAccountNumber: String?,

    @SerializedName("name")
    var name: String?,

    @SerializedName("creationDate")
    var creationDate: String?,

    @SerializedName("status")
    var status: String?,

    @SerializedName("emailAddress")
    var emailAddress: String?,

    @SerializedName("mobileNumber")
    var mobileNumber: String?,

    @SerializedName("billingCycle")
    var billingCycle: String?,

    @SerializedName("currency")
    var currency: String?,

    @SerializedName("billingOnHold")
    var billingOnHold: String?,

    @SerializedName("billingAddress")
    var billingAddress: String?,

    @SerializedName("creditClass")
    var creditClass: String?,

    @SerializedName("billDeliveryMode")
    var billDeliveryMode: String?,

    @SerializedName("dunningStatus")
    var dunningStatus: String?,

    @SerializedName("geoId")
    var geoId: String?,

    @SerializedName("taxType")
    var taxType: String?,

    @SerializedName("billingAreaId")
    var billingAreaId: String?
)