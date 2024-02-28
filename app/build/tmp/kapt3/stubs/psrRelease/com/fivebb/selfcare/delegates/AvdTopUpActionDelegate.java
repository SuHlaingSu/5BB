package com.fivebb.selfcare.delegates;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\rH&\u00a8\u0006\u000e"}, d2 = {"Lcom/fivebb/selfcare/delegates/AvdTopUpActionDelegate;", "Lcom/fivebb/selfcare/delegates/BankActionDelegate;", "citizenPaymentRetrieve", "", "request", "Lcom/fivebb/selfcare/network/requests/CitizenPayRequest;", "loadBankList", "onPayWithCitizen", "onTapPayWithAYAPay", "Lcom/fivebb/selfcare/network/requests/AYAPayRequest;", "onTapPayWithKBZPay", "Lcom/fivebb/selfcare/network/requests/KBZPreCreateRequest;", "onTapWavePayRequest", "Lcom/fivebb/selfcare/network/requests/WavePayRequest;", "app_psrRelease"})
public abstract interface AvdTopUpActionDelegate extends com.fivebb.selfcare.delegates.BankActionDelegate {
    
    public abstract void loadBankList();
    
    public abstract void onTapPayWithKBZPay(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.requests.KBZPreCreateRequest request);
    
    public abstract void onTapPayWithAYAPay(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.requests.AYAPayRequest request);
    
    public abstract void onPayWithCitizen(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.requests.CitizenPayRequest request);
    
    public abstract void citizenPaymentRetrieve(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.requests.CitizenPayRequest request);
    
    public abstract void onTapWavePayRequest(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.requests.WavePayRequest request);
}