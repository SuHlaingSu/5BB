package com.fivebb.selfcare.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import com.fivebb.selfcare.R
import com.fivebb.selfcare.delegates.InvoicePaymentActionDelegate
import com.fivebb.selfcare.viewholders.OutstandingInvoiceViewHolder
import com.fivebb.shared.adapters.BaseRecyclerAdapter
import com.fivebb.shared.holders.BaseViewHolder
import com.fivebb.shared.vos.BillVO

class OutstandingInvoiceAdapter(private val mDelegate: InvoicePaymentActionDelegate) : BaseRecyclerAdapter<OutstandingInvoiceViewHolder, BillVO>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<BillVO> {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_holder_outstanding_invoice, parent, false)
        return OutstandingInvoiceViewHolder(view, mDelegate)
    }
}