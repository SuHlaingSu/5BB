package com.fivebb.selfcare.mvp.views

import android.content.Context
import com.fivebb.shared.mvp.views.BaseView
import com.fivebb.shared.vos.CustomerBasicViewDetailsVO

interface CreateTicketView: BaseView {
    fun getContext() : Context

    fun showCustomerBasicDetail(customerBasicViewDetails: CustomerBasicViewDetailsVO)

    fun showSendEmailSuccess(successMessage: String)
}