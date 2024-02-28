package com.fivebb.selfcare.models

import android.content.Context
import com.fivebb.selfcare.R
import com.fivebb.selfcare.utils.*
import com.fivebb.shared.vos.BankVO
import com.fivebb.shared.vos.HelpVO
import com.fivebb.shared.vos.PaymentMethodVO

object PaymentMethodModel {

    fun getBankList(): MutableList<BankVO> {

        val bankList = mutableListOf<BankVO>()

        bankList.add(
            BankVO(
                1,
                "https://bankinfovideo.s3-ap-southeast-1.amazonaws.com/Kpay.mp4",
                R.drawable.kbz_pay,
                R.string.lbl_open_kbz_pay,
                KBZ_PAY_PACKAGE_NAME
            )
        )

        /*bankList.add(
            BankVO(2,
                "https://bankinfovideo.s3.ap-southeast-1.amazonaws.com/MSP.mp4",
                R.drawable.citizens_pay,
                R.string.lbl_open_mcf,
                CITIZEN_PACKAGE_NAME)
        )*/
        bankList.add(
            BankVO(2,
                "https://bankinfovideo.s3-ap-southeast-1.amazonaws.com/WaveMoney.mp4",
                R.drawable.ic_wpay ,
                R.string.lbl_open_wavemoney,
                WAVE_MONEY_PACKAGE_NAME)
        )
        bankList.add(
            BankVO(
                3,
                "https://s3-ap-southeast-1.amazonaws.com/coveragemapfiles/KBZ.mp4",
                R.drawable.kbz,
                R.string.lbl_open_kbz_mobile_banking,
                KBZ_MOBILE_BANKING_PACKAGE_NAME
            )
        )
        bankList.add(
            BankVO(
                4,
                "https://s3-ap-southeast-1.amazonaws.com/coveragemapfiles/AYA.mp4",
                R.drawable.aya,
                R.string.lbl_open_aya_mobile_banking,
                AYA_MOBILE_BANKING_PACKAGE_NAME
            )
        )

        bankList.add(
            BankVO(
                5,
                "https://s3-ap-southeast-1.amazonaws.com/coveragemapfiles/CB.mp4",
                R.drawable.cb_pay,
                R.string.lbl_open_cb_mobile_banking,
                CB_MOBILE_BANKING_PACKAGE_NAME
            )
        )

        bankList.add(
            BankVO(
                6,
                "https://bankinfovideo.s3.ap-southeast-1.amazonaws.com/OnePay.mp4",
                R.drawable.onepay,
                R.string.lbl_open_onepay,
                ONE_PAY_PACKAGE_NAME
            )
        )

        bankList.add(
            BankVO(7,
            "https://bankinfovideo.s3.ap-southeast-1.amazonaws.com/MSP.mp4",
            R.drawable.msp,
            R.string.lbl_open_msp,
            MSP_PACKAGE_NAME)
        )
        return bankList
    }
}