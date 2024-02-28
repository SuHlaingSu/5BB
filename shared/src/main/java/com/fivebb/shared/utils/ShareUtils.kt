package com.fivebb.shared.utils
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.res.Resources
import android.provider.MediaStore
import android.text.TextUtils
import android.util.Log
import android.widget.EditText
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
//import org.mmtextview.MMFontUtils
import java.security.NoSuchAlgorithmException
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*


/**
 * Created by aung on 3/2/18.
 */

object SharedUtils {

    val ENG_NUMS = charArrayOf('0', '1', '2', '3', '4', '5', '6', '7', '8', '9')
    val MYAN_NUMS = charArrayOf('ဝ', '၁', '၂', '၃', '၄', '၅', '၆', '၇', '၈', '၉')

    val currentHourMinIn24: String
        get() {
            val simpleDateFormat = SimpleDateFormat("HH:mm", Locale.getDefault())
            return simpleDateFormat.format(Date()).replace(":", "")
        }

    val currentHourMin: String
        get() {
            val simpleDateFormat = SimpleDateFormat("hh:mm a", Locale.getDefault())
            return simpleDateFormat.format(Date())
        }

    fun getUniFormat(original: String, context: Context): String {
        return original/* if (MMFontUtils.isSupportUnicode(context)) original else MMFontUtils.zg2uni(original)*/
    }


    fun md5(s: String): String {
        val MD5 = "MD5"
        try {
            // Create MD5 Hash
            val digest = java.security.MessageDigest.getInstance(MD5)
            digest.update(s.toByteArray())
            val messageDigest = digest.digest()

            // Create Hex String
            val hexString = StringBuilder()
            for (aMessageDigest in messageDigest) {
                var h = Integer.toHexString(0xFF and aMessageDigest.toInt())
                while (h.length < 2)
                    h = "0$h"
                hexString.append(h)
            }
            return hexString.toString()

        } catch (e: NoSuchAlgorithmException) {
            e.printStackTrace()
        }

        return ""
    }

    fun isValidEmail(target: CharSequence?): Boolean {
        return if (target == null || target == "") true else android.util.Patterns.EMAIL_ADDRESS.matcher(target).matches()

    }

    fun getDayInWeekFromDate(date: String): String {

        var dayInWeek = ""

        val simpleDateFormat = SimpleDateFormat("yyyy/MM/dd", Locale.US)

        try {

            val d = simpleDateFormat.parse(date)

            val sdf = SimpleDateFormat("EEEE", Locale.US)

            dayInWeek = sdf.format(d)

            Log.i("date ==> ", dayInWeek)


        } catch (e: ParseException) {
            e.printStackTrace()
        }

        return dayInWeek

    }

    fun getDayInWeekInMM(engDay: String): String {
        return when (engDay) {
            "Monday" -> "တနင်္ဂလာ"
            "Tuesday" -> "အင်္ဂါ"
            "Wednesday" -> "ဗုဒ္ဓဟူး"
            "Thursday" -> "ကြာသာပတေး"
            "Friday" -> "သောကြာ"
            "Saturday" -> "စနေ"
            "Sunday" -> "တနင်္ဂနွေ"
            else -> engDay
        }
    }

    fun getTimeInMM(time: String): String {
        val timeInInt = if (time.contains(":")) get24HrFormatTimeExcludeColon(time).toInt()
        else time.toInt()

        val aa = when {
            timeInInt in 600..1159 -> "မနက်"
            timeInInt < 1500 -> "နေ့လည်"
            timeInInt < 1900 -> "ညနေ"
            else -> "ည"
        }

        val hr = if (timeInInt > 1200) timeInInt - 1200 else timeInInt
        var myanmarHr = String(hr.toString().map { getMyanmarChar(it) }.toCharArray())
        myanmarHr =
            if (myanmarHr.contains("ဝဝ")) {
                myanmarHr.replace("ဝဝ", "")
            } else {
                val charArray = myanmarHr.asSequence()
                    .toMutableList().apply { add(myanmarHr.length - 2, ':') }
                    .toList()
                    .toCharArray()

                String(charArray)
            }

        Log.d("TEST", "myanHr: ${myanmarHr}")

        return "$aa $myanmarHr နာရီ"
    }

