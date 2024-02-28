package com.fivebb.selfcare.delegates

import com.fivebb.shared.vos.BankVO
import com.fivebb.shared.vos.NotificationVO

interface NotificationActionDelegate {
    fun onClickNotiInbox(noti: NotificationVO)
    fun onSingleDelete(noti: NotificationVO)
    fun onLongPressed()

}