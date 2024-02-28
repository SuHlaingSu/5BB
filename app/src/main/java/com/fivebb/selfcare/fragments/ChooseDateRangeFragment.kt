package com.fivebb.selfcare.fragments

import android.app.Dialog
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment
import com.fivebb.selfcare.FiveBBApp.Companion.TAG
import com.fivebb.selfcare.R
import com.fivebb.selfcare.delegates.PaymentHistoryFilterActionDelegate
import com.fivebb.selfcare.utils.SharedPreferenceUtils
import com.fivebb.shared.utils.SharedConstants
import com.fivebb.shared.utils.SharedUtils
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.fragment_choose_date_range.view.*
import mm.technomation.mmtext.MMTextView
//import org.mmtextview.components.MMTextView
import java.text.SimpleDateFormat
import java.util.*

class ChooseDateRangeFragment(val mDelegate: PaymentHistoryFilterActionDelegate) : DialogFragment() {

    private lateinit var dialog: AlertDialog

    private var mFromDate = ""
    private var mToDate = ""
    private var mCreatedDate = ""

    private var chooseFromDate = true

    //private var mDelegate: PaymentHistoryFilterActionDelegate? = null

    companion object {
        const val CHOOSE_DATE_RANGE_FRAGMENT = "CHOOSE_DATE_RANGE_FRAGMENT"

        const val FROM_DATE = "FROM_DATE"

        const val TO_DATE = "TO_DATE"

        fun newInstance(bundle: Bundle? = null,delegate: PaymentHistoryFilterActionDelegate): ChooseDateRangeFragment {
            val fragment = ChooseDateRangeFragment(delegate)
            fragment.arguments = bundle
            return fragment
        }

    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {

        Locale.setDefault(Locale.US)
        mCreatedDate = SharedPreferenceUtils.getCreationDate(requireContext())
        val createDate = SharedUtils.getTimestampForDate(
            SharedUtils.changeDateFormat(
                mCreatedDate,
                SharedConstants.FORMAT_DATE_D_M_Y,
                SharedConstants.FORMAT_DATE_M_D_Y_HH_mm_ss
            )
        )

        mFromDate = SharedUtils.getDateThreeMonthsPreviousToday() //SharedPreferenceUtils.getCreationDate(context!!) (comment by sh)

        Log.i(TAG, "From Date: $mFromDate")
        val minDate = SharedUtils.getTimestampForDate(
            SharedUtils.changeDateFormat(
                mFromDate,
                SharedConstants.FORMAT_DATE_D_M_Y,
                SharedConstants.FORMAT_DATE_M_D_Y_HH_mm_ss
            )
        )

        val dialogView = LayoutInflater.from(context).inflate(R.layout.fragment_choose_date_range, null)

        dialogView.btnFromDate.text = mFromDate

        dialogView.calendarView.setDate(createDate, true, true)

        dialogView.calendarView.minDate = createDate
        dialogView.calendarView.maxDate = SharedUtils.getTimestampForDate(
            SharedUtils.changeDateFormat(
                SharedUtils.getFormattedDateForToday(),
                SharedConstants.FORMAT_DATE_Y_M_D,
                SharedConstants.FORMAT_DATE_M_D_Y_HH_mm_ss
            )
        )

        val bundle = this.arguments
        bundle?.let {

            mToDate = SharedUtils.getDateForToday()

            /* if ((it.getString(FROM_DATE) ?: "").isNotEmpty() &&
                 (it.getString(TO_DATE) ?: "").isNotEmpty()
             ) {*/

            /*  mFromDate = it.getString(FROM_DATE) ?: ""
              mToDate = it.getString(TO_DATE) ?: ""*/

            dialogView.btnFromDate.text = mFromDate
            dialogView.btnToDate.text = mToDate


            val ToDateChose = SharedUtils.getTimestampForDate(
                SharedUtils.changeDateFormat(
                    mToDate,
                    SharedConstants.FORMAT_DATE_D_M_Y,
                    SharedConstants.FORMAT_DATE_M_D_Y_HH_mm_ss
                )
            )
            dialogView.calendarView.setDate(ToDateChose, true, true)


            val fromDateChose = SharedUtils.getTimestampForDate(
                SharedUtils.changeDateFormat(
                    mFromDate,
                    SharedConstants.FORMAT_DATE_D_M_Y,
                    SharedConstants.FORMAT_DATE_M_D_Y_HH_mm_ss
                )
            )
            dialogView.calendarView.setDate(fromDateChose, true, true)
            //}
        }

        val builder = AlertDialog.Builder(requireContext())
        builder.setView(dialogView)

        dialog = builder.create()

        dialogView.btnFromDate.setOnClickListener {
            enabelView(dialogView.btnFromDate)
            disableView(dialogView.btnToDate)
            chooseFromDate = true
            dialogView.calendarView.minDate = createDate
                SharedUtils.getTimestampForDate(
                SharedUtils.changeDateFormat(
                    SharedUtils.getDateThreeMonthsPreviousToday(),
                    SharedConstants.FORMAT_DATE_D_M_Y,
                    SharedConstants.FORMAT_DATE_M_D_Y_HH_mm_ss
                )
            )

            if (mFromDate.isNotEmpty()) {
                dialogView.calendarView.setDate(
                    SharedUtils.getTimestampForDate(
                        SharedUtils.changeDateFormat(
                            mFromDate,
                            SharedConstants.FORMAT_DATE_D_M_Y,
                            SharedConstants.FORMAT_DATE_M_D_Y_HH_mm_ss
                        )
                    ), true, true)
            }
        }

        dialogView.btnToDate.setOnClickListener {
            enabelView(dialogView.btnToDate)
            disableView(dialogView.btnFromDate)
            chooseFromDate = false
            dialogView.calendarView.minDate = createDate
                SharedUtils.getTimestampForDate(
                SharedUtils.changeDateFormat(
                    mFromDate,
                    SharedConstants.FORMAT_DATE_D_M_Y,
                    SharedConstants.FORMAT_DATE_M_D_Y_HH_mm_ss
                )
            )

            if (mToDate.isNotEmpty()) {
                dialogView.calendarView.setDate(
                    SharedUtils.getTimestampForDate(
                        SharedUtils.changeDateFormat(
                            mToDate,
                            SharedConstants.FORMAT_DATE_D_M_Y,
                            SharedConstants.FORMAT_DATE_M_D_Y_HH_mm_ss
                        )
                    ), true, true)
            }
        }


        dialogView.ivClose.setOnClickListener {
            this.dialog.dismiss()
        }

        dialogView.btnOk.setOnClickListener {
            if (mToDate.isEmpty()) {
                showSnackBar(dialogView, getString(R.string.err_choose_date_range))
            } else {
                swapValidDateRangeAndAction()
                this.dialog.dismiss()
            }
        }

        dialogView.calendarView.setOnDateChangeListener { view, year, monthOfYear, dayOfMonth ->

            val pickerCalendar = Calendar.getInstance(Locale.US)
            pickerCalendar.set(year, monthOfYear, dayOfMonth)

            val simpleDateFormat = SimpleDateFormat(SharedConstants.FORMAT_DATE_D_M_Y, Locale.US)
            val dateString = simpleDateFormat.format(pickerCalendar.time)

            if (chooseFromDate) {
                mFromDate = dateString
                dialogView.btnFromDate.text = dateString
            } else {
                mToDate = dateString
                dialogView.btnToDate.text = dateString
            }
        }

        return dialog
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

//    override fun onAttach(context: Context) {
//        super.onAttach(context)
//        mDelegate = context as PaymentHistoryFilterActionDelegate
//    }

    private fun disableView(view: MMTextView) {
        view.background = resources.getDrawable(R.drawable.bg_border_divider)
        view.setTextColor(resources.getColor(R.color.divider))
        view.setPadding(
            resources.getDimension(R.dimen.margin_medium).toInt(),
            resources.getDimension(R.dimen.margin_medium).toInt(),
            resources.getDimension(R.dimen.margin_medium).toInt(),
            resources.getDimension(R.dimen.margin_medium).toInt()
        )
    }

    private fun enabelView(view: MMTextView) {
        view.background = resources.getDrawable(R.drawable.bg_primary_border)
        view.setTextColor(resources.getColor(R.color.colorPrimary))
        view.setPadding(
            resources.getDimension(R.dimen.margin_medium).toInt(),
            resources.getDimension(R.dimen.margin_medium).toInt(),
            resources.getDimension(R.dimen.margin_medium).toInt(),
            resources.getDimension(R.dimen.margin_medium).toInt()
        )
    }

    private fun showSnackBar(view: View, message: String) {
        val msgUnicodeOrigin = SharedUtils.mmTextUnicodeOrigin(message, requireContext())
        Snackbar.make(view, msgUnicodeOrigin, Snackbar.LENGTH_SHORT).show()
    }

    private fun swapValidDateRangeAndAction() {

        val fromDate = mFromDate

        if (SharedUtils.getTimestampFromUserChooseDate(fromDate) > SharedUtils.getTimestampFromUserChooseDate(mToDate)) {
            mFromDate = mToDate
            mToDate = fromDate
        }

        mDelegate.onTapChooseDateRange(mFromDate, mToDate)
    }
}