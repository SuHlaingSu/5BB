package com.fivebb.selfcare.activities

import android.annotation.SuppressLint
import android.app.Activity
import android.app.AlertDialog
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import com.facebook.share.Share
import com.fivebb.selfcare.R
import com.fivebb.selfcare.adapters.BankAdapter
import com.fivebb.selfcare.adapters.PaymentMethodAdapter
import com.fivebb.selfcare.mvp.presenters.impls.InvoicePaymentPresenterImpl
import com.fivebb.selfcare.mvp.views.InvoicePaymentView
import com.fivebb.selfcare.network.requests.AYAPayRequest
import com.fivebb.selfcare.network.requests.CitizenPayRequest
import com.fivebb.selfcare.network.requests.KBZPreCreateRequest
import com.fivebb.selfcare.network.requests.WavePayRequest
import com.fivebb.selfcare.network.responses.*
import com.fivebb.selfcare.utils.*
import com.fivebb.shared.utils.SharedConstants
import com.fivebb.shared.utils.SharedUtils
import com.fivebb.shared.vos.BankVO
import com.fivebb.shared.vos.CombinePaymentDataVO
import com.fivebb.shared.vos.PaymentMethodVO
import com.google.android.exoplayer2.*
import com.google.android.exoplayer2.source.ExtractorMediaSource
import com.google.android.exoplayer2.source.MediaSource
import com.google.android.exoplayer2.source.TrackGroupArray
import com.google.android.exoplayer2.source.dash.DashMediaSource
import com.google.android.exoplayer2.source.dash.DefaultDashChunkSource
import com.google.android.exoplayer2.source.hls.HlsMediaSource
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector
import com.google.android.exoplayer2.trackselection.TrackSelectionArray
import com.google.android.exoplayer2.upstream.DefaultHttpDataSourceFactory
import com.google.android.material.snackbar.Snackbar
import com.kbzbank.payment.KBZPay
import com.kbzbank.payment.sdk.callback.CallbackResultActivity
import io.reactivex.Flowable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_callback_result.*
import kotlinx.android.synthetic.main.activity_invoice_payment.*
import java.util.*
import java.util.concurrent.TimeUnit


class InvoicePaymentActivity : ApplicationBaseActivity(), InvoicePaymentView {

    private lateinit var mPresenter: InvoicePaymentPresenterImpl

    private lateinit var mBankAdapter: BankAdapter

    private lateinit var mPaymentMethodAdapter: PaymentMethodAdapter

    private lateinit var mFullScreenImageButton: ImageButton

    private var player: ExoPlayer? = null

    private var nowPlayingUrl: String = ""

    private var mAmount: String = ""

    private var mUnpaidAmount: String = ""

    private var mBillNo: String = ""
    private var orderID: String = ""
    private var cusPh: String = ""

    private var mCurrency: String = ""

    private var timeStamp : String = ""

    private lateinit var disposable: Disposable

    companion object {

        const val UNPAID_AMOUNT = "UNPAID_AMOUNT"
        const val BILL_MONTH= "BILL_MONTH"
        const val BILL_NO = "BILL_NO"
        const val CURRENCY = "CURRENCY"
        const val AMOUNT = "AMOUNT"
        const val BILL_DATE = "BILL_DATE"
        const val DUE_DATE = "DUE_DATE"
        const val BILL_ID = "BILL_ID"

        fun newIntent(
            context: Context,
            amount: String,
            unPaidAmount: String,
            billMonth: String,
            billNo: String,
            currency: String,
            billDate: Long,
            dueDate: Long,
            billId: String
        ): Intent {
            val intent = Intent(context, InvoicePaymentActivity::class.java)
            intent.putExtra(AMOUNT, amount)
            intent.putExtra(UNPAID_AMOUNT, unPaidAmount)
            intent.putExtra(BILL_MONTH, billMonth)
            intent.putExtra(BILL_NO, billNo)
            intent.putExtra(CURRENCY, currency)
            intent.putExtra(BILL_DATE, billDate)
            intent.putExtra(DUE_DATE, dueDate)
            intent.putExtra(BILL_ID, billId)

            return intent
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_invoice_payment)

        getIntentExtraData()
        initPresenter()

        initListeners()
        setUpRecyclerView()

        hidePlayerViewAndButton()
        mPresenter.loadBankList()//old list
        //mPresenter.loadPaymentMethodList()//new list

    }

