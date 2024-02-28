package com.fivebb.selfcare.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00162\u00020\u00012\u00020\u0002:\u0001\u0016B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016J\u0012\u0010\u000f\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\b\u0010\u0012\u001a\u00020\rH\u0002J\b\u0010\u0013\u001a\u00020\rH\u0002J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0007H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/fivebb/selfcare/activities/SendEmailActivity;", "Lcom/fivebb/selfcare/activities/ApplicationBaseActivity;", "Lcom/fivebb/selfcare/mvp/views/SendEmailView;", "()V", "mPresenter", "Lcom/fivebb/selfcare/mvp/presenters/SendEmailPresenter;", "mToEmail", "", "areRequiredFieldsFilled", "", "getContext", "Landroid/content/Context;", "getIntentExtraData", "", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setUpListeners", "setUpPresenter", "showSendEmailSuccessfully", "message", "Companion", "app_psrDebug"})
public final class SendEmailActivity extends com.fivebb.selfcare.activities.ApplicationBaseActivity implements com.fivebb.selfcare.mvp.views.SendEmailView {
    private com.fivebb.selfcare.mvp.presenters.SendEmailPresenter mPresenter;
    private java.lang.String mToEmail = "";
    @org.jetbrains.annotations.NotNull()
    public static final com.fivebb.selfcare.activities.SendEmailActivity.Companion Companion = null;
    private static final java.lang.String TO_EMAIL = "TO_EMAIL";
    private java.util.HashMap _$_findViewCache;
    
    public SendEmailActivity() {
        super();
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
    
    private final void getIntentExtraData() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    private final void setUpPresenter() {
    }
    
    private final void setUpListeners() {
    }
    
    private final boolean areRequiredFieldsFilled() {
        return false;
    }
    
    @java.lang.Override()
    public void showSendEmailSuccessfully(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/fivebb/selfcare/activities/SendEmailActivity$Companion;", "", "()V", "TO_EMAIL", "", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "toEmail", "app_psrDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent newIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String toEmail) {
            return null;
        }
    }
}