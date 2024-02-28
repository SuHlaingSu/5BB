package com.fivebb.shared.vos

import com.google.gson.annotations.SerializedName

data class BillVO (
    @SerializedName("billNumber")
    var billNumber: String?,

    @SerializedName("documentType")
    var documentType: String?,

    @SerializedName("amount")
    var amount: Double?,

    @SerializedName("unpaidAmount")
    var unpaidAmount: Double?,

    @SerializedName("billDate")
    var billDate: Long?,

    @SerializedName("dueDate")
    var dueDate: Long?,

    @SerializedName("billStatus")
    var billStatus: String?,

    @SerializedName("disputedStatus")
    var disputedStatus: String?,

    @SerializedName("billMonth")
    var billMonth: String?,

    @SerializedName("billId")
    var billId: String?,

    @SerializedName("currencyName")
    var currencyName: String?
)