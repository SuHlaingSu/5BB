package com.fivebb.selfcare.models

import android.content.Context
import com.fivebb.selfcare.R
import com.fivebb.selfcare.network.requests.KBZPreCreateRequest
import com.fivebb.selfcare.utils.*
import com.fivebb.shared.vos.BankVO
import com.fivebb.shared.vos.HelpVO

object StaticDataModel {

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
            BankVO(
                2,
                "https://bankinfovideo.s3-ap-southeast-1.amazonaws.com/Kpay.mp4",
                R.drawable.aya_pay_logo,
                R.string.lbl_open_aya_pay,
                AYA_PAY,
                AYA_PAY
            )
        )

        bankList.add(
            BankVO(3,
                "https://bankinfovideo.s3.ap-southeast-1.amazonaws.com/MSP.mp4",
                R.drawable.citizens_pay,
                R.string.lbl_open_mcf,
                CITIZEN_PACKAGE_NAME)
        )
        bankList.add(
            BankVO(4,
                "https://bankinfovideo.s3-ap-southeast-1.amazonaws.com/WaveMoney.mp4",
                R.drawable.ic_wpay ,
                R.string.lbl_open_wavemoney,
                WAVE_MONEY_PACKAGE_NAME,
                WAVE_PAY
                )
        )
        bankList.add(
            BankVO(
                5,
                "https://s3-ap-southeast-1.amazonaws.com/coveragemapfiles/KBZ.mp4",
                R.drawable.kbz,
                R.string.lbl_open_kbz_mobile_banking,
                KBZ_MOBILE_BANKING_PACKAGE_NAME,
                KBZ_MB
            )
        )
        bankList.add(
            BankVO(
                6,
                "https://s3-ap-southeast-1.amazonaws.com/coveragemapfiles/AYA.mp4",
                R.drawable.aya,
                R.string.lbl_open_aya_mobile_banking,
                AYA_MOBILE_BANKING_PACKAGE_NAME,
                AYA_MB
            )
        )

        bankList.add(
            BankVO(
                7,
                "https://s3-ap-southeast-1.amazonaws.com/coveragemapfiles/CB.mp4",
                R.drawable.cb_pay,
                R.string.lbl_open_cb_mobile_banking,
                CB_MOBILE_BANKING_PACKAGE_NAME,
                CB_PAY
            )
        )

        bankList.add(
            BankVO(
                8,
                "https://bankinfovideo.s3.ap-southeast-1.amazonaws.com/OnePay.mp4",
                R.drawable.onepay,
                R.string.lbl_open_onepay,
                ONE_PAY_PACKAGE_NAME,
                ONE_PAY
            )
        )

        bankList.add(
            BankVO(9,
            "https://bankinfovideo.s3.ap-southeast-1.amazonaws.com/MSP.mp4",
            R.drawable.msp,
            R.string.lbl_open_msp,
            MSP_PACKAGE_NAME,
            MANDALAY_SMART_PAY)
        )
        return bankList
    }

    fun getBankListwithAPI(bankid:Int, bcode:String): MutableList<BankVO> {

        val bankList = mutableListOf<BankVO>()

        when(bcode){
            K_PAY ->
                bankList.add(
                    BankVO(
                        bankid,
                        "https://bankinfovideo.s3-ap-southeast-1.amazonaws.com/Kpay.mp4",
                        R.drawable.kbz_pay,
                        R.string.lbl_open_kbz_pay,
                        KBZ_PAY_PACKAGE_NAME
                    )
                )
        }
        return bankList
    }

    fun getCityAndEmail(context: Context): LinkedHashMap<String, String> {

        val cityAndEmailList: LinkedHashMap<String, String> = LinkedHashMap()

        cityAndEmailList[context.getString(R.string.lbl_select_city)] = ""

        cityAndEmailList[context.getString(R.string.yangon_city)] = "yangon5bbsales@gmail.com"
        cityAndEmailList[context.getString(R.string.mandalay_city)] = "mandalay5bbsales@gmail.com"
        cityAndEmailList[context.getString(R.string.mawlamyaing_city)] =
            "mawlamyaing5bbsales@gmail.com"
        cityAndEmailList[context.getString(R.string.hpaan_city)] = "hpaan5bbsales@gmail.com"
        cityAndEmailList[context.getString(R.string.bago_city)] = "bago5bbsales@gmail.com"
        cityAndEmailList[context.getString(R.string.pyay_city)] = "pyay5bbsales@gmail.com"
        cityAndEmailList[context.getString(R.string.magway_city)] = "magway5bbsales@gmail.com"

        return cityAndEmailList
    }

    fun getHelpVOList(): MutableList<HelpVO> {
        val helpVOList: MutableList<HelpVO> = mutableListOf()

        helpVOList.add(
            HelpVO(
                "5BB_YGN_FX",
                "Yangon",
                "01-2305425",
                "01-524978",
                "yangon5bbsales@gmail.com",
                "No(471), Pyay Road, Kamayut Township, Yangon",
                16.820646,
                96.132142,
                "https://www.facebook.com/5BBbroadband/",
                "https://www.youtube.com/channel/UCQVlPVeErSUw0UO3VAtzxhA"
            )
        )

        helpVOList.add(
            HelpVO(
                "5BB_MDY_FX",
                "Mandalay",
                "09-444874391",
                "09-444874390",
                "mandalay5bbsales@gmail.com",
                "No(190), 28th St, Between 80th & 81st St, Chanayethazan Township, Mandalay",
                21.980304,
                96.083380,
                "https://www.facebook.com/5BBMandalay/",
                "https://www.youtube.com/channel/UCQVlPVeErSUw0UO3VAtzxhA"
            )
        )

        helpVOList.add(
            HelpVO(
                "5BB_BGO_FX",
                "Bago",
                "09-458111105",
                "09-458111104",
                "bago5bbsales@gmail.com",
                "Room(301), Shwe War Tun Hotel, Yangon- Mandalay Highway, Shin Saw Pu Ward, Bago",
                17.340443,
                96.491244,
                "https://www.facebook.com/5BBBago/",
                "https://www.youtube.com/channel/UCQVlPVeErSUw0UO3VAtzxhA"
            )
        )

        helpVOList.add(
            HelpVO(
                "5BB_BGO_LTE",
                "Bago",
                "09-458111105",
                "09-458111104",
                "bago5bbsales@gmail.com",
                "Room(301), Shwe War Tun Hotel, Yangon- Mandalay Highway, Shin Saw Pu Ward, Bago",
                17.340443,
                96.491244,
                "https://www.facebook.com/5BBBago/",
                "https://www.youtube.com/channel/UCQVlPVeErSUw0UO3VAtzxhA"
            )
        )

        helpVOList.add(
            HelpVO(
                "5BB_PYA_FX",
                "Pyay",
                "09-453766618",
                "09-404070236",
                "pyay5bbsales@gmail.com",
                "No(262), Bogyoke Road, Mu Yar Pin Ward, Ywar Bae Qtr(Near Lay Kyoon Man Daing Oil Mill)",
                18.820955,
                95.238685,
                "https://www.facebook.com/5BBbroadbandPyay/",
                "https://www.youtube.com/channel/UCQVlPVeErSUw0UO3VAtzxhA"
            )
        )

        helpVOList.add(
            HelpVO(
                "5BB_PYA_LTE",
                "Pyay",
                "09-453766618",
                "09-404070236",
                "pyay5bbsales@gmail.com",
                "No(262), Bogyoke Road, Mu Yar Pin Ward, Ywar Bae Qtr(Near Lay Kyoon Man Daing Oil Mill)",
                18.820955,
                95.238685,
                "https://www.facebook.com/5BBbroadbandPyay/",
                "https://www.youtube.com/channel/UCQVlPVeErSUw0UO3VAtzxhA"
            )
        )

        helpVOList.add(
            HelpVO(
                "5BB_MLM_FX",
                "Mawlamyine",
                "09-449995551",
                "09-449995552",
                "mawlamyaing5bbsales@gmail.com",
                "No(69-A), Baho Road, In front of Kyaik Thoke Pagoda, Mawlamyine",
                16.479168,
                97.621566,
                "https://www.facebook.com/5BB-Broadband-Mawlamyine-218464605610086/",
                "https://www.youtube.com/channel/UCQVlPVeErSUw0UO3VAtzxhA"
            )
        )

        helpVOList.add(
            HelpVO(
                "5BB_MLM_LTE",
                "Mawlamyine",
                "09-449995551",
                "09-449995552",
                "mawlamyaing5bbsales@gmail.com",
                "No(69-A), Baho Road, In front of Kyaik Thoke Pagoda, Mawlamyine",
                16.479168,
                97.621566,
                "https://www.facebook.com/5BB-Broadband-Mawlamyine-218464605610086/",
                "https://www.youtube.com/channel/UCQVlPVeErSUw0UO3VAtzxhA"
            )
        )

        helpVOList.add(
            HelpVO(
                "5BB_HPN_LTE",
                "Hpa An",
                "09-449995551",
                "09-449995553",
                "hpaan5bbsales@gmail.com",
                "Phoe La Min Shopping Mall, No(2/20), Bogyoke Road, Min Tann Lane, No.(2) ward, Hpa An",
                16.889810,
                97.633568,
                "https://www.facebook.com/5BB-Wireless-Broadband-296483767800398/",
                "https://www.youtube.com/channel/UCQVlPVeErSUw0UO3VAtzxhA"
            )
        )

        helpVOList.add(
            HelpVO(
                "5BB_MGW_LTE",
                "Magway",
                "09-453766618",
                "09-449995554",
                "magway5bbsales@gmail.com",
                "Kaung Mon Centre, Corner of Pyi Taw Thar Rd & Myittar Road, Pyi Taw Thar Ward, Magway",
                20.148671,
                94.931212,
                "https://www.facebook.com/5BB-Wireless-Broadband-296483767800398/",
                "https://www.youtube.com/channel/UCQVlPVeErSUw0UO3VAtzxhA"
            )
        )

        return helpVOList
    }


    private fun getBillingAreaAndEmail(): LinkedHashMap<String, String> {

        var billingAreaAndEmailList: LinkedHashMap<String, String> = LinkedHashMap()

        billingAreaAndEmailList["5BB_YGN_FX"] = "yangon5bbsales@gmail.com"
        billingAreaAndEmailList["5BB_MDY_FX"] = "mandalay5bbsales@gmail.com"
        billingAreaAndEmailList["5BB_BGO_FX"] = "bago5bbsales@gmail.com"
        billingAreaAndEmailList["5BB_BGO_LTE"] = "bago5bbsales@gmail.com"
        billingAreaAndEmailList["5BB_PYA_FX"] = "pyay5bbsales@gmail.com"
        billingAreaAndEmailList["5BB_PYA_LTE"] = "pyay5bbsales@gmail.com"
        billingAreaAndEmailList["5BB_MLM_FX"] = "mawlamyaing5bbsales@gmail.com"
        billingAreaAndEmailList["5BB_MLM_LTE"] = "mawlamyaing5bbsales@gmail.com"
        billingAreaAndEmailList["5BB_HPN_LTE"] = "hpaan5bbsales@gmail.com"
        billingAreaAndEmailList["5BB_MGW_LTE"] = "magway5bbsales@gmail.com"

        billingAreaAndEmailList["5BB_SYH_FX"] = "suyeehlaing1@gmail.com"
        return billingAreaAndEmailList
    }


    fun getEmailByBillingArea(billingArea: String): String {

        return getBillingAreaAndEmail().filter { it.key == billingArea }.values.first()

    }

    fun getCallCenterEmailByBillingArea(billingArea: String): String {
        return if (billingArea == "5BB_MDY_FX") {
            "mandalay5bbcallcenter@gmail.com"
        } else {
            "yangon5bbcallcenter@gmail.com"
        }
    }
}