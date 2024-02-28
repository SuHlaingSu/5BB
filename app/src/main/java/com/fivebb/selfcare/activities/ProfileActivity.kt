package com.fivebb.selfcare.activities

import android.app.AlertDialog
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.os.SystemClock
import android.util.Log
import android.view.View
import androidx.lifecycle.ViewModelProviders
import com.fivebb.selfcare.BuildConfig
import com.fivebb.selfcare.R
import com.fivebb.selfcare.mvp.presenters.ProfilePresenter
import com.fivebb.selfcare.mvp.views.ProfileView
import com.fivebb.selfcare.utils.SharedPreferenceUtils
import com.fivebb.shared.activities.BaseActivity
import com.fivebb.shared.utils.SharedConstants
import com.fivebb.shared.vos.AdvancePaymentVO
import com.fivebb.shared.vos.BillVO
import com.github.florent37.viewtooltip.ViewTooltip
import com.github.florent37.viewtooltip.ViewTooltip.ListenerDisplay
import com.github.florent37.viewtooltip.ViewTooltip.ListenerHide
import kotlinx.android.synthetic.main.activity_profile.*
//import org.mmtextview.MMFontUtils
//import org.mmtextview.utils.LibConstants

class ProfileActivity : BaseActivity(), ProfileView {

    override fun getContext(): Context = applicationContext
    private var activityOpenInProgress = false

    override fun showAdvPayment(paymentVO: AdvancePaymentVO) {
        /*var balance: String? = paymentVO.adjustedBalanceVO?.balance
        val longval: Long
        if (balance?.contains(",")!!) {
            balance = balance?.replace(",", "")
        }
        longval = balance?.toLong()
        val formatter = DecimalFormat("#,###,###")
        val formattedString = formatter.format(longval)
        txtPay.text= (formattedString + " MMK")*/
        txtPay.text= paymentVO.adjustedBalanceVO?.balance + " MMK"
    }

    private lateinit var mPresenter: ProfilePresenter

