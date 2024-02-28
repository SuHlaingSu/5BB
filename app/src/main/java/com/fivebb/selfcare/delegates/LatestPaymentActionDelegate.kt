package com.fivebb.selfcare.delegates

interface LatestPaymentActionDelegate {

    fun onTapSeeAllPaymentHistory()

    fun onTapInvoicePdf()

    fun onDownloadRequest(credit:String)

    fun onViewInvoice(credit: String)

}