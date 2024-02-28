package com.fivebb.selfcare.delegates

import com.fivebb.selfcare.network.requests.AYAPayRequest
import com.fivebb.selfcare.network.requests.CitizenPayRequest
import com.fivebb.selfcare.network.requests.KBZPreCreateRequest
import com.fivebb.selfcare.network.requests.WavePayRequest

interface AvdTopUpActionDelegate : BankActionDelegate {
    fun loadBankList()

    fun onTapPayWithKBZPay(request: KBZPreCreateRequest)

    //AYA Pay
    fun onTapPayWithAYAPay(request: AYAPayRequest)

    fun onPayWithCitizen(request: CitizenPayRequest)

    fun citizenPaymentRetrieve(request: CitizenPayRequest)
    //WavePay
    fun onTapWavePayRequest(request: WavePayRequest)
}