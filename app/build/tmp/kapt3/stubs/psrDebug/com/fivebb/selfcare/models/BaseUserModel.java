package com.fivebb.selfcare.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u00a8\u0006\u001d"}, d2 = {"Lcom/fivebb/selfcare/models/BaseUserModel;", "Lcom/fivebb/shared/model/BaseModelImpl;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mBSSApi", "Lcom/fivebb/selfcare/network/BSSApi;", "getMBSSApi", "()Lcom/fivebb/selfcare/network/BSSApi;", "setMBSSApi", "(Lcom/fivebb/selfcare/network/BSSApi;)V", "mMobileAppApi", "Lcom/fivebb/selfcare/network/MobileAppApi;", "getMMobileAppApi", "()Lcom/fivebb/selfcare/network/MobileAppApi;", "setMMobileAppApi", "(Lcom/fivebb/selfcare/network/MobileAppApi;)V", "mPaymentApi", "Lcom/fivebb/selfcare/network/PaymentApi;", "getMPaymentApi", "()Lcom/fivebb/selfcare/network/PaymentApi;", "setMPaymentApi", "(Lcom/fivebb/selfcare/network/PaymentApi;)V", "mUserApi", "Lcom/fivebb/selfcare/network/UserApi;", "getMUserApi", "()Lcom/fivebb/selfcare/network/UserApi;", "setMUserApi", "(Lcom/fivebb/selfcare/network/UserApi;)V", "app_psrDebug"})
public abstract class BaseUserModel extends com.fivebb.shared.model.BaseModelImpl {
    @org.jetbrains.annotations.NotNull()
    private com.fivebb.selfcare.network.UserApi mUserApi;
    @org.jetbrains.annotations.NotNull()
    private com.fivebb.selfcare.network.MobileAppApi mMobileAppApi;
    @org.jetbrains.annotations.NotNull()
    private com.fivebb.selfcare.network.PaymentApi mPaymentApi;
    @org.jetbrains.annotations.NotNull()
    private com.fivebb.selfcare.network.BSSApi mBSSApi;
    
    public BaseUserModel(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final com.fivebb.selfcare.network.UserApi getMUserApi() {
        return null;
    }
    
    protected final void setMUserApi(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.UserApi p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final com.fivebb.selfcare.network.MobileAppApi getMMobileAppApi() {
        return null;
    }
    
    protected final void setMMobileAppApi(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.MobileAppApi p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final com.fivebb.selfcare.network.PaymentApi getMPaymentApi() {
        return null;
    }
    
    protected final void setMPaymentApi(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.PaymentApi p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final com.fivebb.selfcare.network.BSSApi getMBSSApi() {
        return null;
    }
    
    protected final void setMBSSApi(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.BSSApi p0) {
    }
}