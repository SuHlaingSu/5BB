package com.fivebb.shared.utils

import android.util.Base64

object SharedConstants {

    //App Name
    const val APP_ID = "5BB"

    //Date Format
    const val FORMAT_DATE_Y_M_D = "yyyy/MM/dd"
    const val FORMAT_DATE_D_M_Y = "dd/MM/yyyy"
    const val FORMAT_DATE_M_D_Y = "MMM dd yyyy"
    const val FORMAT_DATE_M_D_Y_HH_mm = "MMM dd yyyy HH:mm"
    const val FORMAT_DATE_D_MMMM_YYYY = "d MMMM yyyy"
    const val FORMAT_DATE_YYYY_MM_DD = "yyyy-MM-dd"
    const val FORMAT_DATE_M_D_Y_HH_mm_ss = "yyyy/MM/dd HH:mm:ss"
    const val FORMAT_DATE_M_D_Y_T_HH_mm_ss = "yyyy-MM-dd'T'HH:mm:ss"
    const val FORMAT_TIME_HH_MM = "hh:mm"
    const val FORMAT_TIME_HH_MM_SS = "hh:mm:ss"


    //Question Type
    const val QUESTION_TYPE_CHECK_BOK = "check_box"
    const val QUESTION_TYPE_RADIO = "radio"
    const val QUESTION_TYPE_TEXT = "text"

    const val CONSTANT_CONTINUE = "continue"
    const val CONSTANT_RETRY = "retry"

    //REQUEST CODE
    const val PICK_IMAGE_REQUEST_CODE = "100"
    const val GALLY_REQUEST_CODE = "200"
    const val CROP_IMAGE_REQUEST_CODE = "300"
    const val EMAIL_REQUEST_CODE = 400

    const val APP_VERSION_TAG = "android"

    const val SELECTED_LANGUAGE = "SELECTED_LANGUAGE"
    const val SELECTED_LANGUAGE_MY = "my"
    const val SELECTED_LANGUAGE_EN = "en"

    const val AUTHORIZATION_HEADER = "Bearer"

    //API HEADER
    const val HEADER_ACCEPT = "Accept"
    const val HEADER_CONTENT_TYPE = "Content-Type"
    const val HEADER_APP_VERSION = "app-version"
    const val REQUEST_TYPE_JSON = "application/json"
    const val REQUEST_TYPE_FORM_X_WWW_URL_ENCODED = "application/x-www-form-urlencoded"
    const val REQUEST_TYPE_MULTIPART_FORM_DATA = "multipart/form-data"
    const val HEADER_APP_ID = "app-id"
    const val HEADER_SECRET_KEY = "secret-key"
    const val HEADER_AUTHORIZATION = "Authorization"

    const val SERVICE_IS_BACKGROUND_TRACK_STARTED = "SERVICE_IS_BACKGROUND_TRACK_STARTED"
    const val SERVICE_CALL_DATA_UPLOAD_STARTED = "CALL_DATA_UPLOAD_SERVICE_STARTED"
    const val SERVICE_SMS_DATA_UPLOAD_SERVICE_STARTED = "SMS_DATA_UPLOAD_SERVICE_STARTED"
    const val SERVICE_LOCATION_DATA_UPLOAD_SERVICE_STARTED = "LOCATION_DATA_UPLOAD_SERVICE_STARTED"
    const val SYNC_SERVICE_STARTED = "SYNC_SERVICE_STARTED"
    const val SERVICE_APP_USAGE_DATA_UPLOAD_SERVICE_STARTED =
        "SERVICE_APP_USAGE_DATA_UPLOAD_SERVICE_STARTED"
    const val PSYCHOMETRIC_ANSWER_LAST_SCREEN_REACHED = "PSYCHOMETRIC_ANSWER_LAST_SCREEN_REACHED"
    const val FORM10_RELATION_HAVE_FILLED = "FORM10_RELATION_HAVE_FILLED"
    const val INIT_CALL_DATA_UPLOADED = "INIT_CALL_DATA_UPLOADED"
    const val CREDO_APP_INITIATING = "CREDO_APP_INITIATING"

