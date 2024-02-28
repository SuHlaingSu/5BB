package com.fivebb.selfcare.delegates

import com.fivebb.shared.vos.BillVO

interface InvoicePaymentActionDelegate {

    fun onTapPayment(bill: BillVO)

}