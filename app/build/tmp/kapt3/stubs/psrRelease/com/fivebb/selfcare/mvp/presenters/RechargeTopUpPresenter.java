package com.fivebb.selfcare.mvp.presenters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\fH\u0002J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\fH\u0002J\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0018\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u0019H\u0002J\u0010\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u001eH\u0002J\u0010\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u001eH\u0002J\b\u0010 \u001a\u00020\nH\u0016J\u0010\u0010!\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0011H\u0002J\b\u0010\"\u001a\u00020\nH\u0016J\u0010\u0010#\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020\bH\u0016J\u0010\u0010$\u001a\u00020\n2\u0006\u0010&\u001a\u00020\'H\u0016J\u0018\u0010(\u001a\u00020\n2\u0006\u0010)\u001a\u00020\u00172\u0006\u0010*\u001a\u00020+H\u0016J\u0010\u0010,\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\fH\u0016J\u0018\u0010-\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010.\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u001eH\u0016J\u000e\u0010/\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u001eR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00060"}, d2 = {"Lcom/fivebb/selfcare/mvp/presenters/RechargeTopUpPresenter;", "Lcom/fivebb/shared/mvp/presenters/BasePresenter;", "Lcom/fivebb/selfcare/mvp/views/RechargeTopUpView;", "Lcom/fivebb/selfcare/models/UserModel;", "Lcom/fivebb/selfcare/mvp/presenters/InvoicePaymentPresenter;", "()V", "mBankList", "", "Lcom/fivebb/shared/vos/BankVO;", "ayaPayQueryOrder", "", "data", "Lcom/fivebb/selfcare/network/requests/AYAPayRequest;", "citizenPaymentRetrieve", "request", "Lcom/fivebb/selfcare/network/requests/CitizenPayRequest;", "generateEncDataForAYAPay", "Lcom/fivebb/selfcare/network/requests/EncryptDataRequest;", "generateEncDataForAYAPayQueryOrder", "generateEncDataForCitizen", "generateEncDataForMCFRetrieve", "generateEncDataForOrderInFo", "prepayID", "", "generateEncDataForPreCreate", "Lcom/fivebb/selfcare/network/requests/KBZPreCreateRequest;", "context", "Landroid/content/Context;", "generateEncDataForQueryOrder", "generateEncDataForWPQueryOrder", "Lcom/fivebb/selfcare/network/requests/WavePayRequest;", "generateEncDataForWavePay", "loadBankList", "loadKBZOrderInfo", "loadPaymentMethodList", "onPayWithCitizen", "onTapBank", "bank", "payment", "Lcom/fivebb/shared/vos/CombinePaymentDataVO;", "onTapFullScreen", "url", "position", "", "onTapPayWithAYAPay", "onTapPayWithKBZPay", "onTapWavePayRequest", "wPayQueryOrder", "app_psrRelease"})
public final class RechargeTopUpPresenter extends com.fivebb.shared.mvp.presenters.BasePresenter<com.fivebb.selfcare.mvp.views.RechargeTopUpView, com.fivebb.selfcare.models.UserModel> implements com.fivebb.selfcare.mvp.presenters.InvoicePaymentPresenter {
    private final java.util.List<com.fivebb.shared.vos.BankVO> mBankList = null;
    
    public RechargeTopUpPresenter() {
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
    
    @java.lang.Override()
    public void onTapPayWithKBZPay(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.requests.KBZPreCreateRequest request, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @java.lang.Override()
    public void onTapPayWithAYAPay(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.requests.AYAPayRequest request) {
    }
    
    public final void ayaPayQueryOrder(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.requests.AYAPayRequest data) {
    }
    
    private final void loadKBZOrderInfo(com.fivebb.selfcare.network.requests.EncryptDataRequest data) {
    }
    
    private final com.fivebb.selfcare.network.requests.EncryptDataRequest generateEncDataForPreCreate(com.fivebb.selfcare.network.requests.KBZPreCreateRequest request, android.content.Context context) {
        return null;
    }
    
    private final com.fivebb.selfcare.network.requests.EncryptDataRequest generateEncDataForQueryOrder(com.fivebb.selfcare.network.requests.KBZPreCreateRequest request) {
        return null;
    }
    
    private final com.fivebb.selfcare.network.requests.EncryptDataRequest generateEncDataForOrderInFo(java.lang.String prepayID) {
        return null;
    }
    
    private final com.fivebb.selfcare.network.requests.EncryptDataRequest generateEncDataForAYAPay(com.fivebb.selfcare.network.requests.AYAPayRequest request) {
        return null;
    }
    
    private final com.fivebb.selfcare.network.requests.EncryptDataRequest generateEncDataForAYAPayQueryOrder(com.fivebb.selfcare.network.requests.AYAPayRequest request) {
        return null;
    }
    
    @java.lang.Override()
    public void onPayWithCitizen(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.requests.CitizenPayRequest request) {
    }
    
    @java.lang.Override()
    public void onTapWavePayRequest(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.requests.WavePayRequest request) {
    }
    
    public final void wPayQueryOrder(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.requests.WavePayRequest data) {
    }
    
    private final com.fivebb.selfcare.network.requests.EncryptDataRequest generateEncDataForWavePay(com.fivebb.selfcare.network.requests.WavePayRequest request) {
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