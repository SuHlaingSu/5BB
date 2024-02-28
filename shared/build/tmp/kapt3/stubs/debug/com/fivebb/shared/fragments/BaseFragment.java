package com.fivebb.shared.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0004J\b\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0004J\b\u0010\u000f\u001a\u00020\nH\u0004J\u0018\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/fivebb/shared/fragments/BaseFragment;", "Landroidx/fragment/app/Fragment;", "()V", "alertDialog", "Landroid/app/AlertDialog;", "mLoadingFragment", "Lcom/fivebb/shared/fragments/LoadingFragment;", "mSnackBar", "Lcom/google/android/material/snackbar/Snackbar;", "hideLoadingDialog", "", "positionDialogViews", "showErrorMessage", "message", "", "showLoadingDialog", "showSnackBar", "msg", "anchorView", "Landroid/view/View;", "shared_debug"})
public class BaseFragment extends androidx.fragment.app.Fragment {
    private com.google.android.material.snackbar.Snackbar mSnackBar;
    private android.app.AlertDialog alertDialog;
    private com.fivebb.shared.fragments.LoadingFragment mLoadingFragment;
    private java.util.HashMap _$_findViewCache;
    
    public BaseFragment() {
        super();
    }
    
    public final void showSnackBar(@org.jetbrains.annotations.NotNull()
    java.lang.String msg, @org.jetbrains.annotations.Nullable()
    android.view.View anchorView) {
    }
    
    protected final void showErrorMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    private final void positionDialogViews() {
    }
    
    protected final void showLoadingDialog() {
    }
    
    protected final void hideLoadingDialog() {
    }
}