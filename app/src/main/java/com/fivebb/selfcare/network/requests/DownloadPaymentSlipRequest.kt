package com.fivebb.selfcare.network.requests

import com.google.gson.annotations.SerializedName

data class DownloadPaymentSlipRequest (
    @SerializedName("creditDocumentNumber")
    var creditDocNo: String = ""
)



