package com.fivebb.selfcare.network.responses

import com.fivebb.shared.vos.ActivityLogVO
import com.google.gson.annotations.SerializedName

data class CitizenRetrieveResponse(
    @SerializedName("transactionId")
    val transactionId:String,

    @SerializedName("TransactionHistoryList")
    val tranHis:MutableList<TransactionHistoryResponse>? = null

)