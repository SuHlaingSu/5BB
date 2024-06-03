package com.fivebb.selfcare.mvp.presenters

import android.content.Context
import com.fivebb.selfcare.delegates.BankActionDelegate
import com.fivebb.selfcare.delegates.PaymentMethodActionDelegate
import com.fivebb.selfcare.network.requests.AYAPayRequest
import com.fivebb.selfcare.network.requests.CitizenPayRequest
import com.fivebb.selfcare.network.requests.KBZPreCreateRequest
import com.fivebb.selfcare.network.requests.WavePayRequest

interface PxPaymentPresenter : BankActionDelegate,PaymentMethodActionDelegate {

    //fun getContext()
    fun loadBankList()

    fun loadPaymentMethodList()

    //Kpay
    fun onTapPayWithKBZPay(request:KBZPreCreateRequest,context: Context)
    //AYA Pay
    fun onTapPayWithAYAPay(request:AYAPayRequest,context: Context)
    //Citizen
    fun onPayWithCitizen(request: CitizenPayRequest,context: Context)
    fun citizenPaymentRetrieve(request: CitizenPayRequest)
    //WavePay
    fun onTapWavePayRequest(request: WavePayRequest,context: Context)

    fun onTapFullScreen(url: String,position: Long)
}