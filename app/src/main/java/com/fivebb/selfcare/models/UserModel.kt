package com.fivebb.selfcare.models

import android.content.Context
import androidx.lifecycle.LiveData
import com.fivebb.selfcare.network.requests.*
import com.fivebb.selfcare.network.responses.*
import com.fivebb.shared.model.BaseModel
import com.fivebb.shared.vos.*

interface UserModel : BaseModel {
    fun getInvoicePDF(
        context: Context,
        request: DownloadPaymentSlipRequest,
        success: (InvoiceVO) -> Unit,
        failure: (String) -> Unit
    )
    fun getPaymentMethod(
        success: (MutableList<PaymentMethodVO>) -> Unit,
        failure: (String) -> Unit
    )
    fun getRechargeList(
        context: Context,
        success: (MutableList<RechargeVO>) -> Unit,
        failure: (String) -> Unit
    )

    fun loginAndGetAccountDetail(
        context: Context,
        accountId: String,
        password: String,
        checkedRememberMe: Boolean,
        success: (String) -> Unit,
        failure: (String) -> Unit
    )

    fun getRememberPreviousAccountId(
        context: Context,
        accountId: (String) -> Unit,
        password: (String) -> Unit,
        checkedRememberMe: (Boolean) -> Unit
    )

    fun getCustomerBasicViewDetails(
        context: Context,
        success: (CustomerBasicViewDetailsVO) -> Unit,
        failure: (String) -> Unit
    )

    fun getLoadedCustomerDetails(): CustomerBasicViewDetailsVO?

    fun getLoadedRegionList(): RegionVO?

    fun changePassword(
        context: Context,
        request: ChangePasswordRequest,
        success: (String) -> Unit,
        failure: (String) -> Unit
    )

    fun getPaymentHistory(
        context: Context,
        success: (List<PaymentHistoryVO>) -> Unit,
        failure: (String) -> Unit
    )

    fun getPaymentHistoryByDateRange(
        context: Context,
        fromDate: String,
        toDate: String,
        success: (List<PaymentHistoryVO>) -> Unit,
        failure: (String) -> Unit
    )
    fun getTopics(
        context: Context,
        success: (MutableList<TopicVO>) -> Unit,
        failure: (String) -> Unit
    )

    fun getNotiList(
        context: Context,
        success: (MutableList<NotificationVO>) -> Unit,
        failure: (String) -> Unit
    )

    fun deleteNoti(
        context: Context,
        request:NotiIdRequest,
        success: (String) -> Unit,
        failure: (String) -> Unit
    )
    fun updateNoti(
        context: Context,
        request:NotiIdRequest,
        success: (String) -> Unit,
        failure: (String) -> Unit
    )
    fun getDataForHomeScreen(
        context: Context,
        success: (ServiceInstanceSummaryVO) -> Unit,
        failure: (String) -> Unit
    )

    fun getLoadedPaymentHistory(): MutableList<PaymentHistoryVO>

    fun logOut(context: Context, success: () -> Unit)

    fun getBillList(
        context: Context,
        success: (MutableList<BillVO>) -> Unit,
        failure: (String) -> Unit
    )

    fun getLoadedBillList(): MutableList<BillVO>

    fun getTicketConfiguration(
        context: Context,
        success: (TicketConfigVO) -> Unit,
        failure: (String) -> Unit
    )

    fun getLoginHistory(): LiveData<List<LoginHistroyVO>>

    fun getServiceInstance(): ServiceInstanceDetailsVO?

    fun getPlan(context: Context, success: (MutableList<PlanVO>) -> Unit, failure: (String) -> Unit)

    fun getPXPlan(
        context: Context,
        success: (PXPlanListVO) -> Unit,
        failure: (String) -> Unit)

    fun getActivityLogs(
        context: Context,
        success: (MutableList<ActivityLogVO>) -> Unit,
        failure: (String) -> Unit
    )

    fun getLoadedActivityLogs(): MutableList<ActivityLogVO>

    fun getSecretQuestion(
        accountNumber: String,
        success: (String) -> Unit,
        failure: (String) -> Unit
    )

    fun validateSecretQuestion(answer: String, success: (String) -> Unit, failure: (String) -> Unit)

    fun sendEmail(
        context: Context,
        request: SendEmailRequest,
        success: (String) -> Unit,
        failure: (String) -> Unit
    )

    fun sendEmailAndSaveActivityLog(
        context: Context,
        //emailRequest: SendEmailRequest,
        saveActivityLogRequest: SaveActivityLogRequest,
        success: (String) -> Unit,
        failure: (String) -> Unit
    )

    fun getEmailByBillingArea(context: Context): String

    fun getCallCenterEmailByBillingArea(context: Context): String

    fun getAppImageList(
        context: Context,
        success: (MutableList<AppImageVO>) -> Unit,
        failure: (String) -> Unit
    )

    fun getRegion(
        context: Context,
        actionType: String,
        success: (RegionVO) -> Unit,
        failure: (String) -> Unit
    )

    fun getRegionByShowroom(
        context: Context,
        actionType: String,
        success: (MutableList<RegionVO>) -> Unit,
        failure: (String) -> Unit
    )

    fun requestWavePay(
        encryptData:EncryptDataRequest,
        success: (WavePayResponse) -> Unit,
        failure: (String) -> Unit
    )

    fun wavePayQueryOrder(
        encryptData:EncryptDataRequest,
        success: (WaveQueryOrderResponse) -> Unit,
        failure: (String) -> Unit
    )

    fun sendCitizenPay(
        encryptData:EncryptDataRequest,
        success: (CitizenPayResponse) -> Unit,
        failure: (String) -> Unit
    )

    fun payWithAYAPay(
        encryptData: EncryptDataRequest,
        success: (AYARequestPushPaymentResponse) -> Unit,
        failure: (String) -> Unit
    )

    fun AYAPayQueryOrder(
        encryptData:EncryptDataRequest,
        success: (AYAQueryOrderResponse) -> Unit,
        failure: (String) -> Unit
    )

    fun sendCitizenRetrieve(
        encryptData:EncryptDataRequest,
        success: (CitizenRetrieveResponse) -> Unit,
        failure: (String) -> Unit
    )

    fun sendKBZPayPreCreate(
        encryptData:EncryptDataRequest,
        success: (KBZPreCreateResponse) -> Unit,
        failure: (String) -> Unit
    )

    fun sendKBZPayQueryOrder(
        encryptData:EncryptDataRequest,
        success: (KBZQueryOrderResponse) -> Unit,
        failure: (String) -> Unit
    )

    fun loadKBZOrderInfo(
        encryptData: EncryptDataRequest,
        success:(KBZOrderInfoResponse)->Unit,
        failure: (String) -> Unit
    )

    fun loadAppVersion(
        context: Context,
        success:(AppVersionVO)->Unit,
        failure: (String) -> Unit
    )

    fun getAppVersion():LiveData<AppVersionVO>

    fun getAdvancePayment(
        context: Context,
        success: (AdvancePaymentVO) -> Unit,
        failure: (String) -> Unit
    )

    fun getPXDetails(
        context: Context,
        success: (PXDetailVO) -> Unit,
        failure: (String) -> Unit
    )

    fun advTopUp(
        context: Context,
        success: (PlanPriceListVO) -> Unit,
        failure: (String) -> Unit
    )

    fun topUpAction(
        context: Context,
        success: (String) -> Unit,
        failure: (String) -> Unit
    )

    fun checkVerication(
        context: Context,
        success: (CheckVericationVO) -> Unit,
        failure: (String) -> Unit
    )

    fun changeEmail(
        context: Context,
        request: EmailRequest,
        success: (String) -> Unit,
        failure: (String) -> Unit
    )

    fun checkEmail(
        context: Context,
        request: EmailCheckRequest,
        success: (String) -> Unit,
        failure: (String) -> Unit
    )

    fun emailList(
        context: Context,
        request: EmailRequest,
        success: (MutableList<EmailListResponse>) -> Unit,
        failure: (String) -> Unit
    )

    fun updateEmailInfo(
        context: Context,
        request: UpdateEmailRequest,
        success: (String) -> Unit,
        failure: (String) -> Unit
    )

}