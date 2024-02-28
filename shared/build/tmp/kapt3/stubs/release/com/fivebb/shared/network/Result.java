package com.fivebb.shared.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0002\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007\u00a8\u0006\b"}, d2 = {"Lcom/fivebb/shared/network/Result;", "T", "", "()V", "Error", "Success", "Lcom/fivebb/shared/network/Result$Error;", "Lcom/fivebb/shared/network/Result$Success;", "shared_release"})
public abstract class Result<T extends java.lang.Object> {
    
    private Result() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\n\b\u0001\u0010\u0001 \u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00028\u0001\u00a2\u0006\u0002\u0010\u0005R\u0013\u0010\u0004\u001a\u00028\u0001\u00a2\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\t"}, d2 = {"Lcom/fivebb/shared/network/Result$Success;", "T", "", "Lcom/fivebb/shared/network/Result;", "data", "(Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "shared_release"})
    public static final class Success<T extends java.lang.Object> extends com.fivebb.shared.network.Result<T> {
        @org.jetbrains.annotations.NotNull()
        private final T data = null;
        
        public Success(@org.jetbrains.annotations.NotNull()
        T data) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final T getData() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/fivebb/shared/network/Result$Error;", "Lcom/fivebb/shared/network/Result;", "", "errorMessage", "", "(Ljava/lang/String;)V", "getErrorMessage", "()Ljava/lang/String;", "shared_release"})
    public static final class Error extends com.fivebb.shared.network.Result {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String errorMessage = null;
        
        public Error(@org.jetbrains.annotations.NotNull()
        java.lang.String errorMessage) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getErrorMessage() {
            return null;
        }
    }
}