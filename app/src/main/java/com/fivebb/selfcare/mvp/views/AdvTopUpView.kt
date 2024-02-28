package com.fivebb.selfcare.mvp.views

import android.content.Context
import com.fivebb.selfcare.network.requests.AYAPayRequest
import com.fivebb.selfcare.network.requests.CitizenPayRequest
import com.fivebb.selfcare.network.requests.WavePayRequest
import com.fivebb.selfcare.network.responses.*
import com.fivebb.shared.mvp.views.BaseView
import com.fivebb.shared.vos.AdvPlanListVO
import com.fivebb.shared.vos.BankVO
import com.fivebb.shared.vos.PlanPriceListVO

interface AdvTopUpView :BaseView {
    fun getContext(): Context

    fun showAllBank(data: MutableList<BankVO>)

    fun showSelectedBankInfo(data: BankVO)

    fun showKBZPayAPP(data: KBZOrderInfoResponse)

    fun getPlanPriceList(data:PlanPriceListVO)

    fun goToBank ()

    fun status(status:String)

    fun chooseToPlan ()

    //AYA Pay
    fun ayaPayLink(data: AYARequestPushPaymentResponse)
    fun requestQueryOrderAYAPay(data: AYAPayRequest)
    fun responseOfAYAPay(message:String)
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