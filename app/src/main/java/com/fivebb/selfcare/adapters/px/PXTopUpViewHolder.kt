package com.fivebb.selfcare.adapters.px

import android.annotation.SuppressLint
import androidx.recyclerview.widget.RecyclerView
import com.fivebb.selfcare.databinding.PxPlanPriceListItemBinding
import com.fivebb.selfcare.databinding.RdoItemBinding
import com.fivebb.selfcare.delegates.PrepaidActionDelegate

import com.fivebb.shared.vos.PXPlanVO
import kotlinx.android.synthetic.main.item_recharge.view.*

class PXTopUpViewHolder(var binding: PxPlanPriceListItemBinding) :
    RecyclerView.ViewHolder(binding.root) {

    @SuppressLint("SetTextI18n")
    fun bind(data: PXPlanVO, delegate: PrepaidActionDelegate) {
        binding.lblPlanName.text = data.pkg_display_name
        binding.btnSelect.text = data.total_amt
        binding.lblPlanNote.text = data.validity_txt
        binding.lblTaxNote.text = data.down_speed

        binding.btnSelect.setOnClickListener {
            delegate.onItemClick(data)
        }

    }


}