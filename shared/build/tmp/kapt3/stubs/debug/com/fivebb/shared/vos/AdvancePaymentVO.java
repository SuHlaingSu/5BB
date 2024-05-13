package com.fivebb.shared.vos;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tH\u00c6\u0003J5\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001f"}, d2 = {"Lcom/fivebb/shared/vos/AdvancePaymentVO;", "", "configuration", "Lcom/fivebb/shared/vos/ConfigurationVO;", "info", "Lcom/fivebb/shared/vos/BSInfoVO;", "adjustedBalanceVO", "Lcom/fivebb/shared/vos/RemainingAdjustedBalanceVO;", "getServiceBalanceVO", "Lcom/fivebb/shared/vos/GetServiceBalanceVO;", "(Lcom/fivebb/shared/vos/ConfigurationVO;Lcom/fivebb/shared/vos/BSInfoVO;Lcom/fivebb/shared/vos/RemainingAdjustedBalanceVO;Lcom/fivebb/shared/vos/GetServiceBalanceVO;)V", "getAdjustedBalanceVO", "()Lcom/fivebb/shared/vos/RemainingAdjustedBalanceVO;", "getConfiguration", "()Lcom/fivebb/shared/vos/ConfigurationVO;", "getGetServiceBalanceVO", "()Lcom/fivebb/shared/vos/GetServiceBalanceVO;", "getInfo", "()Lcom/fivebb/shared/vos/BSInfoVO;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "shared_debug"})
public final class AdvancePaymentVO {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "Configuration")
    private final com.fivebb.shared.vos.ConfigurationVO configuration = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "Info")
    private final com.fivebb.shared.vos.BSInfoVO info = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "RemainingAdjustedBalance")
    private final com.fivebb.shared.vos.RemainingAdjustedBalanceVO adjustedBalanceVO = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "GetServiceBalance")
    private final com.fivebb.shared.vos.GetServiceBalanceVO getServiceBalanceVO = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.fivebb.shared.vos.AdvancePaymentVO copy(@org.jetbrains.annotations.NotNull()
    com.fivebb.shared.vos.ConfigurationVO configuration, @org.jetbrains.annotations.NotNull()
    com.fivebb.shared.vos.BSInfoVO info, @org.jetbrains.annotations.Nullable()
    com.fivebb.shared.vos.RemainingAdjustedBalanceVO adjustedBalanceVO, @org.jetbrains.annotations.Nullable()
    com.fivebb.shared.vos.GetServiceBalanceVO getServiceBalanceVO) {
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
    
    public AdvancePaymentVO(@org.jetbrains.annotations.NotNull()
    com.fivebb.shared.vos.ConfigurationVO configuration, @org.jetbrains.annotations.NotNull()
    com.fivebb.shared.vos.BSInfoVO info, @org.jetbrains.annotations.Nullable()
    com.fivebb.shared.vos.RemainingAdjustedBalanceVO adjustedBalanceVO, @org.jetbrains.annotations.Nullable()
    com.fivebb.shared.vos.GetServiceBalanceVO getServiceBalanceVO) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fivebb.shared.vos.ConfigurationVO component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fivebb.shared.vos.ConfigurationVO getConfiguration() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fivebb.shared.vos.BSInfoVO component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fivebb.shared.vos.BSInfoVO getInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.fivebb.shared.vos.RemainingAdjustedBalanceVO component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.fivebb.shared.vos.RemainingAdjustedBalanceVO getAdjustedBalanceVO() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.fivebb.shared.vos.GetServiceBalanceVO component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.fivebb.shared.vos.GetServiceBalanceVO getGetServiceBalanceVO() {
        return null;
    }
}