    companion object {
        fun newIntent(context: Context): Intent {
            return Intent(context, ProfileActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        setUpPresenter()
        initListeners()
        bindLocalizedData()

        //set application version
        tvAppVersion.text = getString(R.string.lbl_app_version,BuildConfig.VERSION_NAME)

        if (SharedPreferenceUtils.getServiceType(applicationContext) == SharedConstants.SERVICE_TYPE_LTE)
        {
            btnAdvPay.visibility = View.GONE
        }
        else{
            btnAdvPay.visibility = View.VISIBLE
        }

       if(SharedPreferenceUtils.getIsSufficient(applicationContext)){
           txtPay.text = SharedPreferenceUtils.getBalance(this)
       }else{
           txtPay.text = SharedPreferenceUtils.getBalance(this)
           lblAdvPay.setTextColor(Color.RED)
           txtPay.setTextColor(Color.RED)
       }
    }

    private fun setUpPresenter() {
        mPresenter = ViewModelProviders.of(this).get(ProfilePresenter::class.java)
        mPresenter.initPresenter(this)
    }

    private fun initListeners() {

        ivBack.setOnClickListener {
            finish()
        }
        txtTooltips.setOnClickListener {
            ViewTooltip.on(txtTooltips)
                .position(ViewTooltip.Position.BOTTOM)
                .arrowSourceMargin(0)
                .arrowTargetMargin(0)
                .corner(100)
                .color(Color.BLACK)
                .align(ViewTooltip.ALIGN.START)
                .distanceWithView(0)
                .text(resources.getString(R.string.txt_tooltips))
                .autoHide(true, 4000)
                .onDisplay(ListenerDisplay { Log.d("ViewTooltip", "onDisplay") })
                .onHide(ListenerHide { Log.d("ViewTooltip", "onHide") })
                .show()
        }

        swipeRefresh.setOnRefreshListener {
            mPresenter.getAdvPayment()
            bindLocalizedData()
        }
        btnAccountDetail.setOnClickListener {
            mPresenter.onTapAccountDetail()
        }

        btnChangePassword.setOnClickListener {
            mPresenter.onTapChangePassword()
        }

        btnPaymentHistory.clickWithDebounce {
            btnPaymentHistory.isEnabled = false
            btnPaymentHistory.isClickable = false
            mPresenter.onTapAdvanceTopUp(applicationContext)
        }

        logout.setOnClickListener {
            mPresenter.onTapLogOut(applicationContext)
        }

        btnLogOut.setOnClickListener {
            mPresenter.onTapPaymentHistory()
        }
    }

    override fun onResume() {
        super.onResume()
        bindLocalizedData()

    }
    private fun View.clickWithDebounce(debounceTime: Long = 600L, action: () -> Unit) {
        this.setOnClickListener(object : View.OnClickListener {
            private var lastClickTime: Long = 0

            override fun onClick(v: View) {
                if (SystemClock.elapsedRealtime() - lastClickTime < debounceTime) return
                else action()

                lastClickTime = SystemClock.elapsedRealtime()
            }
        })
    }

    override fun showLoading() {
        swipeRefresh.isRefreshing = true
    }

    override fun hideLoading() {
        swipeRefresh.isRefreshing = false
    }

    override fun showBillingList(billList: MutableList<BillVO>) {
        billList.let {
            if (billList.size > 0) {

                // setup the alert builder
                val builder: AlertDialog.Builder = AlertDialog.Builder(this)
                builder.setTitle("5BB")
                builder.setMessage(R.string.lbl_alert)
                // add a button
                builder.setPositiveButton("OK", null)

                // create and show the alert dialog
                val dialog: AlertDialog = builder.create()
                dialog.show()
                btnPaymentHistory.isEnabled = true
                btnPaymentHistory.isClickable = true
            } else {
                navigateToAdvPayTopUp()
            }
        }
    }

    private fun bindLocalizedData() {
      /*  if (Build.BRAND.equals(LibConstants.SAMSUNG, true) || MMFontUtils.isSupportUnicode(
                applicationContext
            )) {
            btnAccountDetail.text = resources.getString(R.string.lbl_account_detail_samsung)
            btnChangePassword.text = resources.getString(R.string.lbl_change_password_samsung)
            btnPaymentHistory.text = resources.getString(R.string.lbl_adv_top_up_samsung)
            btnLogOut.text = resources.getString(R.string.lbl_payment_history_samsung)

        }*/
        btnAccountDetail.text = resources.getString(R.string.lbl_account_detail_samsung)
        btnChangePassword.text = resources.getString(R.string.lbl_change_password_samsung)
        btnPaymentHistory.text = resources.getString(R.string.lbl_adv_top_up_samsung)
        btnLogOut.text = resources.getString(R.string.lbl_payment_history_samsung)

        tvAccountNo.text = getString(
            R.string.lbl_profile_account_no, SharedPreferenceUtils.getAccountId(
                applicationContext
            )
        )
        tvName.text = getString(
            R.string.lbl_profile_name, SharedPreferenceUtils.getName(
                applicationContext
            )
        )
        tvStatus.text = getString(
            R.string.lbl_profile_status, SharedPreferenceUtils.getCustomerStatus(
                applicationContext
            )
        )
        tvBillingStatus.text = getString(
            R.string.lbl_profile_billing_status, SharedPreferenceUtils.getBillingStatus(
                applicationContext
            )
        )
    }

    override fun navigateToLoginScreen() {
        val intent = LoginActivity.newIntent(this)
        SharedPreferenceUtils.deleteCusStep(this)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
        startActivity(intent)
    }

    override fun navigateToAccountDetail() {
        startActivity(AccountDetailActivity.newIntent(applicationContext))
    }

    override fun navigateToChangePassword() {
        startActivity(ChangePasswordActivity.newIntent(applicationContext))
    }

    override fun navigateToPaymentHistory() {
        startActivity(PaymentHistoryActivity.newIntent(applicationContext))
    }

    override fun navigateToAdvPayTopUp() {
        btnPaymentHistory.isEnabled = true
        startActivity(ChooseAdvMonthActivity.newIntent(applicationContext))
        btnPaymentHistory.isClickable = true
    }
}

