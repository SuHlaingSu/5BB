package com.fivebb.selfcare.mvp.presenters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0006\u0010\u000e\u001a\u00020\u000bJ\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\tH\u0016J\u0006\u0010\u0011\u001a\u00020\u000bJ\u0016\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\rR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/fivebb/selfcare/mvp/presenters/PXPlanChangePresenter;", "Lcom/fivebb/shared/mvp/presenters/BasePresenter;", "Lcom/fivebb/selfcare/mvp/views/PXPlanChangeView;", "Lcom/fivebb/selfcare/models/UserModel;", "Lcom/fivebb/selfcare/delegates/PXPlanTypeActionDelegate;", "Lcom/fivebb/selfcare/delegates/DatePickerActionDelegate;", "()V", "pxPlanList", "", "Lcom/fivebb/shared/vos/PXPlanVO;", "chooseDate", "", "calendar", "", "onTapChooseDate", "onTapPXPlan", "pxPlanVO", "onUiReady", "sendEmailAndSaveActivity", "selectedPlan", "Lcom/fivebb/shared/vos/PlanVO;", "selectedDate", "app_psrDebug"})
public final class PXPlanChangePresenter extends com.fivebb.shared.mvp.presenters.BasePresenter<com.fivebb.selfcare.mvp.views.PXPlanChangeView, com.fivebb.selfcare.models.UserModel> implements com.fivebb.selfcare.delegates.PXPlanTypeActionDelegate, com.fivebb.selfcare.delegates.DatePickerActionDelegate {
    private java.util.List<com.fivebb.shared.vos.PXPlanVO> pxPlanList;
    
    public PXPlanChangePresenter() {
        super();
    }
    
    public final void onUiReady() {
    }
    
    public final void sendEmailAndSaveActivity(@org.jetbrains.annotations.NotNull()
    com.fivebb.shared.vos.PlanVO selectedPlan, @org.jetbrains.annotations.NotNull()
    java.lang.String selectedDate) {
    }
    
    @java.lang.Override()
    public void chooseDate(@org.jetbrains.annotations.NotNull()
    java.lang.String calendar) {
    }
    
    public final void onTapChooseDate() {
    }
    
    @java.lang.Override()
    public void onTapPXPlan(@org.jetbrains.annotations.NotNull()
    com.fivebb.shared.vos.PXPlanVO pxPlanVO) {
    }
}