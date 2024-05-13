package com.fivebb.shared.vos;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b,\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 B2\u00020\u0001:\u0001BB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004Bi\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0012J\t\u0010-\u001a\u00020\u0006H\u00c6\u0003J\t\u0010.\u001a\u00020\u0006H\u00c6\u0003J\t\u0010/\u001a\u00020\u0006H\u00c6\u0003J\t\u00100\u001a\u00020\u0006H\u00c6\u0003J\t\u00101\u001a\u00020\nH\u00c6\u0003J\t\u00102\u001a\u00020\u0006H\u00c6\u0003J\t\u00103\u001a\u00020\rH\u00c6\u0003J\t\u00104\u001a\u00020\u0006H\u00c6\u0003J\t\u00105\u001a\u00020\rH\u00c6\u0003J\t\u00106\u001a\u00020\rH\u00c6\u0003Jm\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\u0006H\u00c6\u0001J\b\u00108\u001a\u00020\rH\u0016J\u0013\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010<H\u00d6\u0003J\t\u0010=\u001a\u00020\rH\u00d6\u0001J\t\u0010>\u001a\u00020\u0006H\u00d6\u0001J\u0018\u0010?\u001a\u00020@2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010A\u001a\u00020\rH\u0016R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0011\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR\u001e\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR\u001e\u0010\u000b\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0018\"\u0004\b\"\u0010\u001aR\u001e\u0010\u000f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010$\"\u0004\b(\u0010&R\u001e\u0010\u000e\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0018\"\u0004\b*\u0010\u001aR\u001e\u0010\u0010\u001a\u00020\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010$\"\u0004\b,\u0010&\u00a8\u0006C"}, d2 = {"Lcom/fivebb/shared/vos/RechargeVO;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "plan_id", "", "plan_name", "fullname", "cal_price", "", "price", "sorting", "", "speed", "quota", "validity", "flag", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;ILjava/lang/String;IILjava/lang/String;)V", "getCal_price", "()D", "setCal_price", "(D)V", "getFlag", "()Ljava/lang/String;", "setFlag", "(Ljava/lang/String;)V", "getFullname", "setFullname", "getPlan_id", "setPlan_id", "getPlan_name", "setPlan_name", "getPrice", "setPrice", "getQuota", "()I", "setQuota", "(I)V", "getSorting", "setSorting", "getSpeed", "setSpeed", "getValidity", "setValidity", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "flags", "CREATOR", "shared_debug"})
public final class RechargeVO implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "planID")
    private java.lang.String plan_id;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "planName")
    private java.lang.String plan_name;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "FullName")
    private java.lang.String fullname;
    @com.google.gson.annotations.SerializedName(value = "CalculatePrice")
    private double cal_price;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "Price")
    private java.lang.String price;
    @com.google.gson.annotations.SerializedName(value = "SortOrder")
    private int sorting;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "DownloadSpeed")
    private java.lang.String speed;
    @com.google.gson.annotations.SerializedName(value = "Quota")
    private int quota;
    @com.google.gson.annotations.SerializedName(value = "Validity")
    private int validity;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "Label")
    private java.lang.String flag;
    @org.jetbrains.annotations.NotNull()
    public static final com.fivebb.shared.vos.RechargeVO.CREATOR CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.fivebb.shared.vos.RechargeVO copy(@org.jetbrains.annotations.NotNull()
    java.lang.String plan_id, @org.jetbrains.annotations.NotNull()
    java.lang.String plan_name, @org.jetbrains.annotations.NotNull()
    java.lang.String fullname, double cal_price, @org.jetbrains.annotations.NotNull()
    java.lang.String price, int sorting, @org.jetbrains.annotations.NotNull()
    java.lang.String speed, int quota, int validity, @org.jetbrains.annotations.NotNull()
    java.lang.String flag) {
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
    
    public RechargeVO() {
        super();
    }
    
    public RechargeVO(@org.jetbrains.annotations.NotNull()
    java.lang.String plan_id, @org.jetbrains.annotations.NotNull()
    java.lang.String plan_name, @org.jetbrains.annotations.NotNull()
    java.lang.String fullname, double cal_price, @org.jetbrains.annotations.NotNull()
    java.lang.String price, int sorting, @org.jetbrains.annotations.NotNull()
    java.lang.String speed, int quota, int validity, @org.jetbrains.annotations.NotNull()
    java.lang.String flag) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPlan_id() {
        return null;
    }
    
    public final void setPlan_id(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPlan_name() {
        return null;
    }
    
    public final void setPlan_name(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFullname() {
        return null;
    }
    
    public final void setFullname(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final double component4() {
        return 0.0;
    }
    
    public final double getCal_price() {
        return 0.0;
    }
    
    public final void setCal_price(double p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPrice() {
        return null;
    }
    
    public final void setPrice(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int component6() {
        return 0;
    }
    
    public final int getSorting() {
        return 0;
    }
    
    public final void setSorting(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSpeed() {
        return null;
    }
    
    public final void setSpeed(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int component8() {
        return 0;
    }
    
    public final int getQuota() {
        return 0;
    }
    
    public final void setQuota(int p0) {
    }
    
    public final int component9() {
        return 0;
    }
    
    public final int getValidity() {
        return 0;
    }
    
    public final void setValidity(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFlag() {
        return null;
    }
    
    public final void setFlag(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public RechargeVO(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel) {
        super();
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/fivebb/shared/vos/RechargeVO$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/fivebb/shared/vos/RechargeVO;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/fivebb/shared/vos/RechargeVO;", "shared_debug"})
    public static final class CREATOR implements android.os.Parcelable.Creator<com.fivebb.shared.vos.RechargeVO> {
        
        private CREATOR() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.fivebb.shared.vos.RechargeVO createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.fivebb.shared.vos.RechargeVO[] newArray(int size) {
            return null;
        }
    }
}