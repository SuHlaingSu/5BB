package com.fivebb.selfcare.models

import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.LiveData
import com.facebook.share.internal.ShareConstants
import com.fivebb.selfcare.BuildConfig
import com.fivebb.selfcare.network.requests.*
import com.fivebb.selfcare.network.responses.*
import com.fivebb.selfcare.utils.SharedPreferenceUtils
import com.fivebb.selfcare.utils.TICKET_CONFIG_VISIBILITY_FLAG
import com.fivebb.shared.db.AppDatabase
import com.fivebb.shared.utils.SharedConstants
import com.fivebb.shared.utils.SharedUtils
import com.fivebb.shared.utils.subscribeBaseResponse
import com.fivebb.shared.utils.subscribeDataResponse
import com.fivebb.shared.vos.*
//import com.google.firebase.iid.FirebaseInstanceId
import com.google.firebase.messaging.FirebaseMessaging
import com.google.gson.Gson

class UserModelImpl private constructor(context: Context) : BaseUserModel(context), UserModel {

    companion object {
        private const val TAG = "UserModel"
        private const val USER_MODEL_EARLY_INVOCATION =
            "User Model must invoked before initialized."
        private var INSTANCE: UserModelImpl? = null

        private lateinit var appDatabase: AppDatabase

        fun initUserModelImpl(context: Context) {
            INSTANCE = UserModelImpl(context)

            appDatabase = AppDatabase.getDatabase(context)
        }

        fun getInstance(): UserModelImpl {
            INSTANCE?.let {
                return it
            }
            throw RuntimeException(USER_MODEL_EARLY_INVOCATION)
        }
    }

    private var mUserLogin: UserLoginVO? = null
    private var mCustomerBasicViewDetails: CustomerBasicViewDetailsVO? = null
    private var mRegion: RegionVO? = null
    private var mPaymentHistory: MutableList<PaymentHistoryVO> = mutableListOf()
    private var mBillList: MutableList<BillVO> = mutableListOf()
    private var mActivityLogs: MutableList<ActivityLogVO> = mutableListOf()
    private var mEmailList: MutableList<EmailList> = mutableListOf()
    private var mPlanPriceList: PlanPriceListVO? = null
    private var mSecretQuestion: SecretQuestionVO? = null

    init {
        mCustomerBasicViewDetails = SharedPreferenceUtils.getCustomerBasicDetail(context)
    }

    override fun getEmailByBillingArea(context: Context): String {
        val billingArea = SharedPreferenceUtils.getBillingArea(context)
        return StaticDataModel.getEmailByBillingArea(billingArea)
    }

    override fun getCallCenterEmailByBillingArea(context: Context): String {
        val billingArea = SharedPreferenceUtils.getBillingArea(context)
        return StaticDataModel.getCallCenterEmailByBillingArea(billingArea)
    }

    override fun getTopics(
        context: Context,
        success: (MutableList<TopicVO>) -> Unit,
        failure: (String) -> Unit
    ) {
        val accessToken = SharedConstants.getBasicAuthToken()
        val accountId: String = SharedPreferenceUtils.getAccountId(context)
        val firebaseToken: String = SharedPreferenceUtils.getFCMToken(context)
        var token : String = ""
        if (firebaseToken == "null" || firebaseToken == "")
        {
            token = "BLACKLISTED"

        }else{
            token = firebaseToken
        }
        val versionNo = SharedPreferenceUtils.getVersionNo(context)
        val platform = SharedConstants.PLATFORM
        val request = GetTopicRequest(
            customerAccountNumber = accountId,
            token = accessToken,
            deviceId = token,
            appVersion = versionNo,
            platform = platform
        )
        mMobileAppApi.getTopics(SharedConstants.REQUEST_TYPE_JSON, SharedConstants.getBasicAuthToken(),request)
            .subscribeDataResponse(
                success = { topics ->
                    topics.forEach { FirebaseMessaging.getInstance().subscribeToTopic(it.topic) }
                },
                failure = failure
            )
    }

    override fun getAdvancePayment(
        context: Context,
        success: (AdvancePaymentVO) -> Unit,
        failure: (String) -> Unit
    ) {
        SharedConstants.getBasicAuthToken()
        val accountId: String = SharedPreferenceUtils.getAccountId(context)
        val request = AdvancePaymentRequest(
            customerAccountNumber = accountId
        )
        mPaymentApi.getAdvancedPayment(SharedConstants.REQUEST_TYPE_JSON,SharedConstants.getBasicAuthToken(),request)
            .subscribeDataResponse(success = {
                success(it)
            }, failure = {
                it
            })
    }

    override fun getPXDetails(
        context: Context,
        success: (PXDetailVO) -> Unit,
        failure: (String) -> Unit
    ) {
        SharedConstants.getBasicAuthToken()
        val accountId: String = SharedPreferenceUtils.getAccountId(context)
        val request = AdvancePaymentRequest(
            customerAccountNumber = accountId
        )
        mPaymentApi.getPXDetails(SharedConstants.REQUEST_TYPE_JSON,SharedConstants.getBasicAuthToken(),request)
            .subscribeDataResponse(success = {
                success(it)
            }, failure = {
                it
            })
    }

