package com.fivebb.selfcare.adapters.noti

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.NonNull
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.ListAdapter
import com.fivebb.selfcare.R
import com.fivebb.selfcare.databinding.ViewHolderNotificationSmallBinding
import com.fivebb.selfcare.delegates.NotificationActionDelegate
import com.fivebb.selfcare.network.requests.GetNotiIdRequest
import com.fivebb.shared.vos.NotificationVO



class NotificationListAdapter(val delegate : NotificationActionDelegate) : ListAdapter<NotificationVO, NotiViewHolder>(NotiCallback()) {
    var onPressed = false
    @NonNull
    override fun onCreateViewHolder(@NonNull parent: ViewGroup, i: Int): NotiViewHolder {
        val binding = DataBindingUtil.inflate<ViewHolderNotificationSmallBinding>(
            LayoutInflater.from(parent.context),
            R.layout.view_holder_notification_small,
            parent,
            false
        )
        return NotiViewHolder(binding)
    }
    override fun onBindViewHolder(@NonNull holder: NotiViewHolder, i: Int) {
        holder.bind(getItem(i),delegate,onPressed)
        holder.setIsRecyclable(false)
    }

    override fun getItemViewType(position: Int): Int {
        return position
    }
    fun deleteItem(IDList: List<GetNotiIdRequest>)
    {
        this.currentList.let {
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
        currentList.let {
            it.removeAt(adapterPosition)
        }
        notifyDataSetChanged()
    }
}
