package com.fivebb.selfcare.mvp.presenters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0004H&J\b\u0010\b\u001a\u00020\u0004H&J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH&J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u000bH&J\u0018\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u000bH&J\u0018\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\u000bH&\u00a8\u0006\u0017"}, d2 = {"Lcom/fivebb/selfcare/mvp/presenters/PxPaymentPresenter;", "Lcom/fivebb/selfcare/delegates/BankActionDelegate;", "Lcom/fivebb/selfcare/delegates/PaymentMethodActionDelegate;", "citizenPaymentRetrieve", "", "request", "Lcom/fivebb/selfcare/network/requests/CitizenPayRequest;", "loadBankList", "loadPaymentMethodList", "onPayWithCitizen", "context", "Landroid/content/Context;", "onTapFullScreen", "url", "", "position", "", "onTapPayWithAYAPay", "Lcom/fivebb/selfcare/network/requests/AYAPayRequest;", "onTapPayWithKBZPay", "Lcom/fivebb/selfcare/network/requests/KBZPreCreateRequest;", "onTapWavePayRequest", "Lcom/fivebb/selfcare/network/requests/WavePayRequest;", "app_psrDebug"})
public abstract interface PxPaymentPresenter extends com.fivebb.selfcare.delegates.BankActionDelegate, com.fivebb.selfcare.delegates.PaymentMethodActionDelegate {
    
    public abstract void loadBankList();
    
    public abstract void loadPaymentMethodList();
    
    public abstract void onTapPayWithKBZPay(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.requests.KBZPreCreateRequest request, @org.jetbrains.annotations.NotNull()
    android.content.Context context);
    
    public abstract void onTapPayWithAYAPay(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.requests.AYAPayRequest request, @org.jetbrains.annotations.NotNull()
    android.content.Context context);
    
    public abstract void onPayWithCitizen(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.requests.CitizenPayRequest request, @org.jetbrains.annotations.NotNull()
    android.content.Context context);
    
    public abstract void citizenPaymentRetrieve(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.requests.CitizenPayRequest request);
    
    public abstract void onTapWavePayRequest(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.requests.WavePayRequest request, @org.jetbrains.annotations.NotNull()
    android.content.Context context);
    
    public abstract void onTapFullScreen(@org.jetbrains.annotations.NotNull()
    java.lang.String url, long position);
}