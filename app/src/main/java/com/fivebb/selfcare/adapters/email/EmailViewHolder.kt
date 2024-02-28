package com.fivebb.selfcare.adapters.email

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.fivebb.selfcare.databinding.ShowListEmailBinding
import com.fivebb.selfcare.delegates.EmailActionDelegate
import com.fivebb.selfcare.network.responses.EmailListResponse
import com.fivebb.selfcare.utils.SharedPreferenceUtils

class EmailViewHolder(var binding: ShowListEmailBinding) : RecyclerView.ViewHolder(binding.root) {
    var mEmailList = ArrayList<EmailListResponse>()

    fun bind(data: EmailListResponse, delegate: EmailActionDelegate) {
        mEmailList.add(data)
        if(!data.isPrimary)
        {
            binding.btnOK.visibility = View.VISIBLE
            binding.imgVerified.visibility = View.GONE
            binding.txtEmailName.text = data.email
        }else{
            binding.btnOK.visibility = View.GONE
            binding.imgVerified.visibility = View.VISIBLE
            binding.txtEmailName.text = data.email
            //delegate.showBtnAdd()
        }

        binding.btnOK.setOnClickListener {
           val strEmail = data.email
            SharedPreferenceUtils.saveEmailVerifyAcc(itemView.context,strEmail)
            delegate.onTapVerify()
        }
        //Log.i("TAG", "bind: " + mEmailList.toString())
        /*binding.tvTime.text = SharedUtils.formatDateT("${data.sentDate}")*/
    }
}