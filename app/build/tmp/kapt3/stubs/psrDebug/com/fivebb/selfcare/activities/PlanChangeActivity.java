package com.fivebb.selfcare.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 -2\u00020\u00012\u00020\u0002:\u0001-B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0007H\u0002J\u0012\u0010\u0019\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0013H\u0002J*\u0010\u001b\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00132\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u000fH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u0017H\u0002J\b\u0010!\u001a\u00020\u0017H\u0002J\u0012\u0010\"\u001a\u00020\u00172\b\u0010#\u001a\u0004\u0018\u00010$H\u0014J\u001e\u0010%\u001a\u00020\u00172\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f2\u0006\u0010\u0018\u001a\u00020\u0007H\u0016J\u0010\u0010&\u001a\u00020\u00172\u0006\u0010\'\u001a\u00020\u0005H\u0016J\b\u0010(\u001a\u00020\u0017H\u0002J\b\u0010)\u001a\u00020\u0017H\u0002J\u0010\u0010*\u001a\u00020\u00172\u0006\u0010+\u001a\u00020\u0005H\u0016J\b\u0010,\u001a\u00020\u0017H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006."}, d2 = {"Lcom/fivebb/selfcare/activities/PlanChangeActivity;", "Lcom/fivebb/selfcare/activities/ApplicationBaseActivity;", "Lcom/fivebb/selfcare/mvp/views/PlanChangeView;", "()V", "changeDate", "", "currentChoosePlan", "Lcom/fivebb/shared/vos/PlanVO;", "customerDetail", "Lcom/fivebb/shared/vos/CustomerBasicViewDetailsVO;", "mPresenter", "Lcom/fivebb/selfcare/mvp/presenters/PlanChangePresenter;", "planAttributeAdapter", "Lcom/fivebb/selfcare/adapters/PlanAttributeAdapter;", "planList", "", "planTypeAdapter", "Lcom/fivebb/selfcare/adapters/PlanTypeAdapter;", "serviceInstanceDetails", "Lcom/fivebb/shared/vos/ServiceInstanceDetailsVO;", "areRequiredFieldsFilled", "", "bindChoosePlanDetails", "", "plan", "bindServiceInstance", "serviceDetails", "dataReady", "customerBasicViewDetails", "serviceInstanceDetailsVO", "getContext", "Landroid/content/Context;", "initListeners", "initPresenter", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "refreshPlanList", "sendEmailSuccess", "successMessage", "sendRequest", "setUpRecyclerView", "showChooseDate", "calendar", "showDatePickerFragment", "Companion", "app_psrDebug"})
public final class PlanChangeActivity extends com.fivebb.selfcare.activities.ApplicationBaseActivity implements com.fivebb.selfcare.mvp.views.PlanChangeView {
    private com.fivebb.selfcare.mvp.presenters.PlanChangePresenter mPresenter;
    private com.fivebb.selfcare.adapters.PlanTypeAdapter planTypeAdapter;
    private com.fivebb.selfcare.adapters.PlanAttributeAdapter planAttributeAdapter;
    private java.util.List<com.fivebb.shared.vos.PlanVO> planList;
    private com.fivebb.shared.vos.PlanVO currentChoosePlan;
    private java.lang.String changeDate = "";
    @org.jetbrains.annotations.NotNull()
    public static final com.fivebb.selfcare.activities.PlanChangeActivity.Companion Companion = null;
    private com.fivebb.shared.vos.CustomerBasicViewDetailsVO customerDetail;
    private com.fivebb.shared.vos.ServiceInstanceDetailsVO serviceInstanceDetails;
    private java.util.HashMap _$_findViewCache;
    
    public PlanChangeActivity() {
        super();
    }
    
    @java.lang.Override()
    public void sendEmailSuccess(@org.jetbrains.annotations.NotNull()
    java.lang.String successMessage) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.content.Context getContext() {
        return null;
    }
    
    @java.lang.Override()
    public void dataReady(@org.jetbrains.annotations.Nullable()
    com.fivebb.shared.vos.CustomerBasicViewDetailsVO customerBasicViewDetails, @org.jetbrains.annotations.Nullable()
    com.fivebb.shared.vos.ServiceInstanceDetailsVO serviceInstanceDetailsVO, @org.jetbrains.annotations.NotNull()
    java.util.List<com.fivebb.shared.vos.PlanVO> planList) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initPresenter() {
    }
    
    private final void initListeners() {
    }
    
    private final void setUpRecyclerView() {
    }
    
    private final void sendRequest() {
    }
    
    private final void bindServiceInstance(com.fivebb.shared.vos.ServiceInstanceDetailsVO serviceDetails) {
    }
    
    private final void bindChoosePlanDetails(com.fivebb.shared.vos.PlanVO plan) {
    }
    
    @java.lang.Override()
    public void showChooseDate(@org.jetbrains.annotations.NotNull()
    java.lang.String calendar) {
    }
    
    @java.lang.Override()
    public void refreshPlanList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fivebb.shared.vos.PlanVO> planList, @org.jetbrains.annotations.NotNull()
    com.fivebb.shared.vos.PlanVO plan) {
    }
    
    private final boolean areRequiredFieldsFilled() {
        return false;
    }
    
    @java.lang.Override()
    public void showDatePickerFragment() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/fivebb/selfcare/activities/PlanChangeActivity$Companion;", "", "()V", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "app_psrDebug"})
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