package com.fivebb.selfcare.viewholders

import android.view.View
import com.fivebb.selfcare.R
import com.fivebb.selfcare.delegates.InvoicePaymentActionDelegate
import com.fivebb.selfcare.utils.SharedPreferenceUtils
import com.fivebb.shared.holders.BaseViewHolder
import com.fivebb.shared.utils.SharedConstants
import com.fivebb.shared.utils.SharedUtils
import com.fivebb.shared.vos.BillVO
import kotlinx.android.synthetic.main.view_holder_outstanding_invoice.view.*

class OutstandingInvoiceViewHolder(itemView: View, private val mDelegate: InvoicePaymentActionDelegate) :
    BaseViewHolder<BillVO>(itemView) {

    private var unPaidAmount = ""

    private var currency = ""

    init {
        itemView.btnPayment.setOnClickListener {
            mDelegate.onTapPayment(mData)
        }
    }

    override fun setData(data: BillVO) {

        mData = data

        currency = data.currencyName ?: SharedConstants.UNDEFINED

        unPaidAmount = "${data.unpaidAmount ?: 0.0} ${data.currencyName}"

        itemView.tvBillNumber.text = data.billNumber

        itemView.tvUnpaidAmount.text = "${data.unpaidAmount} ${data.currencyName}"

        data.dueDate?.let {
            val formatDateString = SharedUtils.getFormattedDateFromTimestamp(it, SharedConstants.FORMAT_DATE_D_MMMM_YYYY)
            itemView.tvDueDate.text = itemView.resources.getString(R.string.lbl_invoice_due_date, formatDateString)
        }

    }

    override fun onClick(view: View) {

    }
}