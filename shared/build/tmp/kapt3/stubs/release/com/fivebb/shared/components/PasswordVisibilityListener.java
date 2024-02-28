package com.fivebb.shared.components;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/fivebb/shared/components/PasswordVisibilityListener;", "Landroid/view/View$OnTouchListener;", "()V", "isPasswordShown", "", "onTouch", "view", "Landroid/view/View;", "event", "Landroid/view/MotionEvent;", "Companion", "shared_release"})
public final class PasswordVisibilityListener implements android.view.View.OnTouchListener {
    private boolean isPasswordShown = false;
    @org.jetbrains.annotations.NotNull()
    public static final com.fivebb.shared.components.PasswordVisibilityListener.Companion Companion = null;
    private static final int DRAWABLE_RIGHT = 2;
    
    public PasswordVisibilityListener() {
        super();
    }
    
    @java.lang.Override()
    public boolean onTouch(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    android.view.MotionEvent event) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/fivebb/shared/components/PasswordVisibilityListener$Companion;", "", "()V", "DRAWABLE_RIGHT", "", "shared_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}