    @SuppressLint("SetTextI18n")
    private fun getIntentExtraData() {
        intent.let {
            mCurrency = it.getStringExtra(CURRENCY) ?: ""

            mUnpaidAmount = it.getStringExtra(UNPAID_AMOUNT) ?: ""
            tvUnpaidAmount.text = "$mUnpaidAmount $mCurrency"

            val billMonth = it.getStringExtra(BILL_MONTH)?:""
            SharedPreferenceUtils.saveBillMonth(this, billMonth)

            mAmount = it.getStringExtra(AMOUNT)  ?: ""
           // tvAmount.text = "${mAmount} ${mCurrency}"

            mBillNo = it.getStringExtra(BILL_NO) ?: ""
            tvBillNumber.text = mBillNo

            tvBillDate.text = SharedUtils.getFormattedDateFromTimestamp(
                it.getLongExtra(
                    BILL_DATE,
                    0L
                ), SharedConstants.FORMAT_DATE_D_MMMM_YYYY
            )

            it.getLongExtra(DUE_DATE, 0L).run {
                val formatDateString = SharedUtils.getFormattedDateFromTimestamp(
                    this,
                    SharedConstants.FORMAT_DATE_D_MMMM_YYYY
                )
                tvDueDate.text = resources.getString(
                    R.string.lbl_invoice_due_date,
                    formatDateString
                )
            }
        }
    }

    override fun onResume() {
        super.onResume()
        btnOpenMobileBankingApp.isClickable= true
    }

    override fun onPause() {
        super.onPause()
        releasePlayer()
    }

