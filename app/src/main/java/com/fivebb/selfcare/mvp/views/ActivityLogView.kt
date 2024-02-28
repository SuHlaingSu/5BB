package com.fivebb.selfcare.mvp.views

import android.content.Context
import com.fivebb.shared.mvp.views.BaseView
import com.fivebb.shared.vos.ActivityLogVO

interface ActivityLogView: BaseView {

    fun getContext() : Context

    fun showActivityLog(activityLogList: MutableList<ActivityLogVO>,fromDate: String,toDate: String)
    fun showDatePickerDialog()

    //fun showDateRange(fromDate: String,toDate: String)
}