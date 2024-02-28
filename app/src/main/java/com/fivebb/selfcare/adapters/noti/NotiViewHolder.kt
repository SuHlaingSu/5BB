package com.fivebb.selfcare.adapters.noti

import android.graphics.Color
import android.graphics.Typeface
import android.view.View
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.fivebb.selfcare.R

import com.fivebb.selfcare.databinding.ViewHolderNotificationSmallBinding
import com.fivebb.selfcare.delegates.NotificationActionDelegate
import com.fivebb.selfcare.viewholders.formatDate
import com.fivebb.selfcare.viewholders.formatTime
import com.fivebb.shared.utils.SharedUtils
import com.fivebb.shared.vos.NotificationVO
import kotlinx.android.synthetic.main.view_holder_notification.view.*
import kotlinx.android.synthetic.main.view_holder_notification.view.ivLogo
import kotlinx.android.synthetic.main.view_holder_notification.view.tvNotificationDescription
import kotlinx.android.synthetic.main.view_holder_notification.view.tvNotificationTitle
import kotlinx.android.synthetic.main.view_holder_notification.view.tvTime
import kotlinx.android.synthetic.main.view_holder_notification_small.view.*


class NotiViewHolder(var binding: ViewHolderNotificationSmallBinding) :
    RecyclerView.ViewHolder(binding.root) {
    private var showedMore = false

    fun bind(data: NotificationVO, delegate: NotificationActionDelegate, onPressed: Boolean) {

        if(!data.isRead)
        {
            binding.tvNotificationTitle.setTypeface(null,Typeface.BOLD)
            binding.tvNotificationDescription.setTypeface(null,Typeface.BOLD)
            binding.tvNotificationTitle.text = data.title
            binding.tvNotificationDescription.text = data.content
        }else{
            binding.tvNotificationTitle.text = data.title
            binding.tvNotificationDescription.text = data.content
            binding.tvNotificationTitle.setTextColor(Color.BLACK)
            binding.tvNotificationDescription.setTextColor(Color.BLACK)
            binding.container.setBackgroundColor(Color.parseColor("#ebedef"))
            binding.container.alpha=0.8f

        }
        when (data.category) {
            "Information" -> {
                itemView.ivLogo.setImageResource(R.drawable.ic_info_noti)
            }
            "Transaction" -> {
                itemView.ivLogo.setImageResource(R.drawable.ic_transcation_noti)
            }
            "Promotion" -> {
                itemView.ivLogo.setImageResource(R.drawable.ic_promo_noti)
            }
            else -> {
            }
        }
        binding.checkbox.setOnCheckedChangeListener { _, isChecked ->
            if(data.category !="Transaction"){
                data.isSelected = isChecked
            }else{
                binding.checkbox.isChecked =false
            }

        }
        binding.checkbox.isChecked = data.isSelected
        binding.itemBody.setOnLongClickListener {
            delegate.onLongPressed()
            itemView.checkbox.visibility = View.VISIBLE
            if (data.category != "Transaction") {
                itemView.checkbox.isChecked = true
                data.isSelected = true
            }
            true
        }

        binding.tvShowMore.setOnClickListener {

            if (showedMore) {
                binding.tvShowMore.text = itemView.resources.getText(R.string.lbl_show_more)
                binding.tvNotificationDescription.maxLines = 2
                showedMore = !showedMore
            } else {
                binding.tvShowMore.text = itemView.resources.getText(R.string.lbl_show_less)
                binding.tvNotificationDescription.maxLines = Int.MAX_VALUE
                showedMore = !showedMore
            }
        }

        binding.tvTime.text = SharedUtils.formatDateT("${data.sentDate}")
            //"${data.sentDate.formatDate(data)} at ${data.sentDate.formatTime(data)}"
//        itemView.ivLogo.setOnClickListener{
//            delegate.onSingleDelete(data)
//        }
        itemView.setOnClickListener {
            if(onPressed){
                binding.checkbox.isChecked = !binding.checkbox.isChecked
                data.isSelected = binding.checkbox.isChecked
            }else{
                data.isRead=true
                delegate.onClickNotiInbox(data)
            }
        }
        if (onPressed) {
            itemView.checkbox.visibility = View.VISIBLE
            if (data.category != "Transaction") {
                binding.checkbox.isEnabled= true
                binding.checkbox.isClickable = true
            }else{
                binding.checkbox.isEnabled= false
                binding.checkbox.isClickable = false
            }
        } else {
            itemView.checkbox.visibility = View.GONE
        }
        /*  if(itemView.tvNotificationDescription.text.length > 150){
              itemView.tvShowMore.visibility = View.VISIBLE
          } else {
              itemView.tvShowMore.visibility = View.INVISIBLE
          }*/ //close commented by SH
    }
}