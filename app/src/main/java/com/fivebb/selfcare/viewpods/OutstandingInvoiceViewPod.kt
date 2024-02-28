package com.fivebb.selfcare.viewpods

import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import com.fivebb.selfcare.delegates.InvoicePaymentActionDelegate
import kotlinx.android.synthetic.main.viewpod_outstanding_invoice.view.*

class OutstandingInvoiceViewPod @JvmOverloads constructor
    (context: Context, attr: AttributeSet? = null, defStyleAttr: Int = 0)
    : ConstraintLayout(context, attr, defStyleAttr) {


    companion object {

        var mDelegate: InvoicePaymentActionDelegate? = null

        fun newInstance(view: View, delegate: InvoicePaymentActionDelegate): OutstandingInvoiceViewPod {

            val viewPod = view as OutstandingInvoiceViewPod
            mDelegate = delegate
            return viewPod

        }
    }

    override fun onFinishInflate() {
        super.onFinishInflate()

        btnPayment.setOnClickListener {
//            mDelegate?.onTapPayment()
        }
    }

}