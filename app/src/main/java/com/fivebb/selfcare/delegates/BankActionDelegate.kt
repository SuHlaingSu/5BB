package com.fivebb.selfcare.delegates

import com.fivebb.shared.vos.BankVO
import com.fivebb.shared.vos.PaymentMethodVO

interface BankActionDelegate {

    fun onTapBank(bank: BankVO)

}