package com.fivebb.selfcare.utils

import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager
import android.util.Base64
import com.fivebb.selfcare.network.responses.EmailList
import com.fivebb.selfcare.network.responses.EmailListResponse
import com.fivebb.shared.utils.SharedConstants
import com.fivebb.shared.vos.*
import com.google.gson.Gson

object SharedPreferenceUtils {

    private const val FCM_TOKEN = "Firebase Token"
    private const val ACCOUNT_ID = "Account Id"
    private const val PLAN_ID = "PlanID"
    private const val ADV_PAY_ID = "Adv_Pay_ID"
    private const val ACCOUNT_NAME = "Account Name"
    private const val NAME = "Name"
    private const val PASSWORD = "Password"
    private const val ACTION_TYPE = "Cancel"
    private const val ORDER_ID = "order_id"
    private const val BANK_FOR_PAYMENT = "bank_for_payment"
    private const val ACCESS_TOKEN = "Access Token"
    private const val CHECKED_REMEMBER_ME = "Remember Me"
    private const val IS_LOGIN = "Is Login"
    private const val IS_SUFFICIENT = "IsSufficient"
    private const val ACCOUNT_STATUS = "Account Status"
    private const val BILLING_STATUS = "Billing Status"
    private const val BILL_MONTH = "billMonth"
    private const val SERVICE_TYPE = "Service Type"
    private const val CATEGORY = "Category"
    private const val CREATION_DATE = "Creation Date"
    private const val SERVICE_INSTANCE_NAME = "Service Instance Name"
    private const val BILLING_AREA = "Billing Area"
    private const val SERVICE_INSTANCE_NUMBER = "Service Instance Number"
    private const val CURRENT_PLAN_VO = "Current PlanVO"
    private const val CUSTOMER_BASIC_DETAIL = "CUSTOMER_BASIC_DETAIL"
    private const val LTE_DAY_LEFT = "LTE_DAY_LEFT"
    private const val LTE_EXPIRE_DATE = "LTE_EXPIRE_DATE"
    private const val PACKAGE_NAME = "PACKAGE_NAME"
    private const val CURRENT_STEP = "STEP"
    private const val RECHARGE_OBJ = "Recharge"
    private const val PX_CURRENT = "PxChoosePlan"
    private const val VERIFY_EMAIL_ACC = "email_acc"
    private const val CREDIT_DOC_NO = "credit_no"
    private const val PXCurrentPlan = "px_current_plan"


    private const val VERSION_NO = "VERSION_NO"
    private const val ADV_PLAN_LIST = "ADV_PLAN_LIST"
    private const val ADV_CURRENT_PLAN = "CURRENT_PLAN"

    private const val EMAIL_LIST = "EMAIL_LIST"
    private const val AYAPay_Ph = "AYAPay_Ph"



    //Private Function
    private fun getSharePreference(context: Context): SharedPreferences {
        return PreferenceManager.getDefaultSharedPreferences(context)
    }

    private fun getSharedPreferenceEditor(context: Context): SharedPreferences.Editor{
        val preferences = PreferenceManager.getDefaultSharedPreferences(context)
        return preferences.edit()
    }

    //Save Function
    fun saveFCMToken(context: Context, token: String) {
        val editor = getSharedPreferenceEditor(context)
        editor.putString(FCM_TOKEN, token)
        editor.apply()
    }

    fun saveEmailList(context: Context, email:MutableList<String>) {
        val editor = getSharedPreferenceEditor(context)
        editor.putString(EMAIL_LIST,email.toString())
        editor.apply()
    }

    fun saveEmailVerifyAcc(context: Context, email_verify_acc: String) {
        val editor = getSharedPreferenceEditor(context)
        editor.putString(VERIFY_EMAIL_ACC, email_verify_acc)
        editor.apply()
    }

    fun saveCreditDocNo(context: Context, credit_no: String) {
        val editor = getSharedPreferenceEditor(context)
        editor.putString(CREDIT_DOC_NO, credit_no)
        editor.apply()
    }

    fun saveVersionNo(context: Context, versionNo: String) {
        val editor = getSharedPreferenceEditor(context)
        editor.putString(VERSION_NO, versionNo)
        editor.apply()
    }

