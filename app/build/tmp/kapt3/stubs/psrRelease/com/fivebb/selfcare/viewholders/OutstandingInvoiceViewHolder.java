package com.fivebb.selfcare.viewholders;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004H\u0016J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/fivebb/selfcare/viewholders/OutstandingInvoiceViewHolder;", "Lcom/fivebb/shared/holders/BaseViewHolder;", "Lcom/fivebb/shared/vos/BillVO;", "itemView", "Landroid/view/View;", "mDelegate", "Lcom/fivebb/selfcare/delegates/InvoicePaymentActionDelegate;", "(Landroid/view/View;Lcom/fivebb/selfcare/delegates/InvoicePaymentActionDelegate;)V", "currency", "", "unPaidAmount", "onClick", "", "view", "setData", "data", "app_psrRelease"})
public final class OutstandingInvoiceViewHolder extends com.fivebb.shared.holders.BaseViewHolder<com.fivebb.shared.vos.BillVO> {
    private final com.fivebb.selfcare.delegates.InvoicePaymentActionDelegate mDelegate = null;
    private java.lang.String unPaidAmount = "";
    private java.lang.String currency = "";
    
    public OutstandingInvoiceViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.View itemView, @org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.delegates.InvoicePaymentActionDelegate mDelegate) {
        super(null);
    }
    
    @java.lang.Override()
    public void setData(@org.jetbrains.annotations.NotNull()
    com.fivebb.shared.vos.BillVO data) {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
}