    //KEYWORD FOR DEVICE INFO KEY VALUE
    const val KEYWORD_DEVICE_ID = "DEVICE_ID"
    const val KEYWORD_REGISTRATION_ID = "REGISTRATION_ID"
    const val KEYWORD_DEVICE_BRAND = "DEVICE_BRAND"
    const val KEYWORD_DEVICE_MODEL = "DEVICE_MODEL"
    const val KEYWORD_OS_VERSION = "OS_VERSION"
    const val KEYWORD_NETWORK_OPERATOR = "NETWORK_OPERATOR"
    const val KEYWORD_NUMBER_OF_CONTACTS = "NUMBER_OF_CONTACTS"
    const val KEYWORD_NUMBER_OF_CONTACTS_ADDRESS = "NUMBER_OF_CONTACTS_ADDRESS"
    const val KEYWORD_MOST_CONTACTED_PERSON = "MOST_CONTACTED_PERSON"
    const val KEYWORD_MOSTLY_FREQUENTLY_CONTACTED_PERSON_10 =
        "MOSTLY_FREQUENTLY_CONTACTED_PERSON_10"
    const val KEYWORD_ACTIVE_CONTACT_RATIO = "ACTIVE_CONTACT_RATIO"
    const val KEYWORD_WIFI_CONNECTIVITY_FREQUENCY = "WIFI_CONNECTIVITY_FREQUENCY"
    const val KEYWORD_WIFI_CONNECTED = "WIFI_CONNECTED"
    const val KEYWORD_MOSTLY_CONNECTED_WIFI_OPERATORS = "MOSTLY_CONNECTED_WIFI_OPERATORS"
    const val KEYWORD_CONNECTED_WIFI_OPERATOR = "CONNECTED_WIFI_OPERATOR"
    const val KEYWORD_AMOUNT_OF_DATA_USAGE = "AMOUNT_OF_DATA_USAGE"
    const val KEYWORD_DATA_USAGE_PER_WEEK_MOBILE_IN_BYTES = "DATA_USAGE_PER_WEEK_MOBILE_IN_BYTES"
    const val KEYWORD_DATA_USAGE_PER_WEEK_WIFI_IN_BYTES = "DATA_USAGE_PER_WEEK_WIFI_IN_BYTES"
    const val KEYWORD_MOST_FREQUENTLY_USED_APP_10 = "MOST_FREQUENTLY_USED_APP_10"
    const val KEYWORD_MOST_FREQUENT_APP = "MOST_FREQUENT_APP"
    const val KEYWORD_BATTERY_CHARGING_FREQUENCY = "BATTERY_CHARGING_FREQUENCY"
    const val KEYWORD_BATTERY_CHARGING = "BATTERY_CHARGING"
    const val KEYWORD_THE_FREQUENCY_OF_THE_CALLS = "THE_FREQUENCY_OF_THE_CALLS"
    const val KEYWORD_MOSTLY_VISITED_PLACES_OFFICE_LOCATION =
        "MOSTLY_VISITED_PLACES_OFFICE_LOCATION"
    const val KEYWORD_MOST_VISITED_PLACE = "MOST_VISITED_PLACE"
    const val KEYWORD_THE_USUAL_COMMUTE_TIME = "THE_USUAL_COMMUTE_TIME"
    const val KEYWORD_USER_IS_COMMUTING = "USER_IS_COMMUTING"
    const val KEYWORD_INCOMING_CALLS_FREQUENCY_PER_WEEK = "INCOMING_CALLS_FREQUENCY_PER_WEEK"
    const val KEYWORD_OUTGOING_CALLS_FREQUENCY_PER_WEEK = "OUTGOING_CALLS_FREQUENCY_PER_WEEK"
    const val KEYWORD_INCOMING_SMS_FREQUENCY_PER_WEEK = "INCOMING_SMS_FREQUENCY_PER_WEEK"
    const val KEYWORD_OUTGOING_SMS_FREQUENCY_PER_WEEK = "OUTGOING_SMS_FREQUENCY_PER_WEEK"
    const val KEYWORD_INCOMING_CALLS_FREQUENCY_PER_DAY = "INCOMING_CALL_FREQUENCY"
    const val KEYWORD_OUTGOING_CALLS_FREQUENCY_PER_DAY = "OUTGOING_CALL_FREQUENCY"
    const val KEYWORD_INCOMING_SMS_FREQUENCY_PER_DAY = "INCOMING_SMS_FREQUENCY"
    const val KEYWORD_OUTGOING_SMS_FREQUENCY_PER_DAY = "OUTGOING_SMS_FREQUENCY"
    const val KEYWORD_TOP_UP_FREQUENCY_PER_MONTH = "TOP_UP_FREQUENCY_PER_MONTH"
    const val KEYWORD_AVERAGE_TOP_UP_AMOUNT = "AVERAGE_TOP_UP_AMOUNT"
    const val KEYWORD_REGULAR_CONTACT = "REGULAR_CONTACT"
    const val KEYWORD_FACEBOOK_ID = "Facebook ID"
    const val KEYWORD_FACEBOOK_NAME = "Facebook Name"
    const val KEYWORD_FACEBOOK_EMAIL = "Facebook Email"
    const val KEYWORD_FACEBOOK_PROFILE_IMAGE = "Facebook Profile Photo"
    const val KEYWORD_FACEBOOK_COVER_PHOTO = "Facebook Cover Photo"