    override fun advTopUp(
        context: Context,
        success: (PlanPriceListVO) -> Unit,
        failure: (String) -> Unit
    ) {
        mMobileAppApi.fillTopUp(
            SharedConstants.REQUEST_TYPE_JSON,SharedConstants.getBasicAuthToken(),
            ActivityLogRequest((SharedPreferenceUtils.getAccountId(context)))
        ).subscribeDataResponse({
            success(it)
        },{
            failure(it)
        })
    }

    override fun topUpAction(
        context: Context,
        success: (String) -> Unit,
        failure: (String) -> Unit
    ) {
        val actionType: String = SharedPreferenceUtils.getActionType(context)
        val advPayId :String = SharedPreferenceUtils.getAdvPaymentId(context)
        val planId :String = SharedPreferenceUtils.getPlanIdForAdvance(context)
        val accId : String = SharedPreferenceUtils.getAccountId(context)
        val bankPayment :String = SharedPreferenceUtils.getBankForPayment(context)
        val orderCode = SharedPreferenceUtils.getOrderCode(context)
        mMobileAppApi.getTopUpAction(
            SharedConstants.REQUEST_TYPE_JSON,SharedConstants.getBasicAuthToken(),
            TopUpPlanActionRequest(
                advPayId,
                planId, accId,
                bankPayment,orderCode ,actionType
            )
        ) .subscribeBaseResponse({
            success(it)
        }, {
            failure(it)
        })
    }

    override fun checkVerication(
        context: Context,
        success: (CheckVericationVO) -> Unit,
        failure: (String) -> Unit
    ) {
        mMobileAppApi.checkVerication(
            SharedConstants.REQUEST_TYPE_JSON,SharedConstants.getBasicAuthToken(),
            CheckVerificationRequest(SharedPreferenceUtils.getAccountId(context)
            )
        ).subscribeDataResponse(success = {
            success(it)
        },failure = {

        })
    }

    /**
     * Get All Notifications From Api
     */
    override fun getNotiList(
        context: Context,
        success: (MutableList<NotificationVO>) -> Unit,
        failure: (String) -> Unit
    ) {
        SharedConstants.getBasicAuthToken()
        val accountId: String = SharedPreferenceUtils.getAccountId(context)
        val firebaseToken: String = SharedPreferenceUtils.getFCMToken(context)
        var token : String = ""
        if (firebaseToken == "null" || firebaseToken =="")
        {
            token = "BLACKLISTED"
        }else{
            token = firebaseToken
        }
        val request = GetNotiListRequest(
            customerAccountNo = accountId,
            deviceId = token
        )
        mMobileAppApi.getNotiList(SharedConstants.REQUEST_TYPE_JSON,SharedConstants.getBasicAuthToken(), request)
            .subscribeDataResponse(success = { notifications ->
                //Change the dates of the notificaitons into correct format
                success(notifications)
            }, failure = failure)
    }

    override fun deleteNoti(
        context: Context,
        request: NotiIdRequest,
        success: (String) -> Unit,
        failure: (String) -> Unit
    ) {
        SharedConstants.getBasicAuthToken()
        mMobileAppApi.postDeleteNotiID(SharedConstants.REQUEST_TYPE_JSON,SharedConstants.getBasicAuthToken(), request)
            .subscribeBaseResponse({
                success(it)
            }, {
                failure(it)
            })
    }

    override fun updateNoti(
        context: Context,
        request: NotiIdRequest,
        success: (String) -> Unit,
        failure: (String) -> Unit
    ) {
        SharedConstants.getBasicAuthToken()
        mMobileAppApi.updateNotiId(SharedConstants.REQUEST_TYPE_JSON,SharedConstants.getBasicAuthToken(), request)
            .subscribeBaseResponse({
                success(it)
            }, {
                failure(it)
            })
    }

    override fun getInvoicePDF(
        context: Context,
        request: DownloadPaymentSlipRequest,
        success: (InvoiceVO) -> Unit,
        failure: (String) -> Unit
    ) {
        mBSSApi.getInvoicePDf(SharedConstants.REQUEST_TYPE_JSON,SharedConstants.getBasicAuthToken(),request)
            .subscribeDataResponse({
                success(it)
        },{
            failure(it)
        })
    }

    override fun getPaymentMethod(
        success: (MutableList<PaymentMethodVO>) -> Unit,
        failure: (String) -> Unit
    ) {
        mMobileAppApi.getPaymentMethod(SharedConstants.REQUEST_TYPE_JSON,SharedConstants.getBasicAuthToken())
            .subscribeDataResponse({
                success(it)
            },{
                failure(it)
            })
    }

