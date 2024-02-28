package com.fivebb.selfcare.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import com.fivebb.selfcare.R
import com.fivebb.selfcare.delegates.BankActionDelegate
import com.fivebb.selfcare.viewholders.BankViewHolder
import com.fivebb.shared.adapters.BaseRecyclerAdapter
import com.fivebb.shared.holders.BaseViewHolder
import com.fivebb.shared.vos.BankVO

class BankAdapter(private val mDelegate: BankActionDelegate): BaseRecyclerAdapter<BankViewHolder, BankVO>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<BankVO> {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_holder_bank, parent, false)
        return BankViewHolder(view, mDelegate)
    }
}