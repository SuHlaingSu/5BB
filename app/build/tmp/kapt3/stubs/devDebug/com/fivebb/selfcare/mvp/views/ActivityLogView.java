package com.fivebb.selfcare.mvp.views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J&\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH&J\b\u0010\f\u001a\u00020\u0005H&\u00a8\u0006\r"}, d2 = {"Lcom/fivebb/selfcare/mvp/views/ActivityLogView;", "Lcom/fivebb/shared/mvp/views/BaseView;", "getContext", "Landroid/content/Context;", "showActivityLog", "", "activityLogList", "", "Lcom/fivebb/shared/vos/ActivityLogVO;", "fromDate", "", "toDate", "showDatePickerDialog", "app_devDebug"})
public abstract interface ActivityLogView extends com.fivebb.shared.mvp.views.BaseView {
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.content.Context getContext();
    
    public abstract void showActivityLog(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fivebb.shared.vos.ActivityLogVO> activityLogList, @org.jetbrains.annotations.NotNull()
    java.lang.String fromDate, @org.jetbrains.annotations.NotNull()
    java.lang.String toDate);
    
    public abstract void showDatePickerDialog();
}