package com.fivebb.shared.utils
import java.io.IOException


fun Throwable.isNoConnection(): Boolean {
    return this is IOException
}