package com.fivebb.selfcare.viewpods

import android.app.AlertDialog
import android.content.Context
import android.content.Intent
import android.util.AttributeSet
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat.startActivity
import androidx.lifecycle.ViewModelProviders
import com.fivebb.selfcare.R
import com.fivebb.selfcare.activities.AccountDetailActivity
import com.fivebb.selfcare.activities.AddNewEmailAty
import com.fivebb.selfcare.delegates.EmailActionDelegate
import com.fivebb.selfcare.delegates.LatestPaymentActionDelegate
import com.fivebb.selfcare.mvp.presenters.AccountDetailsPresenter
import kotlinx.android.synthetic.main.activity_help.view.*
import kotlinx.android.synthetic.main.view_pod_account_detail_item.view.*
import java.util.regex.Pattern


class AccountDetailItemViewPod @JvmOverloads constructor(
        context: Context, attr: AttributeSet? = null, defStyleAttr: Int = 0)
    : ConstraintLayout(context, attr, defStyleAttr) {

    companion object {
        var mDelegate: EmailActionDelegate? = null

        fun newInstance(view: View,delegate: EmailActionDelegate) : AccountDetailItemViewPod {
            val viewPod = view as AccountDetailItemViewPod
            mDelegate = delegate
            return viewPod
        }
    }

    override fun onFinishInflate() {
        super.onFinishInflate()

    }

    fun bindData(name: String, value: String) {
        tvName.text = name
        tvValue.text = value
    }

    fun onClick()
    {
        editEmail.visibility = View.VISIBLE
        /*editEmail.setOnClickListener { it ->
            mDelegate?.onGetEmailList()*/
            /*val alertDialog = AlertDialog.Builder(it.context)
            val customLayout : View = LayoutInflater.from(it.context!!).inflate(R.layout.add_email_new, null)
            alertDialog.setView(customLayout)
            val alert = alertDialog.create()
            alert.setTitle("5BB")
            alert.setCancelable(false)
            alert.setCanceledOnTouchOutside(false)
            val addNew = customLayout.findViewById<TextView>(R.id.txtAddNew)
            val editText = customLayout.findViewById<EditText>(R.id.etMessage)
            val submitBtn: Button = customLayout.findViewById(R.id.btnOK)
            val cancelBtn: Button = customLayout.findViewById(R.id.btnCancel)
            val tvBody = customLayout.findViewById<TextView>(R.id.lblAlert)

            submitBtn.setOnClickListener { it ->
                submitBtn.isEnabled = true
                val userText = editText.text.toString()
                if (userText != "") {
                    if(isValidEmailId(userText)){
                        mPresenter.changeEmail(customLayout.context)
                        // alert.dismiss()
                    }else{
                        tvBody.visibility = View.VISIBLE
                        tvBody.text = "* InValid Email Address."
                    }

                    //  submitBtnClick.onClick(userText)
                } else {
                    tvBody.visibility = View.VISIBLE
                    tvBody.text = "* Please Enter your email."
                }
            }
            cancelBtn.setOnClickListener {
                alert.dismiss()
            }
            alert.show()*/
        //}
    }

}