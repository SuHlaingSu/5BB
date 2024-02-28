package com.fivebb.selfcare.mvp.views

import android.content.Context
import com.fivebb.selfcare.network.requests.*
import com.fivebb.selfcare.network.responses.*
import com.fivebb.shared.mvp.views.BaseView
import com.fivebb.shared.vos.BankVO
import com.fivebb.shared.vos.NotificationVO
import com.fivebb.shared.vos.RechargeVO

interface RechargeTopUpView : BaseView {
    fun showAllBank(data: MutableList<BankVO>)
    fun showSelectedBankInfo(data: BankVO)
    //KBZ
    fun showKBZPayAPP(data: KBZOrderInfoResponse)
    //AYA
    fun ayaPayLink(data: AYARequestPushPaymentResponse)
    fun responseOfAYAPay(message:String)
    fun requestQueryOrderAYAPay(data: AYAPayRequest)
    fun queryOrderAYAPay (data: AYAQueryOrderResponse)
    //Citizen
    fun mcfPayPaymentLink(data: CitizenPayResponse)
    fun citizenPaymentRetrieveStatus(response: CitizenRetrieveResponse)
    fun callPayRetrieveStatus (status : CitizenPayRequest)
    //WavePay
    fun requestWavePayResponse(data: WavePayResponse)
    fun requestQueryOrderWPay(data: WavePayRequest)
    fun queryOrderWPay (data: WaveQueryOrderResponse)
}