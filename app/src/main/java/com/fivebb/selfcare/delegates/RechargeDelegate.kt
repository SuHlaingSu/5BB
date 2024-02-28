package com.fivebb.selfcare.delegates

import com.fivebb.shared.vos.RechargeVO


interface RechargeDelegate {
    fun onItemClick(recharge: RechargeVO)
}