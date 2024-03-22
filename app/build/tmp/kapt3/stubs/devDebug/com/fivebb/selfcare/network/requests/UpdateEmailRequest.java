package com.fivebb.selfcare.network.requests;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0003H\u00d6\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n\u00a8\u0006\u0019"}, d2 = {"Lcom/fivebb/selfcare/network/requests/UpdateEmailRequest;", "", "customerAccountNo", "", "verifyType", "verifyAcc", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCustomerAccountNo", "()Ljava/lang/String;", "setCustomerAccountNo", "(Ljava/lang/String;)V", "getVerifyAcc", "setVerifyAcc", "getVerifyType", "setVerifyType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_devDebug"})
public final class UpdateEmailRequest {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "CustAccNo")
    private java.lang.String customerAccountNo;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "Type")
    private java.lang.String verifyType;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "SecondaryAccount")
    private java.lang.String verifyAcc;
    
    @org.jetbrains.annotations.NotNull()
    public final com.fivebb.selfcare.network.requests.UpdateEmailRequest copy(@org.jetbrains.annotations.NotNull()
    java.lang.String customerAccountNo, @org.jetbrains.annotations.NotNull()
    java.lang.String verifyType, @org.jetbrains.annotations.NotNull()
    java.lang.String verifyAcc) {
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
    
    public UpdateEmailRequest() {
        super();
    }
    
    public UpdateEmailRequest(@org.jetbrains.annotations.NotNull()
    java.lang.String customerAccountNo, @org.jetbrains.annotations.NotNull()
    java.lang.String verifyType, @org.jetbrains.annotations.NotNull()
    java.lang.String verifyAcc) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCustomerAccountNo() {
        return null;
    }
    
    public final void setCustomerAccountNo(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getVerifyType() {
        return null;
    }
    
    public final void setVerifyType(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getVerifyAcc() {
        return null;
    }
    
    public final void setVerifyAcc(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
}