package com.fivebb.selfcare.activities.recharge;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \"2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\"B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0010H\u0016J\b\u0010\u0019\u001a\u00020\u0014H\u0002J\u0006\u0010\u001a\u001a\u00020\u0014J\b\u0010\u001b\u001a\u00020\u0014H\u0002J\u0016\u0010\u001c\u001a\u00020\u00142\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00100\u001eH\u0017J\u0010\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020!H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\u0002X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/fivebb/selfcare/activities/recharge/RechargeActivity;", "Lcom/fivebb/selfcare/activities/ApplicationBaseActivity;", "Lcom/fivebb/selfcare/delegates/RechargeDelegate;", "Lcom/fivebb/selfcare/mvp/views/RechargeView;", "()V", "mAdapter", "Lcom/fivebb/selfcare/adapters/recharge/RechargeListAdapter;", "mDelegate", "getMDelegate", "()Lcom/fivebb/selfcare/delegates/RechargeDelegate;", "setMDelegate", "(Lcom/fivebb/selfcare/delegates/RechargeDelegate;)V", "mPresenter", "Lcom/fivebb/selfcare/mvp/presenters/RechargeListPresenter;", "mRechargeList", "Ljava/util/ArrayList;", "Lcom/fivebb/shared/vos/RechargeVO;", "getContext", "Landroid/content/Context;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onItemClick", "recharge", "setUpListeners", "setUpPresenter", "setUpRecyclerView", "showData", "rechargeList", "", "showMessage", "message", "", "Companion", "app_psrRelease"})
public final class RechargeActivity extends com.fivebb.selfcare.activities.ApplicationBaseActivity implements com.fivebb.selfcare.delegates.RechargeDelegate, com.fivebb.selfcare.mvp.views.RechargeView {
    private com.fivebb.selfcare.adapters.recharge.RechargeListAdapter mAdapter;
    private com.fivebb.selfcare.mvp.presenters.RechargeListPresenter mPresenter;
    public com.fivebb.selfcare.delegates.RechargeDelegate mDelegate;
    private final java.util.ArrayList<com.fivebb.shared.vos.RechargeVO> mRechargeList = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.fivebb.selfcare.activities.recharge.RechargeActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    public RechargeActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fivebb.selfcare.delegates.RechargeDelegate getMDelegate() {
        return null;
    }
    
    public final void setMDelegate(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.delegates.RechargeDelegate p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void setUpPresenter() {
    }
    
    private final void setUpListeners() {
    }
    
    private final void setUpRecyclerView() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.content.Context getContext() {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    @java.lang.Override()
    public void showData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fivebb.shared.vos.RechargeVO> rechargeList) {
    }
    
    @java.lang.Override()
    public void showMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @java.lang.Override()
    public void onItemClick(@org.jetbrains.annotations.NotNull()
    com.fivebb.shared.vos.RechargeVO recharge) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/fivebb/selfcare/activities/recharge/RechargeActivity$Companion;", "", "()V", "newInstance", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "app_psrRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent newInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
    }
}