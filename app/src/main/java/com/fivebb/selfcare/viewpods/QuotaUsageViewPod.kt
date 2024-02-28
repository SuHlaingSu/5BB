package com.fivebb.selfcare.viewpods

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import com.fivebb.shared.vos.*
import kotlinx.android.synthetic.main.view_pod_quota_usage.view.*
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

class QuotaUsageViewPod @JvmOverloads constructor
    (context: Context, attr: AttributeSet? = null, defStyleAttr: Int = 0) :
    ConstraintLayout(context, attr, defStyleAttr) {

    companion object {
        fun newInstance(view: View): QuotaUsageViewPod {
            val viewPod = view as QuotaUsageViewPod
            return viewPod
        }
    }

    override fun onFinishInflate() {
        super.onFinishInflate()
    }

    fun bindData(
        adjustedBalanceVO: RemainingAdjustedBalanceVO,
        nonMonentryBalanceVO: ArrayList<NonMonentryBalanceVO>
    )
    {
        val consumedBal = nonMonentryBalanceVO[0].balanceConsumed
        val totalBal = nonMonentryBalanceVO[0].totalBalance

        val splitComsumed = consumedBal.replace(",", "")

        val intCB = splitComsumed.toDouble()
        val intTB =  totalBal.toDouble()

        val percent = (intCB/intTB) * 100
        this.progress.progress = percent.toInt()

        this.lblLTE_Plan.text = adjustedBalanceVO.planName
        this.txtTotalQuota.text = nonMonentryBalanceVO[0].balanceAvailable + " " + nonMonentryBalanceVO[0].usageLimitType

        val strExpDate = adjustedBalanceVO.expireDate
        Log.v("exp date",strExpDate.toString())
        val formatLong = SimpleDateFormat("dd/MM/yyyy HH:mm:ss", Locale.US)
        val formatShort = SimpleDateFormat("dd/MM/yyyy hh:mm aa", Locale.US)
        Log.v("out", formatShort.format(formatLong.parse(strExpDate)))

        this.lbl_date.text = "${"Expiry Date : "}"+ formatShort.format(formatLong.parse(strExpDate))
        this.txtExpiryDate.text = adjustedBalanceVO.expireIn
        //this.lblBalanceAvailable.text = nonMonentryBalanceVO[0].balanceAvailable + " GB"
        //this.txtTotalQuota.text = nonMonentryBalanceVO[0].totalBalance + " " + nonMonentryBalanceVO[0].usageLimitType

    }
}