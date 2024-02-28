package com.fivebb.selfcare.activities

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.os.Build
import android.os.Bundle
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
import kotlinx.android.synthetic.main.lte_activity_profile.*
/*import org.mmtextview.MMFontUtils
import org.mmtextview.utils.LibConstants*/

class LTEProfileActivity : BaseActivity(), ProfileView {

    override fun getContext(): Context = applicationContext

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
            return Intent(context, LTEProfileActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.lte_activity_profile)

        setUpPresenter()
        initListeners()
        bindLocalizedData()
        //mPresenter.getAdvPayment()

        //set application version
        tvAppVersion.text = getString(R.string.lbl_app_version,BuildConfig.VERSION_NAME)

        if (SharedPreferenceUtils.getServiceType(applicationContext) == SharedConstants.SERVICE_TYPE_LTE || SharedPreferenceUtils.getCategory(applicationContext) == SharedConstants.CATEGORY_PREPAID)
        {
            btnAdvPay.visibility = View.GONE
        }
        else{
            btnAdvPay.visibility = View.VISIBLE
        }

        if(SharedPreferenceUtils.getIsSufficient(applicationContext).equals(true)){
            txtPay.text = SharedPreferenceUtils.getBalance(this)
        }else{
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
        }
        btnAccountDetail.setOnClickListener {
            mPresenter.onTapAccountDetail()
        }

        btnChangePassword.setOnClickListener {
            mPresenter.onTapChangePassword()
        }

        btnPaymentHistory.setOnClickListener {
            mPresenter.onTapPaymentHistory()
        }

        btnLogOut.setOnClickListener {
            mPresenter.onTapLogOut(applicationContext)
        }

    }

    override fun onResume() {
        super.onResume()
        // mPresenter.getAdvPayment()
    }

    override fun showLoading() {
        swipeRefresh.isRefreshing = true
    }

    override fun hideLoading() {
        swipeRefresh.isRefreshing = false
    }

    override fun showBillingList(billList: MutableList<BillVO>) {

    }

    private fun bindLocalizedData() {
        /*if (Build.BRAND.equals(LibConstants.SAMSUNG, true) || MMFontUtils.isSupportUnicode(
                applicationContext
            )) {
            btnAccountDetail.text = resources.getString(R.string.lbl_account_detail_samsung)
            btnChangePassword.text = resources.getString(R.string.lbl_change_password_samsung)
            btnPaymentHistory.text = resources.getString(R.string.lbl_payment_history_samsung)
            btnLogOut.text = resources.getString(R.string.lbl_log_out_samsung)

        }*/
        btnAccountDetail.text = resources.getString(R.string.lbl_account_detail_samsung)
        btnChangePassword.text = resources.getString(R.string.lbl_change_password_samsung)
        btnPaymentHistory.text = resources.getString(R.string.lbl_payment_history_samsung)
        btnLogOut.text = resources.getString(R.string.lbl_log_out_samsung)
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
        //TODO("Not yet implemented")
    }

}
