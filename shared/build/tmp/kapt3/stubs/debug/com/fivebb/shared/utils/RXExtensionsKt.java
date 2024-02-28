package com.fivebb.shared.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u00000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000e\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004\u001a4\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\tH\u0002\u001aB\u0010\u000b\u001a\u00020\u0006\"\u0004\b\u0000\u0010\f*\n\u0012\u0004\u0012\u0002H\f\u0018\u00010\r2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u00020\u00060\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\tH\u0002\u001a:\u0010\u000e\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00070\u000f2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\tH\u0007\u001aP\u0010\u0010\u001a\u00020\u0006\"\u000e\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\u00110\r\"\u0004\b\u0001\u0010\u0011*\b\u0012\u0004\u0012\u0002H\f0\u000f2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u00020\u00060\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\tH\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"ERROR_MESSAGE_NO_CONNECTION", "", "extractMessage", "t", "", "processBaseResponse", "", "Lcom/fivebb/shared/network/responses/BaseResponse;", "success", "Lkotlin/Function1;", "failure", "processDataResponse", "T", "Lcom/fivebb/shared/network/responses/DataResponse;", "subscribeBaseResponse", "Lio/reactivex/Observable;", "subscribeDataResponse", "W", "shared_debug"})
public final class RXExtensionsKt {
    private static final java.lang.String ERROR_MESSAGE_NO_CONNECTION = "Please Check Internet Connection";
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    public static final <T extends com.fivebb.shared.network.responses.DataResponse<W>, W extends java.lang.Object>void subscribeDataResponse(@org.jetbrains.annotations.NotNull()
    io.reactivex.Observable<T> $this$subscribeDataResponse, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super W, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure) {
    }
    
    private static final <T extends java.lang.Object>void processDataResponse(com.fivebb.shared.network.responses.DataResponse<T> $this$processDataResponse, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> success, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String extractMessage(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable t) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    public static final void subscribeBaseResponse(@org.jetbrains.annotations.NotNull()
    io.reactivex.Observable<com.fivebb.shared.network.responses.BaseResponse> $this$subscribeBaseResponse, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure) {
    }
    
    private static final void processBaseResponse(com.fivebb.shared.network.responses.BaseResponse $this$processBaseResponse, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> success, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure) {
    }
}