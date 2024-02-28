package com.fivebb.selfcare.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import com.fivebb.selfcare.R
import com.fivebb.selfcare.viewholders.ActivityLogViewHolder
import com.fivebb.shared.adapters.BaseRecyclerAdapter
import com.fivebb.shared.holders.BaseViewHolder
import com.fivebb.shared.vos.ActivityLogVO

class ActivityLogAdapter: BaseRecyclerAdapter<ActivityLogViewHolder, ActivityLogVO>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<ActivityLogVO> {
        val viewHolder = LayoutInflater.from(parent.context).inflate(R.layout.view_holder_activity_log, parent, false)
        return ActivityLogViewHolder(viewHolder)
    }

//    override fun onBindViewHolder(holder: BaseViewHolder<ActivityLogVO>, position: Int) {
//
//    }
//
//    override fun getItemCount(): Int {
//        return 9
//    }
}