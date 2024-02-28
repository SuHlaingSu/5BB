package com.fivebb.selfcare.mvp.views

import android.content.Context
import com.fivebb.selfcare.network.requests.GetNotiIdRequest
import com.fivebb.selfcare.network.requests.GetRechargePlanListRequest
import com.fivebb.selfcare.network.requests.NotiIdRequest
import com.fivebb.shared.mvp.views.BaseView
import com.fivebb.shared.vos.BankVO
import com.fivebb.shared.vos.NotificationVO
import com.fivebb.shared.vos.RechargeVO

interface RechargeView : BaseView {
    fun getContext(): Context
    fun showData(rechargeList: List<RechargeVO>)
    fun showMessage(message: String)
}