    fun saveAccountId(context: Context, accountId: String) {
        val editor = getSharedPreferenceEditor(context)
        editor.putString(ACCOUNT_ID, accountId)
        editor.apply()
    }

    fun savePlanIdForAdvance(context: Context, planID: String) {
        val editor = getSharedPreferenceEditor(context)
        editor.putString(PLAN_ID, planID)
        editor.apply()
    }

    fun saveAdvPaymentId(context: Context, advPayID: String) {
        val editor = getSharedPreferenceEditor(context)
        editor.putString(ADV_PAY_ID, advPayID)
        editor.apply()
    }

    fun saveAccountName(context: Context, accountName: String) {
        val editor = getSharedPreferenceEditor(context)
        editor.putString(ACCOUNT_NAME, accountName)
        editor.apply()
    }

    fun saveName(context: Context, name: String) {
        val editor = getSharedPreferenceEditor(context)
        editor.putString(NAME, name)
        editor.apply()
    }

    fun savePassword(context: Context, password: String) {
        val editor = getSharedPreferenceEditor(context)
        editor.putString(PASSWORD, password)
        editor.apply()
    }

    fun saveOrderId(context: Context, orderCode: String) {
        val editor = getSharedPreferenceEditor(context)
        editor.putString(ORDER_ID, orderCode)
        editor.apply()
    }
    fun saveBankForPayment(context: Context, payment: String) {
        val editor = getSharedPreferenceEditor(context)
        editor.putString(BANK_FOR_PAYMENT, payment)
        editor.apply()
    }
    fun saveActionType(context: Context, actionType: String) {
        val editor = getSharedPreferenceEditor(context)
        editor.putString(ACTION_TYPE, actionType)
        editor.apply()
    }
    fun saveAccessToken(context: Context, accessToken: String) {
        val editor = getSharedPreferenceEditor(context)
        editor.putString(ACCESS_TOKEN, accessToken)
        editor.apply()
    }

    fun saveCheckedRememberMe(context: Context, rememberMe: Boolean) {
        val editor = getSharedPreferenceEditor(context)
        editor.putBoolean(CHECKED_REMEMBER_ME, rememberMe)
        editor.apply()
    }

    fun saveIsLogin(context: Context, isLogin: Boolean) {
        val editor = getSharedPreferenceEditor(context)
        editor.putBoolean(IS_LOGIN, isLogin)
        editor.apply()
    }

    fun saveIsSufficient(context: Context, isSufficient: Boolean) {
        val editor = getSharedPreferenceEditor(context)
        editor.putBoolean(IS_SUFFICIENT, isSufficient)
        editor.apply()
    }

    fun saveCustomerStatus(context: Context, status: String) {
        val editor = getSharedPreferenceEditor(context)
        editor.putString(ACCOUNT_STATUS, status)
        editor.apply()
    }

    fun saveBillingStatus(context: Context, status: String) {
        val editor = getSharedPreferenceEditor(context)
        editor.putString(BILLING_STATUS, status)
        editor.apply()
    }

    fun saveAdvPay(context: Context, balance: String) {
        val editor = getSharedPreferenceEditor(context)
        editor.putString("remainingAdjustedBalance", balance)
        editor.apply()
    }

    fun saveBillMonth(context: Context, status: String) {
        val editor = getSharedPreferenceEditor(context)
        editor.putString(BILL_MONTH, status)
        editor.apply()
    }

    fun saveServiceType(context: Context, serviceType: String) {
        val editor = getSharedPreferenceEditor(context)
        editor.putString(SERVICE_TYPE, serviceType)
        editor.apply()
    }

    fun saveCategory(context: Context, category: String) {
        val editor = getSharedPreferenceEditor(context)
        editor.putString(CATEGORY, category)
        editor.apply()
    }

    fun saveCreationDate(context: Context, creationDate: String) {
        val editor = getSharedPreferenceEditor(context)
        editor.putString(CREATION_DATE, creationDate)
        editor.apply()
    }

