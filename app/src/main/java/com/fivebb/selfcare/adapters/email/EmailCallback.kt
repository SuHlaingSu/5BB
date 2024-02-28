package com.fivebb.selfcare.adapters.email

import androidx.recyclerview.widget.DiffUtil
import com.fivebb.selfcare.network.responses.EmailListResponse
import com.fivebb.shared.vos.NotificationVO


class EmailCallback : DiffUtil.ItemCallback<EmailListResponse>() {
    override fun areItemsTheSame(oldItem: EmailListResponse, newItem: EmailListResponse): Boolean {
        return oldItem.email == newItem.email
    }

    override fun areContentsTheSame(oldItem: EmailListResponse, newItem: EmailListResponse): Boolean {
        return oldItem == newItem
    }
}
