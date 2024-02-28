package com.fivebb.selfcare.viewholders

import android.view.View
import com.fivebb.selfcare.R
import com.fivebb.selfcare.delegates.PXPlanChangeActionDelegate
import com.fivebb.selfcare.delegates.PXPlanTypeActionDelegate
import com.fivebb.selfcare.delegates.PlanTypeActionDelegate
import com.fivebb.selfcare.utils.SharedPreferenceUtils
import com.fivebb.shared.holders.BaseViewHolder
import com.fivebb.shared.vos.PXPlanVO
import com.fivebb.shared.vos.PlanVO
import kotlinx.android.synthetic.main.view_holder_plan_type.view.*

class PXPlanTypeViewHolder(itemView: View, private var mDelegate: PXPlanTypeActionDelegate) : BaseViewHolder<PXPlanVO>(itemView) {

    override fun setData(data: PXPlanVO) {

        mData = data

        itemView.tvPlanType.text = data.plan_name
        itemView.tvInternetSpeed.text = data.down_speed?.toInt().toString()

        //changeBackground(mData.isSelected)
    }

    override fun onClick(view: View?) {
        mDelegate.onTapPXPlan(mData)
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