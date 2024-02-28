package com.fivebb.shared.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\f\b&\u0018\u0000 E2\u00020\u0001:\u0001EB\u0005\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00042\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u001aH\u0004J\u0010\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0004H\u0004J\b\u0010\u001d\u001a\u00020\u0017H\u0002J\u0010\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010!\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u0004H\u0002J\b\u0010$\u001a\u00020\u0017H\u0002J\u0010\u0010%\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u000eH\u0016J\u0010\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u0004H\u0002J\b\u0010*\u001a\u00020\u0017H\u0004J\u0010\u0010+\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020 H\u0004J\u0010\u0010,\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020 H\u0004J\u0010\u0010-\u001a\u00020\u00172\u0006\u0010.\u001a\u00020\u0004H\u0004J\u0010\u0010/\u001a\u00020\u00172\u0006\u0010.\u001a\u00020\u0004H\u0004J\"\u00100\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020 2\u0006\u00101\u001a\u00020 2\b\u00102\u001a\u0004\u0018\u000103H\u0014J\u0012\u00104\u001a\u00020\u00172\b\u00105\u001a\u0004\u0018\u000106H\u0014J-\u00107\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020 2\u000e\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u0004082\u0006\u00109\u001a\u00020:H\u0016\u00a2\u0006\u0002\u0010;J\b\u0010<\u001a\u00020\u0017H\u0014J\b\u0010=\u001a\u00020\u0017H\u0002J\b\u0010>\u001a\u00020\u0017H\u0002J\b\u0010?\u001a\u00020\u0017H\u0002J\u0010\u0010@\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0004H\u0004J\u001e\u0010@\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00042\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00170\u001aH\u0004J\b\u0010B\u001a\u00020\u0017H\u0004J\u001e\u0010C\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00042\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00170\u001aH\u0004J\b\u0010D\u001a\u00020\u0017H\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0015X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006F"}, d2 = {"Lcom/fivebb/shared/activities/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "FIVEBB", "", "getFIVEBB", "()Ljava/lang/String;", "alertDialog", "Landroid/app/AlertDialog;", "getAlertDialog", "()Landroid/app/AlertDialog;", "setAlertDialog", "(Landroid/app/AlertDialog;)V", "fileUri", "Landroid/net/Uri;", "mLoadingFragment", "Lcom/fivebb/shared/fragments/LoadingFragment;", "permissions", "Ljava/util/ArrayList;", "permissionsRejected", "permissionsToRequest", "", "confirmDialog", "", "message", "clickOk", "Lkotlin/Function0;", "dialCall", "phoneNo", "filterOutUngrantedPermissions", "fireCameraIntentWithRequestCode", "requestCode", "", "fireGalleryWithRequestCode", "forceUpdateLocale", "language", "getAllPermissionRequestsFromManifest", "getSelectedImageUri", "imageUri", "hasPermission", "", "permission", "hideLoadingDialog", "imageFromGallery", "imageUploadByCamera", "navigateToEmailAddress", "address", "navigateToLink", "onActivityResult", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onRequestPermissionsResult", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "positionDialogViews", "requestAllUngrantedPermissions", "requestRejectedPermissions", "showErrorMessage", "action", "showLoadingDialog", "showSuccessMessage", "showWarningDialogWhenRejectedAndAskForPermissionsAgain", "Companion", "shared_release"})
public abstract class BaseActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String FIVEBB = "5bb";
    private android.net.Uri fileUri;
    private java.util.List<java.lang.String> permissionsToRequest;
    private java.util.ArrayList<java.lang.String> permissionsRejected;
    private java.util.ArrayList<java.lang.String> permissions;
    @org.jetbrains.annotations.Nullable()
    private android.app.AlertDialog alertDialog;
    private com.fivebb.shared.fragments.LoadingFragment mLoadingFragment;
    @org.jetbrains.annotations.NotNull()
    public static final com.fivebb.shared.activities.BaseActivity.Companion Companion = null;
    public static final int ALL_REQUEST_CODE = 1111;
    public static final int PROFILE_IMAGE_SELECT_BY_CAMERA = 111;
    private java.util.HashMap _$_findViewCache;
    
    public BaseActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFIVEBB() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.app.AlertDialog getAlertDialog() {
        return null;
    }
    
    public final void setAlertDialog(@org.jetbrains.annotations.Nullable()
    android.app.AlertDialog p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    private final void getAllPermissionRequestsFromManifest() {
    }
    
    private final void filterOutUngrantedPermissions() {
    }
    
    private final void requestAllUngrantedPermissions() {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    private final void showWarningDialogWhenRejectedAndAskForPermissionsAgain() {
    }
    
    private final void requestRejectedPermissions() {
    }
    
    private final boolean hasPermission(java.lang.String permission) {
        return false;
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    protected final void imageUploadByCamera(int requestCode) {
    }
    
    protected final void imageFromGallery(int requestCode) {
    }
    
    private final void fireCameraIntentWithRequestCode(int requestCode) {
    }
    
    private final void fireGalleryWithRequestCode(int requestCode) {
    }
    
    public void getSelectedImageUri(@org.jetbrains.annotations.NotNull()
    android.net.Uri imageUri) {
    }
    
    protected final void dialCall(@org.jetbrains.annotations.NotNull()
    java.lang.String phoneNo) {
    }
    
    protected final void navigateToLink(@org.jetbrains.annotations.NotNull()
    java.lang.String address) {
    }
    
    protected final void navigateToEmailAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String address) {
    }
    
    private final void forceUpdateLocale(java.lang.String language) {
    }
    
    protected final void showErrorMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    protected final void showErrorMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> action) {
    }
    
    protected final void showSuccessMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> action) {
    }
    
    protected final void confirmDialog(@org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> clickOk) {
    }
    
    private final void positionDialogViews() {
    }
    
    protected final void showLoadingDialog() {
    }
    
    protected final void hideLoadingDialog() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/fivebb/shared/activities/BaseActivity$Companion;", "", "()V", "ALL_REQUEST_CODE", "", "PROFILE_IMAGE_SELECT_BY_CAMERA", "shared_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}