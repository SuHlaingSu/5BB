package com.fivebb.shared.vos;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b:\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 K2\u00020\u0001:\u0001KB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0099\u0001\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0014J\t\u00103\u001a\u00020\u0006H\u00c6\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\t\u00105\u001a\u00020\u0006H\u00c6\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\t\u00107\u001a\u00020\u0006H\u00c6\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\t\u0010?\u001a\u00020\u0006H\u00c6\u0003J\u009d\u0001\u0010@\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000f\u001a\u00020\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0013\u001a\u00020\u0006H\u00c6\u0001J\b\u0010A\u001a\u00020\u0006H\u0016J\u0013\u0010B\u001a\u00020C2\b\u0010D\u001a\u0004\u0018\u00010EH\u00d6\u0003J\t\u0010F\u001a\u00020\u0006H\u00d6\u0001J\t\u0010G\u001a\u00020\bH\u00d6\u0001J\u0018\u0010H\u001a\u00020I2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010J\u001a\u00020\u0006H\u0016R \u0010\f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0011\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u0013\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u001e\u0010\u001cR \u0010\r\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0016\"\u0004\b \u0010\u0018R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001a\"\u0004\b\"\u0010\u001cR \u0010\u000e\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0016\"\u0004\b$\u0010\u0018R \u0010\n\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0016\"\u0004\b&\u0010\u0018R \u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u0016\"\u0004\b(\u0010\u0018R \u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0016\"\u0004\b*\u0010\u0018R \u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0016\"\u0004\b,\u0010\u0018R \u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0016\"\u0004\b.\u0010\u0018R\u001e\u0010\u000f\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u001a\"\u0004\b0\u0010\u001cR \u0010\u0012\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0016\"\u0004\b2\u0010\u0018\u00a8\u0006L"}, d2 = {"Lcom/fivebb/shared/vos/AdvPlanListVO;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "id", "", "promo_name_eng", "", "promo_name_mm", "plan_name", "price", "amount", "cal_amt", "note", "taxPercentage", "taxAmt", "calTaxAmt", "totAmt", "calTotAmt", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;I)V", "getAmount", "()Ljava/lang/String;", "setAmount", "(Ljava/lang/String;)V", "getCalTaxAmt", "()I", "setCalTaxAmt", "(I)V", "getCalTotAmt", "setCalTotAmt", "getCal_amt", "setCal_amt", "getId", "setId", "getNote", "setNote", "getPlan_name", "setPlan_name", "getPrice", "setPrice", "getPromo_name_eng", "setPromo_name_eng", "getPromo_name_mm", "setPromo_name_mm", "getTaxAmt", "setTaxAmt", "getTaxPercentage", "setTaxPercentage", "getTotAmt", "setTotAmt", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "flags", "CREATOR", "shared_debug"})
public final class AdvPlanListVO implements android.os.Parcelable {
    @com.google.gson.annotations.SerializedName(value = "ID")
    private int id;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "PromoName_Eng")
    private java.lang.String promo_name_eng;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "PromoName_MM")
    private java.lang.String promo_name_mm;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "PlanName")
    private java.lang.String plan_name;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "Price")
    private java.lang.String price;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "Amount")
    private java.lang.String amount;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "CalculateAmount")
    private java.lang.String cal_amt;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "Note")
    private java.lang.String note;
    @com.google.gson.annotations.SerializedName(value = "TaxPercentage")
    private int taxPercentage;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "TaxAmount")
    private java.lang.String taxAmt;
    @com.google.gson.annotations.SerializedName(value = "CalculateTaxAmount")
    private int calTaxAmt;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "TotalAmount")
    private java.lang.String totAmt;
    @com.google.gson.annotations.SerializedName(value = "CalculateTotalAmount")
    private int calTotAmt;
    @org.jetbrains.annotations.NotNull()
    public static final com.fivebb.shared.vos.AdvPlanListVO.CREATOR CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.fivebb.shared.vos.AdvPlanListVO copy(int id, @org.jetbrains.annotations.Nullable()
    java.lang.String promo_name_eng, @org.jetbrains.annotations.Nullable()
    java.lang.String promo_name_mm, @org.jetbrains.annotations.Nullable()
    java.lang.String plan_name, @org.jetbrains.annotations.Nullable()
    java.lang.String price, @org.jetbrains.annotations.Nullable()
    java.lang.String amount, @org.jetbrains.annotations.Nullable()
    java.lang.String cal_amt, @org.jetbrains.annotations.Nullable()
    java.lang.String note, int taxPercentage, @org.jetbrains.annotations.Nullable()
    java.lang.String taxAmt, int calTaxAmt, @org.jetbrains.annotations.Nullable()
    java.lang.String totAmt, int calTotAmt) {
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
    
    public AdvPlanListVO() {
        super();
    }
    
    public AdvPlanListVO(int id, @org.jetbrains.annotations.Nullable()
    java.lang.String promo_name_eng, @org.jetbrains.annotations.Nullable()
    java.lang.String promo_name_mm, @org.jetbrains.annotations.Nullable()
    java.lang.String plan_name, @org.jetbrains.annotations.Nullable()
    java.lang.String price, @org.jetbrains.annotations.Nullable()
    java.lang.String amount, @org.jetbrains.annotations.Nullable()
    java.lang.String cal_amt, @org.jetbrains.annotations.Nullable()
    java.lang.String note, int taxPercentage, @org.jetbrains.annotations.Nullable()
    java.lang.String taxAmt, int calTaxAmt, @org.jetbrains.annotations.Nullable()
    java.lang.String totAmt, int calTotAmt) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPromo_name_eng() {
        return null;
    }
    
    public final void setPromo_name_eng(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPromo_name_mm() {
        return null;
    }
    
    public final void setPromo_name_mm(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPlan_name() {
        return null;
    }
    
    public final void setPlan_name(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPrice() {
        return null;
    }
    
    public final void setPrice(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAmount() {
        return null;
    }
    
    public final void setAmount(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCal_amt() {
        return null;
    }
    
    public final void setCal_amt(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNote() {
        return null;
    }
    
    public final void setNote(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final int component9() {
        return 0;
    }
    
    public final int getTaxPercentage() {
        return 0;
    }
    
    public final void setTaxPercentage(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTaxAmt() {
        return null;
    }
    
    public final void setTaxAmt(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final int component11() {
        return 0;
    }
    
    public final int getCalTaxAmt() {
        return 0;
    }
    
    public final void setCalTaxAmt(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTotAmt() {
        return null;
    }
    
    public final void setTotAmt(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final int component13() {
        return 0;
    }
    
    public final int getCalTotAmt() {
        return 0;
    }
    
    public final void setCalTotAmt(int p0) {
    }
    
    public AdvPlanListVO(@org.jetbrains.annotations.NotNull()
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
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/fivebb/shared/vos/AdvPlanListVO$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/fivebb/shared/vos/AdvPlanListVO;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/fivebb/shared/vos/AdvPlanListVO;", "shared_debug"})
    public static final class CREATOR implements android.os.Parcelable.Creator<com.fivebb.shared.vos.AdvPlanListVO> {
        
        private CREATOR() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.fivebb.shared.vos.AdvPlanListVO createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.fivebb.shared.vos.AdvPlanListVO[] newArray(int size) {
            return null;
        }
    }
}