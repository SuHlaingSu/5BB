package com.fivebb.selfcare.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\tH\'J8\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u000eH\'J2\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u0011H\'J2\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u000b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u0014H\'J,\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u0016H\'J(\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u000b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u0019H\'J2\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u000b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u001cH\'J2\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u000b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u001fH\'J(\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u000b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\"H\'J\"\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u0019H\'\u00a8\u0006$"}, d2 = {"Lcom/fivebb/selfcare/network/UserApi;", "", "changePassword", "Lio/reactivex/Observable;", "Lcom/fivebb/shared/network/responses/BaseResponse;", "contentType", "", "authorization", "request", "Lcom/fivebb/selfcare/network/requests/ChangePasswordRequest;", "getBillList", "Lcom/fivebb/shared/network/responses/DataResponse;", "", "Lcom/fivebb/shared/vos/BillVO;", "Lcom/fivebb/selfcare/network/requests/BillListRequest;", "getCustomerDetail", "Lcom/fivebb/shared/vos/CustomerBasicViewDetailsVO;", "Lcom/fivebb/selfcare/network/requests/CustomerDetailRequest;", "getPaymentHistory", "Lcom/fivebb/shared/vos/PaymentDetailVO;", "Lcom/fivebb/selfcare/network/requests/PaymentHistoryRequest;", "getRechargedHistory", "Lcom/fivebb/selfcare/network/requests/RechargedHistoryRequest;", "getSecretQuestion", "Lcom/fivebb/shared/vos/SecretQuestionVO;", "Lcom/fivebb/selfcare/network/requests/SecretQuestionRequest;", "getServiceInstanceSummary", "Lcom/fivebb/shared/vos/ServiceInstanceSummaryVO;", "Lcom/fivebb/selfcare/network/requests/ServiceInstanceSummaryRequest;", "getTicketConfiguration", "Lcom/fivebb/shared/vos/TicketConfigVO;", "Lcom/fivebb/selfcare/network/requests/TicketConfigurationRequest;", "login", "Lcom/fivebb/shared/vos/UserLoginVO;", "Lcom/fivebb/selfcare/network/requests/LoginRequest;", "validateSecretQuestion", "app_psrRelease"})
public abstract interface UserApi {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "customer/login")
    public abstract io.reactivex.Observable<com.fivebb.shared.network.responses.DataResponse<com.fivebb.shared.vos.UserLoginVO>> login(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Content-Type")
    java.lang.String contentType, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.fivebb.selfcare.network.requests.LoginRequest request);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "customer/getCustomerBasicViewDetail")
    public abstract io.reactivex.Observable<com.fivebb.shared.network.responses.DataResponse<com.fivebb.shared.vos.CustomerBasicViewDetailsVO>> getCustomerDetail(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Content-Type")
    java.lang.String contentType, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authorization, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.fivebb.selfcare.network.requests.CustomerDetailRequest request);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "customer/changecustomerpassword")
    public abstract io.reactivex.Observable<com.fivebb.shared.network.responses.BaseResponse> changePassword(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Content-Type")
    java.lang.String contentType, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authorization, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.fivebb.selfcare.network.requests.ChangePasswordRequest request);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "customer/getPaymentHistory")
    public abstract io.reactivex.Observable<com.fivebb.shared.network.responses.DataResponse<com.fivebb.shared.vos.PaymentDetailVO>> getPaymentHistory(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Content-Type")
    java.lang.String contentType, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authorization, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.fivebb.selfcare.network.requests.PaymentHistoryRequest request);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "customer/searchBill")
    public abstract io.reactivex.Observable<com.fivebb.shared.network.responses.DataResponse<java.util.List<com.fivebb.shared.vos.BillVO>>> getBillList(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Content-Type")
    java.lang.String contentType, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authorization, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.fivebb.selfcare.network.requests.BillListRequest request);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "ticket/loadConfiguration")
    public abstract io.reactivex.Observable<com.fivebb.shared.network.responses.DataResponse<com.fivebb.shared.vos.TicketConfigVO>> getTicketConfiguration(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Content-Type")
    java.lang.String contentType, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authorization, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.fivebb.selfcare.network.requests.TicketConfigurationRequest request);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "customer/getrechargehistory")
    public abstract io.reactivex.Observable<com.fivebb.shared.network.responses.BaseResponse> getRechargedHistory(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Content-Type")
    java.lang.String contentType, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authorization, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.fivebb.selfcare.network.requests.RechargedHistoryRequest request);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "customer/getServiceInstanceSummaryDetail")
    public abstract io.reactivex.Observable<com.fivebb.shared.network.responses.DataResponse<com.fivebb.shared.vos.ServiceInstanceSummaryVO>> getServiceInstanceSummary(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Content-Type")
    java.lang.String contentType, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authorization, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.fivebb.selfcare.network.requests.ServiceInstanceSummaryRequest request);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "customer/forgotpassword/getsecretquestion")
    public abstract io.reactivex.Observable<com.fivebb.shared.network.responses.DataResponse<com.fivebb.shared.vos.SecretQuestionVO>> getSecretQuestion(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Content-Type")
    java.lang.String contentType, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.fivebb.selfcare.network.requests.SecretQuestionRequest request);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "customer/forgotpassword/validatesecretquestion")
    public abstract io.reactivex.Observable<com.fivebb.shared.network.responses.BaseResponse> validateSecretQuestion(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Content-Type")
    java.lang.String contentType, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.fivebb.selfcare.network.requests.SecretQuestionRequest request);
}