package com.fivebb.shared.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\bl\n\u0002\u0010 \n\u0002\b\u0012\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\bQ\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0007\u0010\u00dd\u0001\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\nX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\nX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\nX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\nX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020\nX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010L\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010M\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010N\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010O\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010P\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010Q\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010R\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010S\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010T\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010U\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010V\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010W\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010X\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010Y\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010Z\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010[\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\\\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010]\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010^\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010_\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010`\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010a\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010c\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010d\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010g\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010h\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010i\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010j\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010k\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010l\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010m\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010o\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010p\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010q\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010s\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010u\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0017\u0010v\u001a\b\u0012\u0004\u0012\u00020\u00040w\u00a2\u0006\b\n\u0000\u001a\u0004\bx\u0010yR\u000e\u0010z\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010{\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010|\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010}\u001a\u00020\nX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010~\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u007f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u0080\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u0081\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u0082\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u0083\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u0084\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u0085\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u0086\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u0087\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u0088\u0001\u001a\u00020\nX\u0086T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0089\u0001\u001a\u00030\u008a\u0001X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u008b\u0001\u001a\u00020\nX\u0086T\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u008c\u0001\u001a\t\u0012\u0004\u0012\u00020\u00040\u008d\u0001\u00a2\u0006\r\n\u0003\u0010\u0090\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R\u000f\u0010\u0091\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u0092\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u0093\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u0094\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u0095\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u0096\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u0097\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u0098\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u0099\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u009a\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u009b\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u009c\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u009d\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u009e\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u009f\u0001\u001a\u00030\u008a\u0001X\u0086T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u00a0\u0001\u001a\u00030\u008a\u0001X\u0086T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u00a1\u0001\u001a\u00030\u008a\u0001X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00a2\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00a3\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00a4\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00a5\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00a6\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00a7\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00a8\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00a9\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00aa\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00ab\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00ac\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00ad\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00ae\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00af\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00b0\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00b1\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00b2\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u00b3\u0001\u001a\u00030\u008a\u0001X\u0086T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u00b4\u0001\u001a\u00030\u008a\u0001X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00b5\u0001\u001a\u00020\nX\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00b6\u0001\u001a\u00020\nX\u0086T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u00b7\u0001\u001a\u00030\u008a\u0001X\u0086T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u00b8\u0001\u001a\u00030\u008a\u0001X\u0086T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u00b9\u0001\u001a\u00030\u008a\u0001X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00ba\u0001\u001a\u00020\nX\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00bb\u0001\u001a\u00020\nX\u0086T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u00bc\u0001\u001a\u00030\u008a\u0001X\u0086T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u00bd\u0001\u001a\u00030\u008a\u0001X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00be\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00bf\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00c0\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00c1\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00c2\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00c3\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00c4\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00c5\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00c6\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00c7\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00c8\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00c9\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00ca\u0001\u001a\u00020\nX\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00cb\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00cc\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00cd\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00ce\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00cf\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00d0\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00d1\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00d2\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00d3\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00d4\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00d5\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00d6\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00d7\u0001\u001a\u00020\nX\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00d8\u0001\u001a\u00020\nX\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00d9\u0001\u001a\u00020\nX\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00da\u0001\u001a\u00020\nX\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00db\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00dc\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u00de\u0001"}, d2 = {"Lcom/fivebb/shared/utils/SharedConstants;", "", "()V", "ACTIVATION", "", "APP_ID", "APP_VERSION_TAG", "ASCII_CHARACTARS", "AUTHORIZATION_HEADER", "AYA_BANK", "", "BANK_ACCOUNT_TYPE_SAVING", "BILL_STATUS_FULLY_PAID", "BILL_STATUS_PARTIALLY_PAID", "BILL_STATUS_UNPAID", "CALL_TYPE_BLOCKED_TYPE", "CALL_TYPE_INCOMING_TYPE", "CALL_TYPE_MISSED_TYPE", "CALL_TYPE_OUTGOING_TYPE", "CALL_TYPE_REJECTED_TYPE", "CALL_TYPE_VOICEMAIL_TYPE", "CAPTURED_VIDEO_URI", "CATEGORY_BUSINESS", "CATEGORY_FAMILY", "CATEGORY_PREPAID", "CATEGORY_QUOTA", "CATEGORY_SPEED", "CB_BANK", "CONSTANT_CONTINUE", "CONSTANT_RETRY", "CRASHLYTICS_PRIORITY_1", "CRASHLYTICS_PRIORITY_10", "CREDO_APP_INITIATING", "CROP_IMAGE_REQUEST_CODE", "DEFAULT_FROM_DATE", "DESTINATION_PATH", "EMAIL_REQUEST_CODE", "ENCODING_UTF_8", "E_LOAN", "FACEBOOK_USER_COVER", "FACEBOOK_USER_COVER_SOURCE", "FACEBOOK_USER_EMAIL", "FACEBOOK_USER_FIRST_NAME", "FACEBOOK_USER_ID", "FACEBOOK_USER_LAST_NAME", "FACEBOOK_USER_PICTURE", "FIREBASE_DEFAULT_PHOTO_STORAGE_PATH", "FORM10_RELATION_HAVE_FILLED", "FORMAT_DATE_D_MMMM_YYYY", "FORMAT_DATE_D_M_Y", "FORMAT_DATE_M_D_Y", "FORMAT_DATE_M_D_Y_HH_mm", "FORMAT_DATE_M_D_Y_HH_mm_ss", "FORMAT_DATE_M_D_Y_T_HH_mm_ss", "FORMAT_DATE_YYYY_MM_DD", "FORMAT_DATE_Y_M_D", "FORMAT_TIME_HH_MM", "FORMAT_TIME_HH_MM_SS", "GALLY_REQUEST_CODE", "HEADER_ACCEPT", "HEADER_APP_ID", "HEADER_APP_VERSION", "HEADER_AUTHORIZATION", "HEADER_CONTENT_TYPE", "HEADER_SECRET_KEY", "HELP_FORM", "INIT_CALL_DATA_UPLOADED", "JSON_HELP_CENTER", "JSON_VERSION_CODE", "KBZ_BANK", "KEYWORD_ACTIVE_CONTACT_RATIO", "KEYWORD_AMOUNT_OF_DATA_USAGE", "KEYWORD_AVERAGE_TOP_UP_AMOUNT", "KEYWORD_BATTERY_CHARGING", "KEYWORD_BATTERY_CHARGING_FREQUENCY", "KEYWORD_CONNECTED_WIFI_OPERATOR", "KEYWORD_DATA_USAGE_PER_WEEK_MOBILE_IN_BYTES", "KEYWORD_DATA_USAGE_PER_WEEK_WIFI_IN_BYTES", "KEYWORD_DEVICE_BRAND", "KEYWORD_DEVICE_ID", "KEYWORD_DEVICE_MODEL", "KEYWORD_FACEBOOK_COVER_PHOTO", "KEYWORD_FACEBOOK_EMAIL", "KEYWORD_FACEBOOK_ID", "KEYWORD_FACEBOOK_NAME", "KEYWORD_FACEBOOK_PROFILE_IMAGE", "KEYWORD_INCOMING_CALLS_FREQUENCY_PER_DAY", "KEYWORD_INCOMING_CALLS_FREQUENCY_PER_WEEK", "KEYWORD_INCOMING_SMS_FREQUENCY_PER_DAY", "KEYWORD_INCOMING_SMS_FREQUENCY_PER_WEEK", "KEYWORD_MOSTLY_CONNECTED_WIFI_OPERATORS", "KEYWORD_MOSTLY_FREQUENTLY_CONTACTED_PERSON_10", "KEYWORD_MOSTLY_VISITED_PLACES_OFFICE_LOCATION", "KEYWORD_MOST_CONTACTED_PERSON", "KEYWORD_MOST_FREQUENTLY_USED_APP_10", "KEYWORD_MOST_FREQUENT_APP", "KEYWORD_MOST_VISITED_PLACE", "KEYWORD_NETWORK_OPERATOR", "KEYWORD_NUMBER_OF_CONTACTS", "KEYWORD_NUMBER_OF_CONTACTS_ADDRESS", "KEYWORD_OS_VERSION", "KEYWORD_OUTGOING_CALLS_FREQUENCY_PER_DAY", "KEYWORD_OUTGOING_CALLS_FREQUENCY_PER_WEEK", "KEYWORD_OUTGOING_SMS_FREQUENCY_PER_DAY", "KEYWORD_OUTGOING_SMS_FREQUENCY_PER_WEEK", "KEYWORD_REGISTRATION_ID", "KEYWORD_REGULAR_CONTACT", "KEYWORD_THE_FREQUENCY_OF_THE_CALLS", "KEYWORD_THE_USUAL_COMMUTE_TIME", "KEYWORD_TOP_UP_FREQUENCY_PER_MONTH", "KEYWORD_USER_IS_COMMUTING", "KEYWORD_WIFI_CONNECTED", "KEYWORD_WIFI_CONNECTIVITY_FREQUENCY", "KEY_DONT_SHOW_MAIN_DIALOG_AGAIN", "MEDIA_TYPE_IMAGE", "MEDIA_TYPE_M3U8", "MEDIA_TYPE_MP4", "MERCHANT_ID_LIVE_SERVER", "MONTHS", "", "getMONTHS", "()Ljava/util/List;", "MSG_APPLY_LOAN_DIALOG", "MSG_INVALID_IMAGE", "MSG_NO_SECRET_QUESTION", "NOT_WANT_LOAN_IMMEDIATELY", "NO_INTERNET_RETRY", "NUMBER_EIGHT_MM", "NUMBER_FIVE_MM", "NUMBER_FOUR_MM", "NUMBER_NINE_MM", "NUMBER_ONE_MM", "NUMBER_SEVEN_MM", "NUMBER_SIX_MM", "NUMBER_THREE_MM", "NUMBER_TWO_MM", "OK_DOLLAR", "ONE_DAY_MILITIME", "", "PASSWORD_LENGHT", "PHONE_SMS_NUMBER", "", "getPHONE_SMS_NUMBER", "()[Ljava/lang/String;", "[Ljava/lang/String;", "PICK_IMAGE_REQUEST_CODE", "PLAN_CHANGE", "PLAN_CHANGE_FORM", "PLATFORM", "PREF_DONT_SHOW_MAIN_DIALOG_AGAIN", "PSYCHOMETRIC_ANSWER_LAST_SCREEN_REACHED", "QUESTION_TYPE_CHECK_BOK", "QUESTION_TYPE_RADIO", "QUESTION_TYPE_TEXT", "RELOCATION", "RELOCATION_FORM", "REQUEST_TYPE_FORM_X_WWW_URL_ENCODED", "REQUEST_TYPE_JSON", "REQUEST_TYPE_MULTIPART_FORM_DATA", "SCHEDULER_LOCATION_SAVE_TIME", "SCHEDULER_TIME", "SCHEDULER_TIME_12HOURS", "SELECTED_LANGUAGE", "SELECTED_LANGUAGE_EN", "SELECTED_LANGUAGE_MY", "SERVER_DEFAULT_DATE_FORMAT", "SERVICE_APP_USAGE_DATA_UPLOAD_SERVICE_STARTED", "SERVICE_CALL_DATA_UPLOAD_STARTED", "SERVICE_IS_BACKGROUND_TRACK_STARTED", "SERVICE_LOCATION_DATA_UPLOAD_SERVICE_STARTED", "SERVICE_SMS_DATA_UPLOAD_SERVICE_STARTED", "SERVICE_TYPE_FTTH", "SERVICE_TYPE_LTE", "SMS_TYPE_DRAFT", "SMS_TYPE_FAILED", "SMS_TYPE_INBOX", "SMS_TYPE_OUTBOX", "SMS_TYPE_QUEUED", "SMS_TYPE_SENT", "SYNC_INTERVAL_FOR_AMOUNT_OF_USAGE_DATA", "SYNC_INTERVAL_FOR_BATTERY", "SYNC_INTERVAL_FOR_CALL_DETAIL", "SYNC_INTERVAL_FOR_CALL_LOG", "SYNC_INTERVAL_FOR_COMMUTE", "SYNC_INTERVAL_FOR_LOCATION", "SYNC_INTERVAL_FOR_MOST_USED_APP", "SYNC_INTERVAL_FOR_REGULAR_CONTACT", "SYNC_INTERVAL_FOR_SMS", "SYNC_INTERVAL_FOR_TOPUP", "SYNC_INTERVAL_FOR_WIFI", "SYNC_SERVICE_STARTED", "TEMP_BANK_NAME_AYA", "TEMP_BANK_NAME_AYA_FORMAL", "TEMP_BANK_NAME_CB", "TEMP_BANK_NAME_CB_FORMAL", "TEMP_BANK_NAME_KBZ", "TEMP_BANK_NAME_KBZ_FORMAL", "TEMP_BANK_NAME_YOMA", "TEMP_BANK_NAME_YOMA_FORMAL", "TICKET", "TICKET_FORM", "TODAY_DATE_FORMAT_YYYYMMDD", "TRUE_MONEY", "UAT_AMOUNT", "UAT_CURRENCY_CODE", "UAT_HASH_CODE", "UAT_INVOICE_NO", "UAT_MERCHANT_ID", "UAT_PRODUCT_DESC", "UAT_USER_DEFINED_1", "UAT_USER_DEFINED_2", "UAT_USER_DEFINED_3", "UNAUTHORIZED_REQUEST", "UNDEFINED", "UPLOAD_VIDEO_URL", "WANT_LOAN_AT_START_OF_NEXT_MONTH", "WANT_LOAN_IMMEDIATELY", "WAVE_MONEY", "YOMA_BANK", "ZERO_COUNT_16", "ZERO_COUNT_20", "getBasicAuthToken", "shared_debug"})
public final class SharedConstants {
    @org.jetbrains.annotations.NotNull()
    public static final com.fivebb.shared.utils.SharedConstants INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String APP_ID = "5BB";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FORMAT_DATE_Y_M_D = "yyyy/MM/dd";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FORMAT_DATE_D_M_Y = "dd/MM/yyyy";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FORMAT_DATE_M_D_Y = "MMM dd yyyy";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FORMAT_DATE_M_D_Y_HH_mm = "MMM dd yyyy HH:mm";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FORMAT_DATE_D_MMMM_YYYY = "d MMMM yyyy";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FORMAT_DATE_YYYY_MM_DD = "yyyy-MM-dd";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FORMAT_DATE_M_D_Y_HH_mm_ss = "yyyy/MM/dd HH:mm:ss";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FORMAT_DATE_M_D_Y_T_HH_mm_ss = "yyyy-MM-dd\'T\'HH:mm:ss";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FORMAT_TIME_HH_MM = "hh:mm";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FORMAT_TIME_HH_MM_SS = "hh:mm:ss";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String QUESTION_TYPE_CHECK_BOK = "check_box";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String QUESTION_TYPE_RADIO = "radio";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String QUESTION_TYPE_TEXT = "text";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CONSTANT_CONTINUE = "continue";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CONSTANT_RETRY = "retry";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PICK_IMAGE_REQUEST_CODE = "100";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String GALLY_REQUEST_CODE = "200";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CROP_IMAGE_REQUEST_CODE = "300";
    public static final int EMAIL_REQUEST_CODE = 400;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String APP_VERSION_TAG = "android";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SELECTED_LANGUAGE = "SELECTED_LANGUAGE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SELECTED_LANGUAGE_MY = "my";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SELECTED_LANGUAGE_EN = "en";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String AUTHORIZATION_HEADER = "Bearer";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String HEADER_ACCEPT = "Accept";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String HEADER_CONTENT_TYPE = "Content-Type";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String HEADER_APP_VERSION = "app-version";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String REQUEST_TYPE_JSON = "application/json";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String REQUEST_TYPE_FORM_X_WWW_URL_ENCODED = "application/x-www-form-urlencoded";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String REQUEST_TYPE_MULTIPART_FORM_DATA = "multipart/form-data";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String HEADER_APP_ID = "app-id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String HEADER_SECRET_KEY = "secret-key";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String HEADER_AUTHORIZATION = "Authorization";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SERVICE_IS_BACKGROUND_TRACK_STARTED = "SERVICE_IS_BACKGROUND_TRACK_STARTED";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SERVICE_CALL_DATA_UPLOAD_STARTED = "CALL_DATA_UPLOAD_SERVICE_STARTED";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SERVICE_SMS_DATA_UPLOAD_SERVICE_STARTED = "SMS_DATA_UPLOAD_SERVICE_STARTED";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SERVICE_LOCATION_DATA_UPLOAD_SERVICE_STARTED = "LOCATION_DATA_UPLOAD_SERVICE_STARTED";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SYNC_SERVICE_STARTED = "SYNC_SERVICE_STARTED";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SERVICE_APP_USAGE_DATA_UPLOAD_SERVICE_STARTED = "SERVICE_APP_USAGE_DATA_UPLOAD_SERVICE_STARTED";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PSYCHOMETRIC_ANSWER_LAST_SCREEN_REACHED = "PSYCHOMETRIC_ANSWER_LAST_SCREEN_REACHED";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FORM10_RELATION_HAVE_FILLED = "FORM10_RELATION_HAVE_FILLED";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String INIT_CALL_DATA_UPLOADED = "INIT_CALL_DATA_UPLOADED";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CREDO_APP_INITIATING = "CREDO_APP_INITIATING";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEYWORD_DEVICE_ID = "DEVICE_ID";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEYWORD_REGISTRATION_ID = "REGISTRATION_ID";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEYWORD_DEVICE_BRAND = "DEVICE_BRAND";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEYWORD_DEVICE_MODEL = "DEVICE_MODEL";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEYWORD_OS_VERSION = "OS_VERSION";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEYWORD_NETWORK_OPERATOR = "NETWORK_OPERATOR";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEYWORD_NUMBER_OF_CONTACTS = "NUMBER_OF_CONTACTS";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEYWORD_NUMBER_OF_CONTACTS_ADDRESS = "NUMBER_OF_CONTACTS_ADDRESS";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEYWORD_MOST_CONTACTED_PERSON = "MOST_CONTACTED_PERSON";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEYWORD_MOSTLY_FREQUENTLY_CONTACTED_PERSON_10 = "MOSTLY_FREQUENTLY_CONTACTED_PERSON_10";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEYWORD_ACTIVE_CONTACT_RATIO = "ACTIVE_CONTACT_RATIO";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEYWORD_WIFI_CONNECTIVITY_FREQUENCY = "WIFI_CONNECTIVITY_FREQUENCY";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEYWORD_WIFI_CONNECTED = "WIFI_CONNECTED";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEYWORD_MOSTLY_CONNECTED_WIFI_OPERATORS = "MOSTLY_CONNECTED_WIFI_OPERATORS";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEYWORD_CONNECTED_WIFI_OPERATOR = "CONNECTED_WIFI_OPERATOR";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEYWORD_AMOUNT_OF_DATA_USAGE = "AMOUNT_OF_DATA_USAGE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEYWORD_DATA_USAGE_PER_WEEK_MOBILE_IN_BYTES = "DATA_USAGE_PER_WEEK_MOBILE_IN_BYTES";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEYWORD_DATA_USAGE_PER_WEEK_WIFI_IN_BYTES = "DATA_USAGE_PER_WEEK_WIFI_IN_BYTES";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEYWORD_MOST_FREQUENTLY_USED_APP_10 = "MOST_FREQUENTLY_USED_APP_10";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEYWORD_MOST_FREQUENT_APP = "MOST_FREQUENT_APP";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEYWORD_BATTERY_CHARGING_FREQUENCY = "BATTERY_CHARGING_FREQUENCY";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEYWORD_BATTERY_CHARGING = "BATTERY_CHARGING";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEYWORD_THE_FREQUENCY_OF_THE_CALLS = "THE_FREQUENCY_OF_THE_CALLS";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEYWORD_MOSTLY_VISITED_PLACES_OFFICE_LOCATION = "MOSTLY_VISITED_PLACES_OFFICE_LOCATION";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEYWORD_MOST_VISITED_PLACE = "MOST_VISITED_PLACE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEYWORD_THE_USUAL_COMMUTE_TIME = "THE_USUAL_COMMUTE_TIME";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEYWORD_USER_IS_COMMUTING = "USER_IS_COMMUTING";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEYWORD_INCOMING_CALLS_FREQUENCY_PER_WEEK = "INCOMING_CALLS_FREQUENCY_PER_WEEK";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEYWORD_OUTGOING_CALLS_FREQUENCY_PER_WEEK = "OUTGOING_CALLS_FREQUENCY_PER_WEEK";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEYWORD_INCOMING_SMS_FREQUENCY_PER_WEEK = "INCOMING_SMS_FREQUENCY_PER_WEEK";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEYWORD_OUTGOING_SMS_FREQUENCY_PER_WEEK = "OUTGOING_SMS_FREQUENCY_PER_WEEK";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEYWORD_INCOMING_CALLS_FREQUENCY_PER_DAY = "INCOMING_CALL_FREQUENCY";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEYWORD_OUTGOING_CALLS_FREQUENCY_PER_DAY = "OUTGOING_CALL_FREQUENCY";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEYWORD_INCOMING_SMS_FREQUENCY_PER_DAY = "INCOMING_SMS_FREQUENCY";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEYWORD_OUTGOING_SMS_FREQUENCY_PER_DAY = "OUTGOING_SMS_FREQUENCY";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEYWORD_TOP_UP_FREQUENCY_PER_MONTH = "TOP_UP_FREQUENCY_PER_MONTH";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEYWORD_AVERAGE_TOP_UP_AMOUNT = "AVERAGE_TOP_UP_AMOUNT";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEYWORD_REGULAR_CONTACT = "REGULAR_CONTACT";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEYWORD_FACEBOOK_ID = "Facebook ID";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEYWORD_FACEBOOK_NAME = "Facebook Name";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEYWORD_FACEBOOK_EMAIL = "Facebook Email";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEYWORD_FACEBOOK_PROFILE_IMAGE = "Facebook Profile Photo";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEYWORD_FACEBOOK_COVER_PHOTO = "Facebook Cover Photo";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TEMP_BANK_NAME_KBZ = "kbz";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TEMP_BANK_NAME_CB = "cb";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TEMP_BANK_NAME_AYA = "aya";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TEMP_BANK_NAME_YOMA = "yoma";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TEMP_BANK_NAME_KBZ_FORMAL = "KBZ bank";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TEMP_BANK_NAME_CB_FORMAL = "CB bank";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TEMP_BANK_NAME_AYA_FORMAL = "Aya bank";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TEMP_BANK_NAME_YOMA_FORMAL = "Yoma bank";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BANK_ACCOUNT_TYPE_SAVING = "saving";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FIREBASE_DEFAULT_PHOTO_STORAGE_PATH = "user_photos";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PREF_DONT_SHOW_MAIN_DIALOG_AGAIN = "dont show main dialog again";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_DONT_SHOW_MAIN_DIALOG_AGAIN = "dont show main dialog again";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MEDIA_TYPE_IMAGE = "image/*";
    public static final int WANT_LOAN_IMMEDIATELY = 1;
    public static final int NOT_WANT_LOAN_IMMEDIATELY = 6;
    public static final int WANT_LOAN_AT_START_OF_NEXT_MONTH = 7;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FACEBOOK_USER_ID = "id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FACEBOOK_USER_FIRST_NAME = "first_name";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FACEBOOK_USER_LAST_NAME = "last_name";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FACEBOOK_USER_EMAIL = "email";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FACEBOOK_USER_PICTURE = "picture";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FACEBOOK_USER_COVER = "cover";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FACEBOOK_USER_COVER_SOURCE = "source";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String UAT_MERCHANT_ID = "merchantID";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String UAT_INVOICE_NO = "invoiceNo";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String UAT_PRODUCT_DESC = "productDesc";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String UAT_AMOUNT = "amount";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String UAT_CURRENCY_CODE = "currencyCode";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String UAT_USER_DEFINED_1 = "userDefined1";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String UAT_USER_DEFINED_2 = "userDefined2";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String UAT_USER_DEFINED_3 = "userDefined3";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String UAT_HASH_CODE = "hashValue";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MERCHANT_ID_LIVE_SERVER = "206104000002113";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ENCODING_UTF_8 = "UTF-8";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ZERO_COUNT_16 = "0000000000000000";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ZERO_COUNT_20 = "00000000000000000000";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SERVER_DEFAULT_DATE_FORMAT = "yyyy-MM-dd hh:mm:ss";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TODAY_DATE_FORMAT_YYYYMMDD = "yyyyMMdd";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ASCII_CHARACTARS = " !#$%&amp;\\\'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\\\]^_`abcdefghijklmnopqrstuvwxyz{|}~";
    public static final int PASSWORD_LENGHT = 6;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NUMBER_ONE_MM = "\u1015\u1011\u1019";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NUMBER_TWO_MM = "\u1012\u102f\u1010\u102d\u101a";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NUMBER_THREE_MM = "\u1010\u1010\u102d\u101a";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NUMBER_FOUR_MM = "\u101c\u1031\u1038";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NUMBER_FIVE_MM = "\u1004\u102b\u1038";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NUMBER_SIX_MM = "\u1001\u103c\u1031\u102c\u1000\u103a";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NUMBER_SEVEN_MM = "\u1001\u102f\u1014\u1005\u103a";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NUMBER_EIGHT_MM = "\u101b\u103e\u1005\u103a";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NUMBER_NINE_MM = "\u1000\u102d\u102f\u1038";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CALL_TYPE_INCOMING_TYPE = "incoming";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CALL_TYPE_OUTGOING_TYPE = "outgoing";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CALL_TYPE_MISSED_TYPE = "missed";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CALL_TYPE_VOICEMAIL_TYPE = "voicemail";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CALL_TYPE_REJECTED_TYPE = "rejected";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CALL_TYPE_BLOCKED_TYPE = "blocked";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SMS_TYPE_INBOX = "inbox";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SMS_TYPE_SENT = "sent";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SMS_TYPE_OUTBOX = "outbox";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SMS_TYPE_DRAFT = "draft";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SMS_TYPE_FAILED = "failed";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SMS_TYPE_QUEUED = "queued";
    public static final int AYA_BANK = 2;
    public static final int KBZ_BANK = 3;
    public static final int CB_BANK = 4;
    public static final int YOMA_BANK = 9;
    public static final int WAVE_MONEY = 7;
    public static final int OK_DOLLAR = 8;
    public static final int TRUE_MONEY = 10;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String JSON_VERSION_CODE = "json/version_code.json";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String JSON_HELP_CENTER = "json/helpcenter.json";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MSG_INVALID_IMAGE = "The selected image doesn\'t exist in device storage. Please try to upload images from local storage.";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String[] PHONE_SMS_NUMBER = {"5999", "69835", "678", "MPT", "MyTel", "Telenor", "09 953 598828", "+959953598828"};
    public static final long ONE_DAY_MILITIME = 86400000L;
    public static final long SCHEDULER_TIME = 86400000L;
    public static final long SCHEDULER_TIME_12HOURS = 43200000L;
    public static final long SCHEDULER_LOCATION_SAVE_TIME = 3600000L;
    public static final long SYNC_INTERVAL_FOR_LOCATION = 60000L;
    public static final long SYNC_INTERVAL_FOR_WIFI = 60000L;
    public static final long SYNC_INTERVAL_FOR_COMMUTE = 60000L;
    public static final long SYNC_INTERVAL_FOR_BATTERY = 60000L;
    public static final long SYNC_INTERVAL_FOR_TOPUP = 60000L;
    public static final long SYNC_INTERVAL_FOR_MOST_USED_APP = 60000L;
    public static final long SYNC_INTERVAL_FOR_AMOUNT_OF_USAGE_DATA = 60000L;
    public static final int SYNC_INTERVAL_FOR_CALL_LOG = 1;
    public static final int SYNC_INTERVAL_FOR_REGULAR_CONTACT = 60000;
    public static final int SYNC_INTERVAL_FOR_CALL_DETAIL = 1;
    public static final int SYNC_INTERVAL_FOR_SMS = 1;
    public static final int CRASHLYTICS_PRIORITY_1 = 1;
    public static final int CRASHLYTICS_PRIORITY_10 = 10;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NO_INTERNET_RETRY = "No internet connection!";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String E_LOAN = "E_LOAN";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MSG_APPLY_LOAN_DIALOG = "Data Not Found";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CAPTURED_VIDEO_URI = "CAPTURED_VIDEO_URI";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String UPLOAD_VIDEO_URL = "UPLOAD_VIDEO_URL";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DESTINATION_PATH = "DESTINATION_PATH";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MEDIA_TYPE_MP4 = "mp4";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MEDIA_TYPE_M3U8 = "m3u8";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String UNDEFINED = "Undefined";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SERVICE_TYPE_FTTH = "FTTH";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SERVICE_TYPE_LTE = "LTE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CATEGORY_FAMILY = "Family";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CATEGORY_BUSINESS = "Business";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CATEGORY_SPEED = "Speed";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CATEGORY_QUOTA = "Quota";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CATEGORY_PREPAID = "PX";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PLATFORM = "Android";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEFAULT_FROM_DATE = "0001-01-01";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BILL_STATUS_UNPAID = "Unpaid";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BILL_STATUS_FULLY_PAID = "Fully Paid";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BILL_STATUS_PARTIALLY_PAID = "Partially Paid";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String UNAUTHORIZED_REQUEST = "Unauthorized request";
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<java.lang.String> MONTHS = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PLAN_CHANGE_FORM = "Plan Change";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String RELOCATION_FORM = "Relocation";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TICKET_FORM = "Ticket";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String HELP_FORM = "Help";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PLAN_CHANGE = "Plan Change";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String RELOCATION = "Relocation";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TICKET = "Ticket";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTIVATION = "Activation";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MSG_NO_SECRET_QUESTION = "Secret Question has not been set for the user in system";
    
    private SharedConstants() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String[] getPHONE_SMS_NUMBER() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getMONTHS() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBasicAuthToken() {
        return null;
    }
}