    override fun onDestroy() {
        super.onDestroy()
        releasePlayer()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == VideoFullScreenActivity.VIDEO_CURRENT_POSITION_REQUEST_CODE &&
                resultCode == Activity.RESULT_OK) {
            data?.let {
                val currentPosition = it.getLongExtra(
                    VideoFullScreenActivity.VIDEO_CURRENT_POSITION,
                    0L
                )
                initializePlayer(nowPlayingUrl)
                player?.seekTo(currentPosition)
                player?.playWhenReady = true
            }
        }else if(requestCode == CallbackResultActivity.REQUEST_CODE){
            finish()
        }else
        {
            finish()
        }
    }

    private fun initPresenter() {
        mPresenter = ViewModelProviders.of(this).get(InvoicePaymentPresenterImpl::class.java)
        mPresenter.initPresenter(this)
    }

    private fun setUpRecyclerView() {
        mBankAdapter = BankAdapter(mPresenter)
        rvBank.layoutManager = GridLayoutManager(
            applicationContext,
            3,
            GridLayoutManager.VERTICAL,
            false
        )
        rvBank.adapter = mBankAdapter
    }

    private fun initListeners() {

        mPresenter.mErrorLiveData.observe(this, Observer {
            showErrorMessage(it)
        })

        mPresenter.mShowProgressLoadingDialogLiveData.observe(this, Observer {
            showLoadingDialog()
        })

        mPresenter.mHideProgressLoadingDialogLiveData.observe(this, Observer {
            hideLoadingDialog()
        })

        ivBack.setOnClickListener {
            finish()
        }

        mFullScreenImageButton = playerView.findViewById(R.id.exo_fullscreen_button)
        mFullScreenImageButton.setOnClickListener {
            mPresenter.onTapFullScreen(nowPlayingUrl, player?.currentPosition ?: 0L)

        }
    }

    private fun initializePlayer(uri: String) {
        if (player == null) {
            player = ExoPlayerFactory.newSimpleInstance(
                DefaultRenderersFactory(applicationContext),
                DefaultTrackSelector(),
                DefaultLoadControl()
            )
            playerView?.player = player
            player!!.playWhenReady = false
        }
        val mediaSource =
            buildMediaSource(Uri.parse(uri))

        player!!.prepare(mediaSource, true, false)

        player!!.addListener(object : Player.EventListener {
            override fun onPlaybackParametersChanged(playbackParameters: PlaybackParameters?) {

            }

            override fun onSeekProcessed() {

            }

            override fun onTracksChanged(
                trackGroups: TrackGroupArray?,
                trackSelections: TrackSelectionArray?
            ) {

            }

            override fun onLoadingChanged(isLoading: Boolean) {
                if (isLoading) {
                    pbPlayer.visibility = View.VISIBLE
                } else pbPlayer.visibility = View.GONE
            }

            override fun onPositionDiscontinuity(reason: Int) {

            }

            override fun onRepeatModeChanged(repeatMode: Int) {

            }

            override fun onShuffleModeEnabledChanged(shuffleModeEnabled: Boolean) {

            }

            override fun onTimelineChanged(timeline: Timeline?, manifest: Any?, reason: Int) {

            }

            override fun onPlayerError(error: ExoPlaybackException?) {

            }

            override fun onPlayerStateChanged(playWhenReady: Boolean, playbackState: Int) {

            }

        })

    }

    private fun showPlayerViewAndButton() {
        cvHowToPay.visibility = View.VISIBLE
        btnOpenMobileBankingApp.visibility = View.VISIBLE
        playerView.visibility = View.VISIBLE
        pbPlayer.visibility = View.VISIBLE
    }

    private fun hidePlayerViewAndButton() {
        cvHowToPay.visibility = View.GONE
        btnOpenMobileBankingApp.visibility = View.GONE
        playerView.visibility = View.GONE
        pbPlayer.visibility = View.GONE
    }

    private fun buildMediaSource(uri: Uri): MediaSource {

        val userAgent = FIVEBB

        return when {
            uri.lastPathSegment?.contains(SharedConstants.MEDIA_TYPE_MP4)!! -> ExtractorMediaSource.Factory(
                DefaultHttpDataSourceFactory(userAgent)
            )
                .createMediaSource(uri)
            uri.lastPathSegment!!.contains(SharedConstants.MEDIA_TYPE_M3U8) -> HlsMediaSource.Factory(
                DefaultHttpDataSourceFactory(userAgent)
            )
                .createMediaSource(uri)
            else -> {
                val dashChunkSourceFactory = DefaultDashChunkSource.Factory(
                    DefaultHttpDataSourceFactory(userAgent)
                )
                val manifestDataSourceFactory = DefaultHttpDataSourceFactory(userAgent)
                DashMediaSource.Factory(dashChunkSourceFactory, manifestDataSourceFactory).createMediaSource(
                    uri
                )
            }
        }
    }

    private fun releasePlayer() {
        if (player != null) {

            player!!.release()
            player = null
        }
    }

    override fun showAllBankPayment(data: MutableList<BankVO>) {
        mBankAdapter.setNewData(data)
    }

    override fun showAllPaymentMethod(payment: CombinePaymentDataVO) {
        mPaymentMethodAdapter.addNewData(payment)
    }

    override fun showAllPaymentMethodList(paymentList: MutableList<PaymentMethodVO>) {
        mPaymentMethodAdapter.notifyDataSetChanged()
    }

    override fun showSelectedBankInfo(data: BankVO) {

        initializePlayer(data.videoUrl)
        nowPlayingUrl = data.videoUrl

        showPlayerViewAndButton()

        btnOpenMobileBankingApp.text = resources.getString(data.actionText)

        btnOpenMobileBankingApp.setOnClickListener {
            btnOpenMobileBankingApp.isClickable = false
            timeStamp = createTimestamp()
            val billNoList = mBillNo.split("/")

             orderID = if (billNoList.size>2){
                val numberList = billNoList[3].split("-")
                val number = numberList.joinToString("")

                "DR${number}_${billNoList.last()}_${timeStamp}"
            }else{
                mBillNo+timeStamp
            }

            //citizen
            when {
                data.packageName == KBZ_PAY_PACKAGE_NAME || data.code == KBZ_PAY ->
                    mPresenter.onTapPayWithKBZPay(
                        KBZPreCreateRequest(
                            SharedPreferenceUtils.getAccountId(this),
                            SharedPreferenceUtils.getName(this),
                            SharedPreferenceUtils.getBillMonth(this),
                            mBillNo,
                            orderID,
                            mUnpaidAmount.toDoubleOrNull() ?: 0.0
                        ),this
                    )
                data.packageName == AYA_PAY || data.code == AYA_PAY ->
                    showPhBoxForAYAPay()

                data.packageName == CITIZEN_PACKAGE_NAME || data.code == CITIZEN_PAY  ->
               // CITIZEN_PACKAGE_NAME ->
                        mPresenter.onPayWithCitizen(
                        CitizenPayRequest(
                            SharedPreferenceUtils.getAccountId(this),
                            SharedPreferenceUtils.getName(this),
                            SharedPreferenceUtils.getBillMonth(this),
                            mBillNo,
                            orderID,
                            mUnpaidAmount.toDoubleOrNull() ?: 0.0
                        )
                    )
               data.packageName == WAVE_MONEY_PACKAGE_NAME || data.code == WAVE_PAY  ->
               // WAVE_MONEY_PACKAGE_NAME ->
                    mPresenter.onTapWavePayRequest(
                        WavePayRequest(
                            SharedPreferenceUtils.getAccountId(this),
                            SharedPreferenceUtils.getName(this),
                            SharedPreferenceUtils.getBillMonth(this),
                            mBillNo,
                            orderID,
                            mUnpaidAmount.toDoubleOrNull() ?: 0.0
                        )
                    )
                else -> { // Note the block
                    try {
                        startActivity(packageManager.getLaunchIntentForPackage(data.packageName))
                        btnOpenMobileBankingApp.isClickable= true
                    } catch (e: Exception) {
                        Snackbar.make(
                            btnOpenMobileBankingApp,
                            getString(R.string.msg_app_not_found),
                            Snackbar.LENGTH_SHORT
                        ).show()
                        btnOpenMobileBankingApp.isClickable= true
                    }
                }
            }
        }
        btnOpenMobileBankingApp.isClickable= true
    }
    private fun showPhBoxForAYAPay()
    {
        //Toast.makeText(applicationContext,"Clicked Add/New",Toast.LENGTH_SHORT).show()
        val alertDialog = AlertDialog.Builder(this)
        val customLayout: View = LayoutInflater.from(this).inflate(R.layout.add_aya_pay_phno, null)
        alertDialog.setView(customLayout)
        val alert = alertDialog.create()
        alert.setIcon(R.drawable.logo)
        alert.setTitle("5BB")
        alert.setCancelable(false)
        alert.setCanceledOnTouchOutside(false)

        val editText = customLayout.findViewById<EditText>(R.id.etMessage)
        val submitBtn: Button = customLayout.findViewById(R.id.btnOK)
        val cancelBtn: Button = customLayout.findViewById(R.id.btnCancel)
        submitBtn.setOnClickListener {
            if (editText.text.isNotEmpty() && editText.text.startsWith("0")) {
                val ayaPh = editText.text.toString()
                mPresenter.onTapPayWithAYAPay(
                    AYAPayRequest(
                        SharedPreferenceUtils.getAccountId(this),
                        SharedPreferenceUtils.getName(this),
                        SharedPreferenceUtils.getBillMonth(this),
                        mBillNo,
                        orderID,
                        mUnpaidAmount.toDoubleOrNull()?:0.0,
                        ayaPh
                    )
                )
            } else{
                Toast.makeText(this, getString(R.string.you_need_to_fill_aya_pay_no), Toast.LENGTH_SHORT).show()
            }
            //  Log.i("TAG", "Email Response: $userText")
            alert.dismiss()
        }
        cancelBtn.setOnClickListener {
            alert.dismiss()
            onResume()
        }
        alert.show()
    }

    override fun showSelectedPaymentInfo(data: CombinePaymentDataVO) {
        initializePlayer(data.videoUrl)
        nowPlayingUrl = data.videoUrl

        showPlayerViewAndButton()

        btnOpenMobileBankingApp.text = data.bankName

        btnOpenMobileBankingApp.setOnClickListener {

            btnOpenMobileBankingApp.isClickable = false
            timeStamp = createTimestamp()
            val billNoList = mBillNo.split("/")

            val orderID = if (billNoList.size>2){
                val numberList = billNoList[3].split("-")
                val number = numberList.joinToString("")

                "DR${number}_${billNoList.last()}_${timeStamp}"
            }else{
                mBillNo+timeStamp
            }

            //kpay
            when (data.code) {
                K_PAY ->
                    mPresenter.onTapPayWithKBZPay(
                        KBZPreCreateRequest(
                            SharedPreferenceUtils.getAccountId(this),
                            SharedPreferenceUtils.getName(this),
                            SharedPreferenceUtils.getBillMonth(this),
                            mBillNo,
                            orderID,
                            mUnpaidAmount.toDoubleOrNull() ?: 0.0
                        ),this
                    )

                AYA_PAY->
                    mPresenter.onTapPayWithAYAPay(
                        AYAPayRequest(
                            SharedPreferenceUtils.getAccountId(this),
                            SharedPreferenceUtils.getName(this),
                            SharedPreferenceUtils.getBillMonth(this),
                            mBillNo,
                            orderID,
                            mUnpaidAmount.toDoubleOrNull()?:0.0,
                            cusPh
                        )
                    )
                CITIZEN_PAY ->
                    mPresenter.onPayWithCitizen(
                        CitizenPayRequest(
                            SharedPreferenceUtils.getAccountId(this),
                            SharedPreferenceUtils.getName(this),
                            SharedPreferenceUtils.getBillMonth(this),
                            mBillNo,
                            orderID,
                            mUnpaidAmount.toDoubleOrNull() ?: 0.0
                        )
                    )
                WAVE_PAY ->
                    mPresenter.onTapWavePayRequest(
                        WavePayRequest(
                            SharedPreferenceUtils.getAccountId(this),
                            SharedPreferenceUtils.getName(this),
                            SharedPreferenceUtils.getBillMonth(this),
                            mBillNo,
                            orderID,
                            mUnpaidAmount.toDoubleOrNull() ?: 0.0
                        )
                    )
                else -> { // Note the block
                    try {
                        startActivity(packageManager.getLaunchIntentForPackage(data.bankName))
                        btnOpenMobileBankingApp.isClickable= true
                    } catch (e: Exception) {
                        Snackbar.make(
                            btnOpenMobileBankingApp,
                            getString(R.string.msg_app_not_found),
                            Snackbar.LENGTH_SHORT
                        ).show()
                        btnOpenMobileBankingApp.isClickable= true
                    }
                }
            }
        }
        btnOpenMobileBankingApp.isClickable= true    }

    private fun createTimestamp(): String {
        val cal = Calendar.getInstance()
        val time = cal.time.time / 1000
        return time.toString()
    }

    private fun createTimestamp2(): String? {
        val cal = Calendar.getInstance()
        val time = cal.timeInMillis / 1000.0
        val d = time
        return d.toInt().toString()
    }

    override fun showKBZPayAPP(data: KBZOrderInfoResponse) {
        data.orderInfo?.let {
            val orderInfo = createOrderInfo(data)
            Log.e("Mi4c_startpay_orderInfo", orderInfo)
            Log.e("Mi4c_startpay_sign", data.sign)
            Log.e("Mi4c_startpay_signType", data.signType)
            Log.e("Mi4C_decrypt", orderInfo + "-----" + data.sign + "-----" + data.signType)
            Log.e(
                "Mi4C_decrypt",
                "------------------------------------------------------------------------------------"
            )
            KBZPay.startPay(this, orderInfo, data.sign, data.signType)
        }
    }

    private fun createOrderInfo(data: KBZOrderInfoResponse):String{

        val prepayID = data.orderInfo?.prepayID
        val merchCode = data.orderInfo?.merchCode
        val appID = data.orderInfo?.appID
        val nonceStr = data.orderInfo?.nonceStr

        return "appid=" + appID +
                "&merch_code=" + merchCode +
                "&nonce_str=" + nonceStr +
                "&prepay_id=" + prepayID +
                "&timestamp=" + data.timestamp
    }

    override fun navigateToPaymentSuccess() {
        startActivityForResult(
            CallbackResultActivity.newIntent(applicationContext),
            CallbackResultActivity.REQUEST_CODE
        )
    }

    override fun navigateToVideoFullScreen(videoUrl: String, position: Long) {
        val intent = VideoFullScreenActivity.newIntent(
            this,
            videoUrl,
            position
        )
        startActivityForResult(
            intent,
            VideoFullScreenActivity.VIDEO_CURRENT_POSITION_REQUEST_CODE
        )
    }

    override fun errorResponseKBZPayApp(response: String) {
        Toast.makeText(this, response, Toast.LENGTH_SHORT).show()
    }

    override fun ayaPayLink(data: AYARequestPushPaymentResponse) {
        val openLinkIntent = Intent(Intent.ACTION_VIEW, Uri.parse(data.url))
        startActivity(openLinkIntent)
    }

    override fun responseOfAYAPay(message: String) {
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show()
    }

    @SuppressLint("SetJavaScriptEnabled")
    override fun mcfPayPaymentLink(data: CitizenPayResponse) {
        wvPayment.visibility = View.VISIBLE
        wvPayment.settings.javaScriptEnabled = true
        wvPayment.settings.loadWithOverviewMode = true
        wvPayment.settings.useWideViewPort = true
        wvPayment.settings.domStorageEnabled = true
        wvPayment.settings.javaScriptCanOpenWindowsAutomatically = true
        wvPayment.webViewClient = object : WebViewClient() {
            @Deprecated("Deprecated in Java")
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                if (url != null) {
                    view?.loadUrl(url)
                }
                return true
            }
        }
        wvPayment.loadUrl(data.paymentGatewayUrl)
    }

    @SuppressLint("CheckResult")
    override fun callPayRetrieveStatus(request: CitizenPayRequest)
    {
          disposable = Flowable.interval(10, TimeUnit.SECONDS)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(){
                Log.d("Interval recall", "10 sec")
                mPresenter.citizenPaymentRetrieve(request)
            }
    }

    @SuppressLint("SetJavaScriptEnabled","CheckResult")
    override fun requestWavePayResponse(data: WavePayResponse) {
        wvPayment.visibility = View.VISIBLE
        wvPayment.settings.javaScriptEnabled = true
        wvPayment.settings.loadWithOverviewMode = true
        wvPayment.settings.useWideViewPort = true
        wvPayment.settings.domStorageEnabled = true
        wvPayment.settings.javaScriptCanOpenWindowsAutomatically = true
        wvPayment.webViewClient = object : WebViewClient() {
            @Deprecated("Deprecated in Java")
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                if (url != null) {
                    view?.loadUrl(url)
                }
                return true
            }
        }
        wvPayment.loadUrl(data.paymentGatewayUrl)
       }

    @SuppressLint("CheckResult")
    override fun requestQueryOrderWPay(data: WavePayRequest) {
        Flowable.interval(20,70,java.util.concurrent.TimeUnit.SECONDS)
            .take(6)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(){
                mPresenter.wPayQueryOrder(data)
            }
    }

    @SuppressLint("CheckResult")
    override fun queryOrderWPay(data: WaveQueryOrderResponse) {
        when(data.status){
            "PAYMENT_CONFIRMED"->{
                Flowable.timer(3,java.util.concurrent.TimeUnit.SECONDS)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(){
                        Log.d("IntervalDelay","Delay 3 sec")
                        finish()
                    }
            }
            "TRANSACTION_TIMED_OUT"->{
                Flowable.timer(3,java.util.concurrent.TimeUnit.SECONDS)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(){
                        Log.d("IntervalDelay","Delay 3 sec")
                        finish()
                    }
            }
            "INSUFFICIENT_BALANCE"->{
                Flowable.timer(3,java.util.concurrent.TimeUnit.SECONDS)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(){
                        Log.d("IntervalDelay","Delay 3 sec")
                        finish()
                    }
            }
            "ACCOUNT_LOCKED"->{
                Flowable.timer(3,java.util.concurrent.TimeUnit.SECONDS)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(){
                        Log.d("IntervalDelay","Delay 3 sec")
                        finish()
                    }
            }
            "BILL_COLLECTION_FAILED"->{
                Flowable.timer(3,java.util.concurrent.TimeUnit.SECONDS)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(){
                        Log.d("IntervalDelay","Delay 3 sec")
                        finish()
                    }
            }
            "PAYMENT_REQUEST_CANCELLED"->{
                Flowable.timer(3,java.util.concurrent.TimeUnit.SECONDS)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(){
                        Log.d("IntervalDelay","Delay 3 sec")
                        finish()
                    }
            }
            "SCHEDULER_TRANSACTION_TIMED_OUT"->{
                Flowable.timer(3,java.util.concurrent.TimeUnit.SECONDS)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(){
                        Log.d("IntervalDelay","Delay 3 sec")
                        finish()
                    }
            }
        }

    }

    @SuppressLint("CheckResult")
    override fun citizenPaymentRetrieveStatus(response: CitizenRetrieveResponse) {
        Log.i("Status", "citizenPaymentRetrieveStatus: " + response.contextStatus)
        val expiredTime  = response.expiryTime
        val systemCurrentTime = System.currentTimeMillis()
        when(response.contextStatus){
            "APPROVED" -> Flowable.timer(3, TimeUnit.SECONDS)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe() {
                    finish()
                    disposable.dispose()

                }
            "CANCELLED" -> Flowable.timer(3, TimeUnit.SECONDS)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe() {
                    finish()
                    disposable.dispose()
                }
            else->{
                if(expiredTime < systemCurrentTime)
                {
                    Flowable.timer(3, TimeUnit.SECONDS)
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(){
                           finish()
                            disposable.dispose()
                        }
                }
            }
        }
    }

}