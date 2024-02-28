package com.fivebb.selfcare.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000  2\u00020\u00012\u00020\u0002:\u0001 B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u0007H\u0016J\b\u0010\r\u001a\u00020\u0007H\u0002J\u0012\u0010\u000e\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0012\u0010\u0011\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u0007H\u0016J\u0016\u0010\u0015\u001a\u00020\u00072\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016J\b\u0010\u0019\u001a\u00020\u0007H\u0016J\b\u0010\u001a\u001a\u00020\u0007H\u0002J\u0006\u0010\u001b\u001a\u00020\u0007J\b\u0010\u001c\u001a\u00020\u0007H\u0016J\u0010\u0010\u001d\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0016\u0010\u001e\u001a\u00020\u00072\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0017H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/fivebb/selfcare/activities/TransNotiDetailActivity;", "Lcom/fivebb/shared/activities/BaseActivity;", "Lcom/fivebb/selfcare/mvp/views/NotificationListView;", "()V", "mPresenter", "Lcom/fivebb/selfcare/mvp/presenters/NotificationListPresenter;", "displayErrorMessage", "", "message", "", "getContext", "Landroid/content/Context;", "hideLoading", "initUi", "isReadNotiId", "noti", "Lcom/fivebb/shared/vos/NotificationVO;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDeleteAllNotification", "onNotiSuccesss", "IDList", "", "Lcom/fivebb/selfcare/network/requests/GetNotiIdRequest;", "onSelectedDelete", "setUpListeners", "setUpPresenter", "showLoading", "showMessage", "showNotificationList", "notificationList", "Companion", "app_psrRelease"})
public final class TransNotiDetailActivity extends com.fivebb.shared.activities.BaseActivity implements com.fivebb.selfcare.mvp.views.NotificationListView {
    private com.fivebb.selfcare.mvp.presenters.NotificationListPresenter mPresenter;
    @org.jetbrains.annotations.NotNull()
    public static final com.fivebb.selfcare.activities.TransNotiDetailActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    public TransNotiDetailActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initUi() {
    }
    
    private final void setUpListeners() {
    }
    
    public final void setUpPresenter() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.content.Context getContext() {
        return null;
    }
    
    @java.lang.Override()
    public void showNotificationList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fivebb.shared.vos.NotificationVO> notificationList) {
    }
    
    @java.lang.Override()
    public void showLoading() {
    }
    
    @java.lang.Override()
    public void hideLoading() {
    }
    
    @java.lang.Override()
    public void onNotiSuccesss(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fivebb.selfcare.network.requests.GetNotiIdRequest> IDList) {
    }
    
    @java.lang.Override()
    public void showMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @java.lang.Override()
    public void displayErrorMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @java.lang.Override()
    public void onDeleteAllNotification() {
    }
    
    @java.lang.Override()
    public void onSelectedDelete() {
    }
    
    @java.lang.Override()
    public void isReadNotiId(@org.jetbrains.annotations.Nullable()
    com.fivebb.shared.vos.NotificationVO noti) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lcom/fivebb/selfcare/activities/TransNotiDetailActivity$Companion;", "", "()V", "newIntent", "", "context", "Landroid/content/Context;", "notificationVO", "Lcom/fivebb/shared/vos/NotificationVO;", "app_psrRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void newIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        com.fivebb.shared.vos.NotificationVO notificationVO) {
        }
    }
}