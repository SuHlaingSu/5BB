package com.fivebb.selfcare.models

import com.fivebb.selfcare.R
import com.fivebb.selfcare.utils.*
import com.fivebb.shared.vos.BankVO

object RechargeStaticDataModel {

    fun getBankList(): MutableList<BankVO> {

        val bankList = mutableListOf<BankVO>()

        bankList.add(
            BankVO(
                1,
                "https://bankinfovideo.s3-ap-southeast-1.amazonaws.com/Kpay.mp4",
                R.drawable.kbz_pay,
                R.string.lbl_open_kbz_pay,
                KBZ_PAY_PACKAGE_NAME,
                K_PAY
            )
        )
        bankList.add(
            BankVO(2,
                "https://bankinfovideo.s3.ap-southeast-1.amazonaws.com/MSP.mp4",
                R.drawable.aya_pay_logo,
                R.string.lbl_open_aya_pay,
                AYA_PAY,
                AYA_PAY)
        )
        bankList.add(
            BankVO(3,
                "https://bankinfovideo.s3-ap-southeast-1.amazonaws.com/WaveMoney.mp4",
                R.drawable.ic_wpay,
                R.string.lbl_open_wavemoney,
                WAVE_MONEY_PACKAGE_NAME,
                WAVE_PAY)
        )
        bankList.add(
            BankVO(4,
                "https://bankinfovideo.s3-ap-southeast-1.amazonaws.com/WaveMoney.mp4",
                R.drawable.citizens_pay,
                R.string.lbl_open_mcf,
                CITIZEN_PACKAGE_NAME,
                CITIZEN_PAY)
        )
        return bankList
    }

}