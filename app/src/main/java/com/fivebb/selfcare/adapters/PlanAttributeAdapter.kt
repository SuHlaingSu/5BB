package com.fivebb.selfcare.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import com.fivebb.selfcare.R
import com.fivebb.selfcare.viewholders.PlanAttributeViewHolder
import com.fivebb.shared.adapters.BaseRecyclerAdapter
import com.fivebb.shared.holders.BaseViewHolder

class PlanAttributeAdapter() : BaseRecyclerAdapter<PlanAttributeViewHolder, String>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<String> {
        val viewHolder = LayoutInflater.from(parent.context).inflate(R.layout.view_holder_plan_attribute, parent, false)
        return PlanAttributeViewHolder(viewHolder)
    }
}