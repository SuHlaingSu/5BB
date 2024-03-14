package com.fivebb.selfcare.mvp.views

import android.content.Context
import androidx.lifecycle.LifecycleOwner
import com.fivebb.shared.mvp.views.BaseView
import com.fivebb.shared.vos.*

interface HomeScreenView : BaseView {

    fun getContext() : Context

    fun onUiReady(billList: MutableList<BillVO> ,
                  payment: MutableList<PaymentHistoryVO>,
                  serviceInstanceDetails: ServiceInstanceDetailsVO?,
                  serviceInstanceSummary: ServiceInstanceSummaryVO)

    fun showAdsDialog(data: AppImageVO)

    fun saveAdvPay(paymentVO: AdvancePaymentVO)
    fun showPXInfo(pxDetailVO: PXDetailVO)

    fun bindSliderImage(data: MutableList<AppImageVO>)

    fun showBillingList(billList: MutableList<BillVO>)

    fun navigateToProfileActivity()
    fun navigateToGooglePlayStore()
    fun showForceUpdateDialog(isForceUpdate:Boolean,versionName: String)
    fun afterClickDownload(invoiceVO: InvoiceVO)
    fun navigateToAdvPayTopUp()
    fun viewClickInvoice(invoiceVO: InvoiceVO)

    fun topUpListener(billList: MutableList<BillVO>)

}