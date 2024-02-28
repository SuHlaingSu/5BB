package com.fivebb.selfcare.mvp.presenters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0007J\u000e\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0007R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u0011"}, d2 = {"Lcom/fivebb/selfcare/mvp/presenters/SecretQuestionPresenter;", "Lcom/fivebb/shared/mvp/presenters/BasePresenter;", "Lcom/fivebb/selfcare/mvp/views/SecretQuestionView;", "Lcom/fivebb/selfcare/models/UserModel;", "()V", "mSecretQuestion", "Landroidx/lifecycle/MutableLiveData;", "", "getMSecretQuestion", "()Landroidx/lifecycle/MutableLiveData;", "setMSecretQuestion", "(Landroidx/lifecycle/MutableLiveData;)V", "loadSecretQuestion", "", "accountNumber", "validateSecretQuestion", "answer", "app_psrRelease"})
public final class SecretQuestionPresenter extends com.fivebb.shared.mvp.presenters.BasePresenter<com.fivebb.selfcare.mvp.views.SecretQuestionView, com.fivebb.selfcare.models.UserModel> {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> mSecretQuestion;
    
    public SecretQuestionPresenter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getMSecretQuestion() {
        return null;
    }
    
    public final void setMSecretQuestion(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    public final void loadSecretQuestion(@org.jetbrains.annotations.NotNull()
    java.lang.String accountNumber) {
    }
    
    public final void validateSecretQuestion(@org.jetbrains.annotations.NotNull()
    java.lang.String answer) {
    }
}