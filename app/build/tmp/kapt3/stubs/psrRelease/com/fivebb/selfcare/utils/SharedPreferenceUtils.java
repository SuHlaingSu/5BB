package com.fivebb.selfcare.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\'\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\'\n\u0002\u0010!\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.J\u000e\u0010/\u001a\u00020,2\u0006\u0010-\u001a\u00020.J\u000e\u00100\u001a\u00020,2\u0006\u0010-\u001a\u00020.J\u000e\u00101\u001a\u00020,2\u0006\u0010-\u001a\u00020.J\u000e\u00102\u001a\u00020,2\u0006\u0010-\u001a\u00020.J\u000e\u00103\u001a\u00020,2\u0006\u0010-\u001a\u00020.J\u000e\u00104\u001a\u00020,2\u0006\u0010-\u001a\u00020.J\u000e\u00105\u001a\u00020,2\u0006\u0010-\u001a\u00020.J\u000e\u00106\u001a\u00020,2\u0006\u0010-\u001a\u00020.J\u000e\u00107\u001a\u00020,2\u0006\u0010-\u001a\u00020.J\u000e\u00108\u001a\u00020,2\u0006\u0010-\u001a\u00020.J\u000e\u00109\u001a\u00020,2\u0006\u0010-\u001a\u00020.J\u000e\u0010:\u001a\u00020\u00042\u0006\u0010-\u001a\u00020.J\u000e\u0010;\u001a\u00020\u00042\u0006\u0010-\u001a\u00020.J\u000e\u0010<\u001a\u00020\u00042\u0006\u0010-\u001a\u00020.J\u000e\u0010=\u001a\u00020\u00042\u0006\u0010-\u001a\u00020.J\u0010\u0010>\u001a\u0004\u0018\u00010?2\u0006\u0010-\u001a\u00020.J\u000e\u0010@\u001a\u00020\u00042\u0006\u0010-\u001a\u00020.J\u0010\u0010A\u001a\u0004\u0018\u00010B2\u0006\u0010-\u001a\u00020.J\u000e\u0010C\u001a\u00020\u00042\u0006\u0010-\u001a\u00020.J\u000e\u0010D\u001a\u00020\u00042\u0006\u0010-\u001a\u00020.J\u000e\u0010E\u001a\u00020\u00042\u0006\u0010-\u001a\u00020.J\u000e\u0010F\u001a\u00020\u00042\u0006\u0010-\u001a\u00020.J\u000e\u0010G\u001a\u00020\u00042\u0006\u0010-\u001a\u00020.J\u000e\u0010H\u001a\u00020\u00042\u0006\u0010-\u001a\u00020.J\u000e\u0010I\u001a\u00020\u00042\u0006\u0010-\u001a\u00020.J\u000e\u0010J\u001a\u00020,2\u0006\u0010-\u001a\u00020.J\u000e\u0010K\u001a\u00020\u00042\u0006\u0010-\u001a\u00020.J\u000e\u0010L\u001a\u00020\u00042\u0006\u0010-\u001a\u00020.J\u000e\u0010M\u001a\u00020\u00042\u0006\u0010-\u001a\u00020.J\u0010\u0010N\u001a\u0004\u0018\u00010O2\u0006\u0010-\u001a\u00020.J\u000e\u0010P\u001a\u00020\u00042\u0006\u0010-\u001a\u00020.J\u000e\u0010Q\u001a\u00020\u00042\u0006\u0010-\u001a\u00020.J\u000e\u0010R\u001a\u00020\u00042\u0006\u0010-\u001a\u00020.J\u000e\u0010S\u001a\u00020\u00042\u0006\u0010-\u001a\u00020.J\u000e\u0010T\u001a\u00020,2\u0006\u0010-\u001a\u00020.J\u000e\u0010U\u001a\u00020,2\u0006\u0010-\u001a\u00020.J\u000e\u0010V\u001a\u00020,2\u0006\u0010-\u001a\u00020.J\u000e\u0010W\u001a\u00020\u00042\u0006\u0010-\u001a\u00020.J\u000e\u0010X\u001a\u00020\u00042\u0006\u0010-\u001a\u00020.J\u000e\u0010Y\u001a\u00020\u00042\u0006\u0010-\u001a\u00020.J\u000e\u0010Z\u001a\u00020\u00042\u0006\u0010-\u001a\u00020.J\u000e\u0010[\u001a\u00020\u00042\u0006\u0010-\u001a\u00020.J\u0010\u0010\\\u001a\u0004\u0018\u00010]2\u0006\u0010-\u001a\u00020.J\u000e\u0010^\u001a\u00020\u00042\u0006\u0010-\u001a\u00020.J\u000e\u0010_\u001a\u00020\u00042\u0006\u0010-\u001a\u00020.J\u000e\u0010`\u001a\u00020\u00042\u0006\u0010-\u001a\u00020.J\u000e\u0010a\u001a\u00020\u00042\u0006\u0010-\u001a\u00020.J\u0010\u0010b\u001a\u0004\u0018\u00010c2\u0006\u0010-\u001a\u00020.J\u000e\u0010d\u001a\u00020\u00042\u0006\u0010-\u001a\u00020.J\u000e\u0010e\u001a\u00020\u00042\u0006\u0010-\u001a\u00020.J\u000e\u0010f\u001a\u00020\u00042\u0006\u0010-\u001a\u00020.J\u0010\u0010g\u001a\u00020h2\u0006\u0010-\u001a\u00020.H\u0002J\u0010\u0010i\u001a\u00020j2\u0006\u0010-\u001a\u00020.H\u0002J\u000e\u0010k\u001a\u00020\u00042\u0006\u0010-\u001a\u00020.J\u0016\u0010l\u001a\u00020m2\u0006\u0010-\u001a\u00020.2\u0006\u0010n\u001a\u00020\u0004J\u0016\u0010o\u001a\u00020m2\u0006\u0010-\u001a\u00020.2\u0006\u0010p\u001a\u00020\u0004J\u0016\u0010q\u001a\u00020m2\u0006\u0010-\u001a\u00020.2\u0006\u0010r\u001a\u00020\u0004J\u0016\u0010s\u001a\u00020m2\u0006\u0010-\u001a\u00020.2\u0006\u0010t\u001a\u00020\u0004J\u0016\u0010u\u001a\u00020m2\u0006\u0010-\u001a\u00020.2\u0006\u0010v\u001a\u00020?J\u0016\u0010w\u001a\u00020m2\u0006\u0010-\u001a\u00020.2\u0006\u0010x\u001a\u00020\u0004J\u0016\u0010y\u001a\u00020m2\u0006\u0010-\u001a\u00020.2\u0006\u0010z\u001a\u00020\u0004J\u0016\u0010{\u001a\u00020m2\u0006\u0010-\u001a\u00020.2\u0006\u0010v\u001a\u00020BJ\u0016\u0010|\u001a\u00020m2\u0006\u0010-\u001a\u00020.2\u0006\u0010}\u001a\u00020\u0004J\u0016\u0010~\u001a\u00020m2\u0006\u0010-\u001a\u00020.2\u0006\u0010\u007f\u001a\u00020\u0004J\u0018\u0010\u0080\u0001\u001a\u00020m2\u0006\u0010-\u001a\u00020.2\u0007\u0010\u0081\u0001\u001a\u00020\u0004J\u0018\u0010\u0082\u0001\u001a\u00020m2\u0006\u0010-\u001a\u00020.2\u0007\u0010\u0083\u0001\u001a\u00020\u0004J\u0018\u0010\u0084\u0001\u001a\u00020m2\u0006\u0010-\u001a\u00020.2\u0007\u0010\u0081\u0001\u001a\u00020\u0004J\u0018\u0010\u0085\u0001\u001a\u00020m2\u0006\u0010-\u001a\u00020.2\u0007\u0010\u0086\u0001\u001a\u00020\u0004J\u0018\u0010\u0087\u0001\u001a\u00020m2\u0006\u0010-\u001a\u00020.2\u0007\u0010\u0088\u0001\u001a\u00020,J\u0018\u0010\u0089\u0001\u001a\u00020m2\u0006\u0010-\u001a\u00020.2\u0007\u0010\u008a\u0001\u001a\u00020\u0004J\u0018\u0010\u008b\u0001\u001a\u00020m2\u0006\u0010-\u001a\u00020.2\u0007\u0010\u008c\u0001\u001a\u00020\u0004J\u0017\u0010\u008d\u0001\u001a\u00020m2\u0006\u0010-\u001a\u00020.2\u0006\u0010v\u001a\u00020\u0004J\u0018\u0010\u008e\u0001\u001a\u00020m2\u0006\u0010-\u001a\u00020.2\u0007\u0010\u008f\u0001\u001a\u00020,J\u0018\u0010\u0090\u0001\u001a\u00020m2\u0006\u0010-\u001a\u00020.2\u0007\u0010\u0091\u0001\u001a\u00020OJ\u0018\u0010\u0092\u0001\u001a\u00020m2\u0006\u0010-\u001a\u00020.2\u0007\u0010\u0081\u0001\u001a\u00020\u0004J\u001f\u0010\u0093\u0001\u001a\u00020m2\u0006\u0010-\u001a\u00020.2\u000e\u0010\u0094\u0001\u001a\t\u0012\u0004\u0012\u00020\u00040\u0095\u0001J\u0018\u0010\u0096\u0001\u001a\u00020m2\u0006\u0010-\u001a\u00020.2\u0007\u0010\u0097\u0001\u001a\u00020\u0004J\u0018\u0010\u0098\u0001\u001a\u00020m2\u0006\u0010-\u001a\u00020.2\u0007\u0010\u0099\u0001\u001a\u00020\u0004J\u0018\u0010\u009a\u0001\u001a\u00020m2\u0006\u0010-\u001a\u00020.2\u0007\u0010\u009b\u0001\u001a\u00020,J\u0018\u0010\u009c\u0001\u001a\u00020m2\u0006\u0010-\u001a\u00020.2\u0007\u0010\u009d\u0001\u001a\u00020,J\u0018\u0010\u009e\u0001\u001a\u00020m2\u0006\u0010-\u001a\u00020.2\u0007\u0010\u009f\u0001\u001a\u00020\u0004J\u0018\u0010\u00a0\u0001\u001a\u00020m2\u0006\u0010-\u001a\u00020.2\u0007\u0010\u00a1\u0001\u001a\u00020\u0004J\u0018\u0010\u00a2\u0001\u001a\u00020m2\u0006\u0010-\u001a\u00020.2\u0007\u0010\u00a3\u0001\u001a\u00020\u0004J\u0018\u0010\u00a4\u0001\u001a\u00020m2\u0006\u0010-\u001a\u00020.2\u0007\u0010\u00a5\u0001\u001a\u00020\u0004J\u0018\u0010\u00a6\u0001\u001a\u00020m2\u0006\u0010-\u001a\u00020.2\u0007\u0010\u00a7\u0001\u001a\u00020\u0004J\u0017\u0010\u00a8\u0001\u001a\u00020m2\u0006\u0010-\u001a\u00020.2\u0006\u0010v\u001a\u00020]J\u0018\u0010\u00a9\u0001\u001a\u00020m2\u0006\u0010-\u001a\u00020.2\u0007\u0010v\u001a\u00030\u00aa\u0001J\u0017\u0010\u00ab\u0001\u001a\u00020m2\u0006\u0010-\u001a\u00020.2\u0006\u0010v\u001a\u00020\u0004J\u0018\u0010\u00ac\u0001\u001a\u00020m2\u0006\u0010-\u001a\u00020.2\u0007\u0010\u00ad\u0001\u001a\u00020\u0004J\u0018\u0010\u00ae\u0001\u001a\u00020m2\u0006\u0010-\u001a\u00020.2\u0007\u0010\u00af\u0001\u001a\u00020\u0004J\u0017\u0010\u00b0\u0001\u001a\u00020m2\u0006\u0010-\u001a\u00020.2\u0006\u0010v\u001a\u00020cJ\u0018\u0010\u00b1\u0001\u001a\u00020m2\u0006\u0010-\u001a\u00020.2\u0007\u0010\u00b2\u0001\u001a\u00020\u0004J\u0018\u0010\u00b3\u0001\u001a\u00020m2\u0006\u0010-\u001a\u00020.2\u0007\u0010\u00b4\u0001\u001a\u00020\u0004J\u0018\u0010\u00b5\u0001\u001a\u00020m2\u0006\u0010-\u001a\u00020.2\u0007\u0010\u00b6\u0001\u001a\u00020\u0004J\u0018\u0010\u00b7\u0001\u001a\u00020m2\u0006\u0010-\u001a\u00020.2\u0007\u0010\u00b8\u0001\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u00b9\u0001"}, d2 = {"Lcom/fivebb/selfcare/utils/SharedPreferenceUtils;", "", "()V", "ACCESS_TOKEN", "", "ACCOUNT_ID", "ACCOUNT_NAME", "ACCOUNT_STATUS", "ACTION_TYPE", "ADV_CURRENT_PLAN", "ADV_PAY_ID", "ADV_PLAN_LIST", "AYAPay_Ph", "BANK_FOR_PAYMENT", "BILLING_AREA", "BILLING_STATUS", "BILL_MONTH", "CATEGORY", "CHECKED_REMEMBER_ME", "CREATION_DATE", "CREDIT_DOC_NO", "CURRENT_PLAN_VO", "CURRENT_STEP", "CUSTOMER_BASIC_DETAIL", "EMAIL_LIST", "FCM_TOKEN", "IS_LOGIN", "IS_SUFFICIENT", "LTE_DAY_LEFT", "LTE_EXPIRE_DATE", "NAME", "ORDER_ID", "PACKAGE_NAME", "PASSWORD", "PLAN_ID", "PXCurrentPlan", "PX_CURRENT", "RECHARGE_OBJ", "SERVICE_INSTANCE_NAME", "SERVICE_INSTANCE_NUMBER", "SERVICE_TYPE", "VERIFY_EMAIL_ACC", "VERSION_NO", "deleteAccessToken", "", "context", "Landroid/content/Context;", "deleteAccountId", "deleteActionType", "deleteAdvID", "deleteAdvPlan", "deleteBankForPayment", "deleteCurrentPlan", "deleteCusStep", "deleteEmailList", "deleteLogin", "deleteOrderID", "deletePlanID", "getAccessToken", "getAccountId", "getAccountName", "getActionType", "getAdvCurrentPlanVO", "Lcom/fivebb/shared/vos/CurrentPlanVO;", "getAdvPaymentId", "getAdvPlanVO", "Lcom/fivebb/shared/vos/AdvPlanListVO;", "getAyaPh", "getBalance", "getBankForPayment", "getBillMonth", "getBillingArea", "getBillingStatus", "getCategory", "getCheckedRememberMe", "getCreationDate", "getCreditNo", "getCurrentPlanVO", "getCustomerBasicDetail", "Lcom/fivebb/shared/vos/CustomerBasicViewDetailsVO;", "getCustomerStatus", "getEmailList", "getEmailVerifyAcc", "getFCMToken", "getIsLogin", "getIsStep", "getIsSufficient", "getLTEDayLeft", "getLteExpireDate", "getLtePackage", "getName", "getOrderCode", "getPXChoosePlan", "Lcom/fivebb/shared/vos/PXPlanVO;", "getPXCurrentPlanVO", "getPXNextPlanStartDate", "getPassword", "getPlanIdForAdvance", "getRechargePlan", "Lcom/fivebb/shared/vos/RechargeVO;", "getServiceInstanceName", "getServiceInstanceNumber", "getServiceType", "getSharePreference", "Landroid/content/SharedPreferences;", "getSharedPreferenceEditor", "Landroid/content/SharedPreferences$Editor;", "getVersionNo", "saveAccessToken", "", "accessToken", "saveAccountId", "accountId", "saveAccountName", "accountName", "saveActionType", "actionType", "saveAdvCurrentPlanVO", "planJson", "saveAdvPay", "balance", "saveAdvPaymentId", "advPayID", "saveAdvPlanVO", "saveAyaPayPh", "ph", "saveBankForPayment", "payment", "saveBillMonth", "status", "saveBillingArea", "billingArea", "saveBillingStatus", "saveCategory", "category", "saveCheckedRememberMe", "rememberMe", "saveCreationDate", "creationDate", "saveCreditDocNo", "credit_no", "saveCurrentPlanVO", "saveCusStep", "step", "saveCustomerBasicDetail", "customerBasicViewDetailsVO", "saveCustomerStatus", "saveEmailList", "email", "", "saveEmailVerifyAcc", "email_verify_acc", "saveFCMToken", "token", "saveIsLogin", "isLogin", "saveIsSufficient", "isSufficient", "saveLTEDayLeft", "leftDay", "saveLTEExpireDate", "expireDate", "saveLTEPackage", "packageName", "saveName", "name", "saveOrderId", "orderCode", "savePXChoosePlan", "savePXCurrentPlan", "Lcom/fivebb/shared/vos/PXCurrentPlanVO;", "savePXNextPlanStartDate", "savePassword", "password", "savePlanIdForAdvance", "planID", "saveRechargePlan", "saveServiceInstanceName", "serviceInstanceName", "saveServiceInstanceNumber", "serviceInstanceNumber", "saveServiceType", "serviceType", "saveVersionNo", "versionNo", "app_psrRelease"})
public final class SharedPreferenceUtils {
    @org.jetbrains.annotations.NotNull()
    public static final com.fivebb.selfcare.utils.SharedPreferenceUtils INSTANCE = null;
    private static final java.lang.String FCM_TOKEN = "Firebase Token";
    private static final java.lang.String ACCOUNT_ID = "Account Id";
    private static final java.lang.String PLAN_ID = "PlanID";
    private static final java.lang.String ADV_PAY_ID = "Adv_Pay_ID";
    private static final java.lang.String ACCOUNT_NAME = "Account Name";
    private static final java.lang.String NAME = "Name";
    private static final java.lang.String PASSWORD = "Password";
    private static final java.lang.String ACTION_TYPE = "Cancel";
    private static final java.lang.String ORDER_ID = "order_id";
    private static final java.lang.String BANK_FOR_PAYMENT = "bank_for_payment";
    private static final java.lang.String ACCESS_TOKEN = "Access Token";
    private static final java.lang.String CHECKED_REMEMBER_ME = "Remember Me";
    private static final java.lang.String IS_LOGIN = "Is Login";
    private static final java.lang.String IS_SUFFICIENT = "IsSufficient";
    private static final java.lang.String ACCOUNT_STATUS = "Account Status";
    private static final java.lang.String BILLING_STATUS = "Billing Status";
    private static final java.lang.String BILL_MONTH = "billMonth";
    private static final java.lang.String SERVICE_TYPE = "Service Type";
    private static final java.lang.String CATEGORY = "Category";
    private static final java.lang.String CREATION_DATE = "Creation Date";
    private static final java.lang.String SERVICE_INSTANCE_NAME = "Service Instance Name";
    private static final java.lang.String BILLING_AREA = "Billing Area";
    private static final java.lang.String SERVICE_INSTANCE_NUMBER = "Service Instance Number";
    private static final java.lang.String CURRENT_PLAN_VO = "Current PlanVO";
    private static final java.lang.String CUSTOMER_BASIC_DETAIL = "CUSTOMER_BASIC_DETAIL";
    private static final java.lang.String LTE_DAY_LEFT = "LTE_DAY_LEFT";
    private static final java.lang.String LTE_EXPIRE_DATE = "LTE_EXPIRE_DATE";
    private static final java.lang.String PACKAGE_NAME = "PACKAGE_NAME";
    private static final java.lang.String CURRENT_STEP = "STEP";
    private static final java.lang.String RECHARGE_OBJ = "Recharge";
    private static final java.lang.String PX_CURRENT = "PxChoosePlan";
    private static final java.lang.String VERIFY_EMAIL_ACC = "email_acc";
    private static final java.lang.String CREDIT_DOC_NO = "credit_no";
    private static final java.lang.String PXCurrentPlan = "px_current_plan";
    private static final java.lang.String VERSION_NO = "VERSION_NO";
    private static final java.lang.String ADV_PLAN_LIST = "ADV_PLAN_LIST";
    private static final java.lang.String ADV_CURRENT_PLAN = "CURRENT_PLAN";
    private static final java.lang.String EMAIL_LIST = "EMAIL_LIST";
    private static final java.lang.String AYAPay_Ph = "AYAPay_Ph";
    
