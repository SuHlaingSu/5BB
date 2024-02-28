package com.fivebb.shared.vos;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\tH\u00c6\u0003J3\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001f"}, d2 = {"Lcom/fivebb/shared/vos/PXDetailVO;", "", "configuration", "Lcom/fivebb/shared/vos/ConfigurationVO;", "adjustedBalanceVO", "Lcom/fivebb/shared/vos/RemainingAdjustedBalanceVO;", "pXcurrentPlanVO", "Lcom/fivebb/shared/vos/PXCurrentPlanVO;", "nextPlanVO", "Lcom/fivebb/shared/vos/PXNextPlanVO;", "(Lcom/fivebb/shared/vos/ConfigurationVO;Lcom/fivebb/shared/vos/RemainingAdjustedBalanceVO;Lcom/fivebb/shared/vos/PXCurrentPlanVO;Lcom/fivebb/shared/vos/PXNextPlanVO;)V", "getAdjustedBalanceVO", "()Lcom/fivebb/shared/vos/RemainingAdjustedBalanceVO;", "getConfiguration", "()Lcom/fivebb/shared/vos/ConfigurationVO;", "getNextPlanVO", "()Lcom/fivebb/shared/vos/PXNextPlanVO;", "getPXcurrentPlanVO", "()Lcom/fivebb/shared/vos/PXCurrentPlanVO;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "shared_release"})
public final class PXDetailVO {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "Configuration")
    private final com.fivebb.shared.vos.ConfigurationVO configuration = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "RemainingAdjustedBalance")
    private final com.fivebb.shared.vos.RemainingAdjustedBalanceVO adjustedBalanceVO = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "CurrentPlan")
    private final com.fivebb.shared.vos.PXCurrentPlanVO pXcurrentPlanVO = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "NextPlan")
    private final com.fivebb.shared.vos.PXNextPlanVO nextPlanVO = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.fivebb.shared.vos.PXDetailVO copy(@org.jetbrains.annotations.NotNull()
    com.fivebb.shared.vos.ConfigurationVO configuration, @org.jetbrains.annotations.Nullable()
    com.fivebb.shared.vos.RemainingAdjustedBalanceVO adjustedBalanceVO, @org.jetbrains.annotations.NotNull()
    com.fivebb.shared.vos.PXCurrentPlanVO pXcurrentPlanVO, @org.jetbrains.annotations.NotNull()
    com.fivebb.shared.vos.PXNextPlanVO nextPlanVO) {
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
    
    public PXDetailVO(@org.jetbrains.annotations.NotNull()
    com.fivebb.shared.vos.ConfigurationVO configuration, @org.jetbrains.annotations.Nullable()
    com.fivebb.shared.vos.RemainingAdjustedBalanceVO adjustedBalanceVO, @org.jetbrains.annotations.NotNull()
    com.fivebb.shared.vos.PXCurrentPlanVO pXcurrentPlanVO, @org.jetbrains.annotations.NotNull()
    com.fivebb.shared.vos.PXNextPlanVO nextPlanVO) {
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
    
    @org.jetbrains.annotations.Nullable()
    public final com.fivebb.shared.vos.RemainingAdjustedBalanceVO component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.fivebb.shared.vos.RemainingAdjustedBalanceVO getAdjustedBalanceVO() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fivebb.shared.vos.PXCurrentPlanVO component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fivebb.shared.vos.PXCurrentPlanVO getPXcurrentPlanVO() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fivebb.shared.vos.PXNextPlanVO component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fivebb.shared.vos.PXNextPlanVO getNextPlanVO() {
        return null;
    }
}