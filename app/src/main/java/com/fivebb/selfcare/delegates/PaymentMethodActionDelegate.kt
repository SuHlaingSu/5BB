package com.fivebb.selfcare.delegates

import com.fivebb.shared.vos.BankVO
import com.fivebb.shared.vos.CombinePaymentDataVO
import com.fivebb.shared.vos.PaymentMethodVO

interface PaymentMethodActionDelegate {

    fun onTapBank(paymentMethodVO: CombinePaymentDataVO)
}