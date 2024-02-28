package com.fivebb.shared.vos;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0005J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u00c6\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R&\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005\u00a8\u0006\u0012"}, d2 = {"Lcom/fivebb/shared/vos/PaymentDetailVO;", "", "paymentDetail", "", "Lcom/fivebb/shared/vos/PaymentHistoryVO;", "(Ljava/util/List;)V", "getPaymentDetail", "()Ljava/util/List;", "setPaymentDetail", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "shared_release"})
public final class PaymentDetailVO {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "paymentDetail")
    private java.util.List<com.fivebb.shared.vos.PaymentHistoryVO> paymentDetail;
    
    @org.jetbrains.annotations.NotNull()
    public final com.fivebb.shared.vos.PaymentDetailVO copy(@org.jetbrains.annotations.Nullable()
    java.util.List<com.fivebb.shared.vos.PaymentHistoryVO> paymentDetail) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public PaymentDetailVO(@org.jetbrains.annotations.Nullable()
    java.util.List<com.fivebb.shared.vos.PaymentHistoryVO> paymentDetail) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.fivebb.shared.vos.PaymentHistoryVO> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.fivebb.shared.vos.PaymentHistoryVO> getPaymentDetail() {
        return null;
    }
    
    public final void setPaymentDetail(@org.jetbrains.annotations.Nullable()
    java.util.List<com.fivebb.shared.vos.PaymentHistoryVO> p0) {
    }
}