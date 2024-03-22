package com.fivebb.selfcare.mvp.views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH&\u00a8\u0006\u000b"}, d2 = {"Lcom/fivebb/selfcare/mvp/views/CreateTicketView;", "Lcom/fivebb/shared/mvp/views/BaseView;", "getContext", "Landroid/content/Context;", "showCustomerBasicDetail", "", "customerBasicViewDetails", "Lcom/fivebb/shared/vos/CustomerBasicViewDetailsVO;", "showSendEmailSuccess", "successMessage", "", "app_devDebug"})
public abstract interface CreateTicketView extends com.fivebb.shared.mvp.views.BaseView {
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.content.Context getContext();
    
    public abstract void showCustomerBasicDetail(@org.jetbrains.annotations.NotNull()
    com.fivebb.shared.vos.CustomerBasicViewDetailsVO customerBasicViewDetails);
    
    public abstract void showSendEmailSuccess(@org.jetbrains.annotations.NotNull()
    java.lang.String successMessage);
}