package com.fivebb.selfcare.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\bH\u0016J\u000e\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/fivebb/selfcare/adapters/NotificationAdapter;", "Lcom/fivebb/shared/adapters/BaseRecyclerAdapter;", "Lcom/fivebb/selfcare/viewholders/NotificationViewHolder;", "Lcom/fivebb/shared/vos/NotificationVO;", "delegate", "Lcom/fivebb/selfcare/delegates/NotificationActionDelegate;", "(Lcom/fivebb/selfcare/delegates/NotificationActionDelegate;)V", "notiCount", "", "deleteItem", "", "IDList", "", "Lcom/fivebb/selfcare/network/requests/GetNotiIdRequest;", "onCreateViewHolder", "Lcom/fivebb/shared/holders/BaseViewHolder;", "parent", "Landroid/view/ViewGroup;", "viewType", "removeAt", "adapterPosition", "app_psrRelease"})
public final class NotificationAdapter extends com.fivebb.shared.adapters.BaseRecyclerAdapter<com.fivebb.selfcare.viewholders.NotificationViewHolder, com.fivebb.shared.vos.NotificationVO> {
    private final com.fivebb.selfcare.delegates.NotificationActionDelegate delegate = null;
    private int notiCount = 10;
    
    public NotificationAdapter(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.delegates.NotificationActionDelegate delegate) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.fivebb.shared.holders.BaseViewHolder<com.fivebb.shared.vos.NotificationVO> onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    public final void deleteItem(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fivebb.selfcare.network.requests.GetNotiIdRequest> IDList) {
    }
    
    public final void removeAt(int adapterPosition) {
    }
}