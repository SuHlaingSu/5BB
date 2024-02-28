package com.fivebb.selfcare.viewholders

import android.view.View
import com.fivebb.shared.holders.BaseViewHolder
import kotlinx.android.synthetic.main.view_holder_plan_attribute.view.*

class PlanAttributeViewHolder(itemView: View) : BaseViewHolder<String>(itemView) {

    override fun onClick(p0: View?) {

    }

    override fun setData(data: String) {
        itemView.tvAttribute.text = data
    }

}