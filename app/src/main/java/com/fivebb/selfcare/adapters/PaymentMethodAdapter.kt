package com.fivebb.selfcare.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import com.fivebb.selfcare.R
import com.fivebb.selfcare.delegates.BankActionDelegate
import com.fivebb.selfcare.delegates.PaymentMethodActionDelegate
import com.fivebb.selfcare.viewholders.BankViewHolder
import com.fivebb.selfcare.viewholders.PaymentMethodViewHolder
import com.fivebb.shared.adapters.BaseRecyclerAdapter
import com.fivebb.shared.holders.BaseViewHolder
import com.fivebb.shared.vos.BankVO
import com.fivebb.shared.vos.CombinePaymentDataVO
import com.fivebb.shared.vos.PaymentMethodVO

class PaymentMethodAdapter(private val mDelegate: PaymentMethodActionDelegate): BaseRecyclerAdapter<PaymentMethodViewHolder, CombinePaymentDataVO>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<CombinePaymentDataVO> {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_holder_bank, parent, false)
        return PaymentMethodViewHolder(view, mDelegate)
    }
}