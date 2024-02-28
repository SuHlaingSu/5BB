package com.fivebb.selfcare.viewholders

import android.view.View
import com.fivebb.selfcare.delegates.PaymentHistoryFilterActionDelegate
import com.fivebb.selfcare.delegates.PaymentMethodActionDelegate
import com.fivebb.selfcare.mvp.views.PaymentHistoryView
import com.fivebb.selfcare.utils.SharedPreferenceUtils
import com.fivebb.shared.holders.BaseViewHolder
import com.fivebb.shared.utils.SharedConstants
import com.fivebb.shared.utils.SharedUtils
import com.fivebb.shared.vos.PaymentHistoryVO
import kotlinx.android.synthetic.main.view_holder_payment.view.*

class PaymentHistoryViewHolder(itemView: View,private val mDelegate: PaymentHistoryFilterActionDelegate): BaseViewHolder<PaymentHistoryVO>(itemView) {

    override fun setData(data: PaymentHistoryVO) {

        itemView.tvPaymentMode.text = data.paymentMode
        itemView.tvPaidAmount.text = "${data.amount} ${data.currencyName}"
        itemView.tvPaidAt.text = SharedUtils.changeDateFormat(data.date.toString(), SharedConstants.FORMAT_DATE_D_M_Y, SharedConstants.FORMAT_DATE_D_MMMM_YYYY)

        itemView.btnDownload.setOnClickListener {
            data.creditDocumentNumber?.let { it1 ->
                SharedPreferenceUtils.saveCreditDocNo(itemView.context,
                    it1
                )
                mDelegate.onDownload(it1)
            }

        }
        itemView.btnEye.setOnClickListener {
            data.creditDocumentNumber?.let { it1 ->
                SharedPreferenceUtils.saveCreditDocNo(itemView.context,
                    it1
                )
                mDelegate.onViewInvoice(it1)
            }
        }
    }

    override fun onClick(v: View?) {
    }

}