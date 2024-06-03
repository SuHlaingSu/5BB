package com.fivebb.selfcare.mvp.presenters.impls

import android.annotation.SuppressLint
import android.content.Context
import android.icu.text.SimpleDateFormat
import android.os.Build
import android.util.Log
import androidx.annotation.RequiresApi
import com.fivebb.selfcare.BuildConfig
import com.fivebb.selfcare.models.PrepaidStaticDataModel
import com.fivebb.selfcare.models.RechargeStaticDataModel
import com.fivebb.selfcare.models.UserModel
import com.fivebb.selfcare.models.UserModelImpl
import com.fivebb.selfcare.mvp.presenters.InvoicePaymentPresenter
import com.fivebb.selfcare.mvp.presenters.PxPaymentPresenter
import com.fivebb.selfcare.mvp.views.RechargeTopUpView
import com.fivebb.selfcare.network.requests.*
import com.fivebb.selfcare.utils.Cryptography_Android
import com.fivebb.selfcare.utils.SharedPreferenceUtils
import com.fivebb.selfcare.utils.md5Hash
import com.fivebb.shared.mvp.presenters.BasePresenter
import com.fivebb.shared.vos.BankVO
import com.fivebb.shared.vos.CombinePaymentDataVO
import java.util.*

class PXPaymentPresenterImpls: BasePresenter<RechargeTopUpView, UserModel>(),
    PxPaymentPresenter {
    private val mBankList = PrepaidStaticDataModel.getBankList()
    private lateinit var currentDT : String
    private lateinit var resultDate : String
    private lateinit var nextPlanStartDate : String
    init {
        mModel = UserModelImpl.getInstance()
    }

    override fun loadBankList() {
        mView.showAllBank(mBankList)
    }

    override fun loadPaymentMethodList() {
        TODO("Not yet implemented")
    }

    override fun onTapBank(bank: BankVO) {
        mBankList.forEach {
            it.isChecked = it.id == bank.id
        }
        mView.showAllBank(mBankList)

        mView.showSelectedBankInfo(bank)
    }

    override fun onTapBank(payment: CombinePaymentDataVO) {
        TODO("Not yet implemented")
    }

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onTapPayWithKBZPay(request: KBZPreCreateRequest,context: Context) {
        val encryptData = generateEncDataForPreCreate(request,context)
        val decData = Cryptography_Android.Decrypt(encryptData.encData, BuildConfig.ENCRYPTION_KEY)
//        Log.e("Mi4C_encrypt", encryptData.encData)
//        Log.e("Mi4C_decrypt", decData)

        mShowProgressLoadingDialogLiveData.postValue(true)

        mModel.sendKBZPayPreCreate(encryptData,
            success = {
                val encryptDataOrderInfo = generateEncDataForOrderInFo(it.prepayID)
                val decDataForOrderInfo = Cryptography_Android.Decrypt(encryptDataOrderInfo.encData, BuildConfig.ENCRYPTION_KEY)

//                Log.e("Mi4C_encrypt", encryptDataOrderInfo.encData)
//                Log.e("Mi4C_decrypt", decDataForOrderInfo)
                mHideProgressLoadingDialogLiveData.postValue(true)
                loadKBZOrderInfo(encryptDataOrderInfo)
            },
            failure = {
                val encryptDataQueryOrder = generateEncDataForQueryOrder(request)
                val decDataForQueryOrder = Cryptography_Android.Decrypt(encryptDataQueryOrder.encData, BuildConfig.ENCRYPTION_KEY)
                mShowProgressLoadingDialogLiveData.postValue(true)
                mModel.sendKBZPayQueryOrder(encryptDataQueryOrder,
                    success = {
                        mHideProgressLoadingDialogLiveData.postValue(true)
                    },
                    failure = {
                        mHideProgressLoadingDialogLiveData.postValue(true)
                        _errorLiveData.postValue(it)
                    })
//                Log.e("Mi4C_encrypt", encryptDataQueryOrder.encData)
//                Log.e("Mi4C_decrypt", decDataForQueryOrder)

            })
    }

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onTapPayWithAYAPay(request: AYAPayRequest,context: Context) {
        mShowProgressLoadingDialogLiveData.postValue(true)
        val encryptData = generateEncDataForAYAPay(request,context)
        mModel.payWithAYAPay(encryptData, success = {
            mHideProgressLoadingDialogLiveData.postValue(true)
            mView.ayaPayLink(it)
            mView.requestQueryOrderAYAPay(request)
        }, failure = {
            mHideProgressLoadingDialogLiveData.postValue(true)
            mView.responseOfAYAPay(it)
        })
    }

    fun ayaPayQueryOrder(data: AYAPayRequest) {
        val encryptData = generateEncDataForAYAPayQueryOrder(data)
        mModel.AYAPayQueryOrder(encryptData,
            success = {
                mHideProgressLoadingDialogLiveData.postValue(true)
                mView.queryOrderAYAPay(it)
            },
            failure = {
                mHideProgressLoadingDialogLiveData.postValue(true)
                //_errorLiveData.postValue(it)
            })
    }

    private fun loadKBZOrderInfo(data: EncryptDataRequest) {
        mModel.loadKBZOrderInfo(data,
            success = {
                mHideProgressLoadingDialogLiveData.postValue(true)
                mView.showKBZPayAPP(it)
            },
            failure = {
                mHideProgressLoadingDialogLiveData.postValue(true)
                _errorLiveData.postValue(it)
            })
    }

    @SuppressLint("SimpleDateFormat")
    @RequiresApi(Build.VERSION_CODES.N)
    private fun nextPlanResultDate(context: Context){
        val simpleDateFormat= SimpleDateFormat("HH:mm:ss", Locale.US)
        currentDT = simpleDateFormat.format(Date())

        nextPlanStartDate = SharedPreferenceUtils.getPXNextPlanStartDate(context)
        Log.d("nextPlanStartdate", nextPlanStartDate)
        val trimmedInputDate = nextPlanStartDate.substringAfter('"').substringBefore('"')
        Log.d("nextPlanTrimDate", trimmedInputDate)

        val inputFormat = SimpleDateFormat("dd/MM/yyyy HH:mm:ss")
        val outputFormat = SimpleDateFormat("yyyy-MM-dd", Locale.US)

        val date = inputFormat.parse(trimmedInputDate)
        resultDate = outputFormat.format(date)

        Log.d("nextPlanResultDate", resultDate)
    }

    //KBZ
    @SuppressLint("SimpleDateFormat")
    @RequiresApi(Build.VERSION_CODES.N)
    private fun generateEncDataForPreCreate(request: KBZPreCreateRequest,context: Context): EncryptDataRequest {
       /* val simpleDateFormat= SimpleDateFormat("HH:mm:ss", Locale.US)
        val currentDT: String = simpleDateFormat.format(Date())

        val nextPlanStartDate = SharedPreferenceUtils.getPXNextPlanStartDate(context)
        Log.d("nextPlanStartdate", nextPlanStartDate)
        val trimmedInputDate = nextPlanStartDate.substringAfter('"').substringBefore('"')
        Log.d("nextPlanTrimDate", trimmedInputDate)

        val inputFormat = SimpleDateFormat("dd/MM/yyyy HH:mm:ss")
        val outputFormat = SimpleDateFormat("yyyy-MM-dd", Locale.US)

        val date = inputFormat.parse(trimmedInputDate)
        val resultDate = outputFormat.format(date)

        Log.d("nextPlanResultDate", resultDate)*/
        nextPlanResultDate(context)
        val accountCode = "AccountCode=${BuildConfig.ACCOUNT_CODE}|"
        val customerAccountNo = "CustAccNo=${request.custAccNo}|"
        val name = "Name=${request.name}|"
        val billInvoiceNo = "BillInvoiceNo=${request.billInvoiceNo}|"
        val orderID = "OrderID=${request.orderID}|"
        val totalAmount = "TotalAmount=${request.totalAmount}|"
        val tradeType = "TradeType=APP|Title=Prepaid Payment|Currency=MMK|PaymentAlias=Prepaid/Plan Renewal|"
        val billMonth = "BillMonth=$resultDate $currentDT"


        Log.d("nextPlanGenerate", billMonth)

        var data =
            accountCode + customerAccountNo + name + billInvoiceNo + orderID + totalAmount + tradeType + billMonth

        data += "|checkSum=${data.md5Hash()}"

        return EncryptDataRequest(Cryptography_Android.Encrypt(data, BuildConfig.ENCRYPTION_KEY))
    }

    private fun generateEncDataForQueryOrder(request: KBZPreCreateRequest): EncryptDataRequest {

        val accountCode = "AccountCode=${BuildConfig.ACCOUNT_CODE}|"
        val orderID = "OrderID=${request.orderID}"

        var data = accountCode + orderID

        data += "|checkSum=${data.md5Hash()}"

        return EncryptDataRequest(Cryptography_Android.Encrypt(data, BuildConfig.ENCRYPTION_KEY))
    }

    private fun generateEncDataForOrderInFo(prepayID: String): EncryptDataRequest {
        val accountCode = "AccountCode=${BuildConfig.ACCOUNT_CODE}|"
        val concatPrepayID = "prepay_id=$prepayID"

        var data = accountCode + concatPrepayID

        data += "|checkSum=${data.md5Hash()}"

        return EncryptDataRequest(Cryptography_Android.Encrypt(data, BuildConfig.ENCRYPTION_KEY))
    }

    //AYA Pay
    @RequiresApi(Build.VERSION_CODES.N)
    private fun generateEncDataForAYAPay(request: AYAPayRequest,context: Context): EncryptDataRequest {

        nextPlanResultDate(context)
        /*val simpleDateFormat= SimpleDateFormat("HH:mm:ss", Locale.US)
        currentDT = simpleDateFormat.format(Date())

        val trimmedInputDate = nextPlanStartDate.substringAfter('"').substringBefore('"')
        Log.d("nextPlanTrimDate", trimmedInputDate)

        val inputFormat = SimpleDateFormat("dd/MM/yyyy HH:mm:ss")
        val outputFormat = SimpleDateFormat("yyyy-MM-dd", Locale.US)

        val date = inputFormat.parse(trimmedInputDate)
        resultDate = outputFormat.format(date)

        Log.d("nextPlanResultDate", resultDate)*/

        val accountCode = "AccountCode=${BuildConfig.ACCOUNT_CODE}|"
        val customerAccountNo = "CustAccNo=${request.custAccNo}|"
        val name = "Name=${request.name}|"
        val billInvoiceNo = "BillInvoiceNo=${request.billInvoiceNo}|"
        val orderID = "OrderID=${request.orderID}|"
        val totalAmount = "TotalAmount=${request.totalAmount?.toInt()}|"
        val tradeType = "TradeType=APP|Title=Prepaid Payment|Currency=MMK|PaymentAlias=Prepaid/Plan Renewal|"
        val billMonth = "BillMonth=$resultDate $currentDT|"
        val paymentType = "PaymentType=Android_PrepaidPay|"
        val cusPh = "CustomerPhone=${request.cusPh}"

        var data =
            accountCode + customerAccountNo + name + billInvoiceNo + orderID + totalAmount + tradeType + billMonth + paymentType + cusPh

        data += "|checkSum=${data.md5Hash()}"

        Log.i("TAG", "generateEncDataForAYAPay: $data")

        return EncryptDataRequest(Cryptography_Android.Encrypt(data, BuildConfig.ENCRYPTION_KEY))
    }

    private fun generateEncDataForAYAPayQueryOrder(request: AYAPayRequest): EncryptDataRequest {

        val accountCode = "AccountCode=${BuildConfig.ACCOUNT_CODE}|"
        val orderID = "OrderID=${request.orderID}"

        var data = accountCode + orderID

        data += "|checkSum=${data.md5Hash()}"

        return EncryptDataRequest(Cryptography_Android.Encrypt(data, BuildConfig.ENCRYPTION_KEY))
    }

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onPayWithCitizen(request: CitizenPayRequest, context: Context) {
        mShowProgressLoadingDialogLiveData.postValue(true)
        val encryptData = generateEncDataForCitizen(request,context)

        mModel.sendCitizenPay(encryptData,
            success = {
                mHideProgressLoadingDialogLiveData.postValue(true)
                mView.mcfPayPaymentLink(it)
                mView.callPayRetrieveStatus(request)
            },
            failure = {
                mHideProgressLoadingDialogLiveData.postValue(true)
                citizenPaymentRetrieve(request)
            })
    }

    //WavePay
    @RequiresApi(Build.VERSION_CODES.N)
    override fun onTapWavePayRequest(request: WavePayRequest, context: Context) {
        mShowProgressLoadingDialogLiveData.postValue(true)
        val encryptData = generateEncDataForWavePay(request,context)
        mModel.requestWavePay(encryptData,
            success = {
                mHideProgressLoadingDialogLiveData.postValue(true)
                mView.requestWavePayResponse(it)
                mView.requestQueryOrderWPay(request)
            },
            failure = {
                mHideProgressLoadingDialogLiveData.postValue(true)
                _errorLiveData.postValue(it)
            })
    }

    fun wPayQueryOrder(data: WavePayRequest) {
        val encryptData = generateEncDataForWPQueryOrder(data)
        mModel.wavePayQueryOrder(encryptData,
            success = {
                mHideProgressLoadingDialogLiveData.postValue(true)
                mView.queryOrderWPay(it)
            },
            failure = {
                mHideProgressLoadingDialogLiveData.postValue(true)
                //_errorLiveData.postValue(it)
            })
    }

    @RequiresApi(Build.VERSION_CODES.N)
    private fun generateEncDataForWavePay(request: WavePayRequest, context: Context): EncryptDataRequest {
        nextPlanResultDate(context)
        val accountCode = "AccountCode=${BuildConfig.ACCOUNT_CODE}|"
        val customerAccountNo = "CustAccNo=${request.custAccNo}|"
        val name = "Name=${request.name}|"
        val billInvoiceNo = "BillInvoiceNo=${request.billInvoiceNo}|"
        val orderID = "OrderID=${request.orderID}|"
        val totalAmount = "TotalAmount=${request.totalAmount}|"
        val tradeType = "TradeType=APP|Title=Prepaid Payment|Currency=MMK|PaymentAlias=Prepaid/Plan Renewal|"
        val billMonth = "BillMonth=$resultDate $currentDT|"
        val paymentType = "PaymentType=Android_PrepaidPay"
        var data =
            accountCode + customerAccountNo + name + billInvoiceNo + orderID + totalAmount + tradeType + billMonth + paymentType

        data += "|checkSum=${data.md5Hash()}"

        return EncryptDataRequest(Cryptography_Android.Encrypt(data, BuildConfig.ENCRYPTION_KEY))
    }

    private fun generateEncDataForWPQueryOrder(request: WavePayRequest): EncryptDataRequest {

        val accountCode = "AccountCode=${BuildConfig.ACCOUNT_CODE}|"
        val orderID = "OrderID=${request.orderID}"

        var data = accountCode + orderID

        data += "|checkSum=${data.md5Hash()}"

        return EncryptDataRequest(Cryptography_Android.Encrypt(data, BuildConfig.ENCRYPTION_KEY))
    }

    override fun citizenPaymentRetrieve(request: CitizenPayRequest) {
        val encryptData = generateEncDataForMCFRetrieve(request)

        mModel.sendCitizenRetrieve(encryptData,
            success = {
                mHideProgressLoadingDialogLiveData.postValue(true)
                mView.citizenPaymentRetrieveStatus(it)
            },
            failure = {
                mHideProgressLoadingDialogLiveData.postValue(true)
                _errorLiveData.postValue(it)
            })
    }

    //Citizen
    @RequiresApi(Build.VERSION_CODES.N)
    private fun generateEncDataForCitizen(request: CitizenPayRequest, context: Context): EncryptDataRequest {
        nextPlanResultDate(context)
        val accountCode = "AccountCode=${BuildConfig.ACCOUNT_CODE}|"
        val customerAccountNo = "CustAccNo=${request.custAccNo}|"
        val name = "Name=${request.name}|"
        val billInvoiceNo = "BillInvoiceNo=${request.billInvoiceNo}|"
        val orderID = "OrderID=${request.orderID}|"
        val totalAmount = "TotalAmount=${request.totalAmount}|"
        val tradeType = "TradeType=APP|Title=Prepaid Payment|Currency=MMK|PaymentAlias=Prepaid/Plan Renewal|"
        val billMonth = "BillMonth=$resultDate $currentDT|"
        val paymentType = "PaymentType=Android_PrepaidPay"
        var data =
            accountCode + customerAccountNo + name + billInvoiceNo + orderID + totalAmount + tradeType + billMonth + paymentType

        data += "|checkSum=${data.md5Hash()}"

        return EncryptDataRequest(Cryptography_Android.Encrypt(data, BuildConfig.ENCRYPTION_KEY))
    }

    //Citizen Retrieve Response
    private fun generateEncDataForMCFRetrieve(request: CitizenPayRequest): EncryptDataRequest {

        val accountCode = "AccountCode=${BuildConfig.ACCOUNT_CODE}|"
        val orderID = "OrderID=${request.orderID}"

        var data = accountCode + orderID

        data += "|checkSum=${data.md5Hash()}"

        return EncryptDataRequest(Cryptography_Android.Encrypt(data, BuildConfig.ENCRYPTION_KEY))
    }

    override fun onTapFullScreen(url: String, position: Long) {
    }
}