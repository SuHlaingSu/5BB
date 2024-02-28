package com.fivebb.selfcare.viewholders

import android.R.attr.key
import android.R.attr.start
import android.annotation.SuppressLint
import android.content.Intent
import android.view.View
import androidx.core.content.ContextCompat.startActivity
import com.fivebb.selfcare.R
import com.fivebb.selfcare.activities.InfoNotiDetailActivity
import com.fivebb.selfcare.activities.LoginActivity
import com.fivebb.selfcare.delegates.NotificationActionDelegate
import com.fivebb.shared.holders.BaseViewHolder
import com.fivebb.shared.vos.NotificationVO
import kotlinx.android.synthetic.main.view_holder_notification.view.tvNotificationDescription
import kotlinx.android.synthetic.main.view_holder_notification.view.tvNotificationTitle
import kotlinx.android.synthetic.main.view_holder_notification_small.view.*
import java.text.SimpleDateFormat


class NotificationViewHolder(itemView: View,private val delegate : NotificationActionDelegate ,private val viewImage: Boolean = false) : BaseViewHolder<NotificationVO>(
    itemView
) {

    private var showedMore = false

    init {

//        if (viewImage) {
//
//            itemView.ivNotification.visibility = View.GONE
//            Glide.with(itemView.context)
//                .load("https://mm.myanmartechpress.com/wp-content/uploads/2018/04/2.jpg")
//                .into(itemView.ivNotification)
//
//        } else itemView.ivNotification.visibility = View.GONE
//

        itemView.checkbox.setOnCheckedChangeListener { _, isChecked ->
            if(!isChecked){
                itemView.checkbox.visibility=View.GONE
                this.mData.isSelected= false
            }
        }
        itemView.itemBody.setOnLongClickListener {
            if(this.mData.category!="Transaction") {
                itemView.checkbox.visibility = View.VISIBLE
                itemView.checkbox.isChecked = true
                this.mData.isSelected = true
            }
            true
        }

        itemView.tvShowMore.setOnClickListener {
            if (showedMore) {
                itemView.tvShowMore.text = itemView.resources.getText(R.string.lbl_show_more)
                itemView.tvNotificationDescription.maxLines = 2
                showedMore = !showedMore
            } else {
                itemView.tvShowMore.text = itemView.resources.getText(R.string.lbl_show_less)
                itemView.tvNotificationDescription.maxLines = Int.MAX_VALUE
                showedMore = !showedMore
            }
        }
    }

    @SuppressLint("SetTextI18n")
    override fun setData(data: NotificationVO) {
        itemView.tvNotificationTitle.text = data.title
        itemView.tvNotificationDescription.text = data.content
        this.mData = data
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


        itemView.tvTime.text  = "${data.sentDate.formatDate(data)} at ${data.sentDate.formatTime(data)}"
//        itemView.ivLogo.setOnClickListener{
//            delegate.onSingleDelete(data)
//        }
        itemView.setOnClickListener {
            delegate.onClickNotiInbox(data)
        }
      /*  if(itemView.tvNotificationDescription.text.length > 150){
            itemView.tvShowMore.visibility = View.VISIBLE
        } else {
            itemView.tvShowMore.visibility = View.INVISIBLE
        }*/ //close commented by SH

    }

    override fun onClick(v: View?) {


    }
}

fun String.formatDate(data: NotificationVO) : String{
    val parser = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss")
    var formatter = SimpleDateFormat("dd-MMMM-yyyy")
    return formatter.format(parser.parse(data.sentDate))
}

fun String.formatTime(data: NotificationVO) : String{
    val parser = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss")
    var formatter = SimpleDateFormat("hh:mm aa")
    return formatter.format(parser.parse(data.sentDate))
}
