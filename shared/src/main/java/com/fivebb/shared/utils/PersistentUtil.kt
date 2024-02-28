package com.fivebb.shared.utils

import android.content.Context
import android.content.SharedPreferences

class PersistentUtil(context: Context) {

    private var mSharedPreferences: SharedPreferences = context.getSharedPreferences(PersistentUtil::class.java.name, Context.MODE_PRIVATE)

    companion object {
        fun newInstance(context: Context): PersistentUtil {
            return PersistentUtil(context)
        }
    }

    fun saveLanguage(language: String) {
        val editor = mSharedPreferences.edit()
        editor.putString(SharedConstants.SELECTED_LANGUAGE, language)
        editor.apply()
    }

    //Default language is Myanmar.
    fun getLanguage(): String? {
        return mSharedPreferences.getString(SharedConstants.SELECTED_LANGUAGE, SharedConstants.SELECTED_LANGUAGE_MY)
    }

}