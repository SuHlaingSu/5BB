package com.fivebb.shared.vos

import com.google.gson.annotations.SerializedName

data class CustomerAccountDetailsVO (

    @SerializedName("customerAccountNumber")
    var customerAccountNumber: String?,

    @SerializedName("name")
    var name: String?,

    @SerializedName("title")
    var title: String?,

    @SerializedName("dateOfBirth")
    var dateOfBirth: String?,

    @SerializedName("gender")
    var gender: String?,

    @SerializedName("creationDate")
    var creationDate: String?,

    @SerializedName("status")
    var status: String?,

    @SerializedName("emailAddress")
    var emailAddress: String?,

    @SerializedName("multipleEmailAddress")
    var multipleEmailAddress: String?,

    @SerializedName("registeredMobileNumber")
    var registeredMobileNumber: String?,

    @SerializedName("billingArea")
    var billingArea: String?,

    @SerializedName("customerCategory")
    var customerCategory: String?,

    @SerializedName("geoId")
    var geoId: String?,

    @SerializedName("userName")
    var userName: String?,

    @SerializedName("partnerAccountNumber")
    var partnerAccountNumber: String?,

    @SerializedName("organizationId")
    var organizationId: String?,

    @SerializedName("address")
    var address: String?,

    @SerializedName("secretQuestion")
    var secretQuestion: String?,

    @SerializedName("secretAnswer")
    var secretAnswer: String?,

    @SerializedName("mobileNumber")
    var mobileNumber: String?,

    @SerializedName("multipleMobileNumber")
    var multipleMobileNumber: String?,

    @SerializedName("customerAccountNumberId")
    var customerAccountNumberId: String?,

    @SerializedName("billAddCompanyName")
    var billAddCompanyName: String?,

    @SerializedName("regNo")
    var regNo: String?,

    @SerializedName("businessType")
    var businessType: String?,

    @SerializedName("lco")
    var lco: String?
)