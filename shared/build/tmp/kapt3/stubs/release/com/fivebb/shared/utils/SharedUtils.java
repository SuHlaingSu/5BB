package com.fivebb.shared.utils;

import java.lang.System;

/**
 * Created by aung on 3/2/18.
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\f\n\u0002\u0010\u001e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\b\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nJ\u001e\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\nJ\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0016J\u000e\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\nJ\u000e\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\nJ\u0006\u0010\u001d\u001a\u00020\nJ\u000e\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\nJ\u0010\u0010 \u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\nJ\u000e\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\nJ \u0010#\u001a\u0014\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020%0$2\u0006\u0010&\u001a\u00020\nJ\u000e\u0010\'\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\nJ\u0016\u0010(\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010)\u001a\u00020\nJ\u000e\u0010*\u001a\u00020\n2\u0006\u0010+\u001a\u00020\nJ\u0010\u0010,\u001a\u00020\n2\b\u0010-\u001a\u0004\u0018\u00010\nJ\u0006\u0010.\u001a\u00020\nJ\u000e\u0010/\u001a\u00020\n2\u0006\u00100\u001a\u00020\nJ\u0006\u00101\u001a\u00020\nJ\u0006\u00102\u001a\u00020\nJ\u000e\u00103\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\nJ\u000e\u00104\u001a\u00020\n2\u0006\u00105\u001a\u00020\nJ\u0006\u00106\u001a\u00020\nJ\u0014\u00107\u001a\b\u0012\u0004\u0012\u00020\n082\u0006\u00109\u001a\u00020%J\u000e\u0010:\u001a\u00020%2\u0006\u0010&\u001a\u00020\nJ\u000e\u0010;\u001a\u00020\n2\u0006\u0010<\u001a\u00020\nJ\u0006\u0010=\u001a\u00020\nJ\u0016\u0010>\u001a\u00020\n2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020\nJ\u000e\u0010B\u001a\u00020\n2\u0006\u0010C\u001a\u00020%J\u0016\u0010D\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010)\u001a\u00020\nJ\u0016\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020\nJ\u0016\u0010J\u001a\u00020@2\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010)\u001a\u00020\nJ\u000e\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020LJ\u0010\u0010N\u001a\u00020\n2\b\u0010O\u001a\u0004\u0018\u00010\nJ\u000e\u0010P\u001a\u00020\n2\u0006\u0010O\u001a\u00020\nJ\u0018\u0010Q\u001a\u00020\n2\b\u0010R\u001a\u0004\u0018\u00010\n2\u0006\u0010)\u001a\u00020\nJ\u0010\u0010S\u001a\u00020\n2\b\u0010T\u001a\u0004\u0018\u00010\nJ\u0014\u0010U\u001a\b\u0012\u0004\u0012\u00020\n082\u0006\u00109\u001a\u00020%J$\u0010V\u001a\u00020\n\"\u0004\b\u0000\u0010W2\f\u0010X\u001a\b\u0012\u0004\u0012\u0002HW0Y2\u0006\u0010Z\u001a\u00020\nH\u0002J\u0016\u0010[\u001a\u00020%2\u0006\u0010\\\u001a\u00020\n2\u0006\u0010]\u001a\u00020\nJ\u0016\u0010^\u001a\u00020\n2\u0006\u0010_\u001a\u00020%2\u0006\u0010)\u001a\u00020\nJ\u000e\u0010`\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\nJ\u000e\u0010a\u001a\u00020@2\u0006\u0010\u0012\u001a\u00020\nJ\u000e\u0010b\u001a\u00020@2\u0006\u0010\u0012\u001a\u00020\nJ\u000e\u0010c\u001a\u00020@2\u0006\u0010\u0012\u001a\u00020\nJ\u000e\u0010d\u001a\u00020\n2\u0006\u0010A\u001a\u00020\nJ\u0016\u0010e\u001a\u00020\n2\u0006\u0010f\u001a\u00020\n2\u0006\u0010G\u001a\u00020HJ\u0014\u0010g\u001a\b\u0012\u0004\u0012\u00020\n082\u0006\u0010h\u001a\u00020%J\u0014\u0010i\u001a\b\u0012\u0004\u0012\u00020\n082\u0006\u00109\u001a\u00020%J\u000e\u0010j\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\nJ\u0016\u0010k\u001a\u00020l2\u0006\u0010-\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\nJ\u000e\u0010m\u001a\u00020l2\u0006\u0010n\u001a\u00020@J\u0010\u0010o\u001a\u00020l2\b\u0010p\u001a\u0004\u0018\u00010qJ\u000e\u0010r\u001a\u00020\n2\u0006\u0010s\u001a\u00020\nJ\u0016\u0010t\u001a\u00020\n2\u0006\u0010u\u001a\u00020\n2\u0006\u0010G\u001a\u00020HJ\u000e\u0010v\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\nJ\u0016\u0010w\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010x\u001a\u00020\u0016R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\f\u00a8\u0006y"}, d2 = {"Lcom/fivebb/shared/utils/SharedUtils;", "", "()V", "ENG_NUMS", "", "getENG_NUMS", "()[C", "MYAN_NUMS", "getMYAN_NUMS", "currentHourMin", "", "getCurrentHourMin", "()Ljava/lang/String;", "currentHourMinIn24", "getCurrentHourMinIn24", "addSpaceInPhoneNumber", "phoneNumber", "changeDateFormat", "date", "fromFormat", "toFormat", "dp2px", "", "resources", "Landroid/content/res/Resources;", "dp", "formatDate", "data", "formatDateT", "get24HourFormatTo4DigitsMilitaryTime", "get24HrFormatTimeExcludeColon", "time", "getAppointmentTimeNumberFormat", "getCalculatedFinishTimeInSessionStartedMessage", "formattedAppointmentDetails", "getCalendarFromDob", "Lkotlin/Triple;", "", "dob", "getChangedDateByFormat", "getDateAndTimeForCancelByPatient", "appointmentStart", "getDateForDay", "dayInWeek", "getDateForSession", "fullDate", "getDateForToday", "getDateFormatForAppointmentHistory", "dateForSession", "getDateThreeMonthsPreviousToday", "getDayInWeekForToday", "getDayInWeekFromDate", "getDayInWeekInMM", "engDay", "getDayOfToday", "getDaysFromToday", "", "days", "getEstAgeFromDateOfBirth", "getFormattedDateForBookingDisplay", "inputDate", "getFormattedDateForToday", "getFormattedDateFromTimestamp", "timeStamp", "", "format", "getGenderFromInt", "gender", "getHoursAndMinutes", "getIntentForImageUpload", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "className", "getMillisFromDateAndTime", "getMyanmarChar", "", "eng", "getPhoneNumberWithCallableFormat", "phoneNo", "getPhoneNumberWithStandardFormat", "getPresentableAppointmentFinishTime", "appointmentFinish", "getPresentableAppointmentTime", "originalAppointmentTime", "getPreviousDaysModelLogic", "getSeparatedString", "T", "collection", "", "separator", "getTimeDifferenceFromTwoDatesV2", "startDateInput", "dueDateInput", "getTimeForYourTurn", "bookingNumber", "getTimeInMM", "getTimestampForDate", "getTimestampFromMobilApiDate", "getTimestampFromUserChooseDate", "getTodayDateByFormat", "getUniFormat", "original", "getUpcomingDateDays", "count", "getUpcomingDays", "getYearMonthDayInNumberString", "isSessionValid", "", "isSessionValidByTimeSlot", "timeSlot", "isValidEmail", "target", "", "md5", "s", "mmTextUnicodeOrigin", "originalText", "patientEstAge", "sp2px", "sp", "shared_release"})
public final class SharedUtils {
    @org.jetbrains.annotations.NotNull()
    public static final com.fivebb.shared.utils.SharedUtils INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    private static final char[] ENG_NUMS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    @org.jetbrains.annotations.NotNull()
    private static final char[] MYAN_NUMS = {'\u101d', '\u1041', '\u1042', '\u1043', '\u1044', '\u1045', '\u1046', '\u1047', '\u1048', '\u1049'};
    
    private SharedUtils() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final char[] getENG_NUMS() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final char[] getMYAN_NUMS() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCurrentHourMinIn24() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCurrentHourMin() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUniFormat(@org.jetbrains.annotations.NotNull()
    java.lang.String original, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String md5(@org.jetbrains.annotations.NotNull()
    java.lang.String s) {
        return null;
    }
    
    public final boolean isValidEmail(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence target) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDayInWeekFromDate(@org.jetbrains.annotations.NotNull()
    java.lang.String date) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDayInWeekInMM(@org.jetbrains.annotations.NotNull()
    java.lang.String engDay) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTimeInMM(@org.jetbrains.annotations.NotNull()
    java.lang.String time) {
        return null;
    }
    
    public final char getMyanmarChar(char eng) {
        return '\u0000';
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDayOfToday() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDayInWeekForToday() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getChangedDateByFormat(@org.jetbrains.annotations.NotNull()
    java.lang.String date) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPresentableAppointmentTime(@org.jetbrains.annotations.Nullable()
    java.lang.String originalAppointmentTime) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String get24HourFormatTo4DigitsMilitaryTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String patientEstAge(@org.jetbrains.annotations.NotNull()
    java.lang.String date) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHoursAndMinutes(@org.jetbrains.annotations.NotNull()
    java.lang.String date, @org.jetbrains.annotations.NotNull()
    java.lang.String appointmentStart) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAppointmentTimeNumberFormat(@org.jetbrains.annotations.Nullable()
    java.lang.String time) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.Triple<java.lang.Integer, java.lang.Integer, java.lang.Integer> getCalendarFromDob(@org.jetbrains.annotations.NotNull()
    java.lang.String dob) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPhoneNumberWithStandardFormat(@org.jetbrains.annotations.NotNull()
    java.lang.String phoneNo) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPhoneNumberWithCallableFormat(@org.jetbrains.annotations.Nullable()
    java.lang.String phoneNo) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGenderFromInt(int gender) {
        return null;
    }
    
    public final int getEstAgeFromDateOfBirth(@org.jetbrains.annotations.NotNull()
    java.lang.String dob) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getUpcomingDays(int days) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getDaysFromToday(int days) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFormattedDateForBookingDisplay(@org.jetbrains.annotations.NotNull()
    java.lang.String inputDate) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDateForDay(@org.jetbrains.annotations.NotNull()
    java.lang.String dayInWeek) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDateAndTimeForCancelByPatient(@org.jetbrains.annotations.NotNull()
    java.lang.String date, @org.jetbrains.annotations.NotNull()
    java.lang.String appointmentStart) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFormattedDateForToday() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDateForToday() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDateThreeMonthsPreviousToday() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getUpcomingDateDays(int count) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTodayDateByFormat(@org.jetbrains.annotations.NotNull()
    java.lang.String format) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String changeDateFormat(@org.jetbrains.annotations.NotNull()
    java.lang.String date, @org.jetbrains.annotations.NotNull()
    java.lang.String fromFormat, @org.jetbrains.annotations.NotNull()
    java.lang.String toFormat) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String formatDate(@org.jetbrains.annotations.NotNull()
    java.lang.String data) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String formatDateT(@org.jetbrains.annotations.NotNull()
    java.lang.String data) {
        return null;
    }
    
    public final long getTimestampForDate(@org.jetbrains.annotations.NotNull()
    java.lang.String date) {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFormattedDateFromTimestamp(long timeStamp, @org.jetbrains.annotations.NotNull()
    java.lang.String format) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getPreviousDaysModelLogic(int days) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String mmTextUnicodeOrigin(@org.jetbrains.annotations.NotNull()
    java.lang.String originalText, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String get24HrFormatTimeExcludeColon(@org.jetbrains.annotations.NotNull()
    java.lang.String time) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getYearMonthDayInNumberString(@org.jetbrains.annotations.NotNull()
    java.lang.String date) {
        return null;
    }
    
    public final boolean isSessionValid(@org.jetbrains.annotations.NotNull()
    java.lang.String fullDate, @org.jetbrains.annotations.NotNull()
    java.lang.String time) {
        return false;
    }
    
    public final boolean isSessionValidByTimeSlot(long timeSlot) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCalculatedFinishTimeInSessionStartedMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String formattedAppointmentDetails) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDateForSession(@org.jetbrains.annotations.Nullable()
    java.lang.String fullDate) {
        return null;
    }
    
    public final long getMillisFromDateAndTime(@org.jetbrains.annotations.NotNull()
    java.lang.String date, @org.jetbrains.annotations.NotNull()
    java.lang.String appointmentStart) {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTimeForYourTurn(int bookingNumber, @org.jetbrains.annotations.NotNull()
    java.lang.String appointmentStart) {
        return null;
    }
    
    private final <T extends java.lang.Object>java.lang.String getSeparatedString(java.util.Collection<? extends T> collection, java.lang.String separator) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPresentableAppointmentFinishTime(@org.jetbrains.annotations.Nullable()
    java.lang.String appointmentFinish, @org.jetbrains.annotations.NotNull()
    java.lang.String appointmentStart) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String addSpaceInPhoneNumber(@org.jetbrains.annotations.NotNull()
    java.lang.String phoneNumber) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDateFormatForAppointmentHistory(@org.jetbrains.annotations.NotNull()
    java.lang.String dateForSession) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Intent getIntentForImageUpload(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String className) {
        return null;
    }
    
    public final float dp2px(@org.jetbrains.annotations.NotNull()
    android.content.res.Resources resources, float dp) {
        return 0.0F;
    }
    
    public final float sp2px(@org.jetbrains.annotations.NotNull()
    android.content.res.Resources resources, float sp) {
        return 0.0F;
    }
    
    /**
     * Test case များကို  DateDiffCalculationTest တ္ငင်ရေးထားပါသည်။
     * positive integer ဆိုရင် -> due date ရောက်ဖို့လိုသေးတယ်
     * zero ဆိုရင် -> due date ရောက်နေပြီ
     * negative integer ဆိုရင် -> due date ကိုကျော်သွားပြီ
     *
     * @param startDateInput -> start date ကို {yyyy-MM-dd hh:mm:ss} format နဲ့ထည့်ပေးရမယ်။
     * @param dueDateInput -> end date ကို {yyyy-MM-dd hh:mm:ss} format နဲ့ထည့်ပေးရမယ်။
     * @return Date နှစ်ခုရဲ့ စုစုပေါင်းခြားနားချက်ကို Day အနေနဲ့ ပြန်ပေးတယ်။ ဥပမာ... Due Date ကိုရောက်ဖို့် ဆယ်ရက်လိုတယ်ဆိုရင် 10 return ပြန်ပေးတယ်။
     */
    public final int getTimeDifferenceFromTwoDatesV2(@org.jetbrains.annotations.NotNull()
    java.lang.String startDateInput, @org.jetbrains.annotations.NotNull()
    java.lang.String dueDateInput) {
        return 0;
    }
    
    public final long getTimestampFromMobilApiDate(@org.jetbrains.annotations.NotNull()
    java.lang.String date) {
        return 0L;
    }
    
    public final long getTimestampFromUserChooseDate(@org.jetbrains.annotations.NotNull()
    java.lang.String date) {
        return 0L;
    }
}