    private SharedPreferenceUtils() {
        super();
    }
    
    private final android.content.SharedPreferences getSharePreference(android.content.Context context) {
        return null;
    }
    
    private final android.content.SharedPreferences.Editor getSharedPreferenceEditor(android.content.Context context) {
        return null;
    }
    
    public final void saveFCMToken(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String token) {
    }
    
    public final void saveEmailList(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> email) {
    }
    
    public final void saveEmailVerifyAcc(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String email_verify_acc) {
    }
    
    public final void saveCreditDocNo(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String credit_no) {
    }
    
    public final void saveVersionNo(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String versionNo) {
    }
    
    public final void saveAccountId(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String accountId) {
    }
    
    public final void savePlanIdForAdvance(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String planID) {
    }
    
    public final void saveAdvPaymentId(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String advPayID) {
    }
    
    public final void saveAccountName(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String accountName) {
    }
    
    public final void saveName(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
    
    public final void savePassword(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
    }
    
    public final void saveOrderId(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String orderCode) {
    }
    
    public final void saveBankForPayment(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String payment) {
    }
    
    public final void saveActionType(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String actionType) {
    }
    
    public final void saveAccessToken(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String accessToken) {
    }
    
    public final void saveCheckedRememberMe(@org.jetbrains.annotations.NotNull()
    android.content.Context context, boolean rememberMe) {
    }
    
    public final void saveIsLogin(@org.jetbrains.annotations.NotNull()
    android.content.Context context, boolean isLogin) {
    }
    
    public final void saveIsSufficient(@org.jetbrains.annotations.NotNull()
    android.content.Context context, boolean isSufficient) {
    }
    
    public final void saveCustomerStatus(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String status) {
    }
    
    public final void saveBillingStatus(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String status) {
    }
    
    public final void saveAdvPay(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String balance) {
    }
    
    public final void saveBillMonth(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String status) {
    }
    
    public final void saveServiceType(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String serviceType) {
    }
    
    public final void saveCategory(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String category) {
    }
    
    public final void saveCreationDate(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String creationDate) {
    }
    
    public final void saveServiceInstanceName(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String serviceInstanceName) {
    }
    
    public final void saveBillingArea(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String billingArea) {
    }
    
    public final void saveServiceInstanceNumber(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String serviceInstanceNumber) {
    }
    
    public final void saveCurrentPlanVO(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String planJson) {
    }
    
    public final void saveRechargePlan(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.fivebb.shared.vos.RechargeVO planJson) {
    }
    
    public final void savePXChoosePlan(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.fivebb.shared.vos.PXPlanVO planJson) {
    }
    
    public final void savePXCurrentPlan(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.fivebb.shared.vos.PXCurrentPlanVO planJson) {
    }
    
    public final void savePXNextPlanStartDate(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String planJson) {
    }
    
    public final void saveAdvPlanVO(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.fivebb.shared.vos.AdvPlanListVO planJson) {
    }
    
    public final void saveAdvCurrentPlanVO(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.fivebb.shared.vos.CurrentPlanVO planJson) {
    }
    
    public final void saveCustomerBasicDetail(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.fivebb.shared.vos.CustomerBasicViewDetailsVO customerBasicViewDetailsVO) {
    }
    
    public final void saveLTEExpireDate(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String expireDate) {
    }
    
    public final void saveLTEPackage(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String packageName) {
    }
    
    public final void saveLTEDayLeft(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String leftDay) {
    }
    
    public final void saveCusStep(@org.jetbrains.annotations.NotNull()
    android.content.Context context, boolean step) {
    }
    
    public final void saveAyaPayPh(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String ph) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFCMToken(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAyaPh(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEmailVerifyAcc(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getVersionNo(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAccountId(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPlanIdForAdvance(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAdvPaymentId(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCreditNo(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getActionType(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBankForPayment(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOrderCode(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAccountName(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPassword(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    public final boolean getCheckedRememberMe(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    public final boolean getIsLogin(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    public final boolean getIsSufficient(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAccessToken(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCustomerStatus(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBalance(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBillingStatus(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBillMonth(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getServiceType(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCategory(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCreationDate(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getServiceInstanceName(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBillingArea(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getServiceInstanceNumber(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCurrentPlanVO(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPXCurrentPlanVO(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPXNextPlanStartDate(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.fivebb.shared.vos.AdvPlanListVO getAdvPlanVO(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEmailList(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.fivebb.shared.vos.RechargeVO getRechargePlan(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.fivebb.shared.vos.PXPlanVO getPXChoosePlan(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.fivebb.shared.vos.CurrentPlanVO getAdvCurrentPlanVO(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.fivebb.shared.vos.CustomerBasicViewDetailsVO getCustomerBasicDetail(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLteExpireDate(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLtePackage(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLTEDayLeft(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    public final boolean getIsStep(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    public final boolean deleteLogin(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    public final boolean deleteEmailList(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    public final boolean deleteCusStep(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    public final boolean deleteAccountId(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    public final boolean deleteAccessToken(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    public final boolean deleteCurrentPlan(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    public final boolean deleteAdvPlan(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    public final boolean deleteActionType(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    public final boolean deleteAdvID(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    public final boolean deletePlanID(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    public final boolean deleteOrderID(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    public final boolean deleteBankForPayment(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
}