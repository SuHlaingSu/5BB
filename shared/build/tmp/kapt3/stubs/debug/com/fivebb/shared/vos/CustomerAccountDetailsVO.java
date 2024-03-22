package com.fivebb.shared.vos;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\bl\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0089\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u001dJ\u000b\u0010T\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u00c1\u0002\u0010n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010o\u001a\u00020p2\b\u0010q\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010r\u001a\u00020sH\u00d6\u0001J\t\u0010t\u001a\u00020\u0003H\u00d6\u0001R \u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R \u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001f\"\u0004\b#\u0010!R \u0010\r\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001f\"\u0004\b%\u0010!R \u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001f\"\u0004\b\'\u0010!R \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001f\"\u0004\b)\u0010!R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u001f\"\u0004\b+\u0010!R \u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001f\"\u0004\b-\u0010!R \u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001f\"\u0004\b/\u0010!R \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u001f\"\u0004\b1\u0010!R \u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u001f\"\u0004\b3\u0010!R \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u001f\"\u0004\b5\u0010!R \u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u001f\"\u0004\b7\u0010!R \u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u001f\"\u0004\b9\u0010!R \u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u001f\"\u0004\b;\u0010!R \u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u001f\"\u0004\b=\u0010!R \u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u001f\"\u0004\b?\u0010!R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u001f\"\u0004\bA\u0010!R \u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u001f\"\u0004\bC\u0010!R \u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u001f\"\u0004\bE\u0010!R \u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u001f\"\u0004\bG\u0010!R \u0010\f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bH\u0010\u001f\"\u0004\bI\u0010!R \u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010\u001f\"\u0004\bK\u0010!R \u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\u001f\"\u0004\bM\u0010!R \u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bN\u0010\u001f\"\u0004\bO\u0010!R \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bP\u0010\u001f\"\u0004\bQ\u0010!R \u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bR\u0010\u001f\"\u0004\bS\u0010!\u00a8\u0006u"}, d2 = {"Lcom/fivebb/shared/vos/CustomerAccountDetailsVO;", "", "customerAccountNumber", "", "name", "title", "dateOfBirth", "gender", "creationDate", "status", "emailAddress", "multipleEmailAddress", "registeredMobileNumber", "billingArea", "customerCategory", "geoId", "userName", "partnerAccountNumber", "organizationId", "address", "secretQuestion", "secretAnswer", "mobileNumber", "multipleMobileNumber", "customerAccountNumberId", "billAddCompanyName", "regNo", "businessType", "lco", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "getBillAddCompanyName", "setBillAddCompanyName", "getBillingArea", "setBillingArea", "getBusinessType", "setBusinessType", "getCreationDate", "setCreationDate", "getCustomerAccountNumber", "setCustomerAccountNumber", "getCustomerAccountNumberId", "setCustomerAccountNumberId", "getCustomerCategory", "setCustomerCategory", "getDateOfBirth", "setDateOfBirth", "getEmailAddress", "setEmailAddress", "getGender", "setGender", "getGeoId", "setGeoId", "getLco", "setLco", "getMobileNumber", "setMobileNumber", "getMultipleEmailAddress", "setMultipleEmailAddress", "getMultipleMobileNumber", "setMultipleMobileNumber", "getName", "setName", "getOrganizationId", "setOrganizationId", "getPartnerAccountNumber", "setPartnerAccountNumber", "getRegNo", "setRegNo", "getRegisteredMobileNumber", "setRegisteredMobileNumber", "getSecretAnswer", "setSecretAnswer", "getSecretQuestion", "setSecretQuestion", "getStatus", "setStatus", "getTitle", "setTitle", "getUserName", "setUserName", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "shared_debug"})
public final class CustomerAccountDetailsVO {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "customerAccountNumber")
    private java.lang.String customerAccountNumber;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "name")
    private java.lang.String name;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "title")
    private java.lang.String title;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "dateOfBirth")
    private java.lang.String dateOfBirth;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "gender")
    private java.lang.String gender;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "creationDate")
    private java.lang.String creationDate;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "status")
    private java.lang.String status;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "emailAddress")
    private java.lang.String emailAddress;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "multipleEmailAddress")
    private java.lang.String multipleEmailAddress;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "registeredMobileNumber")
    private java.lang.String registeredMobileNumber;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "billingArea")
    private java.lang.String billingArea;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "customerCategory")
    private java.lang.String customerCategory;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "geoId")
    private java.lang.String geoId;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "userName")
    private java.lang.String userName;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "partnerAccountNumber")
    private java.lang.String partnerAccountNumber;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "organizationId")
    private java.lang.String organizationId;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "address")
    private java.lang.String address;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "secretQuestion")
    private java.lang.String secretQuestion;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "secretAnswer")
    private java.lang.String secretAnswer;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "mobileNumber")
    private java.lang.String mobileNumber;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "multipleMobileNumber")
    private java.lang.String multipleMobileNumber;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "customerAccountNumberId")
    private java.lang.String customerAccountNumberId;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "billAddCompanyName")
    private java.lang.String billAddCompanyName;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "regNo")
    private java.lang.String regNo;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "businessType")
    private java.lang.String businessType;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "lco")
    private java.lang.String lco;
    
    @org.jetbrains.annotations.NotNull()
    public final com.fivebb.shared.vos.CustomerAccountDetailsVO copy(@org.jetbrains.annotations.Nullable()
    java.lang.String customerAccountNumber, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.String dateOfBirth, @org.jetbrains.annotations.Nullable()
    java.lang.String gender, @org.jetbrains.annotations.Nullable()
    java.lang.String creationDate, @org.jetbrains.annotations.Nullable()
    java.lang.String status, @org.jetbrains.annotations.Nullable()
    java.lang.String emailAddress, @org.jetbrains.annotations.Nullable()
    java.lang.String multipleEmailAddress, @org.jetbrains.annotations.Nullable()
    java.lang.String registeredMobileNumber, @org.jetbrains.annotations.Nullable()
    java.lang.String billingArea, @org.jetbrains.annotations.Nullable()
    java.lang.String customerCategory, @org.jetbrains.annotations.Nullable()
    java.lang.String geoId, @org.jetbrains.annotations.Nullable()
    java.lang.String userName, @org.jetbrains.annotations.Nullable()
    java.lang.String partnerAccountNumber, @org.jetbrains.annotations.Nullable()
    java.lang.String organizationId, @org.jetbrains.annotations.Nullable()
    java.lang.String address, @org.jetbrains.annotations.Nullable()
    java.lang.String secretQuestion, @org.jetbrains.annotations.Nullable()
    java.lang.String secretAnswer, @org.jetbrains.annotations.Nullable()
    java.lang.String mobileNumber, @org.jetbrains.annotations.Nullable()
    java.lang.String multipleMobileNumber, @org.jetbrains.annotations.Nullable()
    java.lang.String customerAccountNumberId, @org.jetbrains.annotations.Nullable()
    java.lang.String billAddCompanyName, @org.jetbrains.annotations.Nullable()
    java.lang.String regNo, @org.jetbrains.annotations.Nullable()
    java.lang.String businessType, @org.jetbrains.annotations.Nullable()
    java.lang.String lco) {
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
    
    public CustomerAccountDetailsVO(@org.jetbrains.annotations.Nullable()
    java.lang.String customerAccountNumber, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.String dateOfBirth, @org.jetbrains.annotations.Nullable()
    java.lang.String gender, @org.jetbrains.annotations.Nullable()
    java.lang.String creationDate, @org.jetbrains.annotations.Nullable()
    java.lang.String status, @org.jetbrains.annotations.Nullable()
    java.lang.String emailAddress, @org.jetbrains.annotations.Nullable()
    java.lang.String multipleEmailAddress, @org.jetbrains.annotations.Nullable()
    java.lang.String registeredMobileNumber, @org.jetbrains.annotations.Nullable()
    java.lang.String billingArea, @org.jetbrains.annotations.Nullable()
    java.lang.String customerCategory, @org.jetbrains.annotations.Nullable()
    java.lang.String geoId, @org.jetbrains.annotations.Nullable()
    java.lang.String userName, @org.jetbrains.annotations.Nullable()
    java.lang.String partnerAccountNumber, @org.jetbrains.annotations.Nullable()
    java.lang.String organizationId, @org.jetbrains.annotations.Nullable()
    java.lang.String address, @org.jetbrains.annotations.Nullable()
    java.lang.String secretQuestion, @org.jetbrains.annotations.Nullable()
    java.lang.String secretAnswer, @org.jetbrains.annotations.Nullable()
    java.lang.String mobileNumber, @org.jetbrains.annotations.Nullable()
    java.lang.String multipleMobileNumber, @org.jetbrains.annotations.Nullable()
    java.lang.String customerAccountNumberId, @org.jetbrains.annotations.Nullable()
    java.lang.String billAddCompanyName, @org.jetbrains.annotations.Nullable()
    java.lang.String regNo, @org.jetbrains.annotations.Nullable()
    java.lang.String businessType, @org.jetbrains.annotations.Nullable()
    java.lang.String lco) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCustomerAccountNumber() {
        return null;
    }
    
    public final void setCustomerAccountNumber(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDateOfBirth() {
        return null;
    }
    
    public final void setDateOfBirth(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getGender() {
        return null;
    }
    
    public final void setGender(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCreationDate() {
        return null;
    }
    
    public final void setCreationDate(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStatus() {
        return null;
    }
    
    public final void setStatus(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEmailAddress() {
        return null;
    }
    
    public final void setEmailAddress(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMultipleEmailAddress() {
        return null;
    }
    
    public final void setMultipleEmailAddress(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRegisteredMobileNumber() {
        return null;
    }
    
    public final void setRegisteredMobileNumber(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBillingArea() {
        return null;
    }
    
    public final void setBillingArea(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCustomerCategory() {
        return null;
    }
    
    public final void setCustomerCategory(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getGeoId() {
        return null;
    }
    
    public final void setGeoId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUserName() {
        return null;
    }
    
    public final void setUserName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPartnerAccountNumber() {
        return null;
    }
    
    public final void setPartnerAccountNumber(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOrganizationId() {
        return null;
    }
    
    public final void setOrganizationId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAddress() {
        return null;
    }
    
    public final void setAddress(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSecretQuestion() {
        return null;
    }
    
    public final void setSecretQuestion(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSecretAnswer() {
        return null;
    }
    
    public final void setSecretAnswer(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMobileNumber() {
        return null;
    }
    
    public final void setMobileNumber(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component21() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMultipleMobileNumber() {
        return null;
    }
    
    public final void setMultipleMobileNumber(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component22() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCustomerAccountNumberId() {
        return null;
    }
    
    public final void setCustomerAccountNumberId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component23() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBillAddCompanyName() {
        return null;
    }
    
    public final void setBillAddCompanyName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component24() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRegNo() {
        return null;
    }
    
    public final void setRegNo(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component25() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBusinessType() {
        return null;
    }
    
    public final void setBusinessType(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component26() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLco() {
        return null;
    }
    
    public final void setLco(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
}