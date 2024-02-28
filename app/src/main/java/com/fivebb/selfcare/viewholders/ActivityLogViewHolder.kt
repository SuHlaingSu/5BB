package com.fivebb.selfcare.viewholders

import android.view.View
import com.fivebb.shared.holders.BaseViewHolder
import com.fivebb.shared.utils.SharedConstants
import com.fivebb.shared.utils.SharedUtils
import com.fivebb.shared.vos.ActivityLogVO
import kotlinx.android.synthetic.main.view_holder_activity_log.view.*
import java.text.SimpleDateFormat
import java.util.*

class ActivityLogViewHolder(itemView: View) : BaseViewHolder<ActivityLogVO>(itemView) {


    override fun setData(data: ActivityLogVO) {
        mData = data

        val timestamp = SharedUtils.getTimestampFromMobilApiDate(data.activityDate)

        val calendar = Calendar.getInstance()
        calendar.timeInMillis = timestamp


        val dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH)
        val monthOfYear = SharedConstants.MONTHS[calendar.get(Calendar.MONTH)]

        val timeFormat = SimpleDateFormat(SharedConstants.FORMAT_TIME_HH_MM, Locale.US)

        itemView.tvLogTitle.text = data.activityType
        itemView.tvLogContent.text = data.description
        itemView.tvDate.text = "$dayOfMonth $monthOfYear"
        itemView.tvTime.text = timeFormat.format(calendar.time)
    }

    override fun onClick(p0: View?) {

    }


}