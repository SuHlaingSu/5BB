package com.fivebb.selfcare.mvp.views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u0006\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H&J\b\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&\u00a8\u0006\r"}, d2 = {"Lcom/fivebb/selfcare/mvp/views/HelpView;", "Lcom/fivebb/shared/mvp/views/BaseView;", "bindData", "", "data", "Lcom/fivebb/shared/vos/RegionVO;", "bindDataList", "", "getContext", "Landroid/content/Context;", "navigateToSendEmailActivity", "email", "", "app_psrDebug"})
public abstract interface HelpView extends com.fivebb.shared.mvp.views.BaseView {
    
    public abstract void bindData(@org.jetbrains.annotations.NotNull()
    com.fivebb.shared.vos.RegionVO data);
    
    public abstract void bindDataList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fivebb.shared.vos.RegionVO> data);
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.content.Context getContext();
    
    public abstract void navigateToSendEmailActivity(@org.jetbrains.annotations.NotNull()
    java.lang.String email);
}