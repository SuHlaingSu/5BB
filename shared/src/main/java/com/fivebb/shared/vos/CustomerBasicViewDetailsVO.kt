package com.fivebb.shared.vos

import com.google.gson.annotations.SerializedName

data class CustomerBasicViewDetailsVO (

    @SerializedName("customerAccountDetails")
    var customerAccountDetails: HashMap<String, CustomerAccountDetailsVO>,

    @SerializedName("billingAccountDetails")
    var billingAccountDetails: HashMap<String, BillingAccountDetailsVO>,

    @SerializedName("serviceAccountDetails")
    var serviceAccountDetails: HashMap<String, ServiceAccountDetailsVO>,

    @SerializedName("serviceInstanceDetails")
    var serviceInstanceDetails: HashMap<String, ServiceInstanceDetailsVO>,

    @SerializedName("notificationList")
    var notificationList: MutableList<String>?

    //TODO response format

//    var cafDetail: String?,

//    @SerializedName("depositDetailsResponseVOs")
//    var depositDetailsResponseVOs: MutableList<String>?
)