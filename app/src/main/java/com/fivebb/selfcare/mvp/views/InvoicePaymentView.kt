package com.fivebb.selfcare.mvp.views

import com.fivebb.selfcare.network.requests.CitizenPayRequest
import com.fivebb.selfcare.network.requests.WavePayRequest
import com.fivebb.selfcare.network.responses.*
import com.fivebb.shared.mvp.views.BaseView
import com.fivebb.shared.vos.BankVO
import com.fivebb.shared.vos.CombinePaymentDataVO
import com.fivebb.shared.vos.PaymentMethodVO

interface InvoicePaymentView: BaseView {

    fun showAllBankPayment(data: MutableList<BankVO>)

    fun showAllPaymentMethod(combinePayment: CombinePaymentDataVO)

    fun showAllPaymentMethodList(paymentList: MutableList<PaymentMethodVO>)

    fun showSelectedBankInfo(data: BankVO)

    fun showSelectedPaymentInfo(payment: CombinePaymentDataVO)

    fun showKBZPayAPP(data:KBZOrderInfoResponse)

    fun navigateToPaymentSuccess()

    fun navigateToVideoFullScreen(url: String,position: Long)

    fun errorResponseKBZPayApp(response: String)

    fun ayaPayLink(data: AYARequestPushPaymentResponse)

    fun responseOfAYAPay(message:String)

    fun mcfPayPaymentLink(data: CitizenPayResponse)

    fun citizenPaymentRetrieveStatus(response:CitizenRetrieveResponse)

    fun callPayRetrieveStatus (status : CitizenPayRequest)

    //WavePay
    fun requestWavePayResponse(data:WavePayResponse)
    fun requestQueryOrderWPay(data:WavePayRequest)
    fun queryOrderWPay (data:WaveQueryOrderResponse)


}