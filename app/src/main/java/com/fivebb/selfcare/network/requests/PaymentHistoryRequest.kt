package com.fivebb.selfcare.network.requests

data class PaymentHistoryRequest (
    var billingAccountNumber: String,
    var fromDate: String,
    var toDate: String,
    var currencyAlias: String
)