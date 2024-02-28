package com.fivebb.selfcare.adapters.help

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.NonNull
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.ListAdapter
import com.fivebb.selfcare.R
import com.fivebb.selfcare.adapters.advPaymentChooseMonth.AdvPaymentCallback
import com.fivebb.selfcare.adapters.advPaymentChooseMonth.AdvPaymentViewHolder
import com.fivebb.selfcare.databinding.ListItemShowroomBinding
import com.fivebb.selfcare.delegates.HelpActionDelegate
import com.fivebb.shared.vos.RegionVO


class HelpListAdapter(val delegate : HelpActionDelegate) : ListAdapter<RegionVO, HelpViewHolder>(
    HelpCallback()
) {

    @NonNull
    override fun onCreateViewHolder(@NonNull parent: ViewGroup, i: Int): HelpViewHolder {
        val binding = DataBindingUtil.inflate<ListItemShowroomBinding>(
            LayoutInflater.from(parent.context),
            R.layout.list_item_showroom,
            parent,
            false
        )
        return HelpViewHolder(binding)
    }
    override fun onBindViewHolder(@NonNull holder: HelpViewHolder, i: Int) {
        holder.bind(getItem(i))
        holder.itemView.setOnClickListener {
            delegate.onShowroomClickItem(getItem(i))
        }
        holder.setIsRecyclable(false)
    }

    override fun getItemViewType(position: Int): Int {
        return position
    }

}
