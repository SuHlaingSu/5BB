package com.fivebb.shared.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ&\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u001e\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\fJ\u001e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\f\u00a8\u0006\u0018"}, d2 = {"Lcom/fivebb/shared/utils/InputValidityUtil;", "", "()V", "checkEditTextAtLeastCharacterCount", "", "editText", "Landroid/widget/EditText;", "textInputLayout", "Lcom/google/android/material/textfield/TextInputLayout;", "atLeastCount", "", "errorMessage", "", "checkEditTextCharacterCount", "numberOfCharacterLimit", "isEditTextInputEmailValid", "etEmail", "isGivenEditTextHasInput", "isRadioGroupHasSelectedButton", "radioGroup", "Landroid/widget/RadioGroup;", "isSpinnerItemSelected", "spinner", "Landroid/widget/Spinner;", "shared_release"})
public final class InputValidityUtil {
    @org.jetbrains.annotations.NotNull()
    public static final com.fivebb.shared.utils.InputValidityUtil INSTANCE = null;
    
    private InputValidityUtil() {
        super();
    }
    
    public final boolean checkEditTextCharacterCount(@org.jetbrains.annotations.NotNull()
    android.widget.EditText editText, int numberOfCharacterLimit, @org.jetbrains.annotations.NotNull()
    java.lang.String errorMessage) {
        return false;
    }
    
    public final boolean checkEditTextCharacterCount(@org.jetbrains.annotations.NotNull()
    android.widget.EditText editText, @org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputLayout textInputLayout, int numberOfCharacterLimit, @org.jetbrains.annotations.NotNull()
    java.lang.String errorMessage) {
        return false;
    }
    
    public final boolean checkEditTextAtLeastCharacterCount(@org.jetbrains.annotations.NotNull()
    android.widget.EditText editText, @org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputLayout textInputLayout, int atLeastCount, @org.jetbrains.annotations.NotNull()
    java.lang.String errorMessage) {
        return false;
    }
    
    public final boolean isGivenEditTextHasInput(@org.jetbrains.annotations.NotNull()
    android.widget.EditText editText, @org.jetbrains.annotations.NotNull()
    java.lang.String errorMessage) {
        return false;
    }
    
    public final boolean isGivenEditTextHasInput(@org.jetbrains.annotations.NotNull()
    android.widget.EditText editText, @org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputLayout textInputLayout, @org.jetbrains.annotations.NotNull()
    java.lang.String errorMessage) {
        return false;
    }
    
    public final boolean isSpinnerItemSelected(@org.jetbrains.annotations.NotNull()
    android.widget.Spinner spinner, @org.jetbrains.annotations.NotNull()
    java.lang.String errorMessage) {
        return false;
    }
    
    public final boolean isRadioGroupHasSelectedButton(@org.jetbrains.annotations.NotNull()
    android.widget.RadioGroup radioGroup, @org.jetbrains.annotations.NotNull()
    java.lang.String errorMessage) {
        return false;
    }
    
    public final boolean isEditTextInputEmailValid(@org.jetbrains.annotations.NotNull()
    android.widget.EditText etEmail, @org.jetbrains.annotations.NotNull()
    java.lang.String errorMessage) {
        return false;
    }
}