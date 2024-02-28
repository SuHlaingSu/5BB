package com.fivebb.selfcare.mvp.views

import com.fivebb.shared.mvp.views.BaseView
import com.fivebb.shared.vos.BankVO

interface BankListView :BaseView {

    fun showAllBank(data: MutableList<BankVO>)

    fun showSelectedBankInfo(data: BankVO)

}