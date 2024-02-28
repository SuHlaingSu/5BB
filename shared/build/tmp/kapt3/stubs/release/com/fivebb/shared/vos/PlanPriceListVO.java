package com.fivebb.shared.vos;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\t\u0010\u001e\u001a\u00020\nH\u00c6\u0003J=\u0010\u001f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u00c6\u0001J\u0013\u0010 \u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\"\u001a\u00020#H\u00d6\u0001J\t\u0010$\u001a\u00020%H\u00d6\u0001R \u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R&\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006&"}, d2 = {"Lcom/fivebb/shared/vos/PlanPriceListVO;", "", "planPriceList", "", "Lcom/fivebb/shared/vos/AdvPlanListVO;", "currentPlanVO", "Lcom/fivebb/shared/vos/CurrentPlanVO;", "noteVo", "Lcom/fivebb/shared/vos/NoteVo;", "isSelected", "", "(Ljava/util/List;Lcom/fivebb/shared/vos/CurrentPlanVO;Lcom/fivebb/shared/vos/NoteVo;Z)V", "getCurrentPlanVO", "()Lcom/fivebb/shared/vos/CurrentPlanVO;", "setCurrentPlanVO", "(Lcom/fivebb/shared/vos/CurrentPlanVO;)V", "()Z", "setSelected", "(Z)V", "getNoteVo", "()Lcom/fivebb/shared/vos/NoteVo;", "setNoteVo", "(Lcom/fivebb/shared/vos/NoteVo;)V", "getPlanPriceList", "()Ljava/util/List;", "setPlanPriceList", "(Ljava/util/List;)V", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "shared_release"})
public final class PlanPriceListVO {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "PlanPriceList")
    private java.util.List<com.fivebb.shared.vos.AdvPlanListVO> planPriceList;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "CurrentPlan")
    private com.fivebb.shared.vos.CurrentPlanVO currentPlanVO;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "Note")
    private com.fivebb.shared.vos.NoteVo noteVo;
    @com.google.gson.annotations.SerializedName(value = "isSelected")
    private boolean isSelected;
    
    @org.jetbrains.annotations.NotNull()
    public final com.fivebb.shared.vos.PlanPriceListVO copy(@org.jetbrains.annotations.Nullable()
    java.util.List<com.fivebb.shared.vos.AdvPlanListVO> planPriceList, @org.jetbrains.annotations.Nullable()
    com.fivebb.shared.vos.CurrentPlanVO currentPlanVO, @org.jetbrains.annotations.Nullable()
    com.fivebb.shared.vos.NoteVo noteVo, boolean isSelected) {
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
    
    public PlanPriceListVO() {
        super();
    }
    
    public PlanPriceListVO(@org.jetbrains.annotations.Nullable()
    java.util.List<com.fivebb.shared.vos.AdvPlanListVO> planPriceList, @org.jetbrains.annotations.Nullable()
    com.fivebb.shared.vos.CurrentPlanVO currentPlanVO, @org.jetbrains.annotations.Nullable()
    com.fivebb.shared.vos.NoteVo noteVo, boolean isSelected) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.fivebb.shared.vos.AdvPlanListVO> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.fivebb.shared.vos.AdvPlanListVO> getPlanPriceList() {
        return null;
    }
    
    public final void setPlanPriceList(@org.jetbrains.annotations.Nullable()
    java.util.List<com.fivebb.shared.vos.AdvPlanListVO> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.fivebb.shared.vos.CurrentPlanVO component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.fivebb.shared.vos.CurrentPlanVO getCurrentPlanVO() {
        return null;
    }
    
    public final void setCurrentPlanVO(@org.jetbrains.annotations.Nullable()
    com.fivebb.shared.vos.CurrentPlanVO p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.fivebb.shared.vos.NoteVo component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.fivebb.shared.vos.NoteVo getNoteVo() {
        return null;
    }
    
    public final void setNoteVo(@org.jetbrains.annotations.Nullable()
    com.fivebb.shared.vos.NoteVo p0) {
    }
    
    public final boolean component4() {
        return false;
    }
    
    public final boolean isSelected() {
        return false;
    }
    
    public final void setSelected(boolean p0) {
    }
}