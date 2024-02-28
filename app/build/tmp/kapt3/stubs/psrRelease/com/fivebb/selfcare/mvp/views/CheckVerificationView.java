package com.fivebb.selfcare.mvp.views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/fivebb/selfcare/mvp/views/CheckVerificationView;", "Lcom/fivebb/shared/mvp/views/BaseView;", "getContext", "Landroid/content/Context;", "onSuccessVerification", "", "data", "Lcom/fivebb/shared/vos/CheckVericationVO;", "app_psrRelease"})
public abstract interface CheckVerificationView extends com.fivebb.shared.mvp.views.BaseView {
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.content.Context getContext();
    
    public abstract void onSuccessVerification(@org.jetbrains.annotations.NotNull()
    com.fivebb.shared.vos.CheckVericationVO data);
}