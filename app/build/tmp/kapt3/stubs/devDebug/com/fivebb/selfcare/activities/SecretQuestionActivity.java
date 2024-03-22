package com.fivebb.selfcare.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00132\u00020\u00012\u00020\u0002:\u0001\u0013B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u0007H\u0002J\b\u0010\u000e\u001a\u00020\u0007H\u0002J\u0012\u0010\u000f\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\b\u0010\u0012\u001a\u00020\u0007H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/fivebb/selfcare/activities/SecretQuestionActivity;", "Lcom/fivebb/selfcare/activities/ApplicationBaseActivity;", "Lcom/fivebb/selfcare/mvp/views/SecretQuestionView;", "()V", "mPresenter", "Lcom/fivebb/selfcare/mvp/presenters/SecretQuestionPresenter;", "bindLocalizedData", "", "correctSecretQuestion", "message", "", "getContext", "Landroid/content/Context;", "initListeners", "initPresenter", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "readySecretQuestion", "Companion", "app_devDebug"})
public final class SecretQuestionActivity extends com.fivebb.selfcare.activities.ApplicationBaseActivity implements com.fivebb.selfcare.mvp.views.SecretQuestionView {
    private com.fivebb.selfcare.mvp.presenters.SecretQuestionPresenter mPresenter;
    @org.jetbrains.annotations.NotNull()
    public static final com.fivebb.selfcare.activities.SecretQuestionActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    public SecretQuestionActivity() {
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
    
    private final void initPresenter() {
    }
    
    private final void initListeners() {
    }
    
    @java.lang.Override()
    public void readySecretQuestion() {
    }
    
    @java.lang.Override()
    public void correctSecretQuestion(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    private final void bindLocalizedData() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/fivebb/selfcare/activities/SecretQuestionActivity$Companion;", "", "()V", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "app_devDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent newIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
    }
}