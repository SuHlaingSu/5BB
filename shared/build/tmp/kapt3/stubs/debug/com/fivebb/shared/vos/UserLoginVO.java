package com.fivebb.shared.vos;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J-\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0005H\u00d6\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b\u00a8\u0006\u0017"}, d2 = {"Lcom/fivebb/shared/vos/UserLoginVO;", "", "externalUserDetails", "Lcom/fivebb/shared/vos/ExternalUserDetailsVO;", "staffName", "", "token", "(Lcom/fivebb/shared/vos/ExternalUserDetailsVO;Ljava/lang/String;Ljava/lang/String;)V", "getExternalUserDetails", "()Lcom/fivebb/shared/vos/ExternalUserDetailsVO;", "getStaffName", "()Ljava/lang/String;", "getToken", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "shared_debug"})
public final class UserLoginVO {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "externalUserDetails")
    private final com.fivebb.shared.vos.ExternalUserDetailsVO externalUserDetails = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "staffName")
    private final java.lang.String staffName = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "token")
    private final java.lang.String token = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.fivebb.shared.vos.UserLoginVO copy(@org.jetbrains.annotations.Nullable()
    com.fivebb.shared.vos.ExternalUserDetailsVO externalUserDetails, @org.jetbrains.annotations.Nullable()
    java.lang.String staffName, @org.jetbrains.annotations.Nullable()
    java.lang.String token) {
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
    
    public UserLoginVO(@org.jetbrains.annotations.Nullable()
    com.fivebb.shared.vos.ExternalUserDetailsVO externalUserDetails, @org.jetbrains.annotations.Nullable()
    java.lang.String staffName, @org.jetbrains.annotations.Nullable()
    java.lang.String token) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.fivebb.shared.vos.ExternalUserDetailsVO component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.fivebb.shared.vos.ExternalUserDetailsVO getExternalUserDetails() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStaffName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getToken() {
        return null;
    }
}