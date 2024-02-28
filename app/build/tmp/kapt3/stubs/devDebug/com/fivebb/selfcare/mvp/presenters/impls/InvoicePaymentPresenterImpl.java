package com.fivebb.selfcare.mvp.presenters.impls;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0018\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010!\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u001eH\u0002J\u0010\u0010\"\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020#H\u0002J\u0010\u0010$\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020#H\u0002J\b\u0010%\u001a\u00020\u0012H\u0016J\u0010\u0010&\u001a\u00020\u00122\u0006\u0010\'\u001a\u00020\u0016H\u0002J\b\u0010(\u001a\u00020\u0012H\u0016J\u0010\u0010)\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010*\u001a\u00020\u00122\u0006\u0010+\u001a\u00020\u000eH\u0016J\u0010\u0010*\u001a\u00020\u00122\u0006\u0010,\u001a\u00020\u0007H\u0016J\u0018\u0010-\u001a\u00020\u00122\u0006\u0010.\u001a\u00020\u001c2\u0006\u0010/\u001a\u000200H\u0016J\u0010\u00101\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0017H\u0016J\u0018\u00102\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0010\u00103\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020#H\u0016J\u000e\u00104\u001a\u00020\u00122\u0006\u0010\'\u001a\u00020#R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00065"}, d2 = {"Lcom/fivebb/selfcare/mvp/presenters/impls/InvoicePaymentPresenterImpl;", "Lcom/fivebb/shared/mvp/presenters/BasePresenter;", "Lcom/fivebb/selfcare/mvp/views/InvoicePaymentView;", "Lcom/fivebb/selfcare/models/UserModel;", "Lcom/fivebb/selfcare/mvp/presenters/InvoicePaymentPresenter;", "()V", "combinePaymentDataVO", "Lcom/fivebb/shared/vos/CombinePaymentDataVO;", "getCombinePaymentDataVO", "()Lcom/fivebb/shared/vos/CombinePaymentDataVO;", "setCombinePaymentDataVO", "(Lcom/fivebb/shared/vos/CombinePaymentDataVO;)V", "mBankList", "", "Lcom/fivebb/shared/vos/BankVO;", "mPaymentList", "Lcom/fivebb/shared/vos/PaymentMethodVO;", "citizenPaymentRetrieve", "", "request", "Lcom/fivebb/selfcare/network/requests/CitizenPayRequest;", "generateEncDataForAYAPay", "Lcom/fivebb/selfcare/network/requests/EncryptDataRequest;", "Lcom/fivebb/selfcare/network/requests/AYAPayRequest;", "generateEncDataForCitizen", "generateEncDataForMCFRetrieve", "generateEncDataForOrderInFo", "prepayID", "", "generateEncDataForPreCreate", "Lcom/fivebb/selfcare/network/requests/KBZPreCreateRequest;", "context", "Landroid/content/Context;", "generateEncDataForQueryOrder", "generateEncDataForWPQueryOrder", "Lcom/fivebb/selfcare/network/requests/WavePayRequest;", "generateEncDataForWavePay", "loadBankList", "loadKBZOrderInfo", "data", "loadPaymentMethodList", "onPayWithCitizen", "onTapBank", "bank", "paymentMethodVO", "onTapFullScreen", "url", "position", "", "onTapPayWithAYAPay", "onTapPayWithKBZPay", "onTapWavePayRequest", "wPayQueryOrder", "app_devDebug"})
public final class InvoicePaymentPresenterImpl extends com.fivebb.shared.mvp.presenters.BasePresenter<com.fivebb.selfcare.mvp.views.InvoicePaymentView, com.fivebb.selfcare.models.UserModel> implements com.fivebb.selfcare.mvp.presenters.InvoicePaymentPresenter {
    private final java.util.List<com.fivebb.shared.vos.BankVO> mBankList = null;
    private final java.util.List<com.fivebb.shared.vos.PaymentMethodVO> mPaymentList = null;
    @org.jetbrains.annotations.NotNull()
    private com.fivebb.shared.vos.CombinePaymentDataVO combinePaymentDataVO;
    
    public InvoicePaymentPresenterImpl() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fivebb.shared.vos.CombinePaymentDataVO getCombinePaymentDataVO() {
        return null;
    }
    
    public final void setCombinePaymentDataVO(@org.jetbrains.annotations.NotNull()
    com.fivebb.shared.vos.CombinePaymentDataVO p0) {
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
    com.fivebb.shared.vos.CombinePaymentDataVO paymentMethodVO) {
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
    
    @java.lang.Override()
    public void citizenPaymentRetrieve(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.requests.CitizenPayRequest request) {
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
    
    private final com.fivebb.selfcare.network.requests.EncryptDataRequest generateEncDataForCitizen(com.fivebb.selfcare.network.requests.CitizenPayRequest request) {
        return null;
    }
    
    private final com.fivebb.selfcare.network.requests.EncryptDataRequest generateEncDataForWavePay(com.fivebb.selfcare.network.requests.WavePayRequest request) {
        return null;
    }
    
    private final com.fivebb.selfcare.network.requests.EncryptDataRequest generateEncDataForWPQueryOrder(com.fivebb.selfcare.network.requests.WavePayRequest request) {
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