    override fun getRechargeList(
        context: Context,
        success: (MutableList<RechargeVO>) -> Unit,
        failure: (String) -> Unit
    ) {
        SharedConstants.getBasicAuthToken()
        val accountId: String = SharedPreferenceUtils.getAccountId(context)
        val request = GetRechargePlanListRequest(
            customerAccountNo = accountId
        )
        mMobileAppApi.getRechargeList(SharedConstants.REQUEST_TYPE_JSON,SharedConstants.getBasicAuthToken(), request)
            .subscribeDataResponse(success = { recharge ->
                recharge.sortedBy { it.sorting }
                success(recharge)
            }, failure = failure)
    }


    override fun loginAndGetAccountDetail(
        context: Context,
        accountId: String,
        password: String,
        checkedRememberMe: Boolean,
        success: (String) -> Unit,
        failure: (String) -> Unit
    ) {
        val loginRequest = LoginRequest(accountId, password)
        mUserApi.login(
            SharedConstants.REQUEST_TYPE_JSON,
            loginRequest
        ).takeWhile {
            if (it.isResponseOk() && it.data != null) {
                mUserLogin = it.data

                SharedPreferenceUtils.saveCheckedRememberMe(context, checkedRememberMe)
                SharedPreferenceUtils.saveAccountName(
                    context,
                    it.data?.externalUserDetails?.userName ?: ""
                )
                SharedPreferenceUtils.saveAccountId(
                    context,
                    it.data?.externalUserDetails?.userId ?: SharedConstants.UNDEFINED
                )
                SharedPreferenceUtils.saveName(
                    context,
                    it.data?.externalUserDetails?.customer?.customerName ?: ""
                )
                SharedPreferenceUtils.savePassword(context, password)
                SharedPreferenceUtils.saveAccessToken(context, it.data?.token ?: "")
                SharedPreferenceUtils.saveIsLogin(context, true)

                val insertedID = appDatabase.loginHistoryDao().insertLoginHistory(
                    LoginHistroyVO(accountId, password)
                )

                return@takeWhile true
            }
            failure(it.message)
            return@takeWhile false

        }.flatMap {
            val customerDetailRequest =
                CustomerDetailRequest(
                    mUserLogin?.externalUserDetails?.userId ?: SharedConstants.UNDEFINED
                )

            return@flatMap mUserApi.getCustomerDetail(
                SharedConstants.REQUEST_TYPE_JSON,
                SharedPreferenceUtils.getAccessToken(context),
                customerDetailRequest
            )
        }.takeWhile {
            if (it.isResponseOk() && it.data != null) {

                val customerBasicViewDetails = it.data!!

                val customerStatus =
                    customerBasicViewDetails.customerAccountDetails.values.first().status
                        ?: SharedConstants.UNDEFINED
                val billingStatus =
                    customerBasicViewDetails.billingAccountDetails.values.first().status
                        ?: SharedConstants.UNDEFINED
                val serviceType =
                    customerBasicViewDetails.serviceAccountDetails.values.first().serviceType
                        ?: SharedConstants.UNDEFINED
                val creationDate =
                    customerBasicViewDetails.serviceAccountDetails.values.first().creationDate
                        ?: SharedConstants.DEFAULT_FROM_DATE
                val serviceInstanceName =
                    customerBasicViewDetails.serviceInstanceDetails.values.first().name
                        ?: SharedConstants.UNDEFINED
                val billingArea =
                    customerBasicViewDetails.customerAccountDetails.values.first().billingArea
                        ?: SharedConstants.UNDEFINED
                val serviceInstanceNumber =
                    customerBasicViewDetails.serviceInstanceDetails.values.first().serviceInstanceNumber
                        ?: ""

                SharedPreferenceUtils.saveCustomerStatus(context, customerStatus)
                SharedPreferenceUtils.saveBillingStatus(context, billingStatus)
                SharedPreferenceUtils.saveServiceType(context, serviceType)
                SharedPreferenceUtils.saveCreationDate(context, creationDate)
                SharedPreferenceUtils.saveServiceInstanceName(context, serviceInstanceName)
                SharedPreferenceUtils.saveBillingArea(context, billingArea)
                SharedPreferenceUtils.saveServiceInstanceNumber(context, serviceInstanceNumber)

                mCustomerBasicViewDetails = customerBasicViewDetails
                SharedPreferenceUtils.saveCustomerBasicDetail(context,customerBasicViewDetails)

                return@takeWhile true
            }
            failure(it.message)
            return@takeWhile false
        }.flatMap {

            val serviceInstanceSummaryRequest =
                ServiceInstanceSummaryRequest(SharedPreferenceUtils.getServiceInstanceNumber(context))

            Log.i("ServiceInstanceNo", SharedPreferenceUtils.getServiceInstanceName(context))
            return@flatMap mUserApi.getServiceInstanceSummary(
                SharedConstants.REQUEST_TYPE_JSON,
                SharedPreferenceUtils.getAccessToken(context),
                serviceInstanceSummaryRequest
            )
        }.subscribeDataResponse(
            success = {
                //                if (SharedPreferenceUtils.getServiceType(context) == SharedConstants.SERVICE_TYPE_FTTH) {
                mMobileAppApi.getPlan(
                    SharedConstants.REQUEST_TYPE_JSON,
                    SharedConstants.getBasicAuthToken(),
                    GetPlanRequest(
                        SharedPreferenceUtils.getServiceType(context),
                        SharedPreferenceUtils.getServiceInstanceName(context),
                        SharedPreferenceUtils.getAccountId(context)
                    )
                ).subscribeDataResponse(
                    { planList ->
                        planList.size.run {
                            if (this > 0) SharedPreferenceUtils.saveCurrentPlanVO(
                                context,
                                Gson().toJson(planList[0])
                            )
                        }

                        Log.i("Current Plan", SharedPreferenceUtils.getCurrentPlanVO(context))
                        success(SharedPreferenceUtils.getServiceType(context))
                        SharedPreferenceUtils.saveCategory(context,planList[0].category)

                    }, {
                        failure("Connection isn't stable , Please Login again!!!")

                    }
                )
//                } else {
//                    success(SharedPreferenceUtils.getServiceType(context))
//                }


            }, failure = {
                failure("Service Instance response Failed")
            }
        )
    }

