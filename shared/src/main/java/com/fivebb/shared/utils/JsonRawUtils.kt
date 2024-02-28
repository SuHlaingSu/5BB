package com.fivebb.shared.utils
import android.content.Context
import androidx.annotation.RawRes
import java.util.*

fun readFromRaw(@RawRes id: Int, context: Context): String {
        return context.resources.openRawResource(id).let {
            val scanner = Scanner(it)
            val builder = StringBuilder()
            while (scanner.hasNext()) {
                builder.append(scanner.nextLine())
            }
            builder.toString()
        }
    }