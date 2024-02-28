package com.fivebb.selfcare.mvp.views

import android.content.Context
import com.fivebb.shared.mvp.views.BaseView
import com.fivebb.shared.vos.InvoiceVO
import com.fivebb.shared.vos.PaymentHistoryVO

interface PaymentHistoryView: BaseView {

    fun getContext() : Context

    fun showPaymentHistory(paymentList: MutableList<PaymentHistoryVO>,fromDate: String,toDate: String)

    fun showFilterDateDialog(fromDate: String,toDate: String)

  //  fun showDateRange(fromDate: String,toDate: String)

    fun onPaymentPDF(creditNo:String)

    fun onViewPDF(creditNo: String)

    fun afterClickDownload(invoiceVO: InvoiceVO)

    fun onViewClick(invoiceVO: InvoiceVO)
}