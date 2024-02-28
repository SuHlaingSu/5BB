package com.fivebb.selfcare.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import com.fivebb.selfcare.R
import com.fivebb.selfcare.viewholders.RechargedHistoryViewHolder
import com.fivebb.shared.adapters.BaseRecyclerAdapter
import com.fivebb.shared.holders.BaseViewHolder

class RechargedHistoryAdapter: BaseRecyclerAdapter<RechargedHistoryViewHolder, String>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<String> {
        val viewHolder = LayoutInflater.from(parent.context).inflate(R.layout.view_holder_recharged, parent, false)
        return RechargedHistoryViewHolder(viewHolder)
    }

    override fun onBindViewHolder(holder: BaseViewHolder<String>, position: Int) {

    }

    override fun getItemCount(): Int {
        return 10
    }
}