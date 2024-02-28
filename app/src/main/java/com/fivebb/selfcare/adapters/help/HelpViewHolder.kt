package com.fivebb.selfcare.adapters.help

import android.annotation.SuppressLint
import androidx.recyclerview.widget.RecyclerView
import com.fivebb.selfcare.R
import com.fivebb.selfcare.databinding.ListItemShowroomBinding
import com.fivebb.selfcare.delegates.HelpActionDelegate
import com.fivebb.shared.vos.RegionVO

class HelpViewHolder(var binding: ListItemShowroomBinding) :
    RecyclerView.ViewHolder(binding.root) {

    @SuppressLint("SetTextI18n")
    fun bind(data: RegionVO) {
        if (data.showroomName == null || data.showroomName =="") {
            binding.tvShowroomName.text = "Information"
        }
        else{
            binding.tvShowroomName.text = data.showroomName
        }

        changeBackground(data.isSelected)

    }
    private fun changeBackground(isSelected: Boolean) {
        if (isSelected) {
            binding.tvShowroomName.background = itemView.resources.getDrawable(R.drawable.plan_type_fill_primary)
        }
    }
}