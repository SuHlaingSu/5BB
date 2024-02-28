package com.fivebb.selfcare.fragments

import android.app.Activity
import android.app.DatePickerDialog
import android.app.Dialog
import android.content.Context
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import com.fivebb.selfcare.delegates.DatePickerActionDelegate
import com.fivebb.shared.utils.SharedUtils
import java.text.SimpleDateFormat
import java.util.*

class DatePickerFragment(val mDelegate: DatePickerActionDelegate): DialogFragment() {

 //   private lateinit var mDelegate: DatePickerActionDelegate

    companion object {

        const val DATE_PICKER_FRAGMENT = "DATE_PICKER_FRAGMENT"

        fun newInstance(delegate: DatePickerActionDelegate) : DatePickerFragment {
            return DatePickerFragment(delegate)
        }
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {

        Locale.setDefault(Locale.US)

        val calendar = Calendar.getInstance(Locale.US)
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val day = calendar.get(Calendar.DAY_OF_MONTH) + 1

        val datePickerDialog = DatePickerDialog(requireContext(), dateSetListener, year, month, day)
        datePickerDialog.datePicker.minDate= System.currentTimeMillis() + 24*60*60*1000

        return datePickerDialog
    }

    private val dateSetListener = DatePickerDialog.OnDateSetListener{ view, year, monthOfYear, dayOfMonth ->

        val pickerCalendar = Calendar.getInstance(Locale.US)
        pickerCalendar.set(year, monthOfYear, dayOfMonth)

        val simpleDateFormat = SimpleDateFormat("dd/MM/yyyy", Locale.US)
        val dateString = simpleDateFormat.format(pickerCalendar.time)

        mDelegate.chooseDate(dateString)
    }

//    override fun onAttach(context: Context) {
//        super.onAttach(context)
//        mDelegate = context as DatePickerActionDelegate
//    }

}