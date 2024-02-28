package com.fivebb.selfcare.viewpods

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.RelativeLayout
import com.fivebb.selfcare.delegates.LatestPaymentActionDelegate
import com.fivebb.shared.utils.SharedConstants
import com.fivebb.shared.utils.SharedUtils
import com.fivebb.shared.vos.PaymentHistoryVO
import kotlinx.android.synthetic.main.viewpod_latest_payment.view.*
import java.text.SimpleDateFormat
import java.util.*

class LatestPaymentViewPod @JvmOverloads constructor(
    context: Context, attr: AttributeSet? = null, defStyleAttr: Int = 0)
    : RelativeLayout(context, attr, defStyleAttr) {

    companion object {

        var mDelegate: LatestPaymentActionDelegate? = null

        fun newInstance(view: View, delegate: LatestPaymentActionDelegate): LatestPaymentViewPod {
            val viewPod = view as LatestPaymentViewPod
            mDelegate = delegate

            return viewPod
        }
    }

    override fun onFinishInflate() {
        super.onFinishInflate()

        btnSeeAll.setOnClickListener {
            mDelegate?.onTapSeeAllPaymentHistory()
        }
    }

    fun bindData(payment: PaymentHistoryVO) {
        tvPaymentMode.text = payment.paymentMode
        tvPaidAmount.text = "${payment.amount} ${payment.currencyName}"
        tvPaidAt.text = SharedUtils.changeDateFormat(payment.date.toString(), SharedConstants.FORMAT_DATE_D_M_Y, SharedConstants.FORMAT_DATE_D_MMMM_YYYY)

        btnDownload.setOnClickListener {
            payment.creditDocumentNumber?.let { it1 -> mDelegate?.onDownloadRequest(it1) }
        }

        btnEye.setOnClickListener {
            payment.creditDocumentNumber?.let { it1 -> mDelegate?.onViewInvoice(it1) }
        }
    }

}