package com.fivebb.selfcare.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001a\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00192\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0018\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\nH\u0002J\b\u0010\u001c\u001a\u00020\u0010H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/fivebb/selfcare/fragments/ChooseDateRangeFragment;", "Landroidx/fragment/app/DialogFragment;", "mDelegate", "Lcom/fivebb/selfcare/delegates/PaymentHistoryFilterActionDelegate;", "(Lcom/fivebb/selfcare/delegates/PaymentHistoryFilterActionDelegate;)V", "chooseFromDate", "", "dialog", "Landroidx/appcompat/app/AlertDialog;", "mCreatedDate", "", "getMDelegate", "()Lcom/fivebb/selfcare/delegates/PaymentHistoryFilterActionDelegate;", "mFromDate", "mToDate", "disableView", "", "view", "Lmm/technomation/mmtext/MMTextView;", "enabelView", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "Landroid/view/View;", "showSnackBar", "message", "swapValidDateRangeAndAction", "Companion", "app_psrDebug"})
public final class ChooseDateRangeFragment extends androidx.fragment.app.DialogFragment {
    @org.jetbrains.annotations.NotNull()
    private final com.fivebb.selfcare.delegates.PaymentHistoryFilterActionDelegate mDelegate = null;
    private androidx.appcompat.app.AlertDialog dialog;
    private java.lang.String mFromDate = "";
    private java.lang.String mToDate = "";
    private java.lang.String mCreatedDate = "";
    private boolean chooseFromDate = true;
    @org.jetbrains.annotations.NotNull()
    public static final com.fivebb.selfcare.fragments.ChooseDateRangeFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CHOOSE_DATE_RANGE_FRAGMENT = "CHOOSE_DATE_RANGE_FRAGMENT";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FROM_DATE = "FROM_DATE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TO_DATE = "TO_DATE";
    private java.util.HashMap _$_findViewCache;
    
    public ChooseDateRangeFragment(@org.jetbrains.annotations.NotNull()
    com.fivebb.selfcare.delegates.PaymentHistoryFilterActionDelegate mDelegate) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fivebb.selfcare.delegates.PaymentHistoryFilterActionDelegate getMDelegate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void disableView(mm.technomation.mmtext.MMTextView view) {
    }
    
    private final void enabelView(mm.technomation.mmtext.MMTextView view) {
    }
    
    private final void showSnackBar(android.view.View view, java.lang.String message) {
    }
    
    private final void swapValidDateRangeAndAction() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/fivebb/selfcare/fragments/ChooseDateRangeFragment$Companion;", "", "()V", "CHOOSE_DATE_RANGE_FRAGMENT", "", "FROM_DATE", "TO_DATE", "newInstance", "Lcom/fivebb/selfcare/fragments/ChooseDateRangeFragment;", "bundle", "Landroid/os/Bundle;", "delegate", "Lcom/fivebb/selfcare/delegates/PaymentHistoryFilterActionDelegate;", "app_psrDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.fivebb.selfcare.fragments.ChooseDateRangeFragment newInstance(@org.jetbrains.annotations.Nullable()
        android.os.Bundle bundle, @org.jetbrains.annotations.NotNull()
        com.fivebb.selfcare.delegates.PaymentHistoryFilterActionDelegate delegate) {
            return null;
        }
    }
}