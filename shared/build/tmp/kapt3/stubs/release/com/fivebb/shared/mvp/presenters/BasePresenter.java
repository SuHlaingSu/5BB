package com.fivebb.shared.mvp.presenters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\u0013\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u001fR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000bR\u001c\u0010\u0013\u001a\u00028\u0001X\u0084.\u00a2\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00110\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u000bR\u001c\u0010\u001b\u001a\u00028\u0000X\u0084.\u00a2\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f\u00a8\u0006$"}, d2 = {"Lcom/fivebb/shared/mvp/presenters/BasePresenter;", "T", "Lcom/fivebb/shared/mvp/views/BaseView;", "M", "", "Landroidx/lifecycle/ViewModel;", "()V", "_errorLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "get_errorLiveData", "()Landroidx/lifecycle/MutableLiveData;", "mErrorLiveData", "Landroidx/lifecycle/LiveData;", "getMErrorLiveData", "()Landroidx/lifecycle/LiveData;", "mHideProgressLoadingDialogLiveData", "", "getMHideProgressLoadingDialogLiveData", "mModel", "getMModel", "()Ljava/lang/Object;", "setMModel", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "mShowProgressLoadingDialogLiveData", "getMShowProgressLoadingDialogLiveData", "mView", "getMView", "()Lcom/fivebb/shared/mvp/views/BaseView;", "setMView", "(Lcom/fivebb/shared/mvp/views/BaseView;)V", "Lcom/fivebb/shared/mvp/views/BaseView;", "initPresenter", "", "view", "shared_release"})
public abstract class BasePresenter<T extends com.fivebb.shared.mvp.views.BaseView, M extends java.lang.Object> extends androidx.lifecycle.ViewModel {
    protected T mView;
    protected M mModel;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _errorLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> mShowProgressLoadingDialogLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> mHideProgressLoadingDialogLiveData = null;
    
    public BasePresenter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final T getMView() {
        return null;
    }
    
    protected final void setMView(@org.jetbrains.annotations.NotNull()
    T p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final M getMModel() {
        return null;
    }
    
    protected final void setMModel(@org.jetbrains.annotations.NotNull()
    M p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final androidx.lifecycle.MutableLiveData<java.lang.String> get_errorLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getMErrorLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getMShowProgressLoadingDialogLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getMHideProgressLoadingDialogLiveData() {
        return null;
    }
    
    public final void initPresenter(@org.jetbrains.annotations.NotNull()
    T view) {
    }
}