    fun saveServiceInstanceName(context: Context, serviceInstanceName: String) {
        val editor = getSharedPreferenceEditor(context)
        editor.putString(SERVICE_INSTANCE_NAME, serviceInstanceName)
        editor.apply()
    }

    fun saveBillingArea(context: Context, billingArea: String) {
        val editor = getSharedPreferenceEditor(context)
        editor.putString(BILLING_AREA, billingArea)
        editor.apply()
    }

    fun saveServiceInstanceNumber(context: Context, serviceInstanceNumber: String) {
        val editor = getSharedPreferenceEditor(context)
        editor.putString(SERVICE_INSTANCE_NUMBER, serviceInstanceNumber)
        editor.apply()
    }

    fun saveCurrentPlanVO(context: Context, planJson: String) {
        val editor = getSharedPreferenceEditor(context)
        editor.putString(CURRENT_PLAN_VO, planJson)
        editor.apply()
    }

    fun saveRechargePlan(context: Context, planJson: RechargeVO) {
        val editor = getSharedPreferenceEditor(context)
        editor.putString(RECHARGE_OBJ, Gson().toJson(planJson))
        editor.apply()
    }

    fun savePXChoosePlan(context: Context, planJson: PXPlanVO) {
        val editor = getSharedPreferenceEditor(context)
        editor.putString(PX_CURRENT, Gson().toJson(planJson))
        editor.apply()
    }

    fun savePXCurrentPlan(context: Context, planJson: PXCurrentPlanVO) {
        val editor = getSharedPreferenceEditor(context)
        editor.putString(PXCurrentPlan, Gson().toJson(planJson))
        editor.apply()
    }

    fun savePXNextPlanStartDate(context: Context, planJson: String) {
        val editor = getSharedPreferenceEditor(context)
        editor.putString(PXCurrentPlan, Gson().toJson(planJson))
        editor.apply()
    }

    fun saveAdvPlanVO(context: Context, planJson: AdvPlanListVO) {
        val editor = getSharedPreferenceEditor(context)
        editor.putString(ADV_PLAN_LIST,Gson().toJson(planJson))
        editor.apply()
    }

    fun saveAdvCurrentPlanVO(context: Context, planJson: CurrentPlanVO) {
        val editor = getSharedPreferenceEditor(context)
        editor.putString(ADV_CURRENT_PLAN,Gson().toJson(planJson))
        editor.apply()
    }

    fun saveCustomerBasicDetail(context: Context,customerBasicViewDetailsVO: CustomerBasicViewDetailsVO){
        val customerBasicJson = Gson().toJson(customerBasicViewDetailsVO)
        val editor = getSharedPreferenceEditor(context)
        editor.putString(CUSTOMER_BASIC_DETAIL, customerBasicJson)
        editor.apply()
    }

    fun saveLTEExpireDate(context: Context, expireDate: String) {
        val editor = getSharedPreferenceEditor(context)
        editor.putString(LTE_EXPIRE_DATE, expireDate)
        editor.apply()
    }

    fun saveLTEPackage(context: Context, packageName: String) {
        val editor = getSharedPreferenceEditor(context)
        editor.putString(PACKAGE_NAME, packageName)
        editor.apply()
    }

    fun saveLTEDayLeft(context: Context, leftDay: String) {
        val editor = getSharedPreferenceEditor(context)
        editor.putString(LTE_DAY_LEFT, leftDay)
        editor.apply()
    }

    fun saveCusStep(context: Context, step: Boolean) {
        val editor = getSharedPreferenceEditor(context)
        editor.putBoolean(CURRENT_STEP, step)
        editor.apply()
    }
    fun saveAyaPayPh(context: Context, ph: String) {
        val editor = getSharedPreferenceEditor(context)
        editor.putString(AYAPay_Ph, ph)
        editor.apply()
    }
//Get Function
    fun getFCMToken(context: Context): String {
        return getSharePreference(context).getString(FCM_TOKEN,"") ?: SharedConstants.UNDEFINED
    }
    fun getAyaPh(context: Context): String {
        return getSharePreference(context).getString(AYAPay_Ph,"") ?: ""
    }

