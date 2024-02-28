package com.fivebb.shared.vos

import com.google.gson.annotations.SerializedName

data class PaymentHistoryVO (

    @SerializedName("transactionNumber")
    var transactionNumber: String?,

    @SerializedName("date")
    var date: String?,

    @SerializedName("paymentMode")
    var paymentMode: String?,

    @SerializedName("amount")
    var amount: Double?,

    @SerializedName("paymentStatus")
    var paymentStatus: String?,

    @SerializedName("currencyName")
    var currencyName: String?,

    @SerializedName("channelAlias")
    var channelAlias: String?,

    @SerializedName("creditDocumentNumber")
    var creditDocumentNumber: String?
)