    override fun getRememberPreviousAccountId(
        context: Context,
        accountId: (String) -> Unit,
        password: (String) -> Unit,
        checkedRememberMe: (Boolean) -> Unit
    ) {
        accountId(SharedPreferenceUtils.getAccountName(context))
        password(SharedPreferenceUtils.getPassword(context))
        checkedRememberMe(SharedPreferenceUtils.getCheckedRememberMe(context))
    }

    override fun getCustomerBasicViewDetails(
        context: Context,
        success: (CustomerBasicViewDetailsVO) -> Unit,
        failure: (String) -> Unit
    ) {

        val customerDetailRequest =
            CustomerDetailRequest(SharedPreferenceUtils.getAccountId(context))

        mUserApi.getCustomerDetail(
            SharedConstants.REQUEST_TYPE_JSON,
            SharedPreferenceUtils.getAccessToken(context),
            customerDetailRequest
        ).subscribeDataResponse(
            success = {

                val customerStatus =
                    it.customerAccountDetails.values.first().status ?: SharedConstants.UNDEFINED
                val billingStatus =
                    it.billingAccountDetails.values.first().status ?: SharedConstants.UNDEFINED
                val serviceType =
                    it.serviceAccountDetails.values.first().serviceType ?: SharedConstants.UNDEFINED
                val creationDate =
                    it.serviceAccountDetails.values.first().creationDate
                        ?: SharedConstants.DEFAULT_FROM_DATE
                val serviceInstanceName =
                    it.serviceInstanceDetails.values.first().name ?: SharedConstants.UNDEFINED
                val billingArea = it.customerAccountDetails.values.first().billingArea
                    ?: SharedConstants.UNDEFINED
                val serviceInstanceNumber =
                    it.serviceInstanceDetails.values.first().serviceInstanceNumber ?: ""

                SharedPreferenceUtils.saveCustomerStatus(context, customerStatus)
                SharedPreferenceUtils.saveBillingStatus(context, billingStatus)
                SharedPreferenceUtils.saveServiceType(context, serviceType)
                SharedPreferenceUtils.saveCreationDate(context, creationDate)
                SharedPreferenceUtils.saveServiceInstanceName(context, serviceInstanceName)
                SharedPreferenceUtils.saveBillingArea(context, billingArea)
                SharedPreferenceUtils.saveServiceInstanceNumber(context, serviceInstanceNumber)

                mCustomerBasicViewDetails = it
                SharedPreferenceUtils.saveCustomerBasicDetail(context,it)

                success(it)
            },
            failure = {
                failure(it)
            }
        )
    }

    override fun getLoadedCustomerDetails(): CustomerBasicViewDetailsVO? = mCustomerBasicViewDetails

    override fun getLoadedRegionList(): RegionVO? = mRegion

    override fun changePassword(
        context: Context,
        request: ChangePasswordRequest,
        success: (String) -> Unit,
        failure: (String) -> Unit
    ) {
        mUserApi.changePassword(
            SharedConstants.REQUEST_TYPE_JSON,
            SharedPreferenceUtils.getAccessToken(context),
            request
        ).subscribeBaseResponse(
            success = {
                success(it)
            },
            failure = {
                failure(it)
            }
        )
    }

    override fun getPaymentHistory(
        context: Context,
        success: (List<PaymentHistoryVO>) -> Unit,
        failure: (String) -> Unit
    ) {

        val request = PaymentHistoryRequest(
            mCustomerBasicViewDetails?.billingAccountDetails?.keys?.first().toString(),
            SharedConstants.DEFAULT_FROM_DATE,
            SharedUtils.getTodayDateByFormat(SharedConstants.FORMAT_DATE_YYYY_MM_DD),
            mCustomerBasicViewDetails?.billingAccountDetails?.values?.first()?.currency.toString()
        )

        mUserApi.getPaymentHistory(
            SharedConstants.REQUEST_TYPE_JSON,
            SharedPreferenceUtils.getAccessToken(context),
            request
        ).subscribeDataResponse(
            success = {
                it.paymentDetail?.let { paymentHistory ->
                    success(paymentHistory)
                }
            },
            failure = {
                failure(it)
            }
        )
    }

