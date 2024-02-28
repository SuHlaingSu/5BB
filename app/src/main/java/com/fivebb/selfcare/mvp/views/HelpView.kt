package com.fivebb.selfcare.mvp.views

import android.content.Context
import com.fivebb.shared.mvp.views.BaseView
import com.fivebb.shared.vos.HelpVO
import com.fivebb.shared.vos.RegionVO

interface HelpView: BaseView {

    fun bindData(data: RegionVO)

    fun bindDataList(data: List<RegionVO> )

    fun getContext() : Context

    fun navigateToSendEmailActivity(email: String)

}