    //TEMP CONSTANT
    const val TEMP_BANK_NAME_KBZ = "kbz"
    const val TEMP_BANK_NAME_CB = "cb"
    const val TEMP_BANK_NAME_AYA = "aya"
    const val TEMP_BANK_NAME_YOMA = "yoma"
    const val TEMP_BANK_NAME_KBZ_FORMAL = "KBZ bank"
    const val TEMP_BANK_NAME_CB_FORMAL = "CB bank"
    const val TEMP_BANK_NAME_AYA_FORMAL = "Aya bank"
    const val TEMP_BANK_NAME_YOMA_FORMAL = "Yoma bank"

    //BANK ACCOUNT
    const val BANK_ACCOUNT_TYPE_SAVING = "saving"

    //FIREBASE DEFAULT PHOTO STORAGE PATH
    const val FIREBASE_DEFAULT_PHOTO_STORAGE_PATH = "user_photos"


    const val PREF_DONT_SHOW_MAIN_DIALOG_AGAIN = "dont show main dialog again"
    const val KEY_DONT_SHOW_MAIN_DIALOG_AGAIN = "dont show main dialog again"

    const val MEDIA_TYPE_IMAGE = "image/*"
    const val WANT_LOAN_IMMEDIATELY = 1
    const val NOT_WANT_LOAN_IMMEDIATELY = 6
    const val WANT_LOAN_AT_START_OF_NEXT_MONTH = 7

    //FACEBOOK USER ATTRIBUTE CONSTANT
    const val FACEBOOK_USER_ID = "id"
    const val FACEBOOK_USER_FIRST_NAME = "first_name"
    const val FACEBOOK_USER_LAST_NAME = "last_name"
    const val FACEBOOK_USER_EMAIL = "email"
    const val FACEBOOK_USER_PICTURE = "picture"
    const val FACEBOOK_USER_COVER = "cover"
    const val FACEBOOK_USER_COVER_SOURCE = "source"

