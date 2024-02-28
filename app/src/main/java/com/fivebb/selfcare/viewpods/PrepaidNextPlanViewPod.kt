package com.fivebb.selfcare.viewpods

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import com.fivebb.shared.vos.*
import kotlinx.android.synthetic.main.view_pod_prepaid.view.*
import kotlinx.android.synthetic.main.view_pod_prepaid.view.NotYet
import kotlinx.android.synthetic.main.view_pod_prepaid.view.lblExpiryDate
import kotlinx.android.synthetic.main.view_pod_prepaid.view.txtNotYet
import kotlinx.android.synthetic.main.view_pod_prepaid_next_plan.view.*
import java.text.SimpleDateFormat
import java.util.*

class PrepaidNextPlanViewPod @JvmOverloads constructor
    (context: Context, attr: AttributeSet? = null, defStyleAttr: Int = 0) :
    ConstraintLayout(context, attr, defStyleAttr) {

    companion object {
        fun newInstance(view: View): PrepaidNextPlanViewPod {
            return view as PrepaidNextPlanViewPod
        }
    }

    override fun onFinishInflate() {
        super.onFinishInflate()
    }

    fun bindData(
       nextPlan: PXNextPlanVO
    )
    {
        if(nextPlan.packageID != null)
        {
            val strExpDate = nextPlan.endDate
            Log.v("exp date from response",strExpDate.toString())
            val formatLong = SimpleDateFormat("dd/MM/yyyy HH:mm:ss", Locale.US)
            val formatShort = SimpleDateFormat("dd/MM/yyyy hh:mm aa", Locale.US)
            Log.v("out", formatShort.format(formatLong.parse(strExpDate)))

            this.txtPkgPlanName.text =  nextPlan.fullName + "(" + nextPlan.download_speed + ")"
            this.txtStartAndEndDate.text = nextPlan.startDate + " - " + nextPlan.endDate
            this.txtValidity.text = "("+ nextPlan.validity_lbl + ")"
        }

    }
}