package com.fivebb.selfcare.delegates;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\b"}, d2 = {"Lcom/fivebb/selfcare/delegates/NotificationActionDelegate;", "", "onClickNotiInbox", "", "noti", "Lcom/fivebb/shared/vos/NotificationVO;", "onLongPressed", "onSingleDelete", "app_devDebug"})
public abstract interface NotificationActionDelegate {
    
    public abstract void onClickNotiInbox(@org.jetbrains.annotations.NotNull()
    com.fivebb.shared.vos.NotificationVO noti);
    
    public abstract void onSingleDelete(@org.jetbrains.annotations.NotNull()
    com.fivebb.shared.vos.NotificationVO noti);
    
    public abstract void onLongPressed();
}