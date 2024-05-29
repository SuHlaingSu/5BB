package com.fivebb.selfcare.mvp.views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\b\u001a\u00020\tH&J\u0016\u0010\n\u001a\u00020\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0010"}, d2 = {"Lcom/fivebb/selfcare/mvp/views/EmailVerifyView;", "Lcom/fivebb/shared/mvp/views/BaseView;", "addNewEmail", "", "checkVerify", "msg", "", "deleteEmail", "getContext", "Landroid/content/Context;", "showEmailList", "emailList", "", "Lcom/fivebb/selfcare/network/responses/EmailListResponse;", "showMsgVerify", "updateEmailInfo", "app_psrDebug"})
public abstract interface EmailVerifyView extends com.fivebb.shared.mvp.views.BaseView {
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.content.Context getContext();
    
    public abstract void showEmailList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fivebb.selfcare.network.responses.EmailListResponse> emailList);
    
    public abstract void showMsgVerify(@org.jetbrains.annotations.NotNull()
    java.lang.String msg);
    
    public abstract void addNewEmail();
    
    public abstract void checkVerify(@org.jetbrains.annotations.NotNull()
    java.lang.String msg);
    
    public abstract void updateEmailInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String msg);
    
    public abstract void deleteEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String msg);
}