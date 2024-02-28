package com.fivebb.shared.vos

import com.google.gson.annotations.SerializedName

data class ServiceInstanceSummaryVO (
    @SerializedName("serviceInstanceNumber")
    var serviceInstanceNumber: String?,

    @SerializedName("planName")
    var planName: String?,

    @SerializedName("planId")
    var planId: String?,

    @SerializedName("planStatus")
    var planStatus: String?,

    @SerializedName("planType")
    var planType: String?,

    @SerializedName("expiryDate")
    var expiryDate: String?,

    @SerializedName("userName")
    var userName: String?,

    @SerializedName("currencyId")
    var currencyId: String?,

    @SerializedName("basicPackageHistoryId")
    var basicPackageHistoryId: String?,

    @SerializedName("basicPackageServiceAlias")
    var basicPackageServiceAlias: String?,

    @SerializedName("activationDate")
    var activationDate: String?,

    @SerializedName("contractstartdate")
    var contractStartDate: String?,
    
    @SerializedName("contractenddate")
    var contractEndDate: String?,

    @SerializedName("noofyears")
    var noofyears: Int = 0,

    @SerializedName("billingStatus")
    var billingStatus: String?,

    @SerializedName("promoName")
    var promoName: String?,

    @SerializedName("promoStartDate")
    var promoStartDate: String?,

    @SerializedName("promoEndDate")
    var promoEndDate: String?,

    @SerializedName("billiareaalias")
    var billiareaalias: String?,

    @SerializedName("starterPackValidityActive")
    var starterPackValidityActive: String?,

    @SerializedName("currencyAlias")
    var currencyAlias: String?
)