package com.fivebb.selfcare.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\bF\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0018\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0019\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001a\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001d\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001e\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001f\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010 \u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010!\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\"\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010#\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010$\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010%\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010&\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\'\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010(\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010)\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010*\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010+\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010,\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010-\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010.\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010/\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u00100\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u00101\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u00102\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u00103\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u00104\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u00105\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u00106\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u00107\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u00108\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u00109\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010:\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010;\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010<\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010=\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010>\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010?\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010@\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010A\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010B\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010C\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010D\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010E\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010F\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006G"}, d2 = {"API_ADVANCE_PAYMENT", "", "API_ADV_TOP_UP", "API_ADV_TOP_UP_ACTION", "API_APP_IMAGE_LIST", "API_AYA_PAY", "API_AYA_QUERY_ORDER", "API_CHANGE_PASSWORD", "API_CHECK_VERIFICATION", "API_CITIZEN_PAY", "API_CITIZEN_RETRIEVE", "API_CUSTOMER_DETAIL", "API_DEL_NOTI_ID", "API_EMAIL_CHECK_VERIFICATION", "API_EMAIL_LIST", "API_EMAIL_VERIFICATION", "API_GET_APP_VERSION", "API_GET_PLAN", "API_GET_RECHARGE_LIST", "API_GET_REGION", "API_GET_SECRET_QUESTION", "API_INVOICE_DOWNLOAD", "API_KBZ_ORDER_INFO", "API_KBZ_PRE_CREATE", "API_KBZ_QUERY_ORDER", "API_LIST_OF_BILL", "API_LOAD_TICKET_CONFIGURATION", "API_LOG_IN_BY_PHONENUMBER_AND_PASSWORD", "API_NOTIFICATION", "API_PAYMENT_HISTORY", "API_PAYMENT_METHOD", "API_PX_PLAN", "API_RECHARGED_HISTORY", "API_SAVE_ACTIVITY", "API_SAVE_ACTIVITY_LOG", "API_SEND_EMAIL", "API_SERVICE_INSTANCE_SUMMARY_DETAILS", "API_TOPICS", "API_UPDATE_EMAIL_INFO", "API_UPDATE_NOTI_ID", "API_VALIDATE_SECRET_QUESTION", "API_WAVE_PAY", "API_WAVE_QUERY_ORDER", "AYA_MB", "AYA_MOBILE_BANKING_PACKAGE_NAME", "AYA_PAY", "CB_MB", "CB_MOBILE_BANKING_PACKAGE_NAME", "CB_PAY", "CITIZEN_PACKAGE_NAME", "CITIZEN_PAY", "FIVEBB_FACEBOOK_PAGE", "FIVEBB_GMAIL_ADDRESS", "FIVEBB_YOUTUBE_CHANNEL", "IMAGE_TYPE_ADS", "IMAGE_TYPE_SLIDE", "KBZ_MB", "KBZ_MOBILE_BANKING_PACKAGE_NAME", "KBZ_PAY", "KBZ_PAY_PACKAGE_NAME", "K_PAY", "LINK_FOR_POP_UP_ADS", "MANDALAY_SMART_PAY", "MSP_PACKAGE_NAME", "ONE_PAY", "ONE_PAY_PACKAGE_NAME", "RECHARGED_HISTORY_TYPE", "TICKET_CONFIG_VISIBILITY_FLAG", "UAB_BANK_PACKAGE_NAME", "WAVE_MONEY_PACKAGE_NAME", "WAVE_PAY", "app_devDebug"})
public final class AppConstantsKt {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_LOG_IN_BY_PHONENUMBER_AND_PASSWORD = "customer/login";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_CUSTOMER_DETAIL = "customer/getCustomerBasicViewDetail";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_CHANGE_PASSWORD = "customer/changecustomerpassword";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_PAYMENT_HISTORY = "customer/getPaymentHistory";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_LIST_OF_BILL = "customer/searchBill";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_LOAD_TICKET_CONFIGURATION = "ticket/loadConfiguration";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_RECHARGED_HISTORY = "customer/getrechargehistory";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_SERVICE_INSTANCE_SUMMARY_DETAILS = "customer/getServiceInstanceSummaryDetail";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_GET_SECRET_QUESTION = "customer/forgotpassword/getsecretquestion";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_VALIDATE_SECRET_QUESTION = "customer/forgotpassword/validatesecretquestion";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_EMAIL_LIST = "GetEmailList";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_EMAIL_VERIFICATION = "AccountVerification";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_EMAIL_CHECK_VERIFICATION = "CheckAccountVerification";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_UPDATE_EMAIL_INFO = "UpdateCustomerContact";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_PAYMENT_METHOD = "GetPaymentMethod";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_CHECK_VERIFICATION = "CheckVerification";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_GET_PLAN = "GetPlan";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_SAVE_ACTIVITY = "SaveActivityLog";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_SAVE_ACTIVITY_LOG = "GetActivityLog";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_SEND_EMAIL = "SendEmail";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_TOPICS = "GetTopicV2";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_NOTIFICATION = "NotiListv2";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_GET_RECHARGE_LIST = "GetRechargePlan";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_DEL_NOTI_ID = "DeleteNotiByID";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_UPDATE_NOTI_ID = "UpdateNotiByID";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_APP_IMAGE_LIST = "AppImageList";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_GET_REGION = "RegionList";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_GET_APP_VERSION = "MobileAppAPI/GetAppVersionV2";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_ADVANCE_PAYMENT = "BSS/GetDetail";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_ADV_TOP_UP = "PlanPriceList";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_ADV_TOP_UP_ACTION = "AdvancePaymentPlanAction";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_INVOICE_DOWNLOAD = "DownloadPaymentSlip";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_PX_PLAN = "Payment/PXPlanPriceList";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_KBZ_PRE_CREATE = "Payment/KBZPrecreateV2";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_KBZ_QUERY_ORDER = "Payment/KBZQueryOrder";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_KBZ_ORDER_INFO = "Payment/KBZOrderInfo";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_AYA_PAY = "Payment/AYARequestPushPayment";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_AYA_QUERY_ORDER = "Payment/AYAQueryOrder";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_CITIZEN_PAY = "Payment/MCBEMoneyPayments";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_CITIZEN_RETRIEVE = "Payment/GTGMCBRetrieveEmoneyPayment";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_WAVE_PAY = "Payment/WMPaymentRequest";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_WAVE_QUERY_ORDER = "Payment/WMQueryOrder";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FIVEBB_YOUTUBE_CHANNEL = "https://www.youtube.com/channel/UCQVlPVeErSUw0UO3VAtzxhA?fbclid=IwAR21QsT9HgF_FJJFlKRmF8Zc6ZVtEIRnIc6JQcjfnEAfFqkV2gxeeKzYBww";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FIVEBB_FACEBOOK_PAGE = "https://www.facebook.com/5BBbroadband/?ref=br_rs";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FIVEBB_GMAIL_ADDRESS = "salesoffice471.5bb@gmail.com";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TICKET_CONFIG_VISIBILITY_FLAG = "0";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String RECHARGED_HISTORY_TYPE = "ALL";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String AYA_MOBILE_BANKING_PACKAGE_NAME = "com.jits.mobile.aya";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KBZ_MOBILE_BANKING_PACKAGE_NAME = "com.ofss.fcdb.mobile.android.phone.kbz.launcher";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KBZ_PAY_PACKAGE_NAME = "com.kbzbank.kpaycustomer";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CITIZEN_PACKAGE_NAME = "citizen";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CB_MOBILE_BANKING_PACKAGE_NAME = "com.cbbank.cbmbanking";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ONE_PAY_PACKAGE_NAME = "com.agd.upi";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MSP_PACKAGE_NAME = "com.ccpp.msp";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String WAVE_MONEY_PACKAGE_NAME = "mm.com.wavemoney.wavepay";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String UAB_BANK_PACKAGE_NAME = "com.uab.FinacleMobileApp";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KBZ_MB = "KBZ_MobileBanking";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String AYA_MB = "AYA_MobileBanking";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CB_MB = "CB_MobileBanking";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String K_PAY = "KBZ_Pay";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String AYA_PAY = "AYA_Pay";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CB_PAY = "KBZ_MobileBanking";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String WAVE_PAY = "Wave_Pay";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CITIZEN_PAY = "Citizens_Pay";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ONE_PAY = "One_Pay";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MANDALAY_SMART_PAY = "MandalaySmart_Pay";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LINK_FOR_POP_UP_ADS = "http://www.5bb.com.mm/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String IMAGE_TYPE_SLIDE = "Slide";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String IMAGE_TYPE_ADS = "Ads";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KBZ_PAY = "KBZ_PAY";
}