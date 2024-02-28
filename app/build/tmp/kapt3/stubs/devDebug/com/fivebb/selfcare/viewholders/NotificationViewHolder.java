package com.fivebb.selfcare.viewholders;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0002H\u0017R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/fivebb/selfcare/viewholders/NotificationViewHolder;", "Lcom/fivebb/shared/holders/BaseViewHolder;", "Lcom/fivebb/shared/vos/NotificationVO;", "itemView", "Landroid/view/View;", "delegate", "Lcom/fivebb/selfcare/delegates/NotificationActionDelegate;", "viewImage", "", "(Landroid/view/View;Lcom/fivebb/selfcare/delegates/NotificationActionDelegate;Z)V", "showedMore", "onClick", "", "v", "setData", "data", "app_devDebug"})
public final class NotificationViewHolder extends com.fivebb.shared.holders.BaseViewHolder<com.fivebb.shared.vos.NotificationVO> {
    private final com.fivebb.selfcare.delegates.NotificationActionDelegate delegate = null;
    private final boolean viewImage = false;
    private boolean showedMore = false;
    
    public NotificationViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.View itemView, @org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.delegates.NotificationActionDelegate delegate, boolean viewImage) {
        super(null);
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @java.lang.Override()
    public void setData(@org.jetbrains.annotations.NotNull()
    com.fivebb.shared.vos.NotificationVO data) {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
}