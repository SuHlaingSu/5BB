package com.fivebb.selfcare.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0004\u0018\u0000 72\u00020\u00012\u00020\u00022\u00020\u0003:\u00017B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0007H\u0016J\u0010\u0010\"\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0007H\u0016J\b\u0010#\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u0007H\u0002J\u0012\u0010(\u001a\u00020\u001f2\b\u0010)\u001a\u0004\u0018\u00010*H\u0014J\b\u0010+\u001a\u00020\u001fH\u0016J\b\u0010,\u001a\u00020\u001fH\u0014J\b\u0010-\u001a\u00020\u001fH\u0016J\b\u0010.\u001a\u00020\u001fH\u0016J\b\u0010/\u001a\u00020\u001fH\u0002J\b\u00100\u001a\u00020\u001fH\u0002J\b\u00101\u001a\u00020\u001fH\u0002J\u0016\u00102\u001a\u00020\u001f2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u001604H\u0017J\u0010\u00105\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0007H\u0016J\u0010\u00106\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0007H\u0017R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0003X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u000e\u00a8\u00068"}, d2 = {"Lcom/fivebb/selfcare/activities/AddNewEmailAty;", "Lcom/fivebb/selfcare/activities/ApplicationBaseActivity;", "Lcom/fivebb/selfcare/mvp/views/EmailVerifyView;", "Lcom/fivebb/selfcare/delegates/EmailActionDelegate;", "()V", "eList", "", "", "getEList", "()Ljava/util/List;", "emailToText", "getEmailToText", "()Ljava/lang/String;", "setEmailToText", "(Ljava/lang/String;)V", "mDelegate", "getMDelegate", "()Lcom/fivebb/selfcare/delegates/EmailActionDelegate;", "setMDelegate", "(Lcom/fivebb/selfcare/delegates/EmailActionDelegate;)V", "mEmail", "Ljava/util/ArrayList;", "Lcom/fivebb/selfcare/network/responses/EmailListResponse;", "mEmailListAdapter", "Lcom/fivebb/selfcare/adapters/email/EmailAdapter;", "mPresenter", "Lcom/fivebb/selfcare/mvp/presenters/EmailVerifyPresenter;", "strMsg", "getStrMsg", "setStrMsg", "addNewEmail", "", "checkVerify", "msg", "deleteEmail", "getContext", "Landroid/content/Context;", "isValidEmailId", "", "email", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onGetEmailList", "onResume", "onTapAddNew", "onTapVerify", "setUpListeners", "setUpPresenter", "setUpRecyclerView", "showEmailList", "emailList", "", "showMsgVerify", "updateEmailInfo", "Companion", "app_psrRelease"})
public final class AddNewEmailAty extends com.fivebb.selfcare.activities.ApplicationBaseActivity implements com.fivebb.selfcare.mvp.views.EmailVerifyView, com.fivebb.selfcare.delegates.EmailActionDelegate {
    private com.fivebb.selfcare.adapters.email.EmailAdapter mEmailListAdapter;
    private com.fivebb.selfcare.mvp.presenters.EmailVerifyPresenter mPresenter;
    public com.fivebb.selfcare.delegates.EmailActionDelegate mDelegate;
    private final java.util.ArrayList<com.fivebb.selfcare.network.responses.EmailListResponse> mEmail = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> eList = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String strMsg = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String emailToText = "";
    @org.jetbrains.annotations.NotNull()
    public static final com.fivebb.selfcare.activities.AddNewEmailAty.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    public AddNewEmailAty() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fivebb.selfcare.delegates.EmailActionDelegate getMDelegate() {
        return null;
    }
    
    public final void setMDelegate(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.delegates.EmailActionDelegate p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getEList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrMsg() {
        return null;
    }
    
    public final void setStrMsg(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEmailToText() {
        return null;
    }
    
    public final void setEmailToText(@org.jetbrains.annotations.NotNull()
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
    
    private final void setUpRecyclerView() {
    }
    
    private final void setUpListeners() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
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
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    @java.lang.Override()
    public void updateEmailInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    @java.lang.Override()
    public void deleteEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    private final boolean isValidEmailId(java.lang.String email) {
        return false;
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
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/fivebb/selfcare/activities/AddNewEmailAty$Companion;", "", "()V", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "app_psrRelease"})
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