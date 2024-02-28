package com.fivebb.selfcare.viewpods

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import com.fivebb.selfcare.delegates.PrepaidActionDelegate
import com.fivebb.selfcare.utils.SharedPreferenceUtils
import com.fivebb.shared.vos.*
import kotlinx.android.synthetic.main.view_pod_prepaid.view.*
import java.text.SimpleDateFormat
import java.util.*

class PrepaidViewPod @JvmOverloads constructor
    (context: Context, attr: AttributeSet? = null, defStyleAttr: Int = 0) :
    ConstraintLayout(context, attr, defStyleAttr) {

    companion object {
        var mDelegate:PrepaidActionDelegate?=null

        fun newInstance(view: View,delegate: PrepaidActionDelegate): PrepaidViewPod {
            val viewPod = view as PrepaidViewPod
            mDelegate = delegate

            return viewPod
        }
    }

    override fun onFinishInflate() {
        super.onFinishInflate()
        btnTopUp.setOnClickListener {
            mDelegate?.onTapTopUp()
        }
    }

    @SuppressLint("SetTextI18n")
    fun bindData(
       adjustedBalanceVO: RemainingAdjustedBalanceVO,nextPlan:PXNextPlanVO,currentPlanVO: PXCurrentPlanVO
    )
    {
        if(adjustedBalanceVO.expireDate != null)
        {
            val strExpDate = adjustedBalanceVO.expireDate
            Log.v("exp date",strExpDate.toString())
            val formatLong = SimpleDateFormat("dd/MM/yyyy HH:mm:ss", Locale.US)
            val formatShort = SimpleDateFormat("dd/MM/yyyy hh:mm aa", Locale.US)
            Log.v("out", formatShort.format(formatLong.parse(strExpDate)))

            this.txtExpiryIn.text =  adjustedBalanceVO.expireIn
            this.lblExpiryDate.text = "${"Expiry Date : "}"+ formatShort.format(formatLong.parse(strExpDate))

            this.NotYet.visibility = View.GONE
            this.txtNotYet.visibility = View.GONE
        }
        val nextPlanStartDate = currentPlanVO.next_plan_start_date
        if (nextPlanStartDate != null) {
            SharedPreferenceUtils.savePXNextPlanStartDate(context,nextPlanStartDate)
        }

        if(nextPlan.packageID != null)
        {
            this.lyNext.visibility = View.VISIBLE
            btnTopUp.visibility = View.GONE
            val strExpDate = nextPlan.endDate
            val strStartDate = nextPlan.startDate
            Log.v("exp date from response",strExpDate.toString())
            val formatLong = SimpleDateFormat("dd/MM/yyyy HH:mm:ss", Locale.US)
            val formatShort = SimpleDateFormat("dd/MM/yyyy hh:mm aa", Locale.US)
            Log.v("out", formatShort.format(strExpDate?.let { formatLong.parse(it) } as Date))

            this.txtPkgPlanName.text =  nextPlan.pkg_displayName + " - " + nextPlan.download_speed
            this.txtStartAndEndDate.text = formatShort.format(formatLong.parse(strStartDate)) + " - " + formatShort.format(formatLong.parse(strExpDate))
            this.txtValidity.text = "("+ nextPlan.validity_lbl + ")"
        }else{
            btnTopUp.visibility = View.VISIBLE
            this.lyNext.visibility = View.GONE
        }

    }
}