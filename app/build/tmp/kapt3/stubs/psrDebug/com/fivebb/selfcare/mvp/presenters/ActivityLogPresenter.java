package com.fivebb.selfcare.mvp.presenters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tJ\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\tH\u0016J\u0018\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0006\u0010\u000e\u001a\u00020\u0007J\u0006\u0010\u000f\u001a\u00020\u0007J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\tH\u0016\u00a8\u0006\u0011"}, d2 = {"Lcom/fivebb/selfcare/mvp/presenters/ActivityLogPresenter;", "Lcom/fivebb/shared/mvp/presenters/BasePresenter;", "Lcom/fivebb/selfcare/mvp/views/ActivityLogView;", "Lcom/fivebb/selfcare/models/UserModel;", "Lcom/fivebb/selfcare/delegates/PaymentHistoryFilterActionDelegate;", "()V", "filterLogsByDate", "", "fromDate", "", "toDate", "onDownload", "creditNo", "onTapChooseDateRange", "onTapFilter", "onUiReady", "onViewInvoice", "app_psrDebug"})
public final class ActivityLogPresenter extends com.fivebb.shared.mvp.presenters.BasePresenter<com.fivebb.selfcare.mvp.views.ActivityLogView, com.fivebb.selfcare.models.UserModel> implements com.fivebb.selfcare.delegates.PaymentHistoryFilterActionDelegate {
    
    public ActivityLogPresenter() {
        super();
    }
    
    public final void onUiReady() {
    }
    
    public final void filterLogsByDate(@org.jetbrains.annotations.NotNull()
    java.lang.String fromDate, @org.jetbrains.annotations.NotNull()
    java.lang.String toDate) {
    }
    
    @java.lang.Override()
    public void onTapChooseDateRange(@org.jetbrains.annotations.NotNull()
    java.lang.String fromDate, @org.jetbrains.annotations.NotNull()
    java.lang.String toDate) {
    }
    
    @java.lang.Override()
    public void onDownload(@org.jetbrains.annotations.NotNull()
    java.lang.String creditNo) {
    }
    
    @java.lang.Override()
    public void onViewInvoice(@org.jetbrains.annotations.NotNull()
    java.lang.String creditNo) {
    }
    
    public final void onTapFilter() {
    }
}