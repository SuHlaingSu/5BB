package com.fivebb.selfcare.adapters.advPaymentChooseMonth

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.NonNull
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.ListAdapter
import com.fivebb.selfcare.R
import com.fivebb.selfcare.databinding.RdoItemBinding
import com.fivebb.selfcare.delegates.AdvPayMonthActionDelegate
import com.fivebb.shared.vos.AdvPlanListVO
import kotlinx.android.synthetic.main.rdo_item.view.*

class AdvPaymentAdapter(val delegate: AdvPayMonthActionDelegate) : ListAdapter<AdvPlanListVO, AdvPaymentViewHolder>(
    AdvPaymentCallback()
) {
    @NonNull
    override fun onCreateViewHolder(@NonNull parent: ViewGroup, i: Int): AdvPaymentViewHolder {
        val binding = DataBindingUtil.inflate<RdoItemBinding>(
            LayoutInflater.from(parent.context),
            R.layout.rdo_item,
            parent,
            false
        )
        return AdvPaymentViewHolder(binding,delegate)
    }
    override fun onBindViewHolder(@NonNull holder: AdvPaymentViewHolder, i: Int) {
        holder.bind(getItem(i),delegate)
        holder.setIsRecyclable(false)
      }
}
