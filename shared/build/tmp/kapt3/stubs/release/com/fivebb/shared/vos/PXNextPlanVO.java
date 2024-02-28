package com.fivebb.shared.vos;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\bS\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 g2\u00020\u0001:\u0001gB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u00e5\u0001\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u001bJ\u000b\u0010H\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\t\u0010I\u001a\u00020\u000bH\u00c6\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\t\u0010K\u001a\u00020\u000bH\u00c6\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\t\u0010N\u001a\u00020\u000bH\u00c6\u0003J\t\u0010O\u001a\u00020\u000bH\u00c6\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\t\u0010Q\u001a\u00020\u000bH\u00c6\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\t\u0010W\u001a\u00020\u000bH\u00c6\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\t\u0010Y\u001a\u00020\u000bH\u00c6\u0003J\t\u0010Z\u001a\u00020\u000bH\u00c6\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u00e9\u0001\u0010\\\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u000b2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001J\b\u0010]\u001a\u00020\u000bH\u0016J\u0013\u0010^\u001a\u00020_2\b\u0010`\u001a\u0004\u0018\u00010aH\u00d6\u0003J\t\u0010b\u001a\u00020\u000bH\u00d6\u0001J\t\u0010c\u001a\u00020\u0006H\u00d6\u0001J\u0018\u0010d\u001a\u00020e2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010f\u001a\u00020\u000bH\u0016R \u0010\f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010\r\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001e\u0010\u0010\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010!\"\u0004\b%\u0010#R\u001e\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010!\"\u0004\b\'\u0010#R \u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001d\"\u0004\b)\u0010\u001fR \u0010\u001a\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u001d\"\u0004\b+\u0010\u001fR \u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001d\"\u0004\b-\u0010\u001fR \u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001d\"\u0004\b/\u0010\u001fR \u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u001d\"\u0004\b1\u0010\u001fR \u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u001d\"\u0004\b3\u0010\u001fR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010!\"\u0004\b5\u0010#R\u001e\u0010\u0016\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010!\"\u0004\b7\u0010#R\u001e\u0010\u0018\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u0010!\"\u0004\b9\u0010#R \u0010\u0019\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u001d\"\u0004\b;\u0010\u001fR \u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u001d\"\u0004\b=\u0010\u001fR\u001e\u0010\u000e\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010!\"\u0004\b?\u0010#R \u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u001d\"\u0004\bA\u0010\u001fR \u0010\u0014\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u001d\"\u0004\bC\u0010\u001fR\u001e\u0010\u0015\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010!\"\u0004\bE\u0010#R \u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u001d\"\u0004\bG\u0010\u001f\u00a8\u0006h"}, d2 = {"Lcom/fivebb/shared/vos/PXNextPlanVO;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "packageID", "", "planName", "fullName", "pkg_displayName", "price", "", "amt", "calc_amt", "tax_percent", "tax_amt", "calc_tax_amt", "tot_amt", "calc_tot_amt", "download_speed", "upload_speed", "validity", "promo_day", "validity_lbl", "sort_order", "startDate", "endDate", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IILjava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;IILjava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getAmt", "()Ljava/lang/String;", "setAmt", "(Ljava/lang/String;)V", "getCalc_amt", "()I", "setCalc_amt", "(I)V", "getCalc_tax_amt", "setCalc_tax_amt", "getCalc_tot_amt", "setCalc_tot_amt", "getDownload_speed", "setDownload_speed", "getEndDate", "setEndDate", "getFullName", "setFullName", "getPackageID", "setPackageID", "getPkg_displayName", "setPkg_displayName", "getPlanName", "setPlanName", "getPrice", "setPrice", "getPromo_day", "setPromo_day", "getSort_order", "setSort_order", "getStartDate", "setStartDate", "getTax_amt", "setTax_amt", "getTax_percent", "setTax_percent", "getTot_amt", "setTot_amt", "getUpload_speed", "setUpload_speed", "getValidity", "setValidity", "getValidity_lbl", "setValidity_lbl", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "flags", "CREATOR", "shared_release"})
public final class PXNextPlanVO implements android.os.Parcelable {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "PackageID")
    private java.lang.String packageID;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "PlanName")
    private java.lang.String planName;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "FullName")
    private java.lang.String fullName;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "PkgDisplayName")
    private java.lang.String pkg_displayName;
    @com.google.gson.annotations.SerializedName(value = "Price")
    private int price;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "Amount")
    private java.lang.String amt;
    @com.google.gson.annotations.SerializedName(value = "CalculateAmount")
    private int calc_amt;
    @com.google.gson.annotations.SerializedName(value = "TaxPercentage")
    private int tax_percent;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "TaxAmount")
    private java.lang.String tax_amt;
    @com.google.gson.annotations.SerializedName(value = "CalculateTaxAmount")
    private int calc_tax_amt;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "TotalAmount")
    private java.lang.String tot_amt;
    @com.google.gson.annotations.SerializedName(value = "CalculateTotalAmount")
    private int calc_tot_amt;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "DownloadSpeed")
    private java.lang.String download_speed;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "UploadSpeed")
    private java.lang.String upload_speed;
    @com.google.gson.annotations.SerializedName(value = "Validity")
    private int validity;
    @com.google.gson.annotations.SerializedName(value = "PromoDay")
    private int promo_day;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "ValidityLabel")
    private java.lang.String validity_lbl;
    @com.google.gson.annotations.SerializedName(value = "SortOrder")
    private int sort_order;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "StartDate")
    private java.lang.String startDate;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "EndDate")
    private java.lang.String endDate;
    @org.jetbrains.annotations.NotNull()
    public static final com.fivebb.shared.vos.PXNextPlanVO.CREATOR CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.fivebb.shared.vos.PXNextPlanVO copy(@org.jetbrains.annotations.Nullable()
    java.lang.String packageID, @org.jetbrains.annotations.Nullable()
    java.lang.String planName, @org.jetbrains.annotations.Nullable()
    java.lang.String fullName, @org.jetbrains.annotations.Nullable()
    java.lang.String pkg_displayName, int price, @org.jetbrains.annotations.Nullable()
    java.lang.String amt, int calc_amt, int tax_percent, @org.jetbrains.annotations.Nullable()
    java.lang.String tax_amt, int calc_tax_amt, @org.jetbrains.annotations.Nullable()
    java.lang.String tot_amt, int calc_tot_amt, @org.jetbrains.annotations.Nullable()
    java.lang.String download_speed, @org.jetbrains.annotations.Nullable()
    java.lang.String upload_speed, int validity, int promo_day, @org.jetbrains.annotations.Nullable()
    java.lang.String validity_lbl, int sort_order, @org.jetbrains.annotations.Nullable()
    java.lang.String startDate, @org.jetbrains.annotations.Nullable()
    java.lang.String endDate) {
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
    
    public PXNextPlanVO() {
        super();
    }
    
    public PXNextPlanVO(@org.jetbrains.annotations.Nullable()
    java.lang.String packageID, @org.jetbrains.annotations.Nullable()
    java.lang.String planName, @org.jetbrains.annotations.Nullable()
    java.lang.String fullName, @org.jetbrains.annotations.Nullable()
    java.lang.String pkg_displayName, int price, @org.jetbrains.annotations.Nullable()
    java.lang.String amt, int calc_amt, int tax_percent, @org.jetbrains.annotations.Nullable()
    java.lang.String tax_amt, int calc_tax_amt, @org.jetbrains.annotations.Nullable()
    java.lang.String tot_amt, int calc_tot_amt, @org.jetbrains.annotations.Nullable()
    java.lang.String download_speed, @org.jetbrains.annotations.Nullable()
    java.lang.String upload_speed, int validity, int promo_day, @org.jetbrains.annotations.Nullable()
    java.lang.String validity_lbl, int sort_order, @org.jetbrains.annotations.Nullable()
    java.lang.String startDate, @org.jetbrains.annotations.Nullable()
    java.lang.String endDate) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPackageID() {
        return null;
    }
    
    public final void setPackageID(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPlanName() {
        return null;
    }
    
    public final void setPlanName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFullName() {
        return null;
    }
    
    public final void setFullName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPkg_displayName() {
        return null;
    }
    
    public final void setPkg_displayName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int getPrice() {
        return 0;
    }
    
    public final void setPrice(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAmt() {
        return null;
    }
    
    public final void setAmt(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final int component7() {
        return 0;
    }
    
    public final int getCalc_amt() {
        return 0;
    }
    
    public final void setCalc_amt(int p0) {
    }
    
    public final int component8() {
        return 0;
    }
    
    public final int getTax_percent() {
        return 0;
    }
    
    public final void setTax_percent(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTax_amt() {
        return null;
    }
    
    public final void setTax_amt(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final int component10() {
        return 0;
    }
    
    public final int getCalc_tax_amt() {
        return 0;
    }
    
    public final void setCalc_tax_amt(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTot_amt() {
        return null;
    }
    
    public final void setTot_amt(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final int component12() {
        return 0;
    }
    
    public final int getCalc_tot_amt() {
        return 0;
    }
    
    public final void setCalc_tot_amt(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDownload_speed() {
        return null;
    }
    
    public final void setDownload_speed(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUpload_speed() {
        return null;
    }
    
    public final void setUpload_speed(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final int component15() {
        return 0;
    }
    
    public final int getValidity() {
        return 0;
    }
    
    public final void setValidity(int p0) {
    }
    
    public final int component16() {
        return 0;
    }
    
    public final int getPromo_day() {
        return 0;
    }
    
    public final void setPromo_day(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getValidity_lbl() {
        return null;
    }
    
    public final void setValidity_lbl(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final int component18() {
        return 0;
    }
    
    public final int getSort_order() {
        return 0;
    }
    
    public final void setSort_order(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStartDate() {
        return null;
    }
    
    public final void setStartDate(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEndDate() {
        return null;
    }
    
    public final void setEndDate(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public PXNextPlanVO(@org.jetbrains.annotations.NotNull()
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
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/fivebb/shared/vos/PXNextPlanVO$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/fivebb/shared/vos/PXNextPlanVO;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/fivebb/shared/vos/PXNextPlanVO;", "shared_release"})
    public static final class CREATOR implements android.os.Parcelable.Creator<com.fivebb.shared.vos.PXNextPlanVO> {
        
        private CREATOR() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.fivebb.shared.vos.PXNextPlanVO createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.fivebb.shared.vos.PXNextPlanVO[] newArray(int size) {
            return null;
        }
    }
}