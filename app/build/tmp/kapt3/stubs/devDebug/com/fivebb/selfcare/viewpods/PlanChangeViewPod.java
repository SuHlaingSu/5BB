package com.fivebb.selfcare.viewpods;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\b\u0010\r\u001a\u00020\nH\u0014\u00a8\u0006\u000f"}, d2 = {"Lcom/fivebb/selfcare/viewpods/PlanChangeViewPod;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "attr", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bindPlanDetails", "", "details", "Lcom/fivebb/shared/vos/ServiceInstanceDetailsVO;", "onFinishInflate", "Companion", "app_devDebug"})
public final class PlanChangeViewPod extends android.widget.RelativeLayout {
    @org.jetbrains.annotations.NotNull()
    public static final com.fivebb.selfcare.viewpods.PlanChangeViewPod.Companion Companion = null;
    @org.jetbrains.annotations.Nullable()
    private static com.fivebb.selfcare.delegates.PlanChangeActionDelegate mDelegate;
    private java.util.HashMap _$_findViewCache;
    
    @kotlin.jvm.JvmOverloads()
    public PlanChangeViewPod(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public PlanChangeViewPod(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attr) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public PlanChangeViewPod(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attr, int defStyleAttr) {
        super(null);
    }
    
    @java.lang.Override()
    protected void onFinishInflate() {
    }
    
    public final void bindPlanDetails(@org.jetbrains.annotations.Nullable()
    com.fivebb.shared.vos.ServiceInstanceDetailsVO details) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u000e"}, d2 = {"Lcom/fivebb/selfcare/viewpods/PlanChangeViewPod$Companion;", "", "()V", "mDelegate", "Lcom/fivebb/selfcare/delegates/PlanChangeActionDelegate;", "getMDelegate", "()Lcom/fivebb/selfcare/delegates/PlanChangeActionDelegate;", "setMDelegate", "(Lcom/fivebb/selfcare/delegates/PlanChangeActionDelegate;)V", "newInstance", "Lcom/fivebb/selfcare/viewpods/PlanChangeViewPod;", "view", "Landroid/view/View;", "delegate", "app_devDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.fivebb.selfcare.delegates.PlanChangeActionDelegate getMDelegate() {
            return null;
        }
        
        public final void setMDelegate(@org.jetbrains.annotations.Nullable()
        com.fivebb.selfcare.delegates.PlanChangeActionDelegate p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.fivebb.selfcare.viewpods.PlanChangeViewPod newInstance(@org.jetbrains.annotations.NotNull()
        android.view.View view, @org.jetbrains.annotations.NotNull()
        com.fivebb.selfcare.delegates.PlanChangeActionDelegate delegate) {
            return null;
        }
    }
}