package com.fivebb.selfcare.delegates

interface PaymentHistoryFilterActionDelegate {

    fun onTapChooseDateRange(fromDate: String, toDate: String)

    fun onDownload(creditNo:String)

    fun onViewInvoice(creditNo: String)

}