    override fun getPaymentHistoryByDateRange(
        context: Context,
        fromDate: String,
        toDate: String,
        success: (List<PaymentHistoryVO>) -> Unit,
        failure: (String) -> Unit
    ) {
        val request = PaymentHistoryRequest(
            mCustomerBasicViewDetails?.billingAccountDetails?.keys?.first().toString(),
            fromDate,
            toDate,
            mCustomerBasicViewDetails?.billingAccountDetails?.values?.first()?.currency.toString()
        )

        mUserApi.getPaymentHistory(
            SharedConstants.REQUEST_TYPE_JSON,
            SharedPreferenceUtils.getAccessToken(context),
            request
        ).subscribeDataResponse(
            success = {
                it.paymentDetail?.let { paymentHistory ->
                    success(paymentHistory)
                }
            },
            failure = {
                failure(it)
            }
        )
    }

    override fun getDataForHomeScreen(
        context: Context,
        success: (ServiceInstanceSummaryVO) -> Unit,
        failure: (String) -> Unit
    ) {

        val billListRequest =
            BillListRequest(
                mCustomerBasicViewDetails?.billingAccountDetails?.keys?.first().toString()
            )

        mUserApi.getBillList(
            SharedConstants.REQUEST_TYPE_JSON,
            SharedPreferenceUtils.getAccessToken(context),
            billListRequest
        ).flatMap {
            if (it.isResponseOk()) {
                it.data?.let { data ->
                    mBillList = data
                }
            }

            val paymentRequest = PaymentHistoryRequest(
                mCustomerBasicViewDetails?.billingAccountDetails?.keys?.first().toString(),
                SharedConstants.DEFAULT_FROM_DATE,
                SharedUtils.getTodayDateByFormat(SharedConstants.FORMAT_DATE_YYYY_MM_DD),
                mCustomerBasicViewDetails?.billingAccountDetails?.values?.first()?.currency.toString()
            )

            return@flatMap mUserApi.getPaymentHistory(
                SharedConstants.REQUEST_TYPE_JSON,
                SharedPreferenceUtils.getAccessToken(context),
                paymentRequest
            )
        }.flatMap {
            if (it.isResponseOk()) {
                it.data?.paymentDetail?.let {
                    mPaymentHistory = it
                }
            }

            return@flatMap mUserApi.getServiceInstanceSummary(
                SharedConstants.REQUEST_TYPE_JSON,
                SharedPreferenceUtils.getAccessToken(context),
                ServiceInstanceSummaryRequest(SharedPreferenceUtils.getServiceInstanceNumber(context))
            )
        }.subscribeDataResponse(
            success = {
                success(it)
            },
            failure = {
                failure(it)
            }
        )
    }

    override fun getLoadedPaymentHistory(): MutableList<PaymentHistoryVO> = mPaymentHistory

    override fun logOut(context: Context, success: () -> Unit) {
        SharedPreferenceUtils.deleteLogin(context)
        SharedPreferenceUtils.deleteAccessToken(context)
        SharedPreferenceUtils.deleteAccountId(context)
        SharedPreferenceUtils.deleteCurrentPlan(context)
        SharedPreferenceUtils.deleteActionType(context)
        SharedPreferenceUtils.deleteAdvID(context)
        SharedPreferenceUtils.deletePlanID(context)
        success()
    }

    override fun getBillList(
        context: Context,
        success: (MutableList<BillVO>) -> Unit,
        failure: (String) -> Unit
    ) {
        val request =
            BillListRequest(
                mCustomerBasicViewDetails?.billingAccountDetails?.keys?.first().toString()
            )

        mUserApi.getBillList(
            SharedConstants.REQUEST_TYPE_JSON,
            SharedPreferenceUtils.getAccessToken(context),
            request
        ).subscribeDataResponse(
            success = {
                val billToPayList = it.filter { bill ->
                    bill.billStatus != SharedConstants.BILL_STATUS_FULLY_PAID
                }

                success(billToPayList.toMutableList())
            },
            failure = {
                failure(it)
            }
        )

    }

    override fun getLoadedBillList(): MutableList<BillVO> {
        return mBillList
    }

