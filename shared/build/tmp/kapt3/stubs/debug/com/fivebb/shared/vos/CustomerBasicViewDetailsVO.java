package com.fivebb.shared.vos;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u00a5\u0001\u0012\"\u0010\u0002\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\"\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0003j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b`\u0006\u0012\"\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\u0003j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n`\u0006\u0012\"\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u0003j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f`\u0006\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e\u00a2\u0006\u0002\u0010\u000fJ%\u0010\u001e\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005`\u0006H\u00c6\u0003J%\u0010\u001f\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0003j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b`\u0006H\u00c6\u0003J%\u0010 \u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\u0003j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n`\u0006H\u00c6\u0003J%\u0010!\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u0003j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f`\u0006H\u00c6\u0003J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000eH\u00c6\u0003J\u00b3\u0001\u0010#\u001a\u00020\u00002$\b\u0002\u0010\u0002\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005`\u00062$\b\u0002\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0003j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b`\u00062$\b\u0002\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\u0003j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n`\u00062$\b\u0002\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u0003j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f`\u00062\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000eH\u00c6\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\'\u001a\u00020(H\u00d6\u0001J\t\u0010)\u001a\u00020\u0004H\u00d6\u0001R:\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0003j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b`\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R:\u0010\u0002\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005`\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R&\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R:\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\u0003j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n`\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u0013R:\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u0003j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f`\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0011\"\u0004\b\u001d\u0010\u0013\u00a8\u0006*"}, d2 = {"Lcom/fivebb/shared/vos/CustomerBasicViewDetailsVO;", "", "customerAccountDetails", "Ljava/util/HashMap;", "", "Lcom/fivebb/shared/vos/CustomerAccountDetailsVO;", "Lkotlin/collections/HashMap;", "billingAccountDetails", "Lcom/fivebb/shared/vos/BillingAccountDetailsVO;", "serviceAccountDetails", "Lcom/fivebb/shared/vos/ServiceAccountDetailsVO;", "serviceInstanceDetails", "Lcom/fivebb/shared/vos/ServiceInstanceDetailsVO;", "notificationList", "", "(Ljava/util/HashMap;Ljava/util/HashMap;Ljava/util/HashMap;Ljava/util/HashMap;Ljava/util/List;)V", "getBillingAccountDetails", "()Ljava/util/HashMap;", "setBillingAccountDetails", "(Ljava/util/HashMap;)V", "getCustomerAccountDetails", "setCustomerAccountDetails", "getNotificationList", "()Ljava/util/List;", "setNotificationList", "(Ljava/util/List;)V", "getServiceAccountDetails", "setServiceAccountDetails", "getServiceInstanceDetails", "setServiceInstanceDetails", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "shared_debug"})
public final class CustomerBasicViewDetailsVO {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "customerAccountDetails")
    private java.util.HashMap<java.lang.String, com.fivebb.shared.vos.CustomerAccountDetailsVO> customerAccountDetails;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "billingAccountDetails")
    private java.util.HashMap<java.lang.String, com.fivebb.shared.vos.BillingAccountDetailsVO> billingAccountDetails;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "serviceAccountDetails")
    private java.util.HashMap<java.lang.String, com.fivebb.shared.vos.ServiceAccountDetailsVO> serviceAccountDetails;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "serviceInstanceDetails")
    private java.util.HashMap<java.lang.String, com.fivebb.shared.vos.ServiceInstanceDetailsVO> serviceInstanceDetails;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "notificationList")
    private java.util.List<java.lang.String> notificationList;
    
    @org.jetbrains.annotations.NotNull()
    public final com.fivebb.shared.vos.CustomerBasicViewDetailsVO copy(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, com.fivebb.shared.vos.CustomerAccountDetailsVO> customerAccountDetails, @org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, com.fivebb.shared.vos.BillingAccountDetailsVO> billingAccountDetails, @org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, com.fivebb.shared.vos.ServiceAccountDetailsVO> serviceAccountDetails, @org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, com.fivebb.shared.vos.ServiceInstanceDetailsVO> serviceInstanceDetails, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> notificationList) {
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
    
    public CustomerBasicViewDetailsVO(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, com.fivebb.shared.vos.CustomerAccountDetailsVO> customerAccountDetails, @org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, com.fivebb.shared.vos.BillingAccountDetailsVO> billingAccountDetails, @org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, com.fivebb.shared.vos.ServiceAccountDetailsVO> serviceAccountDetails, @org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, com.fivebb.shared.vos.ServiceInstanceDetailsVO> serviceInstanceDetails, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> notificationList) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.HashMap<java.lang.String, com.fivebb.shared.vos.CustomerAccountDetailsVO> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.HashMap<java.lang.String, com.fivebb.shared.vos.CustomerAccountDetailsVO> getCustomerAccountDetails() {
        return null;
    }
    
    public final void setCustomerAccountDetails(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, com.fivebb.shared.vos.CustomerAccountDetailsVO> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.HashMap<java.lang.String, com.fivebb.shared.vos.BillingAccountDetailsVO> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.HashMap<java.lang.String, com.fivebb.shared.vos.BillingAccountDetailsVO> getBillingAccountDetails() {
        return null;
    }
    
    public final void setBillingAccountDetails(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, com.fivebb.shared.vos.BillingAccountDetailsVO> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.HashMap<java.lang.String, com.fivebb.shared.vos.ServiceAccountDetailsVO> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.HashMap<java.lang.String, com.fivebb.shared.vos.ServiceAccountDetailsVO> getServiceAccountDetails() {
        return null;
    }
    
    public final void setServiceAccountDetails(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, com.fivebb.shared.vos.ServiceAccountDetailsVO> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.HashMap<java.lang.String, com.fivebb.shared.vos.ServiceInstanceDetailsVO> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.HashMap<java.lang.String, com.fivebb.shared.vos.ServiceInstanceDetailsVO> getServiceInstanceDetails() {
        return null;
    }
    
    public final void setServiceInstanceDetails(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, com.fivebb.shared.vos.ServiceInstanceDetailsVO> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getNotificationList() {
        return null;
    }
    
    public final void setNotificationList(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> p0) {
    }
}