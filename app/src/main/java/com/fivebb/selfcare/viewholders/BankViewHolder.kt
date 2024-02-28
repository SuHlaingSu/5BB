package com.fivebb.selfcare.viewholders

import android.view.View
import android.widget.FrameLayout
import com.bumptech.glide.Glide
import com.fivebb.selfcare.R
import com.fivebb.selfcare.delegates.BankActionDelegate
import com.fivebb.shared.holders.BaseViewHolder
import com.fivebb.shared.utils.ScreenUtils
import com.fivebb.shared.vos.BankVO
import kotlinx.android.synthetic.main.view_holder_bank.view.*

class BankViewHolder(itemView: View, private val mDelegate: BankActionDelegate) : BaseViewHolder<BankVO>(itemView) {


    override fun setData(data: BankVO) {

        mData = data
        Glide.with(itemView.context)
            .load(data.logo)
            .into(itemView.ivBank)

        if (data.isChecked) {
            itemView.background = itemView.resources.getDrawable(R.drawable.plan_type_border_primary)
        } else itemView.background = itemView.resources.getDrawable(R.drawable.bg_white_fill_round)

    }

    override fun onClick(view: View?) {
        mDelegate.onTapBank(mData)
    }


}