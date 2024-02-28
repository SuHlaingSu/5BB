package com.fivebb.selfcare.adapters.recharge

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.NonNull
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.ListAdapter
import com.fivebb.selfcare.R
import com.fivebb.selfcare.databinding.ItemRechargeBinding
import com.fivebb.selfcare.delegates.RechargeDelegate
import com.fivebb.shared.vos.RechargeVO


class RechargeListAdapter(val delegate : RechargeDelegate) : ListAdapter<RechargeVO, RechargeViewHolder>(RechargeCallback()) {
    @NonNull
    override fun onCreateViewHolder(@NonNull parent: ViewGroup, i: Int): RechargeViewHolder {
        val binding = DataBindingUtil.inflate<ItemRechargeBinding>(
            LayoutInflater.from(parent.context),
            R.layout.item_recharge,
            parent,
            false
        )
        return RechargeViewHolder(binding)
    }
    override fun onBindViewHolder(@NonNull holder: RechargeViewHolder, i: Int) {
        holder.bind(getItem(i),delegate)
        holder.setIsRecyclable(false)
    }

    override fun getItemViewType(position: Int): Int {
        return position
    }
}