    //UAT ATTRIBUTE CONSTANT
    const val UAT_MERCHANT_ID = "merchantID"
    const val UAT_INVOICE_NO = "invoiceNo"
    const val UAT_PRODUCT_DESC = "productDesc"
    const val UAT_AMOUNT = "amount"
    const val UAT_CURRENCY_CODE = "currencyCode"
    const val UAT_USER_DEFINED_1 = "userDefined1"
    const val UAT_USER_DEFINED_2 = "userDefined2"
    const val UAT_USER_DEFINED_3 = "userDefined3"
    const val UAT_HASH_CODE = "hashValue"

    const val MERCHANT_ID_LIVE_SERVER = "206104000002113"

    const val ENCODING_UTF_8 = "UTF-8"

    const val ZERO_COUNT_16 =
        "0000000000000000" //16 ZEROS TO COMBINE WITH LOAN REQUEST ID TO GENERATE UAT INVOICE NUMBER
    const val ZERO_COUNT_20 =
        "00000000000000000000" //16 ZEROS TO COMBINE WITH LOAN REQUEST ID TO GENERATE INVOICE NUMBER

    const val SERVER_DEFAULT_DATE_FORMAT = "yyyy-MM-dd hh:mm:ss"
    const val TODAY_DATE_FORMAT_YYYYMMDD = "yyyyMMdd"

    const val ASCII_CHARACTARS =
        " !#\$%&amp;\\'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\\\]^_`abcdefghijklmnopqrstuvwxyz{|}~"

    const val PASSWORD_LENGHT = 6

    const val NUMBER_ONE_MM = "ပထမ"
    const val NUMBER_TWO_MM = "ဒုတိယ"
    const val NUMBER_THREE_MM = "တတိယ"
    const val NUMBER_FOUR_MM = "လေး"
    const val NUMBER_FIVE_MM = "ငါး"
    const val NUMBER_SIX_MM = "ခြောက်"
    const val NUMBER_SEVEN_MM = "ခုနစ်"
    const val NUMBER_EIGHT_MM = "ရှစ်"
    const val NUMBER_NINE_MM = "ကိုး"

    const val CALL_TYPE_INCOMING_TYPE = "incoming"
    const val CALL_TYPE_OUTGOING_TYPE = "outgoing"
    const val CALL_TYPE_MISSED_TYPE = "missed"
    const val CALL_TYPE_VOICEMAIL_TYPE = "voicemail"
    const val CALL_TYPE_REJECTED_TYPE = "rejected"
    const val CALL_TYPE_BLOCKED_TYPE = "blocked"

    const val SMS_TYPE_INBOX = "inbox"
    const val SMS_TYPE_SENT = "sent"
    const val SMS_TYPE_OUTBOX = "outbox"
    const val SMS_TYPE_DRAFT = "draft"
    const val SMS_TYPE_FAILED = "failed"
    const val SMS_TYPE_QUEUED = "queued"

    const val AYA_BANK = 2
    const val KBZ_BANK = 3
    const val CB_BANK = 4
    const val YOMA_BANK = 9

    const val WAVE_MONEY = 7
    const val OK_DOLLAR = 8
    const val TRUE_MONEY = 10

    /*JSON FILE CONSTANT*/
    const val JSON_VERSION_CODE = "json/version_code.json"
    const val JSON_HELP_CENTER = "json/helpcenter.json"
    const val MSG_INVALID_IMAGE =
        "The selected image doesn't exist in device storage. Please try to upload images from local storage."

    // 5999 Ooredoo
    // 69835 MyTel
    // 678 MPT
//    var PHONE_SMS_NUMBER : Map<String, Array<String>> = mapOf("MPT" to arrayOf("678"), "Ooredoo" to arrayOf("5999"), "MyTel" to arrayOf("678"))
    val PHONE_SMS_NUMBER =
        arrayOf("5999", "69835", "678", "MPT", "MyTel", "Telenor", "09 953 598828", "+959953598828")

    const val ONE_DAY_MILITIME = 86400000L

    const val SCHEDULER_TIME = 86400000L

    const val SCHEDULER_TIME_12HOURS = 43200000L

    const val SCHEDULER_LOCATION_SAVE_TIME = 3600000L

