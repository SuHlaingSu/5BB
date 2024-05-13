package com.fivebb.selfcare.network.responses

import com.google.gson.annotations.SerializedName

data class TransactionHistoryResponse (
    @SerializedName("TransactionId")
    val transactionId:String,

    @SerializedName("TransactionStatus")
    val tranStatus:String
)

