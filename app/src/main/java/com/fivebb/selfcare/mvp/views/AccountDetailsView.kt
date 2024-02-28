package com.fivebb.selfcare.mvp.views

import com.fivebb.selfcare.network.responses.EmailListResponse
import com.fivebb.shared.mvp.views.BaseView
import com.fivebb.shared.vos.CustomerBasicViewDetailsVO

interface AccountDetailsView: BaseView {

    fun showCustomerBasicViewDetail(customerDetails: CustomerBasicViewDetailsVO)

    fun showCustomerInfoExpend()
   // fun showContactInfoExpend()
    fun showBillingInfoExpend()
   // fun showPlanInfoExpend()
}