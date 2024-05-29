package com.fivebb.selfcare.mvp.views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&J\b\u0010\u000b\u001a\u00020\fH&J\u001e\u0010\r\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000f\u001a\u00020\nH&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H&J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0012H&J\b\u0010\u0015\u001a\u00020\u0003H&\u00a8\u0006\u0016"}, d2 = {"Lcom/fivebb/selfcare/mvp/views/PXPlanChangeView;", "Lcom/fivebb/shared/mvp/views/BaseView;", "dataReady", "", "customerBasicViewDetails", "Lcom/fivebb/shared/vos/CustomerBasicViewDetailsVO;", "serviceInstanceDetailsVO", "Lcom/fivebb/shared/vos/ServiceInstanceDetailsVO;", "pxPlanList", "", "Lcom/fivebb/shared/vos/PXPlanVO;", "getContext", "Landroid/content/Context;", "refreshPlanList", "planList", "plan", "sendEmailSuccess", "successMessage", "", "showChooseDate", "calendar", "showDatePickerFragment", "app_psrDebug"})
public abstract interface PXPlanChangeView extends com.fivebb.shared.mvp.views.BaseView {
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.content.Context getContext();
    
    public abstract void dataReady(@org.jetbrains.annotations.Nullable()
    com.fivebb.shared.vos.CustomerBasicViewDetailsVO customerBasicViewDetails, @org.jetbrains.annotations.Nullable()
    com.fivebb.shared.vos.ServiceInstanceDetailsVO serviceInstanceDetailsVO, @org.jetbrains.annotations.NotNull()
    java.util.List<com.fivebb.shared.vos.PXPlanVO> pxPlanList);
    
    public abstract void refreshPlanList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fivebb.shared.vos.PXPlanVO> planList, @org.jetbrains.annotations.NotNull()
    com.fivebb.shared.vos.PXPlanVO plan);
    
    public abstract void sendEmailSuccess(@org.jetbrains.annotations.NotNull()
    java.lang.String successMessage);
    
    public abstract void showChooseDate(@org.jetbrains.annotations.NotNull()
    java.lang.String calendar);
    
    public abstract void showDatePickerFragment();
}