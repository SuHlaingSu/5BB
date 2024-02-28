package com.fivebb.selfcare.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import com.fivebb.selfcare.R
import com.fivebb.selfcare.delegates.PaymentHistoryFilterActionDelegate
import com.fivebb.selfcare.delegates.PaymentMethodActionDelegate
import com.fivebb.selfcare.viewholders.PaymentHistoryViewHolder
import com.fivebb.shared.adapters.BaseRecyclerAdapter
import com.fivebb.shared.holders.BaseViewHolder
import com.fivebb.shared.vos.PaymentHistoryVO

class PaymentHistoryAdapter(val mDelegate: PaymentHistoryFilterActionDelegate): BaseRecyclerAdapter<PaymentHistoryViewHolder, PaymentHistoryVO>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<PaymentHistoryVO> {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_holder_payment, parent, false)
        return PaymentHistoryViewHolder(view,mDelegate)
    }
}