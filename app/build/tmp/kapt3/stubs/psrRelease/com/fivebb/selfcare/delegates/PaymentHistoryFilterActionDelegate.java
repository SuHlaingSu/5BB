package com.fivebb.selfcare.delegates;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\n"}, d2 = {"Lcom/fivebb/selfcare/delegates/PaymentHistoryFilterActionDelegate;", "", "onDownload", "", "creditNo", "", "onTapChooseDateRange", "fromDate", "toDate", "onViewInvoice", "app_psrRelease"})
public abstract interface PaymentHistoryFilterActionDelegate {
    
    public abstract void onTapChooseDateRange(@org.jetbrains.annotations.NotNull()
    java.lang.String fromDate, @org.jetbrains.annotations.NotNull()
    java.lang.String toDate);
    
    public abstract void onDownload(@org.jetbrains.annotations.NotNull()
    java.lang.String creditNo);
    
    public abstract void onViewInvoice(@org.jetbrains.annotations.NotNull()
    java.lang.String creditNo);
}