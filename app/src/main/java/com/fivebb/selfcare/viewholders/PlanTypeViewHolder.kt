package com.fivebb.selfcare.viewholders

import android.content.Context
import android.view.View
import com.fivebb.selfcare.R
import com.fivebb.selfcare.delegates.PlanTypeActionDelegate
import com.fivebb.selfcare.utils.SharedPreferenceUtils
import com.fivebb.shared.holders.BaseViewHolder
import com.fivebb.shared.vos.PlanVO
import kotlinx.android.synthetic.main.view_holder_plan_type.view.*

class PlanTypeViewHolder(itemView: View, private var mDelegate: PlanTypeActionDelegate) : BaseViewHolder<PlanVO>(itemView) {

    override fun setData(data: PlanVO) {

        mData = data

        itemView.tvPlanType.text = data.planShortName
        itemView.tvInternetSpeed.text = "${data.downloadSpeed?.toInt().toString()}" + " " + "${data.downloadUnit}"

        changeBackground(mData.isSelected)
    }

    override fun onClick(view: View?) {
        mDelegate.onTapPlan(mData)
    }

    private fun changeBackground(isSelected: Boolean) {
        itemView.tvPlanType.isSelected = true
        if (isSelected) {
            //itemView.tvPlanType.isSelected = true
            itemView.background = itemView.resources.getDrawable(R.drawable.plan_type_fill_primary)
        } else {
           // itemView.tvPlanType.isSelected = true
            itemView.background = itemView.resources.getDrawable(R.drawable.plan_type_border_primary)
        }
    }
}