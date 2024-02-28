package com.fivebb.selfcare.activities.prepaid;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000  2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001 B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0012\u0010\u0017\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J\u0010\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u000eH\u0016J\b\u0010\u001c\u001a\u00020\u0014H\u0016J\b\u0010\u001d\u001a\u00020\u0014H\u0002J\u0006\u0010\u001e\u001a\u00020\u0014J\b\u0010\u001f\u001a\u00020\u0014H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\u0002X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/fivebb/selfcare/activities/prepaid/PXTopUpActivity;", "Lcom/fivebb/selfcare/activities/ApplicationBaseActivity;", "Lcom/fivebb/selfcare/delegates/PrepaidActionDelegate;", "Lcom/fivebb/selfcare/mvp/views/PXTopUpView;", "()V", "mAdapter", "Lcom/fivebb/selfcare/adapters/px/PXTopUpListAdapter;", "mDelegate", "getMDelegate", "()Lcom/fivebb/selfcare/delegates/PrepaidActionDelegate;", "setMDelegate", "(Lcom/fivebb/selfcare/delegates/PrepaidActionDelegate;)V", "mPXPricList", "", "Lcom/fivebb/shared/vos/PXPlanVO;", "mPresenter", "Lcom/fivebb/selfcare/mvp/presenters/PXTopUpPresenter;", "getContext", "Landroid/content/Context;", "getPlanPriceList", "", "data", "Lcom/fivebb/shared/vos/PXPlanListVO;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onItemClick", "pxPlanVO", "onTapTopUp", "setUpListeners", "setUpPresenter", "setUpRecyclerView", "Companion", "app_psrRelease"})
public final class PXTopUpActivity extends com.fivebb.selfcare.activities.ApplicationBaseActivity implements com.fivebb.selfcare.delegates.PrepaidActionDelegate, com.fivebb.selfcare.mvp.views.PXTopUpView {
    private com.fivebb.selfcare.adapters.px.PXTopUpListAdapter mAdapter;
    private com.fivebb.selfcare.mvp.presenters.PXTopUpPresenter mPresenter;
    public com.fivebb.selfcare.delegates.PrepaidActionDelegate mDelegate;
    private java.util.List<com.fivebb.shared.vos.PXPlanVO> mPXPricList;
    @org.jetbrains.annotations.NotNull()
    public static final com.fivebb.selfcare.activities.prepaid.PXTopUpActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    public PXTopUpActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fivebb.selfcare.delegates.PrepaidActionDelegate getMDelegate() {
        return null;
    }
    
    public final void setMDelegate(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.delegates.PrepaidActionDelegate p0) {
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
    
    @java.lang.Override()
    public void getPlanPriceList(@org.jetbrains.annotations.NotNull()
    com.fivebb.shared.vos.PXPlanListVO data) {
    }
    
    @java.lang.Override()
    public void onTapTopUp() {
    }
    
    @java.lang.Override()
    public void onItemClick(@org.jetbrains.annotations.NotNull()
    com.fivebb.shared.vos.PXPlanVO pxPlanVO) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/fivebb/selfcare/activities/prepaid/PXTopUpActivity$Companion;", "", "()V", "newInstance", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "app_psrRelease"})
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