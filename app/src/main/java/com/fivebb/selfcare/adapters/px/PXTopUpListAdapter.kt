package com.fivebb.selfcare.adapters.px

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.NonNull
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.ListAdapter
import com.fivebb.selfcare.R
import com.fivebb.selfcare.databinding.PxPlanPriceListItemBinding
import com.fivebb.selfcare.databinding.RdoItemBinding
import com.fivebb.selfcare.delegates.PrepaidActionDelegate
import com.fivebb.shared.vos.PXPlanVO


class PXTopUpListAdapter(val delegate : PrepaidActionDelegate) : ListAdapter<PXPlanVO, PXTopUpViewHolder>(PXTopUpCallback()) {
    @NonNull
    override fun onCreateViewHolder(@NonNull parent: ViewGroup, i: Int): PXTopUpViewHolder {
        val binding = DataBindingUtil.inflate<PxPlanPriceListItemBinding>(
            LayoutInflater.from(parent.context),
            R.layout.px_plan_price_list_item,
            parent,
            false
        )
        return PXTopUpViewHolder(binding)
    }
    override fun onBindViewHolder(@NonNull holder: PXTopUpViewHolder, i: Int) {
        holder.bind(getItem(i),delegate)
        holder.setIsRecyclable(false)
    }

    override fun getItemViewType(position: Int): Int {
        return position
    }
}
