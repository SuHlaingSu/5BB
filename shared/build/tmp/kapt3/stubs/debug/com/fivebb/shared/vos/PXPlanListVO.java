package com.fivebb.shared.vos;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\bH\u00c6\u0003J1\u0010\u0018\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R&\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u001f"}, d2 = {"Lcom/fivebb/shared/vos/PXPlanListVO;", "", "planPriceList", "", "Lcom/fivebb/shared/vos/PXPlanVO;", "noteVo", "Lcom/fivebb/shared/vos/PXNoteVo;", "isSelected", "", "(Ljava/util/List;Lcom/fivebb/shared/vos/PXNoteVo;Z)V", "()Z", "setSelected", "(Z)V", "getNoteVo", "()Lcom/fivebb/shared/vos/PXNoteVo;", "setNoteVo", "(Lcom/fivebb/shared/vos/PXNoteVo;)V", "getPlanPriceList", "()Ljava/util/List;", "setPlanPriceList", "(Ljava/util/List;)V", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "shared_debug"})
public final class PXPlanListVO {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "PlanPriceList")
    private java.util.List<com.fivebb.shared.vos.PXPlanVO> planPriceList;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "Note")
    private com.fivebb.shared.vos.PXNoteVo noteVo;
    @com.google.gson.annotations.SerializedName(value = "isSelected")
    private boolean isSelected;
    
    @org.jetbrains.annotations.NotNull()
    public final com.fivebb.shared.vos.PXPlanListVO copy(@org.jetbrains.annotations.Nullable()
    java.util.List<com.fivebb.shared.vos.PXPlanVO> planPriceList, @org.jetbrains.annotations.Nullable()
    com.fivebb.shared.vos.PXNoteVo noteVo, boolean isSelected) {
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
    
    public PXPlanListVO() {
        super();
    }
    
    public PXPlanListVO(@org.jetbrains.annotations.Nullable()
    java.util.List<com.fivebb.shared.vos.PXPlanVO> planPriceList, @org.jetbrains.annotations.Nullable()
    com.fivebb.shared.vos.PXNoteVo noteVo, boolean isSelected) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.fivebb.shared.vos.PXPlanVO> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.fivebb.shared.vos.PXPlanVO> getPlanPriceList() {
        return null;
    }
    
    public final void setPlanPriceList(@org.jetbrains.annotations.Nullable()
    java.util.List<com.fivebb.shared.vos.PXPlanVO> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.fivebb.shared.vos.PXNoteVo component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.fivebb.shared.vos.PXNoteVo getNoteVo() {
        return null;
    }
    
    public final void setNoteVo(@org.jetbrains.annotations.Nullable()
    com.fivebb.shared.vos.PXNoteVo p0) {
    }
    
    public final boolean component3() {
        return false;
    }
    
    public final boolean isSelected() {
        return false;
    }
    
    public final void setSelected(boolean p0) {
    }
}