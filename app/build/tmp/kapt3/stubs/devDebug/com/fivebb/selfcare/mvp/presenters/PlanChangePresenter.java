package com.fivebb.selfcare.mvp.presenters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0006\u0010\u000e\u001a\u00020\u000bJ\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\tH\u0016J\u0006\u0010\u0011\u001a\u00020\u000bJ\u0016\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\rJ&\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\rR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/fivebb/selfcare/mvp/presenters/PlanChangePresenter;", "Lcom/fivebb/shared/mvp/presenters/BasePresenter;", "Lcom/fivebb/selfcare/mvp/views/PlanChangeView;", "Lcom/fivebb/selfcare/models/UserModel;", "Lcom/fivebb/selfcare/delegates/PlanTypeActionDelegate;", "Lcom/fivebb/selfcare/delegates/DatePickerActionDelegate;", "()V", "planList", "", "Lcom/fivebb/shared/vos/PlanVO;", "chooseDate", "", "calendar", "", "onTapChooseDate", "onTapPlan", "plan", "onUiReady", "sendEmailAndSaveActivity", "selectedPlan", "selectedDate", "sendRequest", "toEmail", "type", "subject", "body", "app_devDebug"})
public final class PlanChangePresenter extends com.fivebb.shared.mvp.presenters.BasePresenter<com.fivebb.selfcare.mvp.views.PlanChangeView, com.fivebb.selfcare.models.UserModel> implements com.fivebb.selfcare.delegates.PlanTypeActionDelegate, com.fivebb.selfcare.delegates.DatePickerActionDelegate {
    private java.util.List<com.fivebb.shared.vos.PlanVO> planList;
    
    public PlanChangePresenter() {
        super();
    }
    
    public final void onUiReady() {
    }
    
    public final void sendRequest(@org.jetbrains.annotations.NotNull()
    java.lang.String toEmail, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    java.lang.String subject, @org.jetbrains.annotations.NotNull()
    java.lang.String body) {
    }
    
    public final void sendEmailAndSaveActivity(@org.jetbrains.annotations.NotNull()
    com.fivebb.shared.vos.PlanVO selectedPlan, @org.jetbrains.annotations.NotNull()
    java.lang.String selectedDate) {
    }
    
    @java.lang.Override()
    public void onTapPlan(@org.jetbrains.annotations.NotNull()
    com.fivebb.shared.vos.PlanVO plan) {
    }
    
    @java.lang.Override()
    public void chooseDate(@org.jetbrains.annotations.NotNull()
    java.lang.String calendar) {
    }
    
    public final void onTapChooseDate() {
    }
}