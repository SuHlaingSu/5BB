package com.fivebb.selfcare.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import com.fivebb.selfcare.R
import com.fivebb.selfcare.delegates.PlanTypeActionDelegate
import com.fivebb.selfcare.viewholders.PlanTypeViewHolder
import com.fivebb.shared.adapters.BaseRecyclerAdapter
import com.fivebb.shared.holders.BaseViewHolder
import com.fivebb.shared.vos.PlanVO


class PlanTypeAdapter(private var mDelegate: PlanTypeActionDelegate) : BaseRecyclerAdapter<PlanTypeViewHolder, PlanVO>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<PlanVO> {

        val viewHolder = LayoutInflater.from(parent.context).inflate(R.layout.view_holder_plan_type, parent, false)
        return PlanTypeViewHolder(viewHolder, mDelegate)

    }
}