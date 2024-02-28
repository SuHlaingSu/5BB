package com.fivebb.selfcare.mvp.presenters.impls;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0017H\u0003J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0010H\u0002J\u0010\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u0007H\u0002J\u0018\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\u0017H\u0003J\u0010\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u001eH\u0002J\u0010\u0010 \u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020!H\u0002J\u0018\u0010\"\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020!2\u0006\u0010\u0016\u001a\u00020\u0017H\u0003J\b\u0010#\u001a\u00020\u000eH\u0016J\u0010\u0010$\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0015H\u0002J\b\u0010%\u001a\u00020\u000eH\u0016J\u0010\u0010&\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0017H\u0003J\u0010\u0010\'\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010(\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\nH\u0016J\u0010\u0010(\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020+H\u0016J\u0018\u0010,\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\u00072\u0006\u0010.\u001a\u00020/H\u0016J\u0018\u00100\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0017H\u0017J\u0018\u00101\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\u0017H\u0017J\u0018\u00102\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020!2\u0006\u0010\u0016\u001a\u00020\u0017H\u0017J\u000e\u00103\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020!R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00064"}, d2 = {"Lcom/fivebb/selfcare/mvp/presenters/impls/PXPaymentPresenterImpls;", "Lcom/fivebb/shared/mvp/presenters/BasePresenter;", "Lcom/fivebb/selfcare/mvp/views/RechargeTopUpView;", "Lcom/fivebb/selfcare/models/UserModel;", "Lcom/fivebb/selfcare/mvp/presenters/PxPaymentPresenter;", "()V", "currentDT", "", "mBankList", "", "Lcom/fivebb/shared/vos/BankVO;", "nextPlanStartDate", "resultDate", "ayaPayQueryOrder", "", "data", "Lcom/fivebb/selfcare/network/requests/AYAPayRequest;", "citizenPaymentRetrieve", "request", "Lcom/fivebb/selfcare/network/requests/CitizenPayRequest;", "generateEncDataForAYAPay", "Lcom/fivebb/selfcare/network/requests/EncryptDataRequest;", "context", "Landroid/content/Context;", "generateEncDataForAYAPayQueryOrder", "generateEncDataForCitizen", "generateEncDataForMCFRetrieve", "generateEncDataForOrderInFo", "prepayID", "generateEncDataForPreCreate", "Lcom/fivebb/selfcare/network/requests/KBZPreCreateRequest;", "generateEncDataForQueryOrder", "generateEncDataForWPQueryOrder", "Lcom/fivebb/selfcare/network/requests/WavePayRequest;", "generateEncDataForWavePay", "loadBankList", "loadKBZOrderInfo", "loadPaymentMethodList", "nextPlanResultDate", "onPayWithCitizen", "onTapBank", "bank", "payment", "Lcom/fivebb/shared/vos/CombinePaymentDataVO;", "onTapFullScreen", "url", "position", "", "onTapPayWithAYAPay", "onTapPayWithKBZPay", "onTapWavePayRequest", "wPayQueryOrder", "app_psrDebug"})
public final class PXPaymentPresenterImpls extends com.fivebb.shared.mvp.presenters.BasePresenter<com.fivebb.selfcare.mvp.views.RechargeTopUpView, com.fivebb.selfcare.models.UserModel> implements com.fivebb.selfcare.mvp.presenters.PxPaymentPresenter {
    private final java.util.List<com.fivebb.shared.vos.BankVO> mBankList = null;
    private java.lang.String currentDT;
    private java.lang.String resultDate;
    private java.lang.String nextPlanStartDate;
    
    public PXPaymentPresenterImpls() {
        super();
    }
    
    @java.lang.Override()
    public void loadBankList() {
    }
    
    @java.lang.Override()
    public void loadPaymentMethodList() {
    }
    
    @java.lang.Override()
    public void onTapBank(@org.jetbrains.annotations.NotNull()
    com.fivebb.shared.vos.BankVO bank) {
    }
    
    @java.lang.Override()
    public void onTapBank(@org.jetbrains.annotations.NotNull()
    com.fivebb.shared.vos.CombinePaymentDataVO payment) {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.N)
    @java.lang.Override()
    public void onTapPayWithKBZPay(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.requests.KBZPreCreateRequest request, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.N)
    @java.lang.Override()
    public void onTapPayWithAYAPay(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.requests.AYAPayRequest request, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void ayaPayQueryOrder(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.requests.AYAPayRequest data) {
    }
    
    private final void loadKBZOrderInfo(com.fivebb.selfcare.network.requests.EncryptDataRequest data) {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.N)
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    private final void nextPlanResultDate(android.content.Context context) {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.N)
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    private final com.fivebb.selfcare.network.requests.EncryptDataRequest generateEncDataForPreCreate(com.fivebb.selfcare.network.requests.KBZPreCreateRequest request, android.content.Context context) {
        return null;
    }
    
    private final com.fivebb.selfcare.network.requests.EncryptDataRequest generateEncDataForQueryOrder(com.fivebb.selfcare.network.requests.KBZPreCreateRequest request) {
        return null;
    }
    
    private final com.fivebb.selfcare.network.requests.EncryptDataRequest generateEncDataForOrderInFo(java.lang.String prepayID) {
        return null;
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.N)
    private final com.fivebb.selfcare.network.requests.EncryptDataRequest generateEncDataForAYAPay(com.fivebb.selfcare.network.requests.AYAPayRequest request, android.content.Context context) {
        return null;
    }
    
    private final com.fivebb.selfcare.network.requests.EncryptDataRequest generateEncDataForAYAPayQueryOrder(com.fivebb.selfcare.network.requests.AYAPayRequest request) {
        return null;
    }
    
    @java.lang.Override()
    public void onPayWithCitizen(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.requests.CitizenPayRequest request) {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.N)
    @java.lang.Override()
    public void onTapWavePayRequest(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.requests.WavePayRequest request, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void wPayQueryOrder(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.requests.WavePayRequest data) {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.N)
    private final com.fivebb.selfcare.network.requests.EncryptDataRequest generateEncDataForWavePay(com.fivebb.selfcare.network.requests.WavePayRequest request, android.content.Context context) {
        return null;
    }
    
    private final com.fivebb.selfcare.network.requests.EncryptDataRequest generateEncDataForWPQueryOrder(com.fivebb.selfcare.network.requests.WavePayRequest request) {
        return null;
    }
    
    @java.lang.Override()
    public void citizenPaymentRetrieve(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.requests.CitizenPayRequest request) {
    }
    
    private final com.fivebb.selfcare.network.requests.EncryptDataRequest generateEncDataForCitizen(com.fivebb.selfcare.network.requests.CitizenPayRequest request) {
        return null;
    }
    
    private final com.fivebb.selfcare.network.requests.EncryptDataRequest generateEncDataForMCFRetrieve(com.fivebb.selfcare.network.requests.CitizenPayRequest request) {
        return null;
    }
    
    @java.lang.Override()
    public void onTapFullScreen(@org.jetbrains.annotations.NotNull()
    java.lang.String url, long position) {
    }
}