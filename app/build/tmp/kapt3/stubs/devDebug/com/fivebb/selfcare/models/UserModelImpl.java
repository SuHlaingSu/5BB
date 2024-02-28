package com.fivebb.selfcare.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u00e0\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u0088\u00012\u00020\u00012\u00020\u0002:\u0002\u0088\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J8\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001a0\u001e2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001a0\u001eH\u0016J8\u0010\"\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u001a0\u001e2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001a0\u001eH\u0016J@\u0010#\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010$\u001a\u00020%2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001a0\u001e2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001a0\u001eH\u0016J@\u0010&\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\'2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001a0\u001e2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001a0\u001eH\u0016J@\u0010(\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010$\u001a\u00020)2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001a0\u001e2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001a0\u001eH\u0016J8\u0010*\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u001a0\u001e2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001a0\u001eH\u0016J@\u0010,\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010$\u001a\u00020-2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001a0\u001e2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001a0\u001eH\u0016JF\u0010.\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010$\u001a\u00020%2\u0018\u0010\u001d\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0\u0007\u0012\u0004\u0012\u00020\u001a0\u001e2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001a0\u001eH\u0016J>\u00100\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u00042\u0018\u0010\u001d\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\u001a0\u001e2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001a0\u001eH\u0016J8\u00101\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u001a0\u001e2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001a0\u001eH\u0016J>\u00103\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u00042\u0018\u0010\u001d\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002040\u0007\u0012\u0004\u0012\u00020\u001a0\u001e2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001a0\u001eH\u0016J\u000e\u00105\u001a\b\u0012\u0004\u0012\u00020706H\u0016J>\u00108\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u00042\u0018\u0010\u001d\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\u0004\u0012\u00020\u001a0\u001e2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001a0\u001eH\u0016J\u0010\u00109\u001a\u00020!2\u0006\u0010\u0003\u001a\u00020\u0004H\u0016J8\u0010:\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001a0\u001e2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001a0\u001eH\u0016J8\u0010;\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020\u001a0\u001e2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001a0\u001eH\u0016J\u0010\u0010=\u001a\u00020!2\u0006\u0010\u0003\u001a\u00020\u0004H\u0016J@\u0010>\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010$\u001a\u00020?2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\u001a0\u001e2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001a0\u001eH\u0016J\u000e\u0010A\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\u000e\u0010B\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0016J\n\u0010C\u001a\u0004\u0018\u00010\fH\u0016J\u000e\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007H\u0016J\n\u0010E\u001a\u0004\u0018\u00010\u0014H\u0016J\u0014\u0010F\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020H0G06H\u0016J>\u0010I\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u00042\u0018\u0010\u001d\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020J0\u0007\u0012\u0004\u0012\u00020\u001a0\u001e2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001a0\u001eH\u0016J8\u0010K\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020L\u0012\u0004\u0012\u00020\u001a0\u001e2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001a0\u001eH\u0016J8\u0010M\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020N\u0012\u0004\u0012\u00020\u001a0\u001e2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001a0\u001eH\u0016J>\u0010O\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u00042\u0018\u0010\u001d\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100G\u0012\u0004\u0012\u00020\u001a0\u001e2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001a0\u001eH\u0016JN\u0010P\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010Q\u001a\u00020!2\u0006\u0010R\u001a\u00020!2\u0018\u0010\u001d\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100G\u0012\u0004\u0012\u00020\u001a0\u001e2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001a0\u001eH\u0016J6\u0010S\u001a\u00020\u001a2\u0018\u0010\u001d\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020T0\u0007\u0012\u0004\u0012\u00020\u001a0\u001e2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001a0\u001eH\u0016J>\u0010U\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u00042\u0018\u0010\u001d\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020V0\u0007\u0012\u0004\u0012\u00020\u001a0\u001e2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001a0\u001eH\u0016J>\u0010W\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u00042\u0018\u0010\u001d\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020X0\u0007\u0012\u0004\u0012\u00020\u001a0\u001e2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001a0\u001eH\u0016J@\u0010Y\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010Z\u001a\u00020!2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u001a0\u001e2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001a0\u001eH\u0016JF\u0010[\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010Z\u001a\u00020!2\u0018\u0010\u001d\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0007\u0012\u0004\u0012\u00020\u001a0\u001e2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001a0\u001eH\u0016JL\u0010\\\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u00042\u0012\u0010]\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001a0\u001e2\u0012\u0010^\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001a0\u001e2\u0012\u0010_\u001a\u000e\u0012\u0004\u0012\u00020`\u0012\u0004\u0012\u00020\u001a0\u001eH\u0016J8\u0010a\u001a\u00020\u001a2\u0006\u0010b\u001a\u00020!2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001a0\u001e2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001a0\u001eH\u0016J\n\u0010c\u001a\u0004\u0018\u00010dH\u0016J8\u0010e\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020f\u0012\u0004\u0012\u00020\u001a0\u001e2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001a0\u001eH\u0016J>\u0010g\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u00042\u0018\u0010\u001d\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020h0\u0007\u0012\u0004\u0012\u00020\u001a0\u001e2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001a0\u001eH\u0016J8\u0010i\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\u001a0\u001e2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001a0\u001eH\u0016J8\u0010j\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020k\u0012\u0004\u0012\u00020\u001a0\u001e2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001a0\u001eH\u0016J\u001e\u0010l\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0mH\u0016JP\u0010n\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010]\u001a\u00020!2\u0006\u0010^\u001a\u00020!2\u0006\u0010_\u001a\u00020`2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001a0\u001e2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001a0\u001eH\u0016J8\u0010o\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020p\u0012\u0004\u0012\u00020\u001a0\u001e2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001a0\u001eH\u0016J8\u0010q\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020r\u0012\u0004\u0012\u00020\u001a0\u001e2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001a0\u001eH\u0016J8\u0010s\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020t\u0012\u0004\u0012\u00020\u001a0\u001e2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001a0\u001eH\u0016J8\u0010u\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020v\u0012\u0004\u0012\u00020\u001a0\u001e2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001a0\u001eH\u0016J@\u0010w\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010$\u001a\u00020x2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001a0\u001e2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001a0\u001eH\u0016J@\u0010y\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010z\u001a\u00020{2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001a0\u001e2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001a0\u001eH\u0016J8\u0010|\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020}\u0012\u0004\u0012\u00020\u001a0\u001e2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001a0\u001eH\u0016J8\u0010~\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u007f\u0012\u0004\u0012\u00020\u001a0\u001e2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001a0\u001eH\u0016J9\u0010\u0080\u0001\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001a0\u001e2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001a0\u001eH\u0016JB\u0010\u0081\u0001\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u00042\u0007\u0010$\u001a\u00030\u0082\u00012\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001a0\u001e2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001a0\u001eH\u0016JA\u0010\u0083\u0001\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010$\u001a\u00020-2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001a0\u001e2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001a0\u001eH\u0016J:\u0010\u0084\u0001\u001a\u00020\u001a2\u0007\u0010\u0085\u0001\u001a\u00020!2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001a0\u001e2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001a0\u001eH\u0016J:\u0010\u0086\u0001\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0013\u0010\u001d\u001a\u000f\u0012\u0005\u0012\u00030\u0087\u0001\u0012\u0004\u0012\u00020\u001a0\u001e2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001a0\u001eH\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0089\u0001"}, d2 = {"Lcom/fivebb/selfcare/models/UserModelImpl;", "Lcom/fivebb/selfcare/models/BaseUserModel;", "Lcom/fivebb/selfcare/models/UserModel;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mActivityLogs", "", "Lcom/fivebb/shared/vos/ActivityLogVO;", "mBillList", "Lcom/fivebb/shared/vos/BillVO;", "mCustomerBasicViewDetails", "Lcom/fivebb/shared/vos/CustomerBasicViewDetailsVO;", "mEmailList", "Lcom/fivebb/selfcare/network/responses/EmailList;", "mPaymentHistory", "Lcom/fivebb/shared/vos/PaymentHistoryVO;", "mPlanPriceList", "Lcom/fivebb/shared/vos/PlanPriceListVO;", "mRegion", "Lcom/fivebb/shared/vos/RegionVO;", "mSecretQuestion", "Lcom/fivebb/shared/vos/SecretQuestionVO;", "mUserLogin", "Lcom/fivebb/shared/vos/UserLoginVO;", "AYAPayQueryOrder", "", "encryptData", "Lcom/fivebb/selfcare/network/requests/EncryptDataRequest;", "success", "Lkotlin/Function1;", "Lcom/fivebb/selfcare/network/responses/AYAQueryOrderResponse;", "failure", "", "advTopUp", "changeEmail", "request", "Lcom/fivebb/selfcare/network/requests/EmailRequest;", "changePassword", "Lcom/fivebb/selfcare/network/requests/ChangePasswordRequest;", "checkEmail", "Lcom/fivebb/selfcare/network/requests/EmailCheckRequest;", "checkVerication", "Lcom/fivebb/shared/vos/CheckVericationVO;", "deleteNoti", "Lcom/fivebb/selfcare/network/requests/NotiIdRequest;", "emailList", "Lcom/fivebb/selfcare/network/responses/EmailListResponse;", "getActivityLogs", "getAdvancePayment", "Lcom/fivebb/shared/vos/AdvancePaymentVO;", "getAppImageList", "Lcom/fivebb/shared/vos/AppImageVO;", "getAppVersion", "Landroidx/lifecycle/LiveData;", "Lcom/fivebb/shared/vos/AppVersionVO;", "getBillList", "getCallCenterEmailByBillingArea", "getCustomerBasicViewDetails", "getDataForHomeScreen", "Lcom/fivebb/shared/vos/ServiceInstanceSummaryVO;", "getEmailByBillingArea", "getInvoicePDF", "Lcom/fivebb/selfcare/network/requests/DownloadPaymentSlipRequest;", "Lcom/fivebb/shared/vos/InvoiceVO;", "getLoadedActivityLogs", "getLoadedBillList", "getLoadedCustomerDetails", "getLoadedPaymentHistory", "getLoadedRegionList", "getLoginHistory", "", "Lcom/fivebb/shared/vos/LoginHistroyVO;", "getNotiList", "Lcom/fivebb/shared/vos/NotificationVO;", "getPXDetails", "Lcom/fivebb/shared/vos/PXDetailVO;", "getPXPlan", "Lcom/fivebb/shared/vos/PXPlanListVO;", "getPaymentHistory", "getPaymentHistoryByDateRange", "fromDate", "toDate", "getPaymentMethod", "Lcom/fivebb/shared/vos/PaymentMethodVO;", "getPlan", "Lcom/fivebb/shared/vos/PlanVO;", "getRechargeList", "Lcom/fivebb/shared/vos/RechargeVO;", "getRegion", "actionType", "getRegionByShowroom", "getRememberPreviousAccountId", "accountId", "password", "checkedRememberMe", "", "getSecretQuestion", "accountNumber", "getServiceInstance", "Lcom/fivebb/shared/vos/ServiceInstanceDetailsVO;", "getTicketConfiguration", "Lcom/fivebb/shared/vos/TicketConfigVO;", "getTopics", "Lcom/fivebb/shared/vos/TopicVO;", "loadAppVersion", "loadKBZOrderInfo", "Lcom/fivebb/selfcare/network/responses/KBZOrderInfoResponse;", "logOut", "Lkotlin/Function0;", "loginAndGetAccountDetail", "payWithAYAPay", "Lcom/fivebb/selfcare/network/responses/AYARequestPushPaymentResponse;", "requestWavePay", "Lcom/fivebb/selfcare/network/responses/WavePayResponse;", "sendCitizenPay", "Lcom/fivebb/selfcare/network/responses/CitizenPayResponse;", "sendCitizenRetrieve", "Lcom/fivebb/selfcare/network/responses/CitizenRetrieveResponse;", "sendEmail", "Lcom/fivebb/selfcare/network/requests/SendEmailRequest;", "sendEmailAndSaveActivityLog", "saveActivityLogRequest", "Lcom/fivebb/selfcare/network/requests/SaveActivityLogRequest;", "sendKBZPayPreCreate", "Lcom/fivebb/selfcare/network/responses/KBZPreCreateResponse;", "sendKBZPayQueryOrder", "Lcom/fivebb/selfcare/network/responses/KBZQueryOrderResponse;", "topUpAction", "updateEmailInfo", "Lcom/fivebb/selfcare/network/requests/UpdateEmailRequest;", "updateNoti", "validateSecretQuestion", "answer", "wavePayQueryOrder", "Lcom/fivebb/selfcare/network/responses/WaveQueryOrderResponse;", "Companion", "app_devDebug"})
public final class UserModelImpl extends com.fivebb.selfcare.models.BaseUserModel implements com.fivebb.selfcare.models.UserModel {
    @org.jetbrains.annotations.NotNull()
    public static final com.fivebb.selfcare.models.UserModelImpl.Companion Companion = null;
    private static final java.lang.String TAG = "UserModel";
    private static final java.lang.String USER_MODEL_EARLY_INVOCATION = "User Model must invoked before initialized.";
    private static com.fivebb.selfcare.models.UserModelImpl INSTANCE;
    private static com.fivebb.shared.db.AppDatabase appDatabase;
    private com.fivebb.shared.vos.UserLoginVO mUserLogin;
    private com.fivebb.shared.vos.CustomerBasicViewDetailsVO mCustomerBasicViewDetails;
    private com.fivebb.shared.vos.RegionVO mRegion;
    private java.util.List<com.fivebb.shared.vos.PaymentHistoryVO> mPaymentHistory;
    private java.util.List<com.fivebb.shared.vos.BillVO> mBillList;
    private java.util.List<com.fivebb.shared.vos.ActivityLogVO> mActivityLogs;
    private java.util.List<com.fivebb.selfcare.network.responses.EmailList> mEmailList;
    private com.fivebb.shared.vos.PlanPriceListVO mPlanPriceList;
    private com.fivebb.shared.vos.SecretQuestionVO mSecretQuestion;
    
