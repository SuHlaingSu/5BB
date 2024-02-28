package com.fivebb.shared.vos

import com.google.gson.annotations.SerializedName

data class InvoiceVO (
    @SerializedName("Url")
    var url: String = "",
)