package com.fivebb.selfcare.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH\'J(\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH\'J2\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00040\u00032\b\b\u0001\u0010\u000e\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\'J(\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\u0013\u001a\u00020\u0014H\'J2\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00040\u00032\b\b\u0001\u0010\u000e\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\'J2\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00040\u00032\b\b\u0001\u0010\u000e\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\u0019\u001a\u00020\u001aH\'J(\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH\'J(\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH\'J(\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH\'J(\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH\'J(\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH\'J(\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH\'J(\u0010\'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH\'\u00a8\u0006)"}, d2 = {"Lcom/fivebb/selfcare/network/PaymentApi;", "", "ayaPay", "Lio/reactivex/Observable;", "Lcom/fivebb/shared/network/responses/DataResponse;", "Lcom/fivebb/selfcare/network/responses/AYARequestPushPaymentResponse;", "authorization", "", "encryptData", "Lcom/fivebb/selfcare/network/requests/EncryptDataRequest;", "ayaPayQueryOrder", "Lcom/fivebb/selfcare/network/responses/AYAQueryOrderResponse;", "getAdvancedPayment", "Lcom/fivebb/shared/vos/AdvancePaymentVO;", "contentType", "advancePaymentRequest", "Lcom/fivebb/selfcare/network/requests/AdvancePaymentRequest;", "getAppVersion", "Lcom/fivebb/shared/vos/AppVersionVO;", "appVersion", "Lcom/fivebb/selfcare/network/requests/AppIDRequest;", "getPXDetails", "Lcom/fivebb/shared/vos/PXDetailVO;", "getPXPlan", "Lcom/fivebb/shared/vos/PXPlanListVO;", "request", "Lcom/fivebb/selfcare/network/requests/PXPlanListRequest;", "kbzOrderInfo", "Lcom/fivebb/selfcare/network/responses/KBZOrderInfoResponse;", "kbzPreCreate", "Lcom/fivebb/selfcare/network/responses/KBZPreCreateResponse;", "kbzQueryOrder", "Lcom/fivebb/selfcare/network/responses/KBZQueryOrderResponse;", "mcfPay", "Lcom/fivebb/selfcare/network/responses/CitizenPayResponse;", "mcfRetrieve", "Lcom/fivebb/selfcare/network/responses/CitizenRetrieveResponse;", "wavePayQueryOrder", "Lcom/fivebb/selfcare/network/responses/WaveQueryOrderResponse;", "wavePayRequest", "Lcom/fivebb/selfcare/network/responses/WavePayResponse;", "app_psrDebug"})
public abstract interface PaymentApi {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "Payment/KBZPrecreateV2")
    public abstract io.reactivex.Observable<com.fivebb.shared.network.responses.DataResponse<com.fivebb.selfcare.network.responses.KBZPreCreateResponse>> kbzPreCreate(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authorization, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.fivebb.selfcare.network.requests.EncryptDataRequest encryptData);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "Payment/KBZQueryOrder")
    public abstract io.reactivex.Observable<com.fivebb.shared.network.responses.DataResponse<com.fivebb.selfcare.network.responses.KBZQueryOrderResponse>> kbzQueryOrder(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authorization, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.fivebb.selfcare.network.requests.EncryptDataRequest encryptData);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "Payment/KBZOrderInfo")
    public abstract io.reactivex.Observable<com.fivebb.shared.network.responses.DataResponse<com.fivebb.selfcare.network.responses.KBZOrderInfoResponse>> kbzOrderInfo(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authorization, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.fivebb.selfcare.network.requests.EncryptDataRequest encryptData);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "MobileAppAPI/GetAppVersionV2")
    public abstract io.reactivex.Observable<com.fivebb.shared.network.responses.DataResponse<com.fivebb.shared.vos.AppVersionVO>> getAppVersion(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authorization, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.fivebb.selfcare.network.requests.AppIDRequest appVersion);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "BSS/GetDetail")
    public abstract io.reactivex.Observable<com.fivebb.shared.network.responses.DataResponse<com.fivebb.shared.vos.AdvancePaymentVO>> getAdvancedPayment(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Content-Type")
    java.lang.String contentType, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authorization, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.fivebb.selfcare.network.requests.AdvancePaymentRequest advancePaymentRequest);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "BSS/GetDetail")
    public abstract io.reactivex.Observable<com.fivebb.shared.network.responses.DataResponse<com.fivebb.shared.vos.PXDetailVO>> getPXDetails(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Content-Type")
    java.lang.String contentType, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authorization, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.fivebb.selfcare.network.requests.AdvancePaymentRequest advancePaymentRequest);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "Payment/AYARequestPushPayment")
    public abstract io.reactivex.Observable<com.fivebb.shared.network.responses.DataResponse<com.fivebb.selfcare.network.responses.AYARequestPushPaymentResponse>> ayaPay(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authorization, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.fivebb.selfcare.network.requests.EncryptDataRequest encryptData);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "Payment/AYAQueryOrder")
    public abstract io.reactivex.Observable<com.fivebb.shared.network.responses.DataResponse<com.fivebb.selfcare.network.responses.AYAQueryOrderResponse>> ayaPayQueryOrder(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authorization, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.fivebb.selfcare.network.requests.EncryptDataRequest encryptData);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "Payment/MCBEMoneyPayments")
    public abstract io.reactivex.Observable<com.fivebb.shared.network.responses.DataResponse<com.fivebb.selfcare.network.responses.CitizenPayResponse>> mcfPay(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authorization, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.fivebb.selfcare.network.requests.EncryptDataRequest encryptData);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "Payment/GTGMCBRetrieveEmoneyPayment")
    public abstract io.reactivex.Observable<com.fivebb.shared.network.responses.DataResponse<com.fivebb.selfcare.network.responses.CitizenRetrieveResponse>> mcfRetrieve(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authorization, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.fivebb.selfcare.network.requests.EncryptDataRequest encryptData);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "Payment/WMPaymentRequest")
    public abstract io.reactivex.Observable<com.fivebb.shared.network.responses.DataResponse<com.fivebb.selfcare.network.responses.WavePayResponse>> wavePayRequest(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authorization, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.fivebb.selfcare.network.requests.EncryptDataRequest encryptData);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "Payment/WMQueryOrder")
    public abstract io.reactivex.Observable<com.fivebb.shared.network.responses.DataResponse<com.fivebb.selfcare.network.responses.WaveQueryOrderResponse>> wavePayQueryOrder(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authorization, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.fivebb.selfcare.network.requests.EncryptDataRequest encryptData);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "Payment/PXPlanPriceList")
    public abstract io.reactivex.Observable<com.fivebb.shared.network.responses.DataResponse<com.fivebb.shared.vos.PXPlanListVO>> getPXPlan(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Content-Type")
    java.lang.String contentType, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authorization, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.fivebb.selfcare.network.requests.PXPlanListRequest request);
}