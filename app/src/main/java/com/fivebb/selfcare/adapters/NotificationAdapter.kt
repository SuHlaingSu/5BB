package com.fivebb.selfcare.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import com.fivebb.selfcare.R
import com.fivebb.selfcare.delegates.NotificationActionDelegate
import com.fivebb.selfcare.network.requests.GetNotiIdRequest
import com.fivebb.selfcare.network.requests.NotiIdRequest
import com.fivebb.selfcare.viewholders.NotificationViewHolder
import com.fivebb.shared.adapters.BaseRecyclerAdapter
import com.fivebb.shared.holders.BaseViewHolder
import com.fivebb.shared.vos.NotificationVO

class NotificationAdapter(private val delegate: NotificationActionDelegate): BaseRecyclerAdapter<NotificationViewHolder, NotificationVO>() {

    private var notiCount = 10

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<NotificationVO> {

        val viewHolder = LayoutInflater.from(parent.context).inflate(R.layout.view_holder_notification_small, parent, false)

        return NotificationViewHolder(viewHolder, delegate)
    }

    fun deleteItem(IDList: List<GetNotiIdRequest>)
    {
        mData?.let {
            for (noti in IDList) {

                for (data in it)
                {
                    data.id == noti.ID
                    it.remove(data)
                    break
                }
            }
            notifyDataSetChanged()
        }

    }

    fun removeAt(adapterPosition: Int) {
        mData?.let {
            it.removeAt(adapterPosition)
        }
        notifyDataSetChanged()
    }
}