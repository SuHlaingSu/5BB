package com.fivebb.selfcare.delegates;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&\u00a8\u0006\t"}, d2 = {"Lcom/fivebb/selfcare/delegates/NavigationActionDelegate;", "", "onTapActivityLog", "", "onTapHelp", "onTapNotification", "onTapRecharge", "onTapRelocation", "onTapTicket", "app_psrRelease"})
public abstract interface NavigationActionDelegate {
    
    public abstract void onTapRecharge();
    
    public abstract void onTapActivityLog();
    
    public abstract void onTapRelocation();
    
    public abstract void onTapTicket();
    
    public abstract void onTapNotification();
    
    public abstract void onTapHelp();
}