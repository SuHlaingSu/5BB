package com.fivebb.selfcare.adapters.email

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.NonNull
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.ListAdapter
import com.fivebb.selfcare.R
import com.fivebb.selfcare.databinding.ShowListEmailBinding
import com.fivebb.selfcare.databinding.ViewHolderNotificationSmallBinding
import com.fivebb.selfcare.delegates.EmailActionDelegate
import com.fivebb.selfcare.delegates.NotificationActionDelegate
import com.fivebb.selfcare.network.requests.GetNotiIdRequest
import com.fivebb.selfcare.network.responses.EmailListResponse
import com.fivebb.shared.vos.NotificationVO

class EmailAdapter(val delegate : EmailActionDelegate) : ListAdapter<EmailListResponse, EmailViewHolder>(EmailCallback()) {
   /* var onPressed = false
    var IsPrimary = false*/
    @NonNull
    override fun onCreateViewHolder(@NonNull parent: ViewGroup, i: Int): EmailViewHolder {
        val binding = DataBindingUtil.inflate<ShowListEmailBinding>(
            LayoutInflater.from(parent.context),
            R.layout.show_list_email,
            parent,
            false
        )
        return EmailViewHolder(binding)
    }
    override fun onBindViewHolder(@NonNull holder: EmailViewHolder, i: Int) {
        holder.bind(getItem(i),delegate)
        holder.setIsRecyclable(false)
    }

    override fun getItemViewType(position: Int): Int {
        return position
    }
}