    const val SYNC_INTERVAL_FOR_LOCATION = 60000L

    const val SYNC_INTERVAL_FOR_WIFI = 60000L

    const val SYNC_INTERVAL_FOR_COMMUTE = 60000L

    const val SYNC_INTERVAL_FOR_BATTERY = 60000L

    const val SYNC_INTERVAL_FOR_TOPUP = 60000L

    const val SYNC_INTERVAL_FOR_MOST_USED_APP = 60000L

    const val SYNC_INTERVAL_FOR_AMOUNT_OF_USAGE_DATA = 60000L

    const val SYNC_INTERVAL_FOR_CALL_LOG = 1

    const val SYNC_INTERVAL_FOR_REGULAR_CONTACT = 60000

    const val SYNC_INTERVAL_FOR_CALL_DETAIL = 1

    const val SYNC_INTERVAL_FOR_SMS = 1

    /*
    Crashlytic priority, tag, msg
    priority severity -> 1(strongest) .... 10(n)
     */
    const val CRASHLYTICS_PRIORITY_1 = 1
    const val CRASHLYTICS_PRIORITY_10 = 10

    const val NO_INTERNET_RETRY = "No internet connection!"

    const val E_LOAN = "E_LOAN"

    const val MSG_APPLY_LOAN_DIALOG = "Data Not Found"

    const val CAPTURED_VIDEO_URI = "CAPTURED_VIDEO_URI"

    const val UPLOAD_VIDEO_URL = "UPLOAD_VIDEO_URL"
    const val DESTINATION_PATH = "DESTINATION_PATH"

    const val MEDIA_TYPE_MP4 = "mp4"
    const val MEDIA_TYPE_M3U8 = "m3u8"

    const val UNDEFINED = "Undefined"

    const val SERVICE_TYPE_FTTH = "FTTH"
    const val SERVICE_TYPE_LTE = "LTE"

    const val CATEGORY_FAMILY = "Family"
    const val CATEGORY_BUSINESS = "Business"
    const val CATEGORY_SPEED = "Speed"
    const val CATEGORY_QUOTA = "Quota"
    const val CATEGORY_PREPAID = "PX"
    const val PLATFORM = "Android"


    const val DEFAULT_FROM_DATE = "0001-01-01"

    //Bill Status
    const val BILL_STATUS_UNPAID = "Unpaid"
    const val BILL_STATUS_FULLY_PAID = "Fully Paid"
    const val BILL_STATUS_PARTIALLY_PAID = "Partially Paid"

    //Unauthorized request
    const val UNAUTHORIZED_REQUEST = "Unauthorized request"

    val MONTHS = listOf(
        "Jan", "Feb", "Mar", "Apr", "May", "Jun",
        "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
    )

    //Request form types
    const val PLAN_CHANGE_FORM = "Plan Change"
    const val RELOCATION_FORM = "Relocation"
    const val TICKET_FORM = "Ticket"
    const val HELP_FORM = "Help"

    const val PLAN_CHANGE = "Plan Change"
    const val RELOCATION = "Relocation"
    const val TICKET = "Ticket"
    const val ACTIVATION = "Activation"

    const val MSG_NO_SECRET_QUESTION = "Secret Question has not been set for the user in system"

    fun getBasicAuthToken(): String {
        //dev
       /*val userName = "8ca8e92d109067532a551e8af981d020"
       val password = "CpxoEGTXQ/RVGYeuizbY7LfwpN+WH74txbj/8KEHIIJjRZQ85wGRqA=="*/
        // prod
        val userName = "b059312e0441a2ceba8adf85437107ec"
        val password = "gkm4Fl0hbsj7LWUtcBRs/nie+j7Sin56E+B3cbrcCW9jRZQ85wGRqA=="
        val credentials = "$userName:$password"
        return "Basic " + Base64.encodeToString(credentials.toByteArray(), Base64.NO_WRAP)
    }
}
