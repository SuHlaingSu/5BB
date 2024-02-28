package com.fivebb.selfcare.adapters.recharge

import android.annotation.SuppressLint
import androidx.recyclerview.widget.RecyclerView
import com.fivebb.selfcare.R
import com.fivebb.selfcare.databinding.ItemRechargeBinding

import com.fivebb.selfcare.delegates.RechargeDelegate
import com.fivebb.shared.vos.RechargeVO
import kotlinx.android.synthetic.main.item_recharge.view.*

class RechargeViewHolder(var binding: ItemRechargeBinding ) :
    RecyclerView.ViewHolder(binding.root) {

    @SuppressLint("SetTextI18n")
    fun bind(data: RechargeVO, delegate: RechargeDelegate) {

        binding.lblGB.text = data.quota.toString() + " GB"
        binding.lblDays.text = data.validity.toString() + " Days"
        binding.lblPrice.text = data.price

        when (data.flag) {
            "new" -> {
                itemView.imgTags.setImageResource(R.drawable.icon_new)
            }
            "hot" -> {
                itemView.imgTags.setImageResource(R.drawable.icon_hot)
            }
            "promo" -> {
                itemView.imgTags.setImageResource(R.drawable.icon_promo)
            }
        }

        itemView.setOnClickListener {
                delegate.onItemClick(data)
        }
    }
}