    fun getEmailVerifyAcc(context: Context): String {
        return getSharePreference(context).getString(VERIFY_EMAIL_ACC,"") ?: SharedConstants.UNDEFINED
    }

    fun getVersionNo(context: Context): String {
        return getSharePreference(context).getString(VERSION_NO,"") ?: SharedConstants.UNDEFINED
    }

    fun getAccountId(context: Context): String {
        return getSharePreference(context).getString(ACCOUNT_ID,"") ?: SharedConstants.UNDEFINED
    }

    fun getPlanIdForAdvance(context: Context): String {
        return getSharePreference(context).getString(PLAN_ID,"") ?: SharedConstants.UNDEFINED
    }

    fun getAdvPaymentId(context: Context): String {
        return getSharePreference(context).getString(ADV_PAY_ID,"") ?: SharedConstants.UNDEFINED
    }

    fun getCreditNo(context: Context): String {
        return getSharePreference(context).getString(CREDIT_DOC_NO,"") ?: SharedConstants.UNDEFINED
    }

    fun getActionType(context: Context): String {
        return getSharePreference(context).getString(ACTION_TYPE,"") ?: ""
    }
    fun getBankForPayment(context: Context): String {
        return getSharePreference(context).getString(BANK_FOR_PAYMENT,"") ?: ""
    }
    fun getOrderCode(context: Context): String {
        return getSharePreference(context).getString(ORDER_ID,"") ?: ""
    }

    fun getAccountName(context: Context): String {
        return getSharePreference(context).getString(ACCOUNT_NAME,"") ?: ""
    }

    fun getName(context: Context): String {
        return getSharePreference(context).getString(NAME,"") ?: ""
    }

    fun getPassword(context: Context): String {
        return getSharePreference(context).getString(PASSWORD, "") ?: ""
    }

    fun getCheckedRememberMe(context: Context): Boolean {
        return getSharePreference(context).getBoolean(CHECKED_REMEMBER_ME, false)
    }

    fun getIsLogin(context: Context): Boolean {
        return getSharePreference(context).getBoolean(IS_LOGIN, false)
    }

    fun getIsSufficient(context: Context): Boolean {
        return getSharePreference(context).getBoolean(IS_SUFFICIENT, false)
    }

    fun getAccessToken(context: Context): String {
        return getSharePreference(context).getString(ACCESS_TOKEN, "") ?: ""
    }

    fun getCustomerStatus(context: Context) : String {
        return getSharePreference(context).getString(ACCOUNT_STATUS, "") ?: ""
    }

    fun getBalance(context: Context) : String {
        return getSharePreference(context).getString("remainingAdjustedBalance", " " ) ?: " "
    }

    fun getBillingStatus(context: Context) : String {
        return getSharePreference(context).getString(BILLING_STATUS, "" ) ?: ""
    }

    fun getBillMonth(context: Context) : String {
        return getSharePreference(context).getString(BILL_MONTH, "" ) ?: ""
    }

    fun getServiceType(context: Context) : String {
        return getSharePreference(context).getString(SERVICE_TYPE, "") ?: ""
    }

    fun getCategory(context: Context) : String {
        return getSharePreference(context).getString(CATEGORY, "") ?: ""
    }

    fun getCreationDate(context: Context) : String {
        return getSharePreference(context).getString(CREATION_DATE, "") ?: SharedConstants.DEFAULT_FROM_DATE
    }

    fun getServiceInstanceName(context: Context) : String {
        return getSharePreference(context).getString(SERVICE_INSTANCE_NAME, "") ?: SharedConstants.UNDEFINED
    }

    fun getBillingArea(context: Context) : String {
        return getSharePreference(context).getString(BILLING_AREA, "") ?: SharedConstants.UNDEFINED
    }

    fun getServiceInstanceNumber(context: Context): String {
        return getSharePreference(context).getString(SERVICE_INSTANCE_NUMBER, "") ?: ""
    }

    fun getCurrentPlanVO(context: Context): String {
        return getSharePreference(context).getString(CURRENT_PLAN_VO, "") ?: ""
    }

    fun getPXCurrentPlanVO(context: Context): String {
        return getSharePreference(context).getString(PXCurrentPlan, "") ?: ""
    }