    private UserModelImpl(android.content.Context context) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getEmailByBillingArea(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getCallCenterEmailByBillingArea(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @java.lang.Override()
    public void getTopics(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<com.fivebb.shared.vos.TopicVO>, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure) {
    }
    
    @java.lang.Override()
    public void getAdvancePayment(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.fivebb.shared.vos.AdvancePaymentVO, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure) {
    }
    
    @java.lang.Override()
    public void getPXDetails(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.fivebb.shared.vos.PXDetailVO, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure) {
    }
    
    @java.lang.Override()
    public void advTopUp(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.fivebb.shared.vos.PlanPriceListVO, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure) {
    }
    
    @java.lang.Override()
    public void topUpAction(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure) {
    }
    
    @java.lang.Override()
    public void checkVerication(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.fivebb.shared.vos.CheckVericationVO, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure) {
    }
    
    /**
     * Get All Notifications From Api
     */
    @java.lang.Override()
    public void getNotiList(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<com.fivebb.shared.vos.NotificationVO>, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure) {
    }
    
    @java.lang.Override()
    public void deleteNoti(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.requests.NotiIdRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure) {
    }
    
    @java.lang.Override()
    public void updateNoti(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.requests.NotiIdRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure) {
    }
    
    @java.lang.Override()
    public void getInvoicePDF(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.requests.DownloadPaymentSlipRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.fivebb.shared.vos.InvoiceVO, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure) {
    }
    
    @java.lang.Override()
    public void getPaymentMethod(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<com.fivebb.shared.vos.PaymentMethodVO>, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure) {
    }
    
    @java.lang.Override()
    public void getRechargeList(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<com.fivebb.shared.vos.RechargeVO>, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure) {
    }
    
    @java.lang.Override()
    public void loginAndGetAccountDetail(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String accountId, @org.jetbrains.annotations.NotNull()
    java.lang.String password, boolean checkedRememberMe, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure) {
    }
    
    @java.lang.Override()
    public void getRememberPreviousAccountId(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> accountId, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> password, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> checkedRememberMe) {
    }
    
    @java.lang.Override()
    public void getCustomerBasicViewDetails(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.fivebb.shared.vos.CustomerBasicViewDetailsVO, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.fivebb.shared.vos.CustomerBasicViewDetailsVO getLoadedCustomerDetails() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.fivebb.shared.vos.RegionVO getLoadedRegionList() {
        return null;
    }
    
    @java.lang.Override()
    public void changePassword(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.requests.ChangePasswordRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure) {
    }
    
    @java.lang.Override()
    public void getPaymentHistory(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<com.fivebb.shared.vos.PaymentHistoryVO>, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure) {
    }
    
    @java.lang.Override()
    public void getPaymentHistoryByDateRange(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String fromDate, @org.jetbrains.annotations.NotNull()
    java.lang.String toDate, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<com.fivebb.shared.vos.PaymentHistoryVO>, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure) {
    }
    
    @java.lang.Override()
    public void getDataForHomeScreen(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.fivebb.shared.vos.ServiceInstanceSummaryVO, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.fivebb.shared.vos.PaymentHistoryVO> getLoadedPaymentHistory() {
        return null;
    }
    
    @java.lang.Override()
    public void logOut(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> success) {
    }
    
    @java.lang.Override()
    public void getBillList(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<com.fivebb.shared.vos.BillVO>, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.fivebb.shared.vos.BillVO> getLoadedBillList() {
        return null;
    }
    
    @java.lang.Override()
    public void getTicketConfiguration(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.fivebb.shared.vos.TicketConfigVO, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.util.List<com.fivebb.shared.vos.LoginHistroyVO>> getLoginHistory() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.fivebb.shared.vos.ServiceInstanceDetailsVO getServiceInstance() {
        return null;
    }
    
    @java.lang.Override()
    public void getPlan(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<com.fivebb.shared.vos.PlanVO>, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure) {
    }
    
    @java.lang.Override()
    public void getPXPlan(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.fivebb.shared.vos.PXPlanListVO, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure) {
    }
    
    @java.lang.Override()
    public void getActivityLogs(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<com.fivebb.shared.vos.ActivityLogVO>, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.fivebb.shared.vos.ActivityLogVO> getLoadedActivityLogs() {
        return null;
    }
    
    @java.lang.Override()
    public void getSecretQuestion(@org.jetbrains.annotations.NotNull()
    java.lang.String accountNumber, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure) {
    }
    
    @java.lang.Override()
    public void validateSecretQuestion(@org.jetbrains.annotations.NotNull()
    java.lang.String answer, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure) {
    }
    
    @java.lang.Override()
    public void sendEmail(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.requests.SendEmailRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure) {
    }
    
    @java.lang.Override()
    public void sendEmailAndSaveActivityLog(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.requests.SaveActivityLogRequest saveActivityLogRequest, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure) {
    }
    
    @java.lang.Override()
    public void getAppImageList(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<com.fivebb.shared.vos.AppImageVO>, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure) {
    }
    
    @java.lang.Override()
    public void getRegion(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String actionType, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.fivebb.shared.vos.RegionVO, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure) {
    }
    
    @java.lang.Override()
    public void getRegionByShowroom(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String actionType, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<com.fivebb.shared.vos.RegionVO>, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure) {
    }
    
    @java.lang.Override()
    public void requestWavePay(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.requests.EncryptDataRequest encryptData, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.fivebb.selfcare.network.responses.WavePayResponse, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure) {
    }
    
    @java.lang.Override()
    public void wavePayQueryOrder(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.requests.EncryptDataRequest encryptData, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.fivebb.selfcare.network.responses.WaveQueryOrderResponse, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure) {
    }
    
    @java.lang.Override()
    public void sendCitizenPay(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.requests.EncryptDataRequest encryptData, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.fivebb.selfcare.network.responses.CitizenPayResponse, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure) {
    }
    
    @java.lang.Override()
    public void payWithAYAPay(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.requests.EncryptDataRequest encryptData, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.fivebb.selfcare.network.responses.AYARequestPushPaymentResponse, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure) {
    }
    
    @java.lang.Override()
    public void AYAPayQueryOrder(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.requests.EncryptDataRequest encryptData, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.fivebb.selfcare.network.responses.AYAQueryOrderResponse, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure) {
    }
    
    @java.lang.Override()
    public void sendCitizenRetrieve(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.requests.EncryptDataRequest encryptData, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.fivebb.selfcare.network.responses.CitizenRetrieveResponse, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure) {
    }
    
    @java.lang.Override()
    public void sendKBZPayPreCreate(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.requests.EncryptDataRequest encryptData, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.fivebb.selfcare.network.responses.KBZPreCreateResponse, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure) {
    }
    
    @java.lang.Override()
    public void sendKBZPayQueryOrder(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.requests.EncryptDataRequest encryptData, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.fivebb.selfcare.network.responses.KBZQueryOrderResponse, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure) {
    }
    
    @java.lang.Override()
    public void loadKBZOrderInfo(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.requests.EncryptDataRequest encryptData, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.fivebb.selfcare.network.responses.KBZOrderInfoResponse, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure) {
    }
    
    @java.lang.Override()
    public void loadAppVersion(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.fivebb.shared.vos.AppVersionVO, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<com.fivebb.shared.vos.AppVersionVO> getAppVersion() {
        return null;
    }
    
    @java.lang.Override()
    public void changeEmail(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.requests.EmailRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure) {
    }
    
    @java.lang.Override()
    public void checkEmail(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.requests.EmailCheckRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure) {
    }
    
    @java.lang.Override()
    public void emailList(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.requests.EmailRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<com.fivebb.selfcare.network.responses.EmailListResponse>, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure) {
    }
    
    @java.lang.Override()
    public void updateEmailInfo(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.requests.UpdateEmailRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\n\u001a\u00020\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/fivebb/selfcare/models/UserModelImpl$Companion;", "", "()V", "INSTANCE", "Lcom/fivebb/selfcare/models/UserModelImpl;", "TAG", "", "USER_MODEL_EARLY_INVOCATION", "appDatabase", "Lcom/fivebb/shared/db/AppDatabase;", "getInstance", "initUserModelImpl", "", "context", "Landroid/content/Context;", "app_devDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void initUserModelImpl(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.fivebb.selfcare.models.UserModelImpl getInstance() {
            return null;
        }
    }
}