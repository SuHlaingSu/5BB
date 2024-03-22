package com.fivebb.selfcare.adapters.email;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0013R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0014"}, d2 = {"Lcom/fivebb/selfcare/adapters/email/EmailViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/fivebb/selfcare/databinding/ShowListEmailBinding;", "(Lcom/fivebb/selfcare/databinding/ShowListEmailBinding;)V", "getBinding", "()Lcom/fivebb/selfcare/databinding/ShowListEmailBinding;", "setBinding", "mEmailList", "Ljava/util/ArrayList;", "Lcom/fivebb/selfcare/network/responses/EmailListResponse;", "getMEmailList", "()Ljava/util/ArrayList;", "setMEmailList", "(Ljava/util/ArrayList;)V", "bind", "", "data", "delegate", "Lcom/fivebb/selfcare/delegates/EmailActionDelegate;", "app_devDebug"})
public final class EmailViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    @org.jetbrains.annotations.NotNull()
    private com.fivebb.selfcare.databinding.ShowListEmailBinding binding;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.fivebb.selfcare.network.responses.EmailListResponse> mEmailList;
    
    public EmailViewHolder(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.databinding.ShowListEmailBinding binding) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fivebb.selfcare.databinding.ShowListEmailBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.databinding.ShowListEmailBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.fivebb.selfcare.network.responses.EmailListResponse> getMEmailList() {
        return null;
    }
    
    public final void setMEmailList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.fivebb.selfcare.network.responses.EmailListResponse> p0) {
    }
    
    public final void bind(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.responses.EmailListResponse data, @org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.delegates.EmailActionDelegate delegate) {
    }
}