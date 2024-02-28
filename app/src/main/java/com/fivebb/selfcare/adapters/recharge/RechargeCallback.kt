package com.fivebb.selfcare.adapters.recharge

import androidx.recyclerview.widget.DiffUtil
import com.fivebb.shared.vos.NotificationVO
import com.fivebb.shared.vos.RechargeVO


class RechargeCallback : DiffUtil.ItemCallback<RechargeVO>() {
    override fun areItemsTheSame(oldItem: RechargeVO, newItem: RechargeVO): Boolean {
        return oldItem.plan_id == newItem.plan_id
    }

    override fun areContentsTheSame(oldItem: RechargeVO, newItem: RechargeVO): Boolean {
        return oldItem == newItem
    }
}
