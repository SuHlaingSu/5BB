package com.fivebb.selfcare.dialog

import android.content.DialogInterface
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.fivebb.selfcare.R
import kotlinx.android.synthetic.main.dialog_force_update.*


class ForceUpdateDialog(private val isForceUpdate: Boolean,private val versionName: String,val onTapUpdate: () -> Unit) :
    DialogFragment() {

    companion object {
        const val TAG = "ForceUpdateDialog"
        fun newInstance(isForceUpdate: Boolean,versionName: String, onTapUpdate: () -> Unit): ForceUpdateDialog {
            return ForceUpdateDialog(isForceUpdate, versionName,onTapUpdate)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.dialog_force_update, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dialog?.setCancelable(false)
        tvVersionName.text = versionName
        isCancelable = !isForceUpdate
        setUpListeners()

        if (isForceUpdate) {
            btnNotNow.visibility = View.GONE
        } else {
            btnNotNow.visibility = View.VISIBLE
        }
    }

    private fun setUpListeners() {
        btnNotNow.setOnClickListener {
            dismiss()
        }

        btnUpdate.setOnClickListener {
            onTapUpdate()
        }
    }

    override fun onStart() {
        super.onStart()
//        dialog?.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        val metrics = resources.displayMetrics
        val width = metrics.widthPixels
        dialog?.window?.setLayout((19 * width) / 20, ViewGroup.LayoutParams.WRAP_CONTENT)
    }

}