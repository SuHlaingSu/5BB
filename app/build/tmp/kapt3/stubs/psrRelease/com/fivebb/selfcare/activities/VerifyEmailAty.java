package com.fivebb.selfcare.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0004\u0018\u0000 $2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001$B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\nH\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0012\u0010\u0016\u001a\u00020\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\b\u0010\u0019\u001a\u00020\u0010H\u0016J\b\u0010\u001a\u001a\u00020\u0010H\u0016J\b\u0010\u001b\u001a\u00020\u0010H\u0016J\b\u0010\u001c\u001a\u00020\u0010H\u0002J\b\u0010\u001d\u001a\u00020\u0010H\u0002J\b\u0010\u001e\u001a\u00020\u0010H\u0002J\u0016\u0010\u001f\u001a\u00020\u00102\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060!H\u0016J\u0010\u0010\"\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u0010\u0010#\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\nH\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006%"}, d2 = {"Lcom/fivebb/selfcare/activities/VerifyEmailAty;", "Lcom/fivebb/selfcare/activities/ApplicationBaseActivity;", "Lcom/fivebb/selfcare/mvp/views/EmailVerifyView;", "Lcom/fivebb/selfcare/delegates/EmailActionDelegate;", "()V", "emailListResponse", "Lcom/fivebb/selfcare/network/responses/EmailListResponse;", "mPresenter", "Lcom/fivebb/selfcare/mvp/presenters/EmailVerifyPresenter;", "strCode", "", "getStrCode", "()Ljava/lang/String;", "setStrCode", "(Ljava/lang/String;)V", "addNewEmail", "", "checkVerify", "msg", "deleteEmail", "getContext", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onGetEmailList", "onTapAddNew", "onTapVerify", "setData", "setUpListeners", "setUpPresenter", "showEmailList", "emailList", "", "showMsgVerify", "updateEmailInfo", "Companion", "app_psrRelease"})
public final class VerifyEmailAty extends com.fivebb.selfcare.activities.ApplicationBaseActivity implements com.fivebb.selfcare.mvp.views.EmailVerifyView, com.fivebb.selfcare.delegates.EmailActionDelegate {
    private com.fivebb.selfcare.mvp.presenters.EmailVerifyPresenter mPresenter;
    private com.fivebb.selfcare.network.responses.EmailListResponse emailListResponse;
    public java.lang.String strCode;
    @org.jetbrains.annotations.NotNull()
    public static final com.fivebb.selfcare.activities.VerifyEmailAty.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    public VerifyEmailAty() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrCode() {
        return null;
    }
    
    public final void setStrCode(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.content.Context getContext() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setUpPresenter() {
    }
    
    private final void setUpListeners() {
    }
    
    private final void setData() {
    }
    
    @java.lang.Override()
    public void onGetEmailList() {
    }
    
    @java.lang.Override()
    public void onTapAddNew() {
    }
    
    @java.lang.Override()
    public void onTapVerify() {
    }
    
    @java.lang.Override()
    public void showEmailList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fivebb.selfcare.network.responses.EmailListResponse> emailList) {
    }
    
    @java.lang.Override()
    public void showMsgVerify(@org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    @java.lang.Override()
    public void addNewEmail() {
    }
    
    @java.lang.Override()
    public void checkVerify(@org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    @java.lang.Override()
    public void updateEmailInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    @java.lang.Override()
    public void deleteEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lcom/fivebb/selfcare/activities/VerifyEmailAty$Companion;", "", "()V", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "requestCode", "", "app_psrRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent newIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, int requestCode) {
            return null;
        }
    }
}