    fun getMyanmarChar(eng: Char): Char {
        val index = ENG_NUMS.indexOf(eng)
        if (index < 0) return eng
        return MYAN_NUMS[index]
    }

    fun getDayOfToday(): String {
        val rightNow = Calendar.getInstance()
        return rightNow.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.getDefault())
    }

    fun getDayInWeekForToday(): String {

        return SimpleDateFormat("EEEE", Locale.getDefault()).format(Date())
    }

    fun getChangedDateByFormat(date: String): String {
        val newFormat = SimpleDateFormat("yyyy/MM/dd", Locale.US)
        return newFormat.format(newFormat.parse(date))
    }

    fun getPresentableAppointmentTime(originalAppointmentTime: String?): String {
        val appointmentTime24hrFormat: Int
        if (originalAppointmentTime != null) {
            try {
                appointmentTime24hrFormat = Integer.parseInt(originalAppointmentTime)
            } catch (e: NumberFormatException) {
                return originalAppointmentTime
            }

            val amPm = if (appointmentTime24hrFormat / 1200 > 0) "pm" else "am"
            val appointmentTime12HrFormat = appointmentTime24hrFormat % 1200

            val appointmentTimeHour = appointmentTime12HrFormat / 100
            val appointmentTimeHourStr =
                if (appointmentTimeHour == 0) "12" else appointmentTimeHour.toString()

            val appointmentTimeMinute = appointmentTime12HrFormat % 100
            var appointmentTimeMinuteStr = ""
            if (appointmentTimeMinute == 0) {
                appointmentTimeMinuteStr = "00"
            } else if (appointmentTimeMinute < 10) {
                appointmentTimeMinuteStr = "0$appointmentTimeMinute"
            } else {
                appointmentTimeMinuteStr = appointmentTimeMinute.toString()
            }

            return "$appointmentTimeHourStr:$appointmentTimeMinuteStr $amPm"
        }
        return ""
    }

    fun get24HourFormatTo4DigitsMilitaryTime(): String {
        val simpleDateFormatArrivals = SimpleDateFormat("HH:mm", Locale.UK)
        val time = simpleDateFormatArrivals.format(Date())

        val parts = time.split(":".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
        val part1 = parts[0]
        val part2 = parts[1]
        return "$part1$part2"
    }

    fun patientEstAge(date: String): String {
        val simpleDateFormatYear = SimpleDateFormat("MMM dd yyyy", Locale.US)
        val date2 = simpleDateFormatYear.format(Date())


        val parts1 = date2.split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
        val parts = date.split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()

        val estAge = parts1[2].toInt() - parts[2].toInt()
        return estAge.toString()
    }

    fun getHoursAndMinutes(date: String, appointmentStart: String): String {
        if (!appointmentStart.isEmpty()) {
            val appointment24Format = Integer.parseInt(appointmentStart)
            val appointmentTimeFormat = appointment24Format / 100
            val appointmentMinuteFormat = appointment24Format % 100
            val te = appointmentTimeFormat / 100
            val appointmentMinuteStr =
                if (appointmentMinuteFormat == 0) {
                    "00"
                } else if (appointmentMinuteFormat < 10) {
                    "0$appointmentMinuteFormat"
                } else {
                    appointmentMinuteFormat.toString()
                }
            val sessionDateAndTime = "$date $appointmentTimeFormat:$appointmentMinuteStr"
            val simpleDateFormat = SimpleDateFormat("yyyy/MM/dd HH:mm")
            val before = simpleDateFormat.parse(sessionDateAndTime)
            return before.time.toString()
        }
        return ""
    }

    //EXPECTED INPUT -> 8 PM
    //OUTPUT -> 2000
    //FIXME -> LOGIC DOESN'T WORK IN CASES LIKE 8:30 PM
    fun getAppointmentTimeNumberFormat(time: String?): String {

        var appointmentTime = ""

        if (time != null) {

            if (Arrays.asList(*time!!.split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()).contains(
                    "AM"
                )
            ) {

                if (Arrays.asList(*time!!.split((" ").toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray())[0].length > 1) {

                    appointmentTime = Arrays.asList(*time!!.split((" ").toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray())[0] +
                            "00"

                } else {

                    appointmentTime = "0" +
                            Arrays.asList(*time!!.split((" ").toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray())[0] +
                            "00"
                }

            } else if (Arrays.asList(*time!!.split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()).contains(
                    "PM"
                )
            ) {

                if (Arrays.asList(*time!!.split((" ").toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray())[0] == "12") {

                    appointmentTime = Arrays.asList(*time!!.split((" ").toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray())[0] +
                            "00"

                } else {

                    if (Arrays.asList(*time!!.split((" ").toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray())[0].length <= 1) {

                        val pmTime =
                            Integer.parseInt(Arrays.asList(*time!!.split((" ").toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray())[0]) + 12

                        appointmentTime = pmTime.toString() + "00"

                    } else {

                        appointmentTime = "0" +
                                Arrays.asList(*time!!.split((" ").toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray())[0] +
                                "00"

                    }
                }

            }

        }

        return appointmentTime


    }

    fun getCalendarFromDob(dob: String): Triple<Int, Int, Int> {
        Log.d("dob", dob)
        val cal = Calendar.getInstance()
        val dateFormat = SimpleDateFormat("MMM dd yyyy", Locale.US)
        try {
            cal.time = dateFormat.parse(dob)
        } catch (e: ParseException) {
            Log.e("getCalendar", e.message, e)
        } finally {
            return Triple(
                cal.get(Calendar.YEAR),
                cal.get(Calendar.MONTH),
                cal.get(Calendar.DAY_OF_MONTH)
            )


        }

    }

    //STANDARD FORMAT -> 959x
    fun getPhoneNumberWithStandardFormat(phoneNo: String): String {
        if (TextUtils.isEmpty(phoneNo)) {
            return ""
        }

        if (phoneNo.startsWith("09")) {
            return "959" + phoneNo.substring(2, phoneNo.length)
            //return phoneNo.replace("09", "959");
        }

        return if (phoneNo.startsWith("+95")) {
            phoneNo.replace("+", "")
        } else phoneNo

    }

    //CALLABLE FORMAT -> 09x
    fun getPhoneNumberWithCallableFormat(phoneNo: String?) =
        if (phoneNo == null) {
            ""
        } else if (phoneNo.startsWith("959")) {
            "09${phoneNo.substring(3, phoneNo.length)}"
        } else if (!phoneNo.startsWith("09")) {
            "09$phoneNo"
        } else phoneNo

    fun getGenderFromInt(gender: Int): String {
        return if (gender == 0) {
            "Female"
        } else {
            "Male"
        }
    }

    fun getEstAgeFromDateOfBirth(dob: String): Int {
        val year = Integer.parseInt(dob.substring(dob.length - 4, dob.length))
        val currentYear = Calendar.getInstance().get(Calendar.YEAR)
        return currentYear - year
    }

    fun getUpcomingDays(days: Int): List<String> {
        val upcomingDays = ArrayList<String>()
        val simpleDateFormat = SimpleDateFormat("(yyyy/MM/dd) EEEE,", Locale.US)
        for (i in 0 until days) {
            val calendar = GregorianCalendar()
            calendar.add(Calendar.DATE, i)
            upcomingDays.add(simpleDateFormat.format(calendar.time))
        }

        return upcomingDays
    }

    fun getDaysFromToday(days: Int): List<String> {
        var days = days
        val previousDays = ArrayList<String>()
        do {
            val simpleDateFormat = SimpleDateFormat("(yyyy/MM/dd) EEEE", Locale.US)

            val calendar = GregorianCalendar()
            calendar.add(Calendar.DATE, days)
            previousDays.add(simpleDateFormat.format(calendar.time))

            days += 1

        } while (days < 0)

        return previousDays
    }


    fun getFormattedDateForBookingDisplay(inputDate: String): String {
        try {
            val simpleDateFormat = SimpleDateFormat("yyyy/MM/dd", Locale.US)
            val date = simpleDateFormat.parse(inputDate)

            val formatDateForBooking = SimpleDateFormat("dd MMM yyyy", Locale.US)
            return formatDateForBooking.format(date)
        } catch (e: ParseException) {
            return ""
        }

    }

    fun getDateForDay(dayInWeek: String): String {
        val simpleDateFormat = SimpleDateFormat("EEEE", Locale.US)
        val simpleDateFormat2 = SimpleDateFormat("yyyy/MM/dd", Locale.US)
        for (i in 0..6) {
            val calendar = GregorianCalendar()
            calendar.add(Calendar.DATE, i)
            if (TextUtils.equals(dayInWeek, simpleDateFormat.format(calendar.time))) {
                return simpleDateFormat2.format(calendar.time)
            }
        }

        return ""
    }

    fun getDateAndTimeForCancelByPatient(date: String, appointmentStart: String): String {
        if (!appointmentStart.isEmpty()) {
            val appointment24Format = Integer.parseInt(appointmentStart)
            val amPm = if (appointment24Format / 1200 > 0) "pm" else "am"
            val appointment12Format = appointment24Format % 1200
            val appointmentTimeFormat = appointment12Format / 100

            val appointmentTimestr =
                if (appointmentTimeFormat == 0)
                    "12"
                else appointmentTimeFormat.toString()

            val appointmentMinuteFormat = appointment24Format % 100
            val appointmentMinuteStr =
                if (appointmentMinuteFormat == 0) {
                    "00"
                } else if (appointmentMinuteFormat < 10) {
                    "0$appointmentMinuteFormat"
                } else {
                    appointmentMinuteFormat.toString()
                }
            val res = "$date $appointmentTimestr:$appointmentMinuteStr"
            val sdf1 = SimpleDateFormat("yyyy/MM/dd HH:mm")
            val res1 = sdf1.parse(res)
            val sdf2 = SimpleDateFormat("dd MMM yyyy HH:mm")
            val result = sdf2.format(res1)
            return "$result $amPm"
        }
        return ""
    }

    fun getFormattedDateForToday(): String {
        val simpleDateFormat = SimpleDateFormat("yyyy/MM/dd", Locale.US)
        val calendar = GregorianCalendar()
        return simpleDateFormat.format(calendar.time)
    }

    fun getDateForToday(): String {
        val simpleDateFormat = SimpleDateFormat("dd/MM/yyyy", Locale.US)
        val calendar = GregorianCalendar()
        return simpleDateFormat.format(calendar.time)
    }

    fun getDateThreeMonthsPreviousToday(): String {
        val simpleDateFormat = SimpleDateFormat("dd/MM/yyyy", Locale.US)
        val calendar = GregorianCalendar()
        calendar.time = Date()
        calendar.add(Calendar.MONTH, -3)
        return simpleDateFormat.format(calendar.time)
    }

    fun getUpcomingDateDays(count: Int): List<String> {
        val dates = mutableListOf<String>()
        val dateFormat = SimpleDateFormat("yyyy/MM/dd EEEE", Locale.US)
        for (i in 0 until count) {
            val calendar = GregorianCalendar()
            calendar.add(Calendar.DATE, i)
            val (date, day) = dateFormat.format(calendar.time).split(" ")
            dates.add(
                "($date) $day"
            )
        }

        return dates
    }

    fun getTodayDateByFormat(format: String): String {
        val simpleDateFormat = SimpleDateFormat(format, Locale.US)
        val calendar = GregorianCalendar()
        return simpleDateFormat.format(calendar.time)
    }

    fun changeDateFormat(date: String, fromFormat: String, toFormat: String): String {
        val parser = SimpleDateFormat(fromFormat, Locale.US)
        val formatter = SimpleDateFormat(toFormat, Locale.US)

        return formatter.format(parser.parse(date))
    }

    fun formatDate(data: String) : String{
        val strTranstime = data
        val parser = SimpleDateFormat("yyyy-MM-dd hh:mm:ss",Locale.ENGLISH)
        var formatter = SimpleDateFormat("dd-MMMM-yyyy hh:mm aa",Locale.ENGLISH)
        return formatter.format(parser.parse(strTranstime))
    }

    fun formatDateT(data: String) : String{
        val strTranstime = data
        val parser = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss",Locale.ENGLISH)
        var formatter = SimpleDateFormat("dd-MMMM-yyyy hh:mm aa",Locale.ENGLISH)
        return formatter.format(parser.parse(strTranstime))
    }

   fun getTimestampForDate(date: String): Long {

        val myDate = date
        val sdf = SimpleDateFormat("yyyy/MM/dd HH:mm:ss", Locale.US)
        val formateDate = sdf.parse(myDate)
        return formateDate.time
    }

    fun getFormattedDateFromTimestamp(timeStamp: Long, format: String) : String {
        val sdf = SimpleDateFormat(format, Locale.US)
        val calendar = Calendar.getInstance(Locale.US)
        calendar.timeInMillis = timeStamp

        val formattedDate = sdf.format(calendar.time)

        return formattedDate
    }

   fun getPreviousDaysModelLogic(days: Int): List<String> {
        var days = days
        val previousDays = ArrayList<String>()


        do {
            val simpleDateFormat = SimpleDateFormat("(yyyy/MM/dd) EEEE", Locale.US)

            val calendar = GregorianCalendar()
            calendar.add(Calendar.DATE, days)
            previousDays.add(simpleDateFormat.format(calendar.time))

            days += 1

        } while (days < 0)

        return previousDays
    }

    fun mmTextUnicodeOrigin(originalText: String, context: Context): String {
        return originalText/* if (MMFontUtils.isSupportUnicode(context)) {
            originalText
        } else {
            MMFontUtils.uni2zg(originalText)
        }*/
    }

    fun get24HrFormatTimeExcludeColon(time: String): String{
        if (!time.contains(":")) return time

        val formatted = time.replace("am","AM").replace("pm","PM")
        val date = SimpleDateFormat("hh:mm a", Locale.US).parse(formatted)
        return SimpleDateFormat("HH:mm", Locale.US).format(date).replace(":", "")
    }

    fun getYearMonthDayInNumberString(date: String): String {
        //Assuming the input is in YYYY/MM/dd format
        val dateInfoArray = date.split("/".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
        return if (dateInfoArray.size == 3) {
            dateInfoArray[0] + dateInfoArray[1] + dateInfoArray[2]
        } else {
            "0"
        }
    }


    //fullDate -> 2018/04/23
    //time -> 1200 or 1500, 0400, etc...
    //Output -> input (2018/04/23/, 1230) => 201804231230
    fun isSessionValid(fullDate: String, time: String): Boolean {
        Log.d("v1", SharedUtils.getYearMonthDayInNumberString(fullDate) + time)
        Log.d(
            "v2", SharedUtils.getYearMonthDayInNumberString(
                SharedUtils.getTodayDateByFormat(SharedConstants.FORMAT_DATE_Y_M_D)
            ) + SharedUtils.getTodayDateByFormat("kkmm")
        )

        return (java.lang.Long.parseLong(
            SharedUtils.getYearMonthDayInNumberString(fullDate) + time
        ) > java.lang.Long.parseLong(
            SharedUtils.getYearMonthDayInNumberString(
                SharedUtils.getTodayDateByFormat(SharedConstants.FORMAT_DATE_Y_M_D)
            ) + SharedUtils.getTodayDateByFormat("kkmm")
        ))
    }


    fun isSessionValidByTimeSlot(timeSlot: Long): Boolean {
        return (timeSlot > java.lang.Long.parseLong(
            (SharedUtils.getYearMonthDayInNumberString(
                SharedUtils.getTodayDateByFormat(SharedConstants.FORMAT_DATE_Y_M_D)
            ) + SharedUtils.getTodayDateByFormat("kkmm"))
        ))
    }

    //DEFAULT PLUS TIME => 2hrs
    //EXPECTED INPUT -> (2018/06/29) Friday, starts from 6:00pm
    //OUTPUT -> 8:00pm
    //FIXME -> DOESN'T WORK IN CASES LIKE (2018/06/29) Friday, starts from 6:30pm
    fun getCalculatedFinishTimeInSessionStartedMessage(formattedAppointmentDetails: String): String {
        val appointmentDetails =
            formattedAppointmentDetails.split((" ").toRegex()).dropLastWhile { it.isEmpty() }
                .toTypedArray()
        if (appointmentDetails.size >= 4 && !appointmentDetails[4].isEmpty()) {
            //IN ORDER TO USE PRE-EXISTING METHOD getAppointmentTimeNumberFormat() IT NEEDS TO BE UPPERCASE
            val startTime = appointmentDetails[4]
            val formattedTime = startTime.replace((":00").toRegex(), " ").toUpperCase()

            return SharedUtils.getPresentableAppointmentTime(
                (Integer.parseInt(SharedUtils.getAppointmentTimeNumberFormat(formattedTime)) + 200).toString()
            )
        }
        return "undefined"

    }

    fun getDateForSession(fullDate: String?): String {
        return if (fullDate != null) {
            fullDate.split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[0].replace(
                "(",
                ""
            ).replace(")", "")
        } else ""
    }

    /*
    dateTime -> 2018/12/31 23:00
     */
    fun getMillisFromDateAndTime(date: String, appointmentStart: String): Long {
        val appointment24Format = Integer.parseInt(appointmentStart)
        val appointmentTimeFormat = appointment24Format / 100
        val appointmentMinuteFormat = appointment24Format % 100
        val te = appointmentTimeFormat / 100
        val appointmentMinuteStr =
            if (appointmentMinuteFormat == 0) {
                "00"
            } else if (appointmentMinuteFormat < 10) {
                "0$appointmentMinuteFormat"
            } else {
                appointmentMinuteFormat.toString()
            }
        val sessionDateAndTime = "$date $appointmentTimeFormat:$appointmentMinuteStr"
        val simpleDateFormat = SimpleDateFormat("yyyy/MM/dd HH:mm", Locale.getDefault())
        val before = simpleDateFormat.parse(sessionDateAndTime)
        return before.time

    }

    fun getTimeForYourTurn(bookingNumber: Int, appointmentStart: String): String {
        var mins = bookingNumber * 5
        var hours = 0
        while (mins >= 60) {
            hours++
            mins -= 60
        }
        val hourMin = (hours * 100) + mins
        val result = appointmentStart.toInt() + hourMin

        return if (result.toString().length == 3){
            "0$result"
        } else {
            result.toString()
        }
    }


    private fun <T> getSeparatedString(collection: Collection<T>, separator: String): String {
        if (collection.size == 1) return collection.first().toString()

        val builder = StringBuilder()
        for ((index, element) in collection.withIndex()) {
            builder.append(element)
            if (index < collection.size - 1)
                builder.append(separator)
        }
        return builder.toString()
    }

    fun getPresentableAppointmentFinishTime(appointmentFinish: String?,appointmentStart: String): String {
        if (appointmentFinish != null) return getPresentableAppointmentTime(appointmentFinish)

        var estimateFinish = (appointmentStart.toInt() + 200).toString()
        estimateFinish = if (estimateFinish.length == 3) "0$estimateFinish" else estimateFinish

        return getPresentableAppointmentTime(estimateFinish)
    }

    fun addSpaceInPhoneNumber(phoneNumber: String): String {
        var value = phoneNumber
        var a: String? = ""
        var b: String? = ""
        var c: String? = ""
        value = value.replace(" ", "")
        if (value.length >= 2) {
            a = value.substring(0, 2)
        } else if (value.length < 2) {
            a = value.substring(0, value.length)
        }
        if (value.length >= 6) {
            b = value.substring(2, 6)
            c = value.substring(6, value.length)
        } else if (value.length > 2 && value.length < 7) {
            b = value.substring(2, value.length)
        }
        val stringBuffer = StringBuffer()
        if (a != null && a.length > 0) {
            stringBuffer.append(a)
            if (a.length == 2) {
                stringBuffer.append(" ")
            }
        }
        if (b != null && b.length > 0) {
            stringBuffer.append(b)
            if (b.length == 4) {
                stringBuffer.append(" ")
            }
        }
        if (c != null && c.length > 0) {
            stringBuffer.append(c)
        }
        return stringBuffer.toString()
    }

    fun getDateFormatForAppointmentHistory(dateForSession: String): String {
        val input:  Date
        try {
            input = SimpleDateFormat(SharedConstants.FORMAT_DATE_Y_M_D).parse(dateForSession)
        }catch (e: Exception){
            return dateForSession
        }

        return SimpleDateFormat(SharedConstants.FORMAT_DATE_M_D_Y).format(input)
    }

    fun getIntentForImageUpload(context: Context,className: String): Intent{
        val allIntents = arrayListOf<Intent>()
        val packageManager = context.packageManager
        val captureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        val listCam = packageManager.queryIntentActivities(captureIntent,0)
        listCam.forEach {res ->
            val intent = Intent(captureIntent)
            intent.component = ComponentName(res.activityInfo.packageName,res.activityInfo.name)
            intent.setPackage(res.activityInfo.packageName)
            allIntents.add(intent)
        }

        val galleryIntent = Intent(Intent.ACTION_GET_CONTENT)
        galleryIntent.type = "image/*"
        val listGallery = packageManager.queryIntentActivities(galleryIntent,0)
        listGallery.forEach {res ->
            val intent = Intent(galleryIntent)
            intent.component = ComponentName(res.activityInfo.packageName,res.activityInfo.name)
            intent.setPackage(res.activityInfo.packageName)
            allIntents.add(intent)
        }

        var mainIntent = allIntents[allIntents.size - 1]
        allIntents.forEach {intent ->
            if (intent.component!!.className == className){
                mainIntent = intent
            }
        }
        allIntents.remove(mainIntent)
        val chooserIntent = Intent.createChooser(mainIntent,"Select Source")
        chooserIntent.putExtra(Intent.EXTRA_INITIAL_INTENTS,allIntents.toTypedArray())

        return chooserIntent
    }

    fun dp2px(resources: Resources, dp: Float): Float {
        val scale = resources.displayMetrics.density
        return dp * scale + 0.5f
    }

    fun sp2px(resources: Resources, sp: Float): Float {
        val scale = resources.displayMetrics.scaledDensity
        return sp * scale
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
     * */
    fun getTimeDifferenceFromTwoDatesV2(startDateInput: String, dueDateInput: String): Int {
        try {
            val simpleDateFormat = SimpleDateFormat("yyyy-MM-dd hh:mm:ss", Locale.US)
            val startDate = simpleDateFormat.parse(startDateInput)
            val dueDate = simpleDateFormat.parse(dueDateInput)

            val startDateCalendar = Calendar.getInstance()
            startDateCalendar.time = startDate

            val dueDateCalendar = Calendar.getInstance()
            dueDateCalendar.time = dueDate

            val startDateYear = startDateCalendar.get(Calendar.YEAR)
            val dueDateYear = dueDateCalendar.get(Calendar.YEAR)

            val yearDiff = dueDateYear - startDateYear
            val totalDayDiffByYear = yearDiff * 365

            val startDateDayOfYear = startDateCalendar.get(Calendar.DAY_OF_YEAR)
            val dueDateDayOfYear = dueDateCalendar.get(Calendar.DAY_OF_YEAR)

            val totalDayDiffByDayOfYear = dueDateDayOfYear - startDateDayOfYear

            return totalDayDiffByDayOfYear + totalDayDiffByYear

        } catch (e: ParseException) {
            return 0
        }
    }

    fun getTimestampFromMobilApiDate(date: String) : Long {

        return try {
            val formattedDate = changeDateFormat(
                date,
                SharedConstants.FORMAT_DATE_M_D_Y_T_HH_mm_ss,
                SharedConstants.FORMAT_DATE_M_D_Y_HH_mm_ss
            )
            getTimestampForDate(formattedDate)
        } catch (e: java.lang.Exception) {
            0L
        }
    }

    fun getTimestampFromUserChooseDate(date: String) : Long {
        return try {
            val formattedDate = changeDateFormat(date,
                SharedConstants.FORMAT_DATE_D_M_Y,
                SharedConstants.FORMAT_DATE_M_D_Y_HH_mm_ss)
            getTimestampForDate(formattedDate)

        } catch (e: java.lang.Exception) {
            0L
        }
    }
}

fun EditText.setMMHint(stringResourceId: Int) {
    hint = SharedUtils.mmTextUnicodeOrigin(resources.getString(stringResourceId), context)
}

fun TextInputLayout.setMMHint(stringResourceId: Int) {
    hint = SharedUtils.mmTextUnicodeOrigin(resources.getString(stringResourceId), context)
}

fun TextInputLayout.setMMError(stringResourceId: Int) {
    error = SharedUtils.mmTextUnicodeOrigin(resources.getString(stringResourceId), context)
}

fun TextInputEditText.setMMHint(stringResourceId: Int) {
    hint = SharedUtils.mmTextUnicodeOrigin(resources.getString(stringResourceId), context)
}

fun TextInputEditText.setMMError(stringResourceId: Int) {
    error = SharedUtils.mmTextUnicodeOrigin(resources.getString(stringResourceId), context)
}

fun TextInputEditText.isInputEmpty(): Boolean = TextUtils.isEmpty(this.text.toString())


