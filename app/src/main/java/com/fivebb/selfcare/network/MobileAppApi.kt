package com.fivebb.selfcare.network

import com.fivebb.selfcare.network.requests.*
import com.fivebb.selfcare.network.responses.EmailList
import com.fivebb.selfcare.network.responses.EmailListResponse
import com.fivebb.selfcare.utils.*
import com.fivebb.shared.network.responses.BaseResponse
import com.fivebb.shared.network.responses.DataResponse
import com.fivebb.shared.utils.SharedConstants
import com.fivebb.shared.vos.*
import io.reactivex.Observable
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST

interface MobileAppApi {
   /* @POST(API_INVOICE_DOWNLOAD)
    fun getInvoicePDf(
        @Header(SharedConstants.HEADER_CONTENT_TYPE) contentType: String,
        @Header(SharedConstants.HEADER_AUTHORIZATION) authorization: String,
        @Body request: DownloadPaymentSlipRequest
    ): Observable<DataResponse<InvoiceVO>>*/

    @POST(API_PAYMENT_METHOD)
    fun getPaymentMethod(
        @Header(SharedConstants.HEADER_CONTENT_TYPE) contentType: String,
        @Header(SharedConstants.HEADER_AUTHORIZATION) authorization: String,
    ): Observable<DataResponse<MutableList<PaymentMethodVO>>>

    @POST(API_GET_PLAN)
    fun getPlan(
        @Header(SharedConstants.HEADER_CONTENT_TYPE) contentType: String,
        @Header(SharedConstants.HEADER_AUTHORIZATION) authorization: String,
        @Body request: GetPlanRequest
    ): Observable<DataResponse<MutableList<PlanVO>>>

    @POST(API_TOPICS)
    fun getTopics(
        @Header(SharedConstants.HEADER_CONTENT_TYPE) contentType: String,
        @Header(SharedConstants.HEADER_AUTHORIZATION) authorization: String,
        @Body request: GetTopicRequest
    ): Observable<DataResponse<MutableList<TopicVO>>>

    @POST(API_NOTIFICATION)
    fun getNotiList(
        @Header(SharedConstants.HEADER_CONTENT_TYPE) contentType: String,
        @Header(SharedConstants.HEADER_AUTHORIZATION) authorization: String,
        @Body request: GetNotiListRequest
    ): Observable<DataResponse<MutableList<NotificationVO>>>

    @POST(API_GET_RECHARGE_LIST)
    fun getRechargeList(
        @Header(SharedConstants.HEADER_CONTENT_TYPE) contentType: String,
        @Header(SharedConstants.HEADER_AUTHORIZATION) authorization: String,
        @Body request: GetRechargePlanListRequest
    ): Observable<DataResponse<MutableList<RechargeVO>>>

    @POST(API_DEL_NOTI_ID)
    fun postDeleteNotiID(
        @Header(SharedConstants.HEADER_CONTENT_TYPE) contentType: String,
        @Header(SharedConstants.HEADER_AUTHORIZATION) authorization: String,
        @Body request: NotiIdRequest
    ): Observable<BaseResponse>

    @POST(API_UPDATE_NOTI_ID)
    fun updateNotiId(
        @Header(SharedConstants.HEADER_CONTENT_TYPE) contentType: String,
        @Header(SharedConstants.HEADER_AUTHORIZATION) authorization: String,
        @Body request: NotiIdRequest
    ): Observable<BaseResponse>

    @POST(API_SAVE_ACTIVITY_LOG)
    fun getActivityLog(
        @Header(SharedConstants.HEADER_CONTENT_TYPE) contentType: String,
        @Header(SharedConstants.HEADER_AUTHORIZATION) authorization: String,
        @Body request: ActivityLogRequest
    ): Observable<DataResponse<MutableList<ActivityLogVO>>>

    @POST(API_SAVE_ACTIVITY)
    fun saveActivity(
        @Header(SharedConstants.HEADER_CONTENT_TYPE) contentType: String,
        @Header(SharedConstants.HEADER_AUTHORIZATION) authorization: String,
        @Body request: SaveActivityLogRequest
    ): Observable<BaseResponse>

    @POST(API_SEND_EMAIL)
    fun sendEmail(
        @Header(SharedConstants.HEADER_CONTENT_TYPE) contentType: String,
        @Header(SharedConstants.HEADER_AUTHORIZATION) authorization: String,
        @Body request: SendEmailRequest
    ): Observable<BaseResponse>

    @POST(API_APP_IMAGE_LIST)
    fun getAppImageList(
        @Header(SharedConstants.HEADER_CONTENT_TYPE) contentType: String,
        @Header(SharedConstants.HEADER_AUTHORIZATION) authorization: String,
        @Body request: AppImageRequest
    ): Observable<DataResponse<MutableList<AppImageVO>>>

    @POST(API_GET_REGION)
    fun getRegion(
        @Header(SharedConstants.HEADER_CONTENT_TYPE) contentType: String,
        @Header(SharedConstants.HEADER_AUTHORIZATION) authorization: String,
        @Body request: GetRegionRequest
    ): Observable<DataResponse<MutableList<RegionVO>>>

    @POST(API_ADV_TOP_UP)
    fun fillTopUp(
        @Header(SharedConstants.HEADER_CONTENT_TYPE) contentType: String,
        @Header(SharedConstants.HEADER_AUTHORIZATION) authorization: String,
        @Body request: ActivityLogRequest
    ): Observable<DataResponse<PlanPriceListVO>>

    @POST(API_ADV_TOP_UP_ACTION)
    fun getTopUpAction(
        @Header(SharedConstants.HEADER_CONTENT_TYPE) contentType: String,
        @Header(SharedConstants.HEADER_AUTHORIZATION) authorization: String,
        @Body request: TopUpPlanActionRequest
    ): Observable<BaseResponse>

    @POST(API_CHECK_VERIFICATION)
    fun checkVerication(
        @Header(SharedConstants.HEADER_CONTENT_TYPE) contentType: String,
        @Header(SharedConstants.HEADER_AUTHORIZATION) authorization: String,
        @Body request: CheckVerificationRequest
    ): Observable<DataResponse<CheckVericationVO>>

    @POST(API_EMAIL_CHECK_VERIFICATION)
    fun checkEmail(
        @Header(SharedConstants.HEADER_CONTENT_TYPE) contentType: String,
        @Header(SharedConstants.HEADER_AUTHORIZATION) authorization: String,
        @Body request: EmailCheckRequest
    ): Observable<BaseResponse>

    @POST(API_EMAIL_VERIFICATION)
    fun changeEmail(
        @Header(SharedConstants.HEADER_CONTENT_TYPE) contentType: String,
        @Header(SharedConstants.HEADER_AUTHORIZATION) authorization: String,
        @Body request: EmailRequest
    ): Observable<BaseResponse>

    @POST(API_EMAIL_LIST)
    fun emailListFromBss(
        @Header(SharedConstants.HEADER_CONTENT_TYPE) contentType: String,
        @Header(SharedConstants.HEADER_AUTHORIZATION) authorization: String,
        @Body request: EmailRequest
    ): Observable<DataResponse<MutableList<EmailListResponse>>>

    @POST(API_UPDATE_EMAIL_INFO)
    fun updateEmailInfo(
        @Header(SharedConstants.HEADER_CONTENT_TYPE) contentType: String,
        @Header(SharedConstants.HEADER_AUTHORIZATION) authorization: String,
        @Body request: UpdateEmailRequest
    ):Observable<BaseResponse>
}