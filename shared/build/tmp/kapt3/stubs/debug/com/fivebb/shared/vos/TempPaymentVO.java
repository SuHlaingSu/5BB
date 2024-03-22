package com.fivebb.shared.vos;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b0\b\u0086\b\u0018\u00002\u00020\u0001Bs\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0003\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\u0010J\t\u0010+\u001a\u00020\u0003H\u00c6\u0003J\t\u0010,\u001a\u00020\u0005H\u00c6\u0003J\t\u0010-\u001a\u00020\u000bH\u00c6\u0003J\t\u0010.\u001a\u00020\u0005H\u00c6\u0003J\t\u0010/\u001a\u00020\u0005H\u00c6\u0003J\t\u00100\u001a\u00020\u0005H\u00c6\u0003J\t\u00101\u001a\u00020\u0003H\u00c6\u0003J\t\u00102\u001a\u00020\u0005H\u00c6\u0003J\t\u00103\u001a\u00020\u000bH\u00c6\u0003J\t\u00104\u001a\u00020\u0005H\u00c6\u0003J\t\u00105\u001a\u00020\u0003H\u00c6\u0003Jw\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0003\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u000bH\u00c6\u0001J\u0013\u00107\u001a\u00020\u000b2\b\u00108\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00109\u001a\u00020\u0003H\u00d6\u0001J\t\u0010:\u001a\u00020\u0005H\u00d6\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014R\u001a\u0010\u000f\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u001d\"\u0004\b \u0010\u001fR\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0018\"\u0004\b\"\u0010\u001aR\u001a\u0010\u000e\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0012\"\u0004\b$\u0010\u0014R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0018\"\u0004\b&\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u0012\"\u0004\b(\u0010\u0014R\u001a\u0010\f\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0012\"\u0004\b*\u0010\u0014\u00a8\u0006;"}, d2 = {"Lcom/fivebb/shared/vos/TempPaymentVO;", "", "id", "", "bankName", "", "code", "status", "sortOrder", "imageUrl", "isMobileActive", "", "videoUrl", "logo", "packageName", "isChecked", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZLjava/lang/String;ILjava/lang/String;Z)V", "getBankName", "()Ljava/lang/String;", "setBankName", "(Ljava/lang/String;)V", "getCode", "setCode", "getId", "()I", "setId", "(I)V", "getImageUrl", "setImageUrl", "()Z", "setChecked", "(Z)V", "setMobileActive", "getLogo", "setLogo", "getPackageName", "setPackageName", "getSortOrder", "setSortOrder", "getStatus", "setStatus", "getVideoUrl", "setVideoUrl", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "shared_debug"})
public final class TempPaymentVO {
    private int id;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String bankName;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String code;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String status;
    private int sortOrder;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String imageUrl;
    private boolean isMobileActive;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String videoUrl;
    private int logo;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String packageName;
    private boolean isChecked;
    
    @org.jetbrains.annotations.NotNull()
    public final com.fivebb.shared.vos.TempPaymentVO copy(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String bankName, @org.jetbrains.annotations.NotNull()
    java.lang.String code, @org.jetbrains.annotations.NotNull()
    java.lang.String status, int sortOrder, @org.jetbrains.annotations.NotNull()
    java.lang.String imageUrl, boolean isMobileActive, @org.jetbrains.annotations.NotNull()
    java.lang.String videoUrl, @androidx.annotation.DrawableRes()
    int logo, @org.jetbrains.annotations.NotNull()
    java.lang.String packageName, boolean isChecked) {
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
    
    public TempPaymentVO() {
        super();
    }
    
    public TempPaymentVO(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String bankName, @org.jetbrains.annotations.NotNull()
    java.lang.String code, @org.jetbrains.annotations.NotNull()
    java.lang.String status, int sortOrder, @org.jetbrains.annotations.NotNull()
    java.lang.String imageUrl, boolean isMobileActive, @org.jetbrains.annotations.NotNull()
    java.lang.String videoUrl, @androidx.annotation.DrawableRes()
    int logo, @org.jetbrains.annotations.NotNull()
    java.lang.String packageName, boolean isChecked) {
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
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBankName() {
        return null;
    }
    
    public final void setBankName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCode() {
        return null;
    }
    
    public final void setCode(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatus() {
        return null;
    }
    
    public final void setStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int getSortOrder() {
        return 0;
    }
    
    public final void setSortOrder(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getImageUrl() {
        return null;
    }
    
    public final void setImageUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean component7() {
        return false;
    }
    
    public final boolean isMobileActive() {
        return false;
    }
    
    public final void setMobileActive(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getVideoUrl() {
        return null;
    }
    
    public final void setVideoUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int component9() {
        return 0;
    }
    
    public final int getLogo() {
        return 0;
    }
    
    public final void setLogo(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPackageName() {
        return null;
    }
    
    public final void setPackageName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean component11() {
        return false;
    }
    
    public final boolean isChecked() {
        return false;
    }
    
    public final void setChecked(boolean p0) {
    }
}