    fun getPXNextPlanStartDate(context: Context): String {
        return getSharePreference(context).getString(PXCurrentPlan, "") ?: ""
    }

    fun getAdvPlanVO(context :Context) : AdvPlanListVO?{
        val planListJson = getSharePreference(context).getString(ADV_PLAN_LIST, "") ?: ""
        return Gson().fromJson(planListJson,AdvPlanListVO::class.java)
    }

    fun getEmailList(context :Context) :String{
        return getSharePreference(context).getString(EMAIL_LIST, "") ?: ""
    }

    fun getRechargePlan(context :Context) : RechargeVO?{
        val planListJson = getSharePreference(context).getString(RECHARGE_OBJ, "") ?: ""
        return Gson().fromJson(planListJson,RechargeVO::class.java)
    }

    fun getPXChoosePlan(context :Context) : PXPlanVO?{
        val planListJson = getSharePreference(context).getString(PX_CURRENT, "") ?: ""
        return Gson().fromJson(planListJson,PXPlanVO::class.java)
    }

    fun getAdvCurrentPlanVO(context :Context) : CurrentPlanVO?{
        val planListJson = getSharePreference(context).getString(ADV_CURRENT_PLAN, "") ?: ""
        return Gson().fromJson(planListJson,CurrentPlanVO::class.java)
    }

    fun getCustomerBasicDetail(context :Context) : CustomerBasicViewDetailsVO?{
        val customerJson = getSharePreference(context).getString(CUSTOMER_BASIC_DETAIL, "") ?: ""
        return Gson().fromJson(customerJson,CustomerBasicViewDetailsVO::class.java)
    }

    fun getLteExpireDate(context: Context): String {
        return getSharePreference(context).getString(LTE_EXPIRE_DATE, "") ?: ""
    }

    fun getLtePackage(context: Context): String {
        return getSharePreference(context).getString(PACKAGE_NAME, "") ?: ""
    }

    fun getLTEDayLeft(context: Context): String {
        return getSharePreference(context).getString(LTE_DAY_LEFT, "") ?: ""
    }

    fun getIsStep(context: Context): Boolean {
        return getSharePreference(context).getBoolean(CURRENT_STEP,false )
    }

    //Delete Function
    fun deleteLogin(context: Context): Boolean {
        return getSharedPreferenceEditor(context).remove(IS_LOGIN).commit()
    }
    fun deleteEmailList(context: Context): Boolean {
        return getSharedPreferenceEditor(context).remove(EMAIL_LIST).commit()
    }

    fun deleteCusStep(context: Context): Boolean {
        return getSharedPreferenceEditor(context).remove(CURRENT_STEP).commit()
    }

    fun deleteAccountId(context: Context): Boolean {
        return getSharedPreferenceEditor(context).remove(ACCOUNT_ID).commit()
    }

    fun deleteAccessToken(context: Context): Boolean {
        return getSharedPreferenceEditor(context).remove(ACCESS_TOKEN).commit()
    }

    fun deleteCurrentPlan(context: Context): Boolean {
        return getSharedPreferenceEditor(context).remove(CURRENT_PLAN_VO).commit()
    }

    fun deleteAdvPlan(context: Context): Boolean {
        return getSharedPreferenceEditor(context).remove(ADV_PLAN_LIST).commit()
    }

    fun deleteActionType(context: Context): Boolean {
        return getSharedPreferenceEditor(context).remove(ACTION_TYPE).commit()
    }
    fun deleteAdvID(context: Context): Boolean {
        return getSharedPreferenceEditor(context).remove(ADV_PAY_ID).commit()
    }
    fun deletePlanID(context: Context): Boolean {
        return getSharedPreferenceEditor(context).remove(PLAN_ID).commit()
    }
    fun deleteOrderID(context: Context): Boolean {
        return getSharedPreferenceEditor(context).remove(ORDER_ID).commit()
    }
    fun deleteBankForPayment(context: Context): Boolean {
        return getSharedPreferenceEditor(context).remove(BANK_FOR_PAYMENT).commit()
    }
}