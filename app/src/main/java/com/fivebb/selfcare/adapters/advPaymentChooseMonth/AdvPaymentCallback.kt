package com.fivebb.selfcare.adapters.advPaymentChooseMonth

import androidx.recyclerview.widget.DiffUtil
import com.fivebb.shared.vos.AdvPlanListVO
import com.fivebb.shared.vos.PlanPriceListVO
import com.fivebb.shared.vos.RegionVO


class AdvPaymentCallback : DiffUtil.ItemCallback<AdvPlanListVO>() {
    override fun areItemsTheSame(oldItem: AdvPlanListVO, newItem: AdvPlanListVO): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: AdvPlanListVO, newItem: AdvPlanListVO): Boolean {
        return oldItem == newItem
    }
}
