package com.fivebb.selfcare.activities

//import io.reactivex.disposables.CompositeDisposable
//import org.mmtextview.MMFontUtils
import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.fivebb.selfcare.BuildConfig
import com.fivebb.selfcare.R
import com.fivebb.selfcare.mvp.presenters.LoginPresenter
import com.fivebb.selfcare.mvp.views.LoginView
import com.fivebb.selfcare.utils.SharedPreferenceUtils
import com.fivebb.shared.activities.BaseActivity
import com.fivebb.shared.components.PasswordVisibilityListener
import com.fivebb.shared.utils.InputValidityUtil
import com.fivebb.shared.utils.setMMHint
import com.fivebb.shared.vos.AdvancePaymentVO
import com.fivebb.shared.vos.CheckVericationVO
import com.fivebb.shared.vos.LoginHistroyVO
import io.reactivex.Flowable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_login.*
import java.io.IOException

class LoginActivity : BaseActivity(), LoginView {

    override fun getContext(): Context = applicationContext
    //private val disposables = CompositeDisposable()
    private lateinit var mPresenter: LoginPresenter
    private var checkedRememberMe: Boolean = false
    //var currentStep : Int = 0

    companion object {

        fun newIntent(context: Context): Intent {
            return Intent(context, LoginActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_login)

        /*MMFontUtils.initMMTextView(this) {
            val intent = newIntent(this)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
        }*/
        setUpPresenter()
        setUpListeners()
        bindLocalizedData()

        mPresenter.checkedRememberPreviousAccountId()

        //Set application version
        val versionNo = getString(R.string.lbl_app_version,BuildConfig.VERSION_NAME)  +" "+ BuildConfig.FLAVOR
        SharedPreferenceUtils.saveVersionNo(this,versionNo)
        tvVersion.text = versionNo
    }

    private fun setUpPresenter() {
        mPresenter = ViewModelProviders.of(this).get(LoginPresenter::class.java)
        mPresenter.initPresenter(this)
    }

    private fun setUpListeners() {

        cbRememberMe.setOnCheckedChangeListener { _, checked ->
            checkedRememberMe = checked
        }

        btnLogin.setOnClickListener {

            if (areRequiredFieldsFilled()) {
                mPresenter.loginAndGetAccountDetail(
                    etAccountNumber.text.toString().trim(),
                    etPassword.text.toString().trim(),
                    checkedRememberMe
                )
            }

        }

        etPassword.setOnTouchListener(PasswordVisibilityListener())

        mPresenter.mErrorLiveData.observe(this, Observer {
            showErrorMessage(it)
        })

        mPresenter.mShowProgressLoadingDialogLiveData.observe(this, Observer {
            showLoadingDialog()
        })

        mPresenter.mHideProgressLoadingDialogLiveData.observe(this, Observer {
            hideLoadingDialog()
        })

        var loginHistory = listOf<LoginHistroyVO>()

        mPresenter.getLoginHistory().observe(this, Observer { it ->
            loginHistory = it
            val adapter =
                ArrayAdapter(applicationContext, R.layout.list_item, it.toMutableList().map {
                    it.username
                })
            etAccountNumber.setAdapter(adapter)
        })

        tvForgotPassword.setOnClickListener {
            mPresenter.onTapForgetPassword()
        }

        //Auto Fill Password
//        etAccountNumber.addTextChangedListener(object : TextWatcher {
//            override fun afterTextChanged(s: Editable?) {
//                loginHistory.find {it.username == s.toString()}.let {
//                    if (it != null) etPassword.setText(it.password)
//                }
//            }
//
//            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
//
//            }
//
//            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
//
//            }
//
//        })
    }

    private fun areRequiredFieldsFilled(): Boolean {
        return InputValidityUtil.isGivenEditTextHasInput(
            etAccountNumber,
            tilAccountNumber,
            resources.getString(R.string.err_fill_account_number)
        ) &&
                InputValidityUtil.isGivenEditTextHasInput(
                    etPassword,
                    tilPassword,
                    resources.getString(R.string.err_fill_password)
                )
    }

    private fun bindLocalizedData() {
        tilAccountNumber.setMMHint(R.string.lbl_customer_account_number)
        tilPassword.setMMHint(R.string.lbl_password)
    }

    override fun fillPreviousAccountIdAndRememberMe(
        accountId: String,
        password: String,
        checkedRememberMe: Boolean
    ) {
        if (checkedRememberMe) {
            etAccountNumber.setText(accountId)
            etPassword.setText(password)
        }
        cbRememberMe.isChecked = checkedRememberMe
    }

    override fun navigateToHome(serviceType: String) {
        SharedPreferenceUtils.saveServiceType(this,serviceType)
        try {
            mPresenter.onSubscribedTopicsWithAccount()
            callLevel2Form()
        } catch (e: IOException){
            e.printStackTrace()
        }
        //mPresenter.onCallCheckVerification()
       // startActivity(HomeActivity.newIntent(applicationContext, serviceType))
    }

    @SuppressLint("CheckResult")
    override fun callLevel2Form() {
        Flowable.timer(3,java.util.concurrent.TimeUnit.SECONDS)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(){
                Log.d("IntervalDelay","Delay 3 sec")
                mPresenter.getLvl2Form()
            }
    }

    override fun navigateToForgetPassword() {
        //startActivity(SecretQuestionActivity.newIntent(applicationContext))
        startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.5bb.com.mm/Customer/GCustInfo")))
    }

    override fun onSuccessVerification(data: CheckVericationVO) {
        val step = data.Step
        if(step == 10)
        {
            SharedPreferenceUtils.saveCusStep(applicationContext,true)
            val intent =  HomeActivity.newIntent(
                this,
                SharedPreferenceUtils.getServiceType(applicationContext)
            )
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            SharedPreferenceUtils.deleteCusStep(applicationContext)
            startActivity(intent)
            finish()
        }else{
            startActivity(CheckVerificationActivity.newIntent(applicationContext))
        }
    }

    override fun level2Form(advancePaymentVO: AdvancePaymentVO) {
       val isEnableForm =  advancePaymentVO.configuration.isEnable_Lvl2Form
        if(isEnableForm)
        {
            mPresenter.onCallCheckVerification()
        }else
        {
            startActivity(HomeActivity.newIntent(applicationContext, SharedPreferenceUtils.getServiceType(this)))
        }
    }
}
