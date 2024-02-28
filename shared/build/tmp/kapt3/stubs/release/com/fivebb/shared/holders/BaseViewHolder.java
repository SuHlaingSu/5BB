package com.fivebb.shared.holders;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u00032\u00020\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0015\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\fR\u001c\u0010\b\u001a\u00028\u0000X\u0084.\u00a2\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u0011"}, d2 = {"Lcom/fivebb/shared/holders/BaseViewHolder;", "W", "", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View$OnClickListener;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "mData", "getMData", "()Ljava/lang/Object;", "setMData", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "setData", "", "data", "shared_release"})
public abstract class BaseViewHolder<W extends java.lang.Object> extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements android.view.View.OnClickListener {
    protected W mData;
    
    public BaseViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.View itemView) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final W getMData() {
        return null;
    }
    
    protected final void setMData(@org.jetbrains.annotations.NotNull()
    W p0) {
    }
    
    public abstract void setData(@org.jetbrains.annotations.NotNull()
    W data);
}