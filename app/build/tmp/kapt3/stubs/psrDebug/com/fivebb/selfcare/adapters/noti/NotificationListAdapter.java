package com.fivebb.selfcare.adapters.noti;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u001a\u0010\u0017\u001a\u00020\u00102\b\b\u0001\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0015H\u0016J\u001a\u0010\u001a\u001a\u00020\u00032\b\b\u0001\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u0015H\u0017J\u000e\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u0015R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u001f"}, d2 = {"Lcom/fivebb/selfcare/adapters/noti/NotificationListAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/fivebb/shared/vos/NotificationVO;", "Lcom/fivebb/selfcare/adapters/noti/NotiViewHolder;", "delegate", "Lcom/fivebb/selfcare/delegates/NotificationActionDelegate;", "(Lcom/fivebb/selfcare/delegates/NotificationActionDelegate;)V", "getDelegate", "()Lcom/fivebb/selfcare/delegates/NotificationActionDelegate;", "onPressed", "", "getOnPressed", "()Z", "setOnPressed", "(Z)V", "deleteItem", "", "IDList", "", "Lcom/fivebb/selfcare/network/requests/GetNotiIdRequest;", "getItemViewType", "", "position", "onBindViewHolder", "holder", "i", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "removeAt", "adapterPosition", "app_psrDebug"})
public final class NotificationListAdapter extends androidx.recyclerview.widget.ListAdapter<com.fivebb.shared.vos.NotificationVO, com.fivebb.selfcare.adapters.noti.NotiViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final com.fivebb.selfcare.delegates.NotificationActionDelegate delegate = null;
    private boolean onPressed = false;
    
    public NotificationListAdapter(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.delegates.NotificationActionDelegate delegate) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fivebb.selfcare.delegates.NotificationActionDelegate getDelegate() {
        return null;
    }
    
    public final boolean getOnPressed() {
        return false;
    }
    
    public final void setOnPressed(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    @java.lang.Override()
    public com.fivebb.selfcare.adapters.noti.NotiViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    android.view.ViewGroup parent, int i) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    com.fivebb.selfcare.adapters.noti.NotiViewHolder holder, int i) {
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    public final void deleteItem(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fivebb.selfcare.network.requests.GetNotiIdRequest> IDList) {
    }
    
    public final void removeAt(int adapterPosition) {
    }
}