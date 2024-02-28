package com.fivebb.selfcare.network.requests;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\nJ\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003JO\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010&\u001a\u00020\'H\u00d6\u0001J\t\u0010(\u001a\u00020\u0003H\u00d6\u0001R\u001e\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000eR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000e\u00a8\u0006)"}, d2 = {"Lcom/fivebb/selfcare/network/requests/TicketConfigurationRequest;", "", "masterSource", "", "ticketTypes", "ticketPriorities", "ticketStatus", "serviceTypes", "resolutionRootCategories", "cafNationality", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCafNationality", "()Ljava/lang/String;", "setCafNationality", "(Ljava/lang/String;)V", "getMasterSource", "setMasterSource", "getResolutionRootCategories", "setResolutionRootCategories", "getServiceTypes", "setServiceTypes", "getTicketPriorities", "setTicketPriorities", "getTicketStatus", "setTicketStatus", "getTicketTypes", "setTicketTypes", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "app_psrRelease"})
public final class TicketConfigurationRequest {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "masterSource")
    private java.lang.String masterSource;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "ticketTypes")
    private java.lang.String ticketTypes;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "ticketPriorities")
    private java.lang.String ticketPriorities;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "ticketStatus")
    private java.lang.String ticketStatus;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "serviceTypes")
    private java.lang.String serviceTypes;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "resolutionRootCategories")
    private java.lang.String resolutionRootCategories;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "cafNationality")
    private java.lang.String cafNationality;
    
    @org.jetbrains.annotations.NotNull()
    public final com.fivebb.selfcare.network.requests.TicketConfigurationRequest copy(@org.jetbrains.annotations.NotNull()
    java.lang.String masterSource, @org.jetbrains.annotations.NotNull()
    java.lang.String ticketTypes, @org.jetbrains.annotations.NotNull()
    java.lang.String ticketPriorities, @org.jetbrains.annotations.NotNull()
    java.lang.String ticketStatus, @org.jetbrains.annotations.NotNull()
    java.lang.String serviceTypes, @org.jetbrains.annotations.NotNull()
    java.lang.String resolutionRootCategories, @org.jetbrains.annotations.NotNull()
    java.lang.String cafNationality) {
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
    
    public TicketConfigurationRequest(@org.jetbrains.annotations.NotNull()
    java.lang.String masterSource, @org.jetbrains.annotations.NotNull()
    java.lang.String ticketTypes, @org.jetbrains.annotations.NotNull()
    java.lang.String ticketPriorities, @org.jetbrains.annotations.NotNull()
    java.lang.String ticketStatus, @org.jetbrains.annotations.NotNull()
    java.lang.String serviceTypes, @org.jetbrains.annotations.NotNull()
    java.lang.String resolutionRootCategories, @org.jetbrains.annotations.NotNull()
    java.lang.String cafNationality) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMasterSource() {
        return null;
    }
    
    public final void setMasterSource(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTicketTypes() {
        return null;
    }
    
    public final void setTicketTypes(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTicketPriorities() {
        return null;
    }
    
    public final void setTicketPriorities(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTicketStatus() {
        return null;
    }
    
    public final void setTicketStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getServiceTypes() {
        return null;
    }
    
    public final void setServiceTypes(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getResolutionRootCategories() {
        return null;
    }
    
    public final void setResolutionRootCategories(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCafNationality() {
        return null;
    }
    
    public final void setCafNationality(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
}