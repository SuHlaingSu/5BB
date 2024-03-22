package com.fivebb.selfcare.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u00c4\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J8\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u0007H&J8\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u0007H&J@\u0010\u000f\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u0007H&J@\u0010\u0012\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00132\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u0007H&J@\u0010\u0014\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00152\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u0007H&J8\u0010\u0016\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00030\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u0007H&J@\u0010\u0018\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00192\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u0007H&JF\u0010\u001a\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0018\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b\u0012\u0004\u0012\u00020\u00030\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u0007H&J>\u0010\u001d\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0018\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001b\u0012\u0004\u0012\u00020\u00030\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u0007H&J8\u0010\u001f\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00030\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u0007H&J>\u0010!\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0018\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u001b\u0012\u0004\u0012\u00020\u00030\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u0007H&J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$H&J>\u0010&\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0018\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\'0\u001b\u0012\u0004\u0012\u00020\u00030\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u0007H&J\u0010\u0010(\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH&J8\u0010)\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u00030\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u0007H&J8\u0010+\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u00030\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u0007H&J\u0010\u0010-\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH&J@\u0010.\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020/2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u00030\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u0007H&J\u000e\u00101\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001bH&J\u000e\u00102\u001a\b\u0012\u0004\u0012\u00020\'0\u001bH&J\n\u00103\u001a\u0004\u0018\u00010*H&J\u000e\u00104\u001a\b\u0012\u0004\u0012\u0002050\u001bH&J\n\u00106\u001a\u0004\u0018\u000107H&J\u0014\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020:090$H&J>\u0010;\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0018\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0\u001b\u0012\u0004\u0012\u00020\u00030\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u0007H&J8\u0010=\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020\u00030\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u0007H&J8\u0010?\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\u00030\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u0007H&J>\u0010A\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0018\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020509\u0012\u0004\u0012\u00020\u00030\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u0007H&JN\u0010B\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010C\u001a\u00020\n2\u0006\u0010D\u001a\u00020\n2\u0018\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020509\u0012\u0004\u0012\u00020\u00030\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u0007H&J6\u0010E\u001a\u00020\u00032\u0018\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020F0\u001b\u0012\u0004\u0012\u00020\u00030\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u0007H&J>\u0010G\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0018\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020H0\u001b\u0012\u0004\u0012\u00020\u00030\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u0007H&J>\u0010I\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0018\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020J0\u001b\u0012\u0004\u0012\u00020\u00030\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u0007H&J@\u0010K\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010L\u001a\u00020\n2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\u00030\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u0007H&JF\u0010M\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010L\u001a\u00020\n2\u0018\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002070\u001b\u0012\u0004\u0012\u00020\u00030\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u0007H&JL\u0010N\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0012\u0010O\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u00072\u0012\u0010P\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u00072\u0012\u0010Q\u001a\u000e\u0012\u0004\u0012\u00020R\u0012\u0004\u0012\u00020\u00030\u0007H&J8\u0010S\u001a\u00020\u00032\u0006\u0010T\u001a\u00020\n2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u0007H&J\n\u0010U\u001a\u0004\u0018\u00010VH&J8\u0010W\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020X\u0012\u0004\u0012\u00020\u00030\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u0007H&J>\u0010Y\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0018\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020Z0\u001b\u0012\u0004\u0012\u00020\u00030\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u0007H&J8\u0010[\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00030\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u0007H&J8\u0010\\\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020]\u0012\u0004\u0012\u00020\u00030\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u0007H&J\u001e\u0010^\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030_H&JP\u0010`\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010O\u001a\u00020\n2\u0006\u0010P\u001a\u00020\n2\u0006\u0010Q\u001a\u00020R2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u0007H&J8\u0010a\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020b\u0012\u0004\u0012\u00020\u00030\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u0007H&J8\u0010c\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020d\u0012\u0004\u0012\u00020\u00030\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u0007H&J8\u0010e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020f\u0012\u0004\u0012\u00020\u00030\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u0007H&J8\u0010g\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020h\u0012\u0004\u0012\u00020\u00030\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u0007H&J@\u0010i\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020j2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u0007H&J@\u0010k\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010l\u001a\u00020m2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u0007H&J8\u0010n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020o\u0012\u0004\u0012\u00020\u00030\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u0007H&J8\u0010p\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020q\u0012\u0004\u0012\u00020\u00030\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u0007H&J8\u0010r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u0007H&J@\u0010s\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020t2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u0007H&J@\u0010u\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00192\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u0007H&J8\u0010v\u001a\u00020\u00032\u0006\u0010w\u001a\u00020\n2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u0007H&J8\u0010x\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020y\u0012\u0004\u0012\u00020\u00030\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u0007H&\u00a8\u0006z"}, d2 = {"Lcom/fivebb/selfcare/models/UserModel;", "Lcom/fivebb/shared/model/BaseModel;", "AYAPayQueryOrder", "", "encryptData", "Lcom/fivebb/selfcare/network/requests/EncryptDataRequest;", "success", "Lkotlin/Function1;", "Lcom/fivebb/selfcare/network/responses/AYAQueryOrderResponse;", "failure", "", "advTopUp", "context", "Landroid/content/Context;", "Lcom/fivebb/shared/vos/PlanPriceListVO;", "changeEmail", "request", "Lcom/fivebb/selfcare/network/requests/EmailRequest;", "changePassword", "Lcom/fivebb/selfcare/network/requests/ChangePasswordRequest;", "checkEmail", "Lcom/fivebb/selfcare/network/requests/EmailCheckRequest;", "checkVerication", "Lcom/fivebb/shared/vos/CheckVericationVO;", "deleteNoti", "Lcom/fivebb/selfcare/network/requests/NotiIdRequest;", "emailList", "", "Lcom/fivebb/selfcare/network/responses/EmailListResponse;", "getActivityLogs", "Lcom/fivebb/shared/vos/ActivityLogVO;", "getAdvancePayment", "Lcom/fivebb/shared/vos/AdvancePaymentVO;", "getAppImageList", "Lcom/fivebb/shared/vos/AppImageVO;", "getAppVersion", "Landroidx/lifecycle/LiveData;", "Lcom/fivebb/shared/vos/AppVersionVO;", "getBillList", "Lcom/fivebb/shared/vos/BillVO;", "getCallCenterEmailByBillingArea", "getCustomerBasicViewDetails", "Lcom/fivebb/shared/vos/CustomerBasicViewDetailsVO;", "getDataForHomeScreen", "Lcom/fivebb/shared/vos/ServiceInstanceSummaryVO;", "getEmailByBillingArea", "getInvoicePDF", "Lcom/fivebb/selfcare/network/requests/DownloadPaymentSlipRequest;", "Lcom/fivebb/shared/vos/InvoiceVO;", "getLoadedActivityLogs", "getLoadedBillList", "getLoadedCustomerDetails", "getLoadedPaymentHistory", "Lcom/fivebb/shared/vos/PaymentHistoryVO;", "getLoadedRegionList", "Lcom/fivebb/shared/vos/RegionVO;", "getLoginHistory", "", "Lcom/fivebb/shared/vos/LoginHistroyVO;", "getNotiList", "Lcom/fivebb/shared/vos/NotificationVO;", "getPXDetails", "Lcom/fivebb/shared/vos/PXDetailVO;", "getPXPlan", "Lcom/fivebb/shared/vos/PXPlanListVO;", "getPaymentHistory", "getPaymentHistoryByDateRange", "fromDate", "toDate", "getPaymentMethod", "Lcom/fivebb/shared/vos/PaymentMethodVO;", "getPlan", "Lcom/fivebb/shared/vos/PlanVO;", "getRechargeList", "Lcom/fivebb/shared/vos/RechargeVO;", "getRegion", "actionType", "getRegionByShowroom", "getRememberPreviousAccountId", "accountId", "password", "checkedRememberMe", "", "getSecretQuestion", "accountNumber", "getServiceInstance", "Lcom/fivebb/shared/vos/ServiceInstanceDetailsVO;", "getTicketConfiguration", "Lcom/fivebb/shared/vos/TicketConfigVO;", "getTopics", "Lcom/fivebb/shared/vos/TopicVO;", "loadAppVersion", "loadKBZOrderInfo", "Lcom/fivebb/selfcare/network/responses/KBZOrderInfoResponse;", "logOut", "Lkotlin/Function0;", "loginAndGetAccountDetail", "payWithAYAPay", "Lcom/fivebb/selfcare/network/responses/AYARequestPushPaymentResponse;", "requestWavePay", "Lcom/fivebb/selfcare/network/responses/WavePayResponse;", "sendCitizenPay", "Lcom/fivebb/selfcare/network/responses/CitizenPayResponse;", "sendCitizenRetrieve", "Lcom/fivebb/selfcare/network/responses/CitizenRetrieveResponse;", "sendEmail", "Lcom/fivebb/selfcare/network/requests/SendEmailRequest;", "sendEmailAndSaveActivityLog", "saveActivityLogRequest", "Lcom/fivebb/selfcare/network/requests/SaveActivityLogRequest;", "sendKBZPayPreCreate", "Lcom/fivebb/selfcare/network/responses/KBZPreCreateResponse;", "sendKBZPayQueryOrder", "Lcom/fivebb/selfcare/network/responses/KBZQueryOrderResponse;", "topUpAction", "updateEmailInfo", "Lcom/fivebb/selfcare/network/requests/UpdateEmailRequest;", "updateNoti", "validateSecretQuestion", "answer", "wavePayQueryOrder", "Lcom/fivebb/selfcare/network/responses/WaveQueryOrderResponse;", "app_devDebug"})
public abstract interface UserModel extends com.fivebb.shared.model.BaseModel {
    
    public abstract void getInvoicePDF(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.requests.DownloadPaymentSlipRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.fivebb.shared.vos.InvoiceVO, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure);
    
    public abstract void getPaymentMethod(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<com.fivebb.shared.vos.PaymentMethodVO>, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure);
    
    public abstract void getRechargeList(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<com.fivebb.shared.vos.RechargeVO>, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure);
    
    public abstract void loginAndGetAccountDetail(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String accountId, @org.jetbrains.annotations.NotNull()
    java.lang.String password, boolean checkedRememberMe, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure);
    
    public abstract void getRememberPreviousAccountId(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> accountId, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> password, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> checkedRememberMe);
    
    public abstract void getCustomerBasicViewDetails(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.fivebb.shared.vos.CustomerBasicViewDetailsVO, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure);
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.fivebb.shared.vos.CustomerBasicViewDetailsVO getLoadedCustomerDetails();
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.fivebb.shared.vos.RegionVO getLoadedRegionList();
    
    public abstract void changePassword(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.requests.ChangePasswordRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure);
    
    public abstract void getPaymentHistory(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<com.fivebb.shared.vos.PaymentHistoryVO>, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure);
    
    public abstract void getPaymentHistoryByDateRange(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String fromDate, @org.jetbrains.annotations.NotNull()
    java.lang.String toDate, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<com.fivebb.shared.vos.PaymentHistoryVO>, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure);
    
    public abstract void getTopics(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<com.fivebb.shared.vos.TopicVO>, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure);
    
    public abstract void getNotiList(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<com.fivebb.shared.vos.NotificationVO>, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure);
    
    public abstract void deleteNoti(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.requests.NotiIdRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure);
    
    public abstract void updateNoti(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.requests.NotiIdRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure);
    
    public abstract void getDataForHomeScreen(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.fivebb.shared.vos.ServiceInstanceSummaryVO, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.fivebb.shared.vos.PaymentHistoryVO> getLoadedPaymentHistory();
    
    public abstract void logOut(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> success);
    
    public abstract void getBillList(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<com.fivebb.shared.vos.BillVO>, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.fivebb.shared.vos.BillVO> getLoadedBillList();
    
    public abstract void getTicketConfiguration(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.fivebb.shared.vos.TicketConfigVO, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure);
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.fivebb.shared.vos.LoginHistroyVO>> getLoginHistory();
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.fivebb.shared.vos.ServiceInstanceDetailsVO getServiceInstance();
    
    public abstract void getPlan(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<com.fivebb.shared.vos.PlanVO>, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure);
    
    public abstract void getPXPlan(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.fivebb.shared.vos.PXPlanListVO, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure);
    
    public abstract void getActivityLogs(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<com.fivebb.shared.vos.ActivityLogVO>, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.fivebb.shared.vos.ActivityLogVO> getLoadedActivityLogs();
    
    public abstract void getSecretQuestion(@org.jetbrains.annotations.NotNull()
    java.lang.String accountNumber, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure);
    
    public abstract void validateSecretQuestion(@org.jetbrains.annotations.NotNull()
    java.lang.String answer, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure);
    
    public abstract void sendEmail(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.requests.SendEmailRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure);
    
    public abstract void sendEmailAndSaveActivityLog(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.requests.SaveActivityLogRequest saveActivityLogRequest, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getEmailByBillingArea(@org.jetbrains.annotations.NotNull()
    android.content.Context context);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getCallCenterEmailByBillingArea(@org.jetbrains.annotations.NotNull()
    android.content.Context context);
    
    public abstract void getAppImageList(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<com.fivebb.shared.vos.AppImageVO>, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure);
    
    public abstract void getRegion(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String actionType, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.fivebb.shared.vos.RegionVO, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure);
    
    public abstract void getRegionByShowroom(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String actionType, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<com.fivebb.shared.vos.RegionVO>, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure);
    
    public abstract void requestWavePay(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.requests.EncryptDataRequest encryptData, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.fivebb.selfcare.network.responses.WavePayResponse, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure);
    
    public abstract void wavePayQueryOrder(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.requests.EncryptDataRequest encryptData, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.fivebb.selfcare.network.responses.WaveQueryOrderResponse, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure);
    
    public abstract void sendCitizenPay(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.requests.EncryptDataRequest encryptData, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.fivebb.selfcare.network.responses.CitizenPayResponse, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure);
    
    public abstract void payWithAYAPay(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.requests.EncryptDataRequest encryptData, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.fivebb.selfcare.network.responses.AYARequestPushPaymentResponse, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure);
    
    public abstract void AYAPayQueryOrder(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.requests.EncryptDataRequest encryptData, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.fivebb.selfcare.network.responses.AYAQueryOrderResponse, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure);
    
    public abstract void sendCitizenRetrieve(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.requests.EncryptDataRequest encryptData, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.fivebb.selfcare.network.responses.CitizenRetrieveResponse, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure);
    
    public abstract void sendKBZPayPreCreate(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.requests.EncryptDataRequest encryptData, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.fivebb.selfcare.network.responses.KBZPreCreateResponse, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure);
    
    public abstract void sendKBZPayQueryOrder(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.requests.EncryptDataRequest encryptData, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.fivebb.selfcare.network.responses.KBZQueryOrderResponse, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure);
    
    public abstract void loadKBZOrderInfo(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.requests.EncryptDataRequest encryptData, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.fivebb.selfcare.network.responses.KBZOrderInfoResponse, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure);
    
    public abstract void loadAppVersion(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.fivebb.shared.vos.AppVersionVO, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure);
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<com.fivebb.shared.vos.AppVersionVO> getAppVersion();
    
    public abstract void getAdvancePayment(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.fivebb.shared.vos.AdvancePaymentVO, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure);
    
    public abstract void getPXDetails(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.fivebb.shared.vos.PXDetailVO, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure);
    
    public abstract void advTopUp(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.fivebb.shared.vos.PlanPriceListVO, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure);
    
    public abstract void topUpAction(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure);
    
    public abstract void checkVerication(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.fivebb.shared.vos.CheckVericationVO, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure);
    
    public abstract void changeEmail(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.requests.EmailRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure);
    
    public abstract void checkEmail(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.requests.EmailCheckRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure);
    
    public abstract void emailList(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.requests.EmailRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<com.fivebb.selfcare.network.responses.EmailListResponse>, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure);
    
    public abstract void updateEmailInfo(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.network.requests.UpdateEmailRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure);
}