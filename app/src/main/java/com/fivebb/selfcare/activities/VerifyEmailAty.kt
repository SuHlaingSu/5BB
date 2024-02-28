package com.fivebb.selfcare.activities

import android.app.AlertDialog
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.text.Html
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.fivebb.selfcare.R
import com.fivebb.selfcare.delegates.EmailActionDelegate
import com.fivebb.selfcare.mvp.presenters.EmailVerifyPresenter
import com.fivebb.selfcare.mvp.views.EmailVerifyView
import com.fivebb.selfcare.network.responses.EmailListResponse
import com.fivebb.shared.activities.BaseActivity
import com.fivebb.shared.vos.NotificationVO
import kotlinx.android.synthetic.main.add_email_new.*
import kotlinx.android.synthetic.main.add_email_new.iBack
import kotlinx.android.synthetic.main.email_otp.*

class VerifyEmailAty : ApplicationBaseActivity(), EmailVerifyView, EmailActionDelegate {
    private lateinit var mPresenter: EmailVerifyPresenter
    private var  emailListResponse: EmailListResponse?=null
    lateinit var strCode: String

    companion  object {
        fun newIntent(context: Context,requestCode:Int): Intent {
           return Intent(context, VerifyEmailAty::class.java)
            //intent.putExtra(DATA,data)
           // context.startActivity(intent,requestCode)
        }
    }
    override fun getContext(): Context = applicationContext

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.email_otp)
        setUpPresenter()
        setUpListeners()
    }

    private fun setUpPresenter() {
        mPresenter = ViewModelProviders.of(this).get(EmailVerifyPresenter::class.java)
        mPresenter.initPresenter(this)
    }

    private fun setUpListeners() {
        iBack.setOnClickListener {
            finish()
        }
        btnOTP.setOnClickListener {
            setData()
            mPresenter.verifyEmail(this,strCode)
        }
        lblResendAgain.setOnClickListener {
            etOTP.text.clear()
            mPresenter.changeEmail(getContext())
        }
        mPresenter.mShowProgressLoadingDialogLiveData.observe(this, Observer {
            // swipeRefresh.isRefreshing = false
            showLoadingDialog()
        })

        mPresenter.mHideProgressLoadingDialogLiveData.observe(this, Observer {
            // swipeRefresh.isRefreshing = false
            hideLoadingDialog()
        })

        mPresenter.mErrorLiveData.observe(this, Observer {
            //swipeRefresh.isRefreshing = false
            checkErrorMessageAndRedirectLogin(it)
        })
    }

    private fun setData()
    {
        strCode = etOTP.text.toString()
    }

    override fun onGetEmailList() {
        TODO("Not yet implemented")
    }

    override fun onTapAddNew() {
        TODO("Not yet implemented")
    }

    override fun onTapVerify() {
        TODO("Not yet implemented")
    }

   /* override fun showBtnAdd() {
        TODO("Not yet implemented")
    }*/

    override fun showEmailList(emailList: List<EmailListResponse>) {
        TODO("Not yet implemented")
    }

    override fun showMsgVerify(msg: String) {
        //TODO("Not yet implemented")
       // Toast.makeText(getContext(),msg,Toast.LENGTH_LONG).show()
        showLoadingDialog()
        if (alertDialog?.isShowing == true) {
            return
        }
        alertDialog = AlertDialog.Builder(this)
            .setCancelable(true)
            .setIcon(com.fivebb.shared.R.drawable.logo)
            .setTitle(com.fivebb.shared.R.string.lbl_app_title)
            .setPositiveButton(com.fivebb.shared.R.string.lbl_ok) { dialog, _ ->
                    alertDialog?.dismiss()
            }
            .create()

        alertDialog!!.apply {
            setMessage( Html.fromHtml(msg))
        }.show()
        hideLoadingDialog()
    }

    override fun addNewEmail() {
        TODO("Not yet implemented")
    }

    override fun checkVerify(msg: String) {
        //TODO("Not yet implemented")
        finishAndRemoveTask()
        Toast.makeText(applicationContext,msg, Toast.LENGTH_SHORT).show()
       // mPresenter.emailList(getContext())
    }

    override fun updateEmailInfo(msg: String) {
        TODO("Not yet implemented")
    }

    override fun deleteEmail(msg: String) {
        TODO("Not yet implemented")
    }
}