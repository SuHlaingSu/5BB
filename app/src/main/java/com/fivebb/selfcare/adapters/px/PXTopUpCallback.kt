package com.fivebb.selfcare.adapters.px

import androidx.recyclerview.widget.DiffUtil
import com.fivebb.shared.vos.NotificationVO
import com.fivebb.shared.vos.PXPlanVO
import com.fivebb.shared.vos.RechargeVO


class PXTopUpCallback : DiffUtil.ItemCallback<PXPlanVO>() {
    override fun areItemsTheSame(oldItem: PXPlanVO, newItem: PXPlanVO): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: PXPlanVO, newItem: PXPlanVO): Boolean {
        return oldItem == newItem
    }
}
