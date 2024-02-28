package com.fivebb.selfcare.viewholders

import android.view.View
import android.widget.FrameLayout
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.fivebb.selfcare.R
import com.fivebb.selfcare.delegates.BankActionDelegate
import com.fivebb.selfcare.delegates.PaymentMethodActionDelegate
import com.fivebb.shared.holders.BaseViewHolder
import com.fivebb.shared.utils.ScreenUtils
import com.fivebb.shared.vos.BankVO
import com.fivebb.shared.vos.CombinePaymentDataVO
import com.fivebb.shared.vos.PaymentMethodVO
import kotlinx.android.synthetic.main.view_holder_bank.view.*

class PaymentMethodViewHolder(itemView: View, private val mDelegate: PaymentMethodActionDelegate) : BaseViewHolder<CombinePaymentDataVO>(itemView) {

    override fun setData(data: CombinePaymentDataVO) {
        mData = data

        Glide.with(itemView.context)
            .load(data.logo)
            //.apply(RequestOptions().placeholder(R.drawable.logo))
            .into(itemView.ivBank)

        if (data.isChecked) {
            itemView.background = itemView.resources.getDrawable(R.drawable.plan_type_border_primary)
        } else itemView.background = itemView.resources.getDrawable(R.drawable.bg_white_fill_round)
    }

    override fun onClick(view: View?) {
        mDelegate.onTapBank(mData)
    }


}