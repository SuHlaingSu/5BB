package com.fivebb.selfcare.mvp.views

import android.content.Context
import com.fivebb.shared.mvp.views.BaseView
import com.fivebb.shared.vos.AdvancePaymentVO
import com.fivebb.shared.vos.BillVO

interface ProfileView: BaseView {

    fun getContext(): Context
    fun showLoading()
    fun hideLoading()
    fun showBillingList(billList: MutableList<BillVO>)
    fun showAdvPayment(paymentVO: AdvancePaymentVO)
    fun navigateToLoginScreen()
    fun navigateToAccountDetail()
    fun navigateToChangePassword()
    fun navigateToPaymentHistory()
    fun navigateToAdvPayTopUp()


}