    override fun getTicketConfiguration(
        context: Context,
        success: (TicketConfigVO) -> Unit,
        failure: (String) -> Unit
    ) {

        val request = TicketConfigurationRequest(
            TICKET_CONFIG_VISIBILITY_FLAG,
            TICKET_CONFIG_VISIBILITY_FLAG,
            TICKET_CONFIG_VISIBILITY_FLAG,
            TICKET_CONFIG_VISIBILITY_FLAG,
            TICKET_CONFIG_VISIBILITY_FLAG,
            TICKET_CONFIG_VISIBILITY_FLAG,
            TICKET_CONFIG_VISIBILITY_FLAG
        )

        mUserApi.getTicketConfiguration(
            SharedConstants.REQUEST_TYPE_JSON,
            SharedPreferenceUtils.getAccessToken(context),
            request
        ).subscribeDataResponse({
            success(it)
        }, {
            failure(it)
        })

    }

    override fun getLoginHistory(): LiveData<List<LoginHistroyVO>> {
        return appDatabase.loginHistoryDao().getLoginHistory()
    }

    override fun getServiceInstance(): ServiceInstanceDetailsVO? {
        return mCustomerBasicViewDetails?.serviceInstanceDetails?.values?.first()
    }

    override fun getPlan(
        context: Context,
        success: (MutableList<PlanVO>) -> Unit,
        failure: (String) -> Unit) {
        mMobileAppApi.getPlan(
            SharedConstants.REQUEST_TYPE_JSON,
            SharedConstants.getBasicAuthToken(),
            GetPlanRequest(
                SharedPreferenceUtils.getServiceType(context),
                "",
                SharedPreferenceUtils.getAccountId(context)
            )
        ).subscribeDataResponse({
            val planJsonStr = SharedPreferenceUtils.getCurrentPlanVO(context)
            val planVO = Gson().fromJson(planJsonStr, PlanVO::class.java)

            if (it.size > 0) {
                it.filter { plan -> plan.isShown && plan.sortOrder > 0  && planVO.planShortName != plan.planShortName }.sortedBy { it.sortOrder }
                    .run {
                        success(this.toMutableList())
                    }
            } else {
                success(it)
            }
        }, {
            failure(it)
        })
    }

    override fun getPXPlan(
        context: Context,
        success: (PXPlanListVO) -> Unit,
        failure: (String) -> Unit
    ) {
       mPaymentApi.getPXPlan(SharedConstants.REQUEST_TYPE_JSON,SharedConstants.getBasicAuthToken(),
           PXPlanListRequest((SharedPreferenceUtils.getAccountId(context)))
       ).subscribeDataResponse({
          success(it)
       },{
           failure(it)
       })
    }

    override fun getActivityLogs(
        context: Context,
        success: (MutableList<ActivityLogVO>) -> Unit,
        failure: (String) -> Unit
    ) {
        mMobileAppApi.getActivityLog(
            SharedConstants.REQUEST_TYPE_JSON,SharedConstants.getBasicAuthToken(),
            ActivityLogRequest((SharedPreferenceUtils.getAccountId(context)))
        ).subscribeDataResponse({

            mActivityLogs = it
            //checked null safe
            success(mActivityLogs)

        }, {
            failure(it)
        })
    }

    override fun getLoadedActivityLogs(): MutableList<ActivityLogVO> {
        return mActivityLogs
    }

    override fun getSecretQuestion(
        accountNumber: String,
        success: (String) -> Unit,
        failure: (String) -> Unit
    ) {

        mUserApi.getSecretQuestion(
            SharedConstants.REQUEST_TYPE_JSON,
            SecretQuestionRequest(accountNumber)
        ).subscribeDataResponse(
            {
                mSecretQuestion = it
                success(it.secretQuestion ?: "")
            },
            {
                failure(it)
            }
        )

    }

    override fun validateSecretQuestion(
        answer: String,
        success: (String) -> Unit,
        failure: (String) -> Unit
    ) {
        mUserApi.validateSecretQuestion(
            SharedConstants.REQUEST_TYPE_JSON,
            SecretQuestionRequest(
                mSecretQuestion?.userName ?: "",
                mSecretQuestion?.secretQuestion ?: "",
                answer
            )
        ).subscribeBaseResponse(
            {
                success(it)
            },
            {
                failure(it)
            }
        )
    }

    override fun sendEmail(
        context: Context,
        request: SendEmailRequest,
        success: (String) -> Unit,
        failure: (String) -> Unit
    ) {

        mMobileAppApi.sendEmail(
            SharedConstants.REQUEST_TYPE_JSON,SharedConstants.getBasicAuthToken(),
            request
        ).subscribeBaseResponse({

            success(it)

        }, {
            failure(it)
        })

    }


    override fun sendEmailAndSaveActivityLog(
        context: Context,
        //emailRequest: SendEmailRequest,
        saveActivityLogRequest: SaveActivityLogRequest,
        success: (String) -> Unit,
        failure: (String) -> Unit
    ) {

        mMobileAppApi.getRegion(
            SharedConstants.REQUEST_TYPE_JSON,SharedConstants.getBasicAuthToken(),
            GetRegionRequest(
                SharedPreferenceUtils.getBillingArea(context),
                SharedConstants.PLAN_CHANGE
            )

        ).takeWhile {
            if (it.isResponseOk()) {
                return@takeWhile true
            }
            failure(it.message)
            return@takeWhile false
        }/*.flatMap {

     val regionVO = it.data?.firstOrNull()
     emailRequest.toEmail = regionVO?.primaryEmail ?: ""

     return@flatMap mMobileAppApi.sendEmail(
         SharedConstants.REQUEST_TYPE_JSON,SharedConstants.getBasicAuthToken(),
         emailRequest
     )

 }*//*.takeWhile {
     if (it.isResponseOK()) {

         return@takeWhile true
     }
     failure(it.message)
     return@takeWhile false
 }*/.flatMap {
            return@flatMap mMobileAppApi.saveActivity(
                SharedConstants.REQUEST_TYPE_JSON,SharedConstants.getBasicAuthToken(),
                saveActivityLogRequest
            )
        }.subscribeBaseResponse({
            success(it)
        }, {
            failure(it)
        })
    }

    override fun getAppImageList(
        context: Context,
        success: (MutableList<AppImageVO>) -> Unit,
        failure: (String) -> Unit
    ) {

        mMobileAppApi.getAppImageList(
            SharedConstants.REQUEST_TYPE_JSON,SharedConstants.getBasicAuthToken(),
            AppImageRequest(SharedPreferenceUtils.getBillingArea(context))
        ).subscribeDataResponse({

            success(it)

        }, {
            failure(it)
        })

    }

    override fun getRegion(
        context: Context,
        actionType: String,
        success: (RegionVO) -> Unit,
        failure: (String) -> Unit
    ) {
        mMobileAppApi.getRegion(
            SharedConstants.REQUEST_TYPE_JSON,SharedConstants.getBasicAuthToken(),
            GetRegionRequest(
                SharedPreferenceUtils.getBillingArea(context),
                actionType
            )
        ).subscribeDataResponse({ regionList ->

            if (regionList.isEmpty()) {
                failure("Data not found!")
            }

            regionList.firstOrNull()?.let {
                success(it)
            }
        }, {
            failure(it)
        })
    }

    override fun getRegionByShowroom(
        context: Context,
        actionType: String,
        success: (MutableList<RegionVO>) -> Unit,
        failure: (String) -> Unit
    ) {
        mMobileAppApi.getRegion(
            SharedConstants.REQUEST_TYPE_JSON,SharedConstants.getBasicAuthToken(),
            GetRegionRequest(
                SharedPreferenceUtils.getBillingArea(context),
                actionType
            )
        ).subscribeDataResponse({ regionList ->

            if (regionList.isEmpty()) {
                failure("Data not found!")
            }

            regionList.firstOrNull()?.let {
                success(regionList)
            }

        }, {
            failure(it)
        })
    }

    override fun requestWavePay(
        encryptData: EncryptDataRequest,
        success: (WavePayResponse) -> Unit,
        failure: (String) -> Unit
    ) {
        mPaymentApi.wavePayRequest(SharedConstants.getBasicAuthToken(),encryptData).subscribeDataResponse(
            success ={
                success(it)
            },
            failure = {
                failure(it)
            }
        )
    }

    override fun wavePayQueryOrder(
        encryptData: EncryptDataRequest,
        success: (WaveQueryOrderResponse) -> Unit,
        failure: (String) -> Unit
    ) {
        Log.e("kbzQueryOrder_request", Gson().toJson(encryptData))

        mPaymentApi.wavePayQueryOrder(SharedConstants.getBasicAuthToken(), encryptData)
            .subscribeDataResponse(
                success = {
                    Log.e("kbzQueryOrder_response", Gson().toJson(it))
                    success(it)
                },
                failure = {
                    Log.e("kbzQueryOrder_response", it)
                    failure(it)
                })
    }

    override fun sendCitizenPay(
        encryptData: EncryptDataRequest,
        success: (CitizenPayResponse) -> Unit,
        failure: (String) -> Unit
    ) {
        mPaymentApi.mcfPay(SharedConstants.getBasicAuthToken(),encryptData).subscribeDataResponse(
            success ={
                success(it)
            },
            failure = {
                failure(it)
            }
        )
    }

    override fun payWithAYAPay(
        encryptData: EncryptDataRequest,
        success: (AYARequestPushPaymentResponse) -> Unit,
        failure: (String) -> Unit
    ) {
        mPaymentApi.ayaPay(SharedConstants.getBasicAuthToken(),encryptData).subscribeDataResponse(
            success = {
                success(it)
                Log.d("AYA Pay","AYA Pay : "+ Gson().toJson(encryptData))
            },
            failure = {
                failure(it)
            }
        )
    }

    override fun AYAPayQueryOrder(
        encryptData: EncryptDataRequest,
        success: (AYAQueryOrderResponse) -> Unit,
        failure: (String) -> Unit
    ) {
        Log.e("AYAQueryOrder_request", Gson().toJson(encryptData))

        mPaymentApi.ayaPayQueryOrder(SharedConstants.getBasicAuthToken(), encryptData)
            .subscribeDataResponse(
                success = {
                    Log.e("AYAQueryOrder_response", Gson().toJson(it))
                    success(it)
                },
                failure = {
                    Log.e("AYAQueryOrder_response", it)
                    failure(it)
                })
    }

    override fun sendCitizenRetrieve(
        encryptData: EncryptDataRequest,
        success: (CitizenRetrieveResponse) -> Unit,
        failure: (String) -> Unit
    ) {
        mPaymentApi.mcfRetrieve(SharedConstants.getBasicAuthToken(), encryptData)
            .subscribeDataResponse(
                success = {
                    success(it)
                },
                failure = {
                    failure(it)
                })
    }

    override fun sendKBZPayPreCreate(
        encryptData: EncryptDataRequest,
        success: (KBZPreCreateResponse) -> Unit,
        failure: (String) -> Unit
    ) {

        Log.e("kbzPreCreate_request", Gson().toJson(encryptData))

        mPaymentApi.kbzPreCreate(SharedConstants.getBasicAuthToken(), encryptData)
            .subscribeDataResponse(
                success = {
                    Log.e("kbzPreCreate_response", Gson().toJson(it))
                    success(it)
                },
                failure = {
                    Log.e("kbzPreCreate_response", it)
                    failure(it)
                   // Toast.makeText(this,it,Toast.LENGTH_SHORT).show()
                })
    }

    override fun sendKBZPayQueryOrder(
        encryptData: EncryptDataRequest,
        success: (KBZQueryOrderResponse) -> Unit,
        failure: (String) -> Unit
    ) {
        Log.e("kbzQueryOrder_request", Gson().toJson(encryptData))

        mPaymentApi.kbzQueryOrder(SharedConstants.getBasicAuthToken(), encryptData)
            .subscribeDataResponse(
                success = {
                    Log.e("kbzQueryOrder_response", Gson().toJson(it))
                    success(it)
                },
                failure = {
                    Log.e("kbzQueryOrder_response", it)
                    failure(it)
                })
    }

    override fun loadKBZOrderInfo(
        encryptData: EncryptDataRequest,
        success: (KBZOrderInfoResponse) -> Unit,
        failure: (String) -> Unit
    ) {
        Log.e("kbzOrderInfo_request", Gson().toJson(encryptData))

        mPaymentApi.kbzOrderInfo(SharedConstants.getBasicAuthToken(), encryptData)
            .subscribeDataResponse(
                success = {
                    Log.e("kbzOrderInfo_response", Gson().toJson(it))
                    success(it)
                },
                failure = {
                    Log.e("kbzOrderInfo_response", it)
                    failure(it)
                })
    }

    override fun loadAppVersion(context: Context,success: (AppVersionVO) -> Unit, failure: (String) -> Unit) {

        mPaymentApi.getAppVersion(
            SharedConstants.getBasicAuthToken(),
            AppIDRequest(
                SharedConstants.APP_ID,
                SharedPreferenceUtils.getVersionNo(context)
            )
        )
            .subscribeDataResponse(
                success = {
                    appDatabase.appVersionDao().saveAppVersion(it)
                    success(it)
                },
                failure = {
                    failure(it)
                }
            )
    }

    override fun getAppVersion(): LiveData<AppVersionVO> {
        return appDatabase.appVersionDao().getAppVersion()
    }

    override fun changeEmail(
        context: Context,
        request: EmailRequest,
        success: (String) -> Unit,
        failure: (String) -> Unit
    ) {
        mMobileAppApi.changeEmail(
            SharedConstants.REQUEST_TYPE_JSON,SharedConstants.getBasicAuthToken(),
            request
        ).subscribeBaseResponse({
            success(it)
        }, {
            failure(it)
        })
    }

    override fun checkEmail(
        context: Context,
        request: EmailCheckRequest,
        success: (String) -> Unit,
        failure: (String) -> Unit
    ) {
        mMobileAppApi.checkEmail(
            SharedConstants.REQUEST_TYPE_JSON,SharedConstants.getBasicAuthToken(),
            request
        ).subscribeBaseResponse({

            success(it)

        }, {
            failure(it)
        })
    }

    override fun emailList(
        context: Context,
        request: EmailRequest,
        success: (MutableList<EmailListResponse>) -> Unit,
        failure: (String) -> Unit
    ) {
        mMobileAppApi.emailListFromBss(SharedConstants.REQUEST_TYPE_JSON,SharedConstants.getBasicAuthToken(),request)
            .subscribeDataResponse(success = {
                success(it)
            }, failure = failure)
    }

    override fun updateEmailInfo(
        context: Context,
        request: UpdateEmailRequest,
        success: (String) -> Unit,
        failure: (String) -> Unit
    ) {
       mMobileAppApi.updateEmailInfo(SharedConstants.REQUEST_TYPE_JSON,SharedConstants.getBasicAuthToken(),request)
           .subscribeBaseResponse({
               success(it)
           },{
               failure(it)
           })
    }
}