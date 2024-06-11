package com.fivebb.selfcare.mvp.views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0006H&\u00a8\u0006\b"}, d2 = {"Lcom/fivebb/selfcare/mvp/views/BankListView;", "Lcom/fivebb/shared/mvp/views/BaseView;", "showAllBank", "", "data", "", "Lcom/fivebb/shared/vos/BankVO;", "showSelectedBankInfo", "app_psrDebug"})
public abstract interface BankListView extends com.fivebb.shared.mvp.views.BaseView {
    
    public abstract void showAllBank(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fivebb.shared.vos.BankVO> data);
    
    public abstract void showSelectedBankInfo(@org.jetbrains.annotations.NotNull()
    com.fivebb.shared.vos.BankVO data);
}