package com.fivebb.selfcare.mvp.views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H&J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&J\b\u0010\f\u001a\u00020\u0003H&J\u0016\u0010\r\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH&J\b\u0010\u0011\u001a\u00020\u0003H&J\b\u0010\u0012\u001a\u00020\u0003H&J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u0014\u001a\u00020\u00032\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fH&\u00a8\u0006\u0016"}, d2 = {"Lcom/fivebb/selfcare/mvp/views/NotificationListView;", "Lcom/fivebb/shared/mvp/views/BaseView;", "displayErrorMessage", "", "message", "", "getContext", "Landroid/content/Context;", "hideLoading", "isReadNotiId", "noti", "Lcom/fivebb/shared/vos/NotificationVO;", "onDeleteAllNotification", "onNotiSuccesss", "IDList", "", "Lcom/fivebb/selfcare/network/requests/GetNotiIdRequest;", "onSelectedDelete", "showLoading", "showMessage", "showNotificationList", "notificationList", "app_psrDebug"})
public abstract interface NotificationListView extends com.fivebb.shared.mvp.views.BaseView {
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.content.Context getContext();
    
    public abstract void showNotificationList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fivebb.shared.vos.NotificationVO> notificationList);
    
    public abstract void showLoading();
    
    public abstract void hideLoading();
    
    public abstract void onNotiSuccesss(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fivebb.selfcare.network.requests.GetNotiIdRequest> IDList);
    
    public abstract void showMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String message);
    
    public abstract void displayErrorMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String message);
    
    public abstract void onDeleteAllNotification();
    
    public abstract void onSelectedDelete();
    
    public abstract void isReadNotiId(@org.jetbrains.annotations.Nullable()
    com.fivebb.shared.vos.NotificationVO noti);
}