package com.fivebb.selfcare.viewpods

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import com.fivebb.selfcare.R
import com.fivebb.selfcare.utils.SharedPreferenceUtils
import com.fivebb.shared.utils.SharedConstants.FORMAT_DATE_D_M_Y
import com.fivebb.shared.utils.SharedConstants.FORMAT_DATE_M_D_Y_T_HH_mm_ss
import com.fivebb.shared.utils.SharedConstants.FORMAT_DATE_YYYY_MM_DD
import com.fivebb.shared.utils.SharedConstants.SERVER_DEFAULT_DATE_FORMAT
import com.fivebb.shared.utils.SharedUtils
import com.fivebb.shared.vos.PlanVO
import com.fivebb.shared.vos.ServiceInstanceSummaryVO
import com.google.gson.Gson
import kotlinx.android.synthetic.main.view_pod_usage_summary.view.*
import kotlin.math.ceil

class UsageSummaryViewPod @JvmOverloads constructor
    (context: Context, attr: AttributeSet? = null, defStyleAttr: Int = 0) :
    ConstraintLayout(context, attr, defStyleAttr) {

    companion object {
        fun newInstance(view: View): UsageSummaryViewPod {
            val viewPod = view as UsageSummaryViewPod
            return viewPod
        }
    }

    override fun onFinishInflate() {
        super.onFinishInflate()
    }


    fun bindData(serviceInstanceDetailsVO: ServiceInstanceSummaryVO?) {

        serviceInstanceDetailsVO?.let {

            val todayDate = SharedUtils.getTodayDateByFormat(SERVER_DEFAULT_DATE_FORMAT)
            // val todayDate = "2020-12-29 11:56:34"
            val strTodayDate = SharedUtils.getTodayDateByFormat(FORMAT_DATE_D_M_Y)
            Log.i("TAG", "Today Date: $strTodayDate")


            val formatTodayDate = SharedUtils.changeDateFormat(
                todayDate,
                SERVER_DEFAULT_DATE_FORMAT,
                FORMAT_DATE_M_D_Y_T_HH_mm_ss
            )

            val expireDate = SharedUtils.changeDateFormat(
                it.expiryDate?.substringBefore("+") ?: formatTodayDate,
                FORMAT_DATE_M_D_Y_T_HH_mm_ss,
                SERVER_DEFAULT_DATE_FORMAT
            )
            val activationDate = SharedUtils.changeDateFormat(
                it.activationDate?.substringBefore("+") ?: formatTodayDate,
                FORMAT_DATE_M_D_Y_T_HH_mm_ss,
                SERVER_DEFAULT_DATE_FORMAT
            )
            val leftDayCount = SharedUtils.getTimeDifferenceFromTwoDatesV2(todayDate, expireDate)

            val packDayCount =
                SharedUtils.getTimeDifferenceFromTwoDatesV2(activationDate, expireDate)

            //Bandwidth
            val planJsonStr = SharedPreferenceUtils.getCurrentPlanVO(context)
            val planVO = Gson().fromJson(planJsonStr, PlanVO::class.java)
            val bandWidth =
                context.getString(R.string.extension_mbps, planVO.downloadSpeed?.toInt().toString())

            // Package name
            val packageName = planVO.planShortName

            // real data
//            this.arcProgress.progress = leftDayCount
//            this.arcProgress.max = packDayCount

            // test
            this.arcProgress.bindData(leftDayCount, packDayCount)

            this.tvDayLeft.text = when {
                leftDayCount == 0 -> context.getString(R.string.lbl_today_last)
                leftDayCount == 1 -> context.getString(R.string.lbl_one_day_left)
                leftDayCount < 0 -> context.getString(R.string.lbl_expired)
                else -> context.getString(R.string.lbl_day_left, leftDayCount.toString())
            }

            val strDayLeft = tvDayLeft.text.toString()

            //val substring = expireDate.substring(0,10)
            SharedPreferenceUtils.saveLTEDayLeft(context,strDayLeft)
            val strexpireDate = SharedUtils.changeDateFormat(
                it.expiryDate?.substringBefore("T") ?: strTodayDate,
                FORMAT_DATE_YYYY_MM_DD,
                FORMAT_DATE_D_M_Y
            )
            SharedPreferenceUtils.saveLTEExpireDate(context, strexpireDate)
            if (packageName != null) {
                SharedPreferenceUtils.saveLTEPackage(context,packageName)
            }
            this.tvLTESpeed.text = bandWidth
            this.tvPackageName.text = packageName
            this.lblTotalDay.text = packDayCount.toString()
            this.lblTotalHalfDay.text = ceil(packDayCount / 2.0).toInt().toString()
        }
    }


}