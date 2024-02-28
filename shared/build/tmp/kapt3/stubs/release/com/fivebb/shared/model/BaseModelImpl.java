package com.fivebb.shared.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0011\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0084 J\u0011\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0084 J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0004J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0011\u0010\u0014\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0084 J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0011\u0010\u0019\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0084 R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0004X\u0084D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u001b"}, d2 = {"Lcom/fivebb/shared/model/BaseModelImpl;", "Lcom/fivebb/shared/model/BaseModel;", "()V", "ERROR_MSG_IO_EXCEPTION", "", "ERROR_MSG_JSON_PARSING_EXCEPTION", "UNDEFINED_MESSAGE", "getUNDEFINED_MESSAGE", "()Ljava/lang/String;", "appId", "buildType", "baseUrl", "flavor", "errorMessage", "it", "", "getTextPlainOriginRequestBody", "Lokhttp3/RequestBody;", "value", "getThrowableErrorMessage", "imageBaseUrl", "init", "", "context", "Landroid/content/Context;", "secretKey", "Companion", "shared_release"})
public abstract class BaseModelImpl implements com.fivebb.shared.model.BaseModel {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String UNDEFINED_MESSAGE = "Undefined message. Error message is null";
    private final java.lang.String ERROR_MSG_JSON_PARSING_EXCEPTION = "Can\'t parse error message. #JSONException";
    private final java.lang.String ERROR_MSG_IO_EXCEPTION = "Can\'t parse error message. #IOException";
    @org.jetbrains.annotations.NotNull()
    public static final com.fivebb.shared.model.BaseModelImpl.Companion Companion = null;
    
    public BaseModelImpl() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final java.lang.String getUNDEFINED_MESSAGE() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final native java.lang.String appId(@org.jetbrains.annotations.NotNull()
    java.lang.String buildType) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final native java.lang.String secretKey(@org.jetbrains.annotations.NotNull()
    java.lang.String buildType) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final native java.lang.String baseUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String flavor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final native java.lang.String imageBaseUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String flavor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final okhttp3.RequestBody getTextPlainOriginRequestBody(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String errorMessage(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable it) {
        return null;
    }
    
    private final java.lang.String getThrowableErrorMessage(java.lang.Throwable it) {
        return null;
    }
    
    @java.lang.Override()
    public void init(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/fivebb/shared/model/BaseModelImpl$Companion;", "", "()V", "shared_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}