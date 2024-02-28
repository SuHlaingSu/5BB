package com.fivebb.selfcare.adapters.advPaymentChooseMonth

import android.util.Log
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.fivebb.selfcare.databinding.RdoItemBinding
import com.fivebb.selfcare.delegates.AdvPayMonthActionDelegate
import com.fivebb.shared.vos.AdvPlanListVO
import com.fivebb.shared.vos.PlanPriceListVO
import okhttp3.internal.notify

class AdvPaymentViewHolder(var binding: RdoItemBinding,val delegate: AdvPayMonthActionDelegate) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(data: AdvPlanListVO, delegate: AdvPayMonthActionDelegate) {
        binding.lblPlanName.text = data.promo_name_eng
        binding.lblPlanNote.text = data.note
        binding.lblPrice.text = data.totAmt
        if(data.taxPercentage != 0)
        {
            binding.lblTaxNote.text = data.taxPercentage.toString() + "% commercial tax included"
        }else{
            binding.lblTaxNote.visibility = View.GONE
        }

        binding.btnSelect.setOnClickListener {
                delegate.onSelectClick(data)
            }
        }
    }