package com.fivebb.selfcare.mvp.presenters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000eH\u0002J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000eH\u0002J\u0010\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u001bH\u0002J\u0010\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u001eH\u0002J\u0010\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u001eH\u0002J\u0006\u0010 \u001a\u00020\fJ\b\u0010!\u001a\u00020\fH\u0016J\u0010\u0010\"\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0013H\u0002J\u0010\u0010#\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\bH\u0016J\u0010\u0010&\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016J\u0010\u0010\'\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u001bH\u0016J\u0010\u0010(\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u001eH\u0016J\u0006\u0010)\u001a\u00020\fJ\u000e\u0010*\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u001eR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"Lcom/fivebb/selfcare/mvp/presenters/AdvTopUpPresenter;", "Lcom/fivebb/shared/mvp/presenters/BasePresenter;", "Lcom/fivebb/selfcare/mvp/views/AdvTopUpView;", "Lcom/fivebb/selfcare/models/UserModel;", "Lcom/fivebb/selfcare/delegates/AvdTopUpActionDelegate;", "()V", "mBankList", "", "Lcom/fivebb/shared/vos/BankVO;", "mPlanList", "Lcom/fivebb/shared/vos/PlanPriceListVO;", "aYAPayQueryOrder", "", "data", "Lcom/fivebb/selfcare/network/requests/AYAPayRequest;", "citizenPaymentRetrieve", "request", "Lcom/fivebb/selfcare/network/requests/CitizenPayRequest;", "generateEncDataForAYAPay", "Lcom/fivebb/selfcare/network/requests/EncryptDataRequest;", "generateEncDataForAYAPayQueryOrder", "generateEncDataForCitizen", "generateEncDataForMCFRetrieve", "generateEncDataForOrderInFo", "prepayID", "", "generateEncDataForPreCreate", "Lcom/fivebb/selfcare/network/requests/KBZPreCreateRequest;", "generateEncDataForQueryOrder", "generateEncDataForWPQueryOrder", "Lcom/fivebb/selfcare/network/requests/WavePayRequest;", "generateEncDataForWavePay", "getAdvPayMonth", "loadBankList", "loadKBZOrderInfo", "onPayWithCitizen", "onTapBank", "bank", "onTapPayWithAYAPay", "onTapPayWithKBZPay", "onTapWavePayRequest", "takePlanAction", "wPayQueryOrder", "app_devDebug"})
public final class AdvTopUpPresenter extends com.fivebb.shared.mvp.presenters.BasePresenter<com.fivebb.selfcare.mvp.views.AdvTopUpView, com.fivebb.selfcare.models.UserModel> implements com.fivebb.selfcare.delegates.AvdTopUpActionDelegate {
    private final java.util.List<com.fivebb.shared.vos.BankVO> mBankList = null;
    private java.util.List<com.fivebb.shared.vos.PlanPriceListVO> mPlanList;
    
    public AdvTopUpPresenter() {
        super();
    }
    
    @java.lang.Override()
    public void loadBankList() {
    }
    
    @java.lang.Override()
    public void onTapBank(@org.jetbrains.annotations.NotNull()
    com.fivebb.shared.vos.BankVO bank) {
    }
    
    @java.lang.Override()
    public void onTapPayWithKBZPay(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.requests.KBZPreCreateRequest request) {
    }
    
    @java.lang.Override()
    public void onTapPayWithAYAPay(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.requests.AYAPayRequest request) {
    }
    
    public final void aYAPayQueryOrder(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.requests.AYAPayRequest data) {
    }
    
    @java.lang.Override()
    public void onPayWithCitizen(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.requests.CitizenPayRequest request) {
    }
    
    @java.lang.Override()
    public void citizenPaymentRetrieve(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.requests.CitizenPayRequest request) {
    }
    
    @java.lang.Override()
    public void onTapWavePayRequest(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.requests.WavePayRequest request) {
    }
    
    public final void wPayQueryOrder(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.requests.WavePayRequest data) {
    }
    
    private final void loadKBZOrderInfo(com.fivebb.selfcare.network.requests.EncryptDataRequest data) {
    }
    
    private final com.fivebb.selfcare.network.requests.EncryptDataRequest generateEncDataForPreCreate(com.fivebb.selfcare.network.requests.KBZPreCreateRequest request) {
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
    
    private final com.fivebb.selfcare.network.requests.EncryptDataRequest generateEncDataForCitizen(com.fivebb.selfcare.network.requests.CitizenPayRequest request) {
        return null;
    }
    
    private final com.fivebb.selfcare.network.requests.EncryptDataRequest generateEncDataForMCFRetrieve(com.fivebb.selfcare.network.requests.CitizenPayRequest request) {
        return null;
    }
    
    private final com.fivebb.selfcare.network.requests.EncryptDataRequest generateEncDataForWavePay(com.fivebb.selfcare.network.requests.WavePayRequest request) {
        return null;
    }
    
    private final com.fivebb.selfcare.network.requests.EncryptDataRequest generateEncDataForWPQueryOrder(com.fivebb.selfcare.network.requests.WavePayRequest request) {
        return null;
    }
    
    public final void getAdvPayMonth() {
    }
    
    public final void takePlanAction() {
    }
}