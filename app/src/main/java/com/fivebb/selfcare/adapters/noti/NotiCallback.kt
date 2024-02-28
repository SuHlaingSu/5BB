package com.fivebb.selfcare.adapters.noti

import androidx.recyclerview.widget.DiffUtil
import com.fivebb.shared.vos.NotificationVO


class NotiCallback : DiffUtil.ItemCallback<NotificationVO>() {
    override fun areItemsTheSame(oldItem: NotificationVO, newItem: NotificationVO): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: NotificationVO, newItem: NotificationVO): Boolean {
        return oldItem == newItem
    }
}
