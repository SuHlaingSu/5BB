package com.fivebb.selfcare.utils

//Api
const val API_LOG_IN_BY_PHONENUMBER_AND_PASSWORD = "customer/login"
const val API_CUSTOMER_DETAIL = "customer/getCustomerBasicViewDetail"
const val API_CHANGE_PASSWORD = "customer/changecustomerpassword"
const val API_PAYMENT_HISTORY = "customer/getPaymentHistory"
const val API_LIST_OF_BILL = "customer/searchBill"
const val API_LOAD_TICKET_CONFIGURATION = "ticket/loadConfiguration"
const val API_RECHARGED_HISTORY = "customer/getrechargehistory"
const val API_SERVICE_INSTANCE_SUMMARY_DETAILS = "customer/getServiceInstanceSummaryDetail"
const val API_GET_SECRET_QUESTION = "customer/forgotpassword/getsecretquestion"
const val API_VALIDATE_SECRET_QUESTION = "customer/forgotpassword/validatesecretquestion"

//Mobile App Api
const val API_EMAIL_LIST = "GetEmailList"
const val API_EMAIL_VERIFICATION = "AccountVerification" //before otp
const val API_EMAIL_CHECK_VERIFICATION = "CheckAccountVerification" //confirm otp
const val API_UPDATE_EMAIL_INFO = "UpdateCustomerContact" //confirm otp

const val API_PAYMENT_METHOD = "GetPaymentMethod"
const val API_CHECK_VERIFICATION = "CheckVerification"
const val API_GET_PLAN = "GetPlan"
const val API_SAVE_ACTIVITY = "SaveActivityLog"
const val API_SAVE_ACTIVITY_LOG = "GetActivityLog"
const val API_SEND_EMAIL = "SendEmail"
const val API_TOPICS = "GetTopicV2"
const val API_NOTIFICATION = "NotiListv2"
const val API_GET_RECHARGE_LIST = "GetRechargePlan"
const val API_DEL_NOTI_ID ="DeleteNotiByID"
const val API_UPDATE_NOTI_ID ="UpdateNotiByID"
const val API_APP_IMAGE_LIST = "AppImageList"
const val API_GET_REGION = "RegionList"
const val API_GET_APP_VERSION = "MobileAppAPI/GetAppVersionV2"
const val API_ADVANCE_PAYMENT = "BSS/GetDetail"
const val API_ADV_TOP_UP ="PlanPriceList"
const val API_ADV_TOP_UP_ACTION ="AdvancePaymentPlanAction"

//BSS
const val API_INVOICE_DOWNLOAD ="DownloadPaymentSlip"
//PX Payment
const val API_PX_PLAN ="Payment/PXPlanPriceList"

//Payment Api
const val API_KBZ_PRE_CREATE = "Payment/KBZPrecreateV2"
const val API_KBZ_QUERY_ORDER = "Payment/KBZQueryOrder"
const val API_KBZ_ORDER_INFO = "Payment/KBZOrderInfo"
//AYA_Pay
const val API_AYA_PAY = "Payment/AYARequestPushPayment"
const val API_AYA_QUERY_ORDER = "Payment/AYAQueryOrder"

//Citizen Api
const val API_CITIZEN_PAY = "Payment/MCBEMoneyPayments"
const val API_CITIZEN_RETRIEVE = "Payment/GTGMCBRetrieveEmoneyPayment"
//WavePay Api
const val API_WAVE_PAY = "Payment/WMPaymentRequest"
const val API_WAVE_QUERY_ORDER = "Payment/WMQueryOrder"

//Link Address
const val FIVEBB_YOUTUBE_CHANNEL =
    "https://www.youtube.com/channel/UCQVlPVeErSUw0UO3VAtzxhA?fbclid=IwAR21QsT9HgF_FJJFlKRmF8Zc6ZVtEIRnIc6JQcjfnEAfFqkV2gxeeKzYBww"
const val FIVEBB_FACEBOOK_PAGE = "https://www.facebook.com/5BBbroadband/?ref=br_rs"
const val FIVEBB_GMAIL_ADDRESS = "salesoffice471.5bb@gmail.com"

//Constant values
const val TICKET_CONFIG_VISIBILITY_FLAG = "0"
const val RECHARGED_HISTORY_TYPE = "ALL"

//Bank App Package Names
const val AYA_MOBILE_BANKING_PACKAGE_NAME = "com.jits.mobile.aya"
const val KBZ_MOBILE_BANKING_PACKAGE_NAME = "com.ofss.fcdb.mobile.android.phone.kbz.launcher"
const val KBZ_PAY_PACKAGE_NAME = "com.kbzbank.kpaycustomer"
const val CITIZEN_PACKAGE_NAME = "citizen"
const val CB_MOBILE_BANKING_PACKAGE_NAME = "com.cbbank.cbmbanking"
const val ONE_PAY_PACKAGE_NAME = "com.agd.upi"
const val MSP_PACKAGE_NAME = "com.ccpp.msp"
const val WAVE_MONEY_PACKAGE_NAME = "mm.com.wavemoney.wavepay"
const val UAB_BANK_PACKAGE_NAME = "com.uab.FinacleMobileApp"

//Payment Code
const val KBZ_MB = "KBZ_MobileBanking"
const val AYA_MB = "AYA_MobileBanking"
const val CB_MB = "CB_MobileBanking"
const val K_PAY = "KBZ_Pay"
const val AYA_PAY = "AYA_Pay"
const val CB_PAY = "KBZ_MobileBanking"
const val WAVE_PAY = "Wave_Pay"
const val CITIZEN_PAY= "Citizens_Pay"
const val ONE_PAY= "One_Pay"
const val MANDALAY_SMART_PAY= "MandalaySmart_Pay"


//Link for pop-up ads
const val LINK_FOR_POP_UP_ADS = "http://www.5bb.com.mm/"

//Mobile api response code
//const val MOBILE_API_SUCCESS_CODE = "000"

//Image Types
const val IMAGE_TYPE_SLIDE = "Slide"
const val IMAGE_TYPE_ADS = "Ads"

//Apps Name
const val KBZ_PAY= "KBZ_PAY"


