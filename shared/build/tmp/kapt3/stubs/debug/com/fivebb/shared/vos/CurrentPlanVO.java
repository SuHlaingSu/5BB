package com.fivebb.shared.vos;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b1\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 C2\u00020\u0001:\u0001CB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0083\u0001\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\u0012J\t\u0010-\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\t\u00100\u001a\u00020\u0006H\u00c6\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\t\u00107\u001a\u00020\u0006H\u00c6\u0003J\u0087\u0001\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000f\u001a\u00020\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\tH\u00c6\u0001J\b\u00109\u001a\u00020\u0006H\u0016J\u0013\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010=H\u00d6\u0003J\t\u0010>\u001a\u00020\u0006H\u00d6\u0001J\t\u0010?\u001a\u00020\tH\u00d6\u0001J\u0018\u0010@\u001a\u00020A2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010B\u001a\u00020\u0006H\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R \u0010\r\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR \u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR\u001e\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0016R \u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR \u0010\f\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0018\"\u0004\b\"\u0010\u001aR \u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0018\"\u0004\b$\u0010\u001aR \u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0018\"\u0004\b&\u0010\u001aR \u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u0018\"\u0004\b(\u0010\u001aR\u001e\u0010\u000f\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0014\"\u0004\b*\u0010\u0016R \u0010\u0011\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0018\"\u0004\b,\u0010\u001a\u00a8\u0006D"}, d2 = {"Lcom/fivebb/shared/vos/CurrentPlanVO;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "adv_id", "", "id", "promo_name_eng", "", "promo_name_mm", "plan_name", "price", "amount", "bankForPayment", "taxPercentage", "taxAmt", "totAmt", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getAdv_id", "()I", "setAdv_id", "(I)V", "getAmount", "()Ljava/lang/String;", "setAmount", "(Ljava/lang/String;)V", "getBankForPayment", "setBankForPayment", "getId", "setId", "getPlan_name", "setPlan_name", "getPrice", "setPrice", "getPromo_name_eng", "setPromo_name_eng", "getPromo_name_mm", "setPromo_name_mm", "getTaxAmt", "setTaxAmt", "getTaxPercentage", "setTaxPercentage", "getTotAmt", "setTotAmt", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "flags", "CREATOR", "shared_debug"})
public final class CurrentPlanVO implements android.os.Parcelable {
    @com.google.gson.annotations.SerializedName(value = "AdvancePaymentFormID")
    private int adv_id;
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
    @com.google.gson.annotations.SerializedName(value = "BankForPayment")
    private java.lang.String bankForPayment;
    @com.google.gson.annotations.SerializedName(value = "TaxPercentage")
    private int taxPercentage;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "TaxAmount")
    private java.lang.String taxAmt;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "TotalAmount")
    private java.lang.String totAmt;
    @org.jetbrains.annotations.NotNull()
    public static final com.fivebb.shared.vos.CurrentPlanVO.CREATOR CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.fivebb.shared.vos.CurrentPlanVO copy(int adv_id, int id, @org.jetbrains.annotations.Nullable()
    java.lang.String promo_name_eng, @org.jetbrains.annotations.Nullable()
    java.lang.String promo_name_mm, @org.jetbrains.annotations.Nullable()
    java.lang.String plan_name, @org.jetbrains.annotations.Nullable()
    java.lang.String price, @org.jetbrains.annotations.Nullable()
    java.lang.String amount, @org.jetbrains.annotations.Nullable()
    java.lang.String bankForPayment, int taxPercentage, @org.jetbrains.annotations.Nullable()
    java.lang.String taxAmt, @org.jetbrains.annotations.Nullable()
    java.lang.String totAmt) {
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
    
    public CurrentPlanVO() {
        super();
    }
    
    public CurrentPlanVO(int adv_id, int id, @org.jetbrains.annotations.Nullable()
    java.lang.String promo_name_eng, @org.jetbrains.annotations.Nullable()
    java.lang.String promo_name_mm, @org.jetbrains.annotations.Nullable()
    java.lang.String plan_name, @org.jetbrains.annotations.Nullable()
    java.lang.String price, @org.jetbrains.annotations.Nullable()
    java.lang.String amount, @org.jetbrains.annotations.Nullable()
    java.lang.String bankForPayment, int taxPercentage, @org.jetbrains.annotations.Nullable()
    java.lang.String taxAmt, @org.jetbrains.annotations.Nullable()
    java.lang.String totAmt) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getAdv_id() {
        return 0;
    }
    
    public final void setAdv_id(int p0) {
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
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
    public final java.lang.String component4() {
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
    public final java.lang.String component5() {
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
    public final java.lang.String component6() {
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
    public final java.lang.String component7() {
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
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBankForPayment() {
        return null;
    }
    
    public final void setBankForPayment(@org.jetbrains.annotations.Nullable()
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
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTotAmt() {
        return null;
    }
    
    public final void setTotAmt(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public CurrentPlanVO(@org.jetbrains.annotations.NotNull()
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
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/fivebb/shared/vos/CurrentPlanVO$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/fivebb/shared/vos/CurrentPlanVO;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/fivebb/shared/vos/CurrentPlanVO;", "shared_debug"})
    public static final class CREATOR implements android.os.Parcelable.Creator<com.fivebb.shared.vos.CurrentPlanVO> {
        
        private CREATOR() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.fivebb.shared.vos.CurrentPlanVO createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.fivebb.shared.vos.CurrentPlanVO[] newArray(int size) {
            return null;
        }
    }
}