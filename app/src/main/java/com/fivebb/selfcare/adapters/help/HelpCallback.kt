package com.fivebb.selfcare.adapters.help

import androidx.recyclerview.widget.DiffUtil
import com.fivebb.shared.vos.RegionVO


class HelpCallback : DiffUtil.ItemCallback<RegionVO>() {
    override fun areItemsTheSame(oldItem: RegionVO, newItem: RegionVO): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: RegionVO, newItem: RegionVO): Boolean {
        return oldItem == newItem
    }
}
