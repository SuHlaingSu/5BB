package com.fivebb.shared.utils
import android.widget.EditText
/*
import org.mmtextview.MMFontUtils
*/

open class MMFontUtilExtended {

    companion object {

        fun enforceEditTextHint(editText: EditText, hint : String) {
           /* if(!MMFontUtils.isSupportUnicode(editText.context)) {
                editText.hint = MMFontUtils.uni2zg(hint)
            }*/
        }

        fun getUnicodeText(editText: EditText) {

        }
    }
}