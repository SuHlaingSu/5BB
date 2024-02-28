package com.fivebb.selfcare.network.requests

import com.google.gson.annotations.SerializedName

data class CitizenPayRequest(
    @SerializedName("CustAccNo")
    val custAccNo: String,

    @SerializedName("Name")
    val name:String,

    @SerializedName("BillMonth")
    val billMonth:String,

    @SerializedName("BillInvoiceNo")
    val billInvoiceNo: String,

    @SerializedName("OrderID")
    val orderID: String,

    @SerializedName("TotalAmount")
    val totalAmount: Double?
) {
}