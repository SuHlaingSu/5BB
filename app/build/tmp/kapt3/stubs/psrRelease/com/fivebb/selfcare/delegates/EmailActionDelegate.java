package com.fivebb.selfcare.delegates;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&\u00a8\u0006\u0006"}, d2 = {"Lcom/fivebb/selfcare/delegates/EmailActionDelegate;", "", "onGetEmailList", "", "onTapAddNew", "onTapVerify", "app_psrRelease"})
public abstract interface EmailActionDelegate {
    
    public abstract void onGetEmailList();
    
    public abstract void onTapAddNew();
    
    public abstract void onTapVerify();
}