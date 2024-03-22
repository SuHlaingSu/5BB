package com.fivebb.selfcare.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u000e\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/fivebb/selfcare/fragments/AdsFragment;", "Landroidx/fragment/app/DialogFragment;", "()V", "dialog", "Landroid/app/AlertDialog;", "mData", "Lcom/fivebb/shared/vos/AppImageVO;", "mDelegate", "Lcom/fivebb/selfcare/delegates/PopupActionDelegate;", "onAttach", "", "context", "Landroid/content/Context;", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "setDelegate", "delegate", "Companion", "app_devDebug"})
public final class AdsFragment extends androidx.fragment.app.DialogFragment {
    private android.app.AlertDialog dialog;
    private com.fivebb.selfcare.delegates.PopupActionDelegate mDelegate;
    private com.fivebb.shared.vos.AppImageVO mData;
    @org.jetbrains.annotations.NotNull()
    public static final com.fivebb.selfcare.fragments.AdsFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ADS_FRAGMENT = "ADS_FRAGMENT";
    private java.util.HashMap _$_findViewCache;
    
    public AdsFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void setDelegate(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.delegates.PopupActionDelegate delegate) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/fivebb/selfcare/fragments/AdsFragment$Companion;", "", "()V", "ADS_FRAGMENT", "", "newInstance", "Lcom/fivebb/selfcare/fragments/AdsFragment;", "data", "Lcom/fivebb/shared/vos/AppImageVO;", "app_devDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.fivebb.selfcare.fragments.AdsFragment newInstance(@org.jetbrains.annotations.NotNull()
        com.fivebb.shared.vos.AppImageVO data) {
            return null;
        }
    }
}