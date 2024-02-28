package com.fivebb.selfcare.mvp.presenters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0014\u0010\t\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ$\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012J\u0016\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0010\u00a8\u0006\u0015"}, d2 = {"Lcom/fivebb/selfcare/mvp/presenters/EmailVerifyPresenter;", "Lcom/fivebb/shared/mvp/presenters/BasePresenter;", "Lcom/fivebb/selfcare/mvp/views/EmailVerifyView;", "Lcom/fivebb/selfcare/models/UserModel;", "()V", "changeEmail", "", "context", "Landroid/content/Context;", "deleteSingleEmail", "response", "", "Lcom/fivebb/selfcare/network/responses/EmailListResponse;", "emailList", "updateCusInfoEmail", "emailFromEditText", "", "elist", "", "verifyEmail", "code", "app_devDebug"})
public final class EmailVerifyPresenter extends com.fivebb.shared.mvp.presenters.BasePresenter<com.fivebb.selfcare.mvp.views.EmailVerifyView, com.fivebb.selfcare.models.UserModel> {
    
    public EmailVerifyPresenter() {
        super();
    }
    
    public final void changeEmail(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void emailList(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void verifyEmail(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String code) {
    }
    
    public final void updateCusInfoEmail(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String emailFromEditText, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> elist) {
    }
    
    public final void deleteSingleEmail(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fivebb.selfcare.network.responses.EmailListResponse> response) {
    }
}