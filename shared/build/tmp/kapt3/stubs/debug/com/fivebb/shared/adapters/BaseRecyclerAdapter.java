package com.fivebb.shared.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004B\u0005\u00a2\u0006\u0002\u0010\u0006J\u0013\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00028\u0001\u00a2\u0006\u0002\u0010\u0013J\u0014\u0010\u0014\u001a\u00020\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\bJ\u0006\u0010\u0016\u001a\u00020\u0011J\u0015\u0010\u0017\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0018\u001a\u00020\u0019\u00a2\u0006\u0002\u0010\u001aJ\b\u0010\u001b\u001a\u00020\u0019H\u0016J\u001e\u0010\u001c\u001a\u00020\u00112\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00010\u00052\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u000e\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0019J\u0013\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00028\u0001\u00a2\u0006\u0002\u0010\u0013J\u0014\u0010 \u001a\u00020\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\b8F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\fX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\u000f\u00a8\u0006!"}, d2 = {"Lcom/fivebb/shared/adapters/BaseRecyclerAdapter;", "T", "W", "", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/fivebb/shared/holders/BaseViewHolder;", "()V", "items", "", "getItems", "()Ljava/util/List;", "mData", "", "getMData", "setMData", "(Ljava/util/List;)V", "addNewData", "", "data", "(Ljava/lang/Object;)V", "appendNewData", "newData", "clearData", "getItemAt", "position", "", "(I)Ljava/lang/Object;", "getItemCount", "onBindViewHolder", "holder", "remove", "removeData", "setNewData", "shared_debug"})
public abstract class BaseRecyclerAdapter<T extends java.lang.Object, W extends java.lang.Object> extends androidx.recyclerview.widget.RecyclerView.Adapter<com.fivebb.shared.holders.BaseViewHolder<W>> {
    @org.jetbrains.annotations.Nullable()
    private java.util.List<W> mData;
    
    public BaseRecyclerAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final java.util.List<W> getMData() {
        return null;
    }
    
    protected final void setMData(@org.jetbrains.annotations.Nullable()
    java.util.List<W> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<W> getItems() {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.fivebb.shared.holders.BaseViewHolder<W> holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void setNewData(@org.jetbrains.annotations.NotNull()
    java.util.List<W> newData) {
    }
    
    public final void appendNewData(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends W> newData) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final W getItemAt(int position) {
        return null;
    }
    
    public final void removeData(@org.jetbrains.annotations.NotNull()
    W data) {
    }
    
    public final void addNewData(@org.jetbrains.annotations.NotNull()
    W data) {
    }
    
    public final void clearData() {
    }
    
    public final void remove(int position) {
    }
}