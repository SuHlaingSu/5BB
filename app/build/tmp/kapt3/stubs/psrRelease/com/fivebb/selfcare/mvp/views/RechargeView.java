package com.fivebb.selfcare.mvp.views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH&\u00a8\u0006\f"}, d2 = {"Lcom/fivebb/selfcare/mvp/views/RechargeView;", "Lcom/fivebb/shared/mvp/views/BaseView;", "getContext", "Landroid/content/Context;", "showData", "", "rechargeList", "", "Lcom/fivebb/shared/vos/RechargeVO;", "showMessage", "message", "", "app_psrRelease"})
public abstract interface RechargeView extends com.fivebb.shared.mvp.views.BaseView {
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.content.Context getContext();
    
    public abstract void showData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fivebb.shared.vos.RechargeVO> rechargeList);
    
    public abstract void showMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String message);
}