package com.fivebb.selfcare.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u00b2\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\tH\'J,\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u000bH\'J2\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u000fH\'J8\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\r0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\tH\'J2\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\r0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u0015H\'J8\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00110\r0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u0015H\'J8\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00110\r0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u001aH\'J8\u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00110\r0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u001dH\'J.\u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00110\r0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\'J8\u0010 \u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u00110\r0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\"H\'J8\u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u00110\r0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020%H\'J8\u0010&\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\'0\u00110\r0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020(H\'J,\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020*H\'J8\u0010+\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0\u00110\r0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020-H\'J,\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020/H\'J,\u00100\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u000201H\'J,\u00102\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u000203H\'J,\u00104\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u000205H\'J,\u00106\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020/H\'\u00a8\u00067"}, d2 = {"Lcom/fivebb/selfcare/network/MobileAppApi;", "", "changeEmail", "Lio/reactivex/Observable;", "Lcom/fivebb/shared/network/responses/BaseResponse;", "contentType", "", "authorization", "request", "Lcom/fivebb/selfcare/network/requests/EmailRequest;", "checkEmail", "Lcom/fivebb/selfcare/network/requests/EmailCheckRequest;", "checkVerication", "Lcom/fivebb/shared/network/responses/DataResponse;", "Lcom/fivebb/shared/vos/CheckVericationVO;", "Lcom/fivebb/selfcare/network/requests/CheckVerificationRequest;", "emailListFromBss", "", "Lcom/fivebb/selfcare/network/responses/EmailListResponse;", "fillTopUp", "Lcom/fivebb/shared/vos/PlanPriceListVO;", "Lcom/fivebb/selfcare/network/requests/ActivityLogRequest;", "getActivityLog", "Lcom/fivebb/shared/vos/ActivityLogVO;", "getAppImageList", "Lcom/fivebb/shared/vos/AppImageVO;", "Lcom/fivebb/selfcare/network/requests/AppImageRequest;", "getNotiList", "Lcom/fivebb/shared/vos/NotificationVO;", "Lcom/fivebb/selfcare/network/requests/GetNotiListRequest;", "getPaymentMethod", "Lcom/fivebb/shared/vos/PaymentMethodVO;", "getPlan", "Lcom/fivebb/shared/vos/PlanVO;", "Lcom/fivebb/selfcare/network/requests/GetPlanRequest;", "getRechargeList", "Lcom/fivebb/shared/vos/RechargeVO;", "Lcom/fivebb/selfcare/network/requests/GetRechargePlanListRequest;", "getRegion", "Lcom/fivebb/shared/vos/RegionVO;", "Lcom/fivebb/selfcare/network/requests/GetRegionRequest;", "getTopUpAction", "Lcom/fivebb/selfcare/network/requests/TopUpPlanActionRequest;", "getTopics", "Lcom/fivebb/shared/vos/TopicVO;", "Lcom/fivebb/selfcare/network/requests/GetTopicRequest;", "postDeleteNotiID", "Lcom/fivebb/selfcare/network/requests/NotiIdRequest;", "saveActivity", "Lcom/fivebb/selfcare/network/requests/SaveActivityLogRequest;", "sendEmail", "Lcom/fivebb/selfcare/network/requests/SendEmailRequest;", "updateEmailInfo", "Lcom/fivebb/selfcare/network/requests/UpdateEmailRequest;", "updateNotiId", "app_devDebug"})
public abstract interface MobileAppApi {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "GetPaymentMethod")
    public abstract io.reactivex.Observable<com.fivebb.shared.network.responses.DataResponse<java.util.List<com.fivebb.shared.vos.PaymentMethodVO>>> getPaymentMethod(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Content-Type")
    java.lang.String contentType, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authorization);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "GetPlan")
    public abstract io.reactivex.Observable<com.fivebb.shared.network.responses.DataResponse<java.util.List<com.fivebb.shared.vos.PlanVO>>> getPlan(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Content-Type")
    java.lang.String contentType, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authorization, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.fivebb.selfcare.network.requests.GetPlanRequest request);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "GetTopicV2")
    public abstract io.reactivex.Observable<com.fivebb.shared.network.responses.DataResponse<java.util.List<com.fivebb.shared.vos.TopicVO>>> getTopics(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Content-Type")
    java.lang.String contentType, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authorization, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.fivebb.selfcare.network.requests.GetTopicRequest request);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "NotiListv2")
    public abstract io.reactivex.Observable<com.fivebb.shared.network.responses.DataResponse<java.util.List<com.fivebb.shared.vos.NotificationVO>>> getNotiList(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Content-Type")
    java.lang.String contentType, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authorization, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.fivebb.selfcare.network.requests.GetNotiListRequest request);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "GetRechargePlan")
    public abstract io.reactivex.Observable<com.fivebb.shared.network.responses.DataResponse<java.util.List<com.fivebb.shared.vos.RechargeVO>>> getRechargeList(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Content-Type")
    java.lang.String contentType, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authorization, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.fivebb.selfcare.network.requests.GetRechargePlanListRequest request);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "DeleteNotiByID")
    public abstract io.reactivex.Observable<com.fivebb.shared.network.responses.BaseResponse> postDeleteNotiID(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Content-Type")
    java.lang.String contentType, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authorization, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.fivebb.selfcare.network.requests.NotiIdRequest request);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "UpdateNotiByID")
    public abstract io.reactivex.Observable<com.fivebb.shared.network.responses.BaseResponse> updateNotiId(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Content-Type")
    java.lang.String contentType, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authorization, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.fivebb.selfcare.network.requests.NotiIdRequest request);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "GetActivityLog")
    public abstract io.reactivex.Observable<com.fivebb.shared.network.responses.DataResponse<java.util.List<com.fivebb.shared.vos.ActivityLogVO>>> getActivityLog(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Content-Type")
    java.lang.String contentType, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authorization, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.fivebb.selfcare.network.requests.ActivityLogRequest request);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "SaveActivityLog")
    public abstract io.reactivex.Observable<com.fivebb.shared.network.responses.BaseResponse> saveActivity(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Content-Type")
    java.lang.String contentType, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authorization, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.fivebb.selfcare.network.requests.SaveActivityLogRequest request);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "SendEmail")
    public abstract io.reactivex.Observable<com.fivebb.shared.network.responses.BaseResponse> sendEmail(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Content-Type")
    java.lang.String contentType, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authorization, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.fivebb.selfcare.network.requests.SendEmailRequest request);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "AppImageList")
    public abstract io.reactivex.Observable<com.fivebb.shared.network.responses.DataResponse<java.util.List<com.fivebb.shared.vos.AppImageVO>>> getAppImageList(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Content-Type")
    java.lang.String contentType, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authorization, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.fivebb.selfcare.network.requests.AppImageRequest request);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "RegionList")
    public abstract io.reactivex.Observable<com.fivebb.shared.network.responses.DataResponse<java.util.List<com.fivebb.shared.vos.RegionVO>>> getRegion(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Content-Type")
    java.lang.String contentType, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authorization, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.fivebb.selfcare.network.requests.GetRegionRequest request);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "PlanPriceList")
    public abstract io.reactivex.Observable<com.fivebb.shared.network.responses.DataResponse<com.fivebb.shared.vos.PlanPriceListVO>> fillTopUp(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Content-Type")
    java.lang.String contentType, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authorization, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.fivebb.selfcare.network.requests.ActivityLogRequest request);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "AdvancePaymentPlanAction")
    public abstract io.reactivex.Observable<com.fivebb.shared.network.responses.BaseResponse> getTopUpAction(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Content-Type")
    java.lang.String contentType, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authorization, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.fivebb.selfcare.network.requests.TopUpPlanActionRequest request);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "CheckVerification")
    public abstract io.reactivex.Observable<com.fivebb.shared.network.responses.DataResponse<com.fivebb.shared.vos.CheckVericationVO>> checkVerication(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Content-Type")
    java.lang.String contentType, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authorization, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.fivebb.selfcare.network.requests.CheckVerificationRequest request);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "CheckAccountVerification")
    public abstract io.reactivex.Observable<com.fivebb.shared.network.responses.BaseResponse> checkEmail(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Content-Type")
    java.lang.String contentType, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authorization, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.fivebb.selfcare.network.requests.EmailCheckRequest request);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "AccountVerification")
    public abstract io.reactivex.Observable<com.fivebb.shared.network.responses.BaseResponse> changeEmail(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Content-Type")
    java.lang.String contentType, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authorization, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.fivebb.selfcare.network.requests.EmailRequest request);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "GetEmailList")
    public abstract io.reactivex.Observable<com.fivebb.shared.network.responses.DataResponse<java.util.List<com.fivebb.selfcare.network.responses.EmailListResponse>>> emailListFromBss(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Content-Type")
    java.lang.String contentType, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authorization, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.fivebb.selfcare.network.requests.EmailRequest request);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "UpdateCustomerContact")
    public abstract io.reactivex.Observable<com.fivebb.shared.network.responses.BaseResponse> updateEmailInfo(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Content-Type")
    java.lang.String contentType, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authorization, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.fivebb.selfcare.network.requests.UpdateEmailRequest request);
}