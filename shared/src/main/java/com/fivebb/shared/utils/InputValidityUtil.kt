package com.fivebb.shared.utils

import android.content.Context
import android.widget.*
import com.fivebb.shared.viewitems.SpinnerViewItem
import com.google.android.material.textfield.TextInputLayout
/*import org.mmtextview.MMFontUtils
import org.mmtextview.MMFontUtils.isSupportUnicode*/

object InputValidityUtil {

    fun checkEditTextCharacterCount(
        editText: EditText,
        numberOfCharacterLimit: Int,
        errorMessage: String
    ): Boolean {
        if (editText != null) {
            return if (editText.text.toString().length == numberOfCharacterLimit) {
                editText.error = null
                true
            } else {
                editText.error = SharedUtils.mmTextUnicodeOrigin(errorMessage, editText.context)
                editText.requestFocus()
                false
            }
        }
        return false

    }

    fun checkEditTextCharacterCount(
        editText: EditText,
        textInputLayout: TextInputLayout,
        numberOfCharacterLimit: Int,
        errorMessage: String
    ): Boolean {
        if (editText != null) {
            return if (editText.text.toString().length == numberOfCharacterLimit) {
                textInputLayout.error = null
                true
            } else {
                textInputLayout.error =
                    SharedUtils.mmTextUnicodeOrigin(errorMessage, editText.context)
                editText.requestFocus()
                false
            }
        }
        return false

    }

    fun checkEditTextAtLeastCharacterCount(
        editText: EditText,
        textInputLayout: TextInputLayout,
        atLeastCount: Int,
        errorMessage: String
    ): Boolean {
        if (editText != null) {
            return if (editText.text.toString().length >= atLeastCount) {
                textInputLayout.error = null
                true
            } else {
                textInputLayout.error =
                    SharedUtils.mmTextUnicodeOrigin(errorMessage, editText.context)
                editText.requestFocus()
                false
            }
        }
        return false

    }

    fun isGivenEditTextHasInput(editText: EditText, errorMessage: String): Boolean {
        return if (editText.text.toString().trim().isEmpty()) {
            editText.error = SharedUtils.mmTextUnicodeOrigin(errorMessage, editText.context)
            editText.requestFocus()
            false
        } else {
            editText.error = null
            true
        }
    }

    fun isGivenEditTextHasInput(
        editText: EditText,
        textInputLayout: TextInputLayout,
        errorMessage: String
    ): Boolean {
        return if (editText.text.toString().trim().isEmpty()) {
            textInputLayout.error = SharedUtils.mmTextUnicodeOrigin(errorMessage, editText.context)
            editText.requestFocus()
            false
        } else {
            textInputLayout.error = null
            true
        }
    }

    fun isSpinnerItemSelected(spinner: Spinner, errorMessage: String): Boolean {
        val spinnerViewItem = spinner.selectedView as SpinnerViewItem
        val textView = spinnerViewItem.getChildAt(0) as TextView

        return if (spinner.selectedItemPosition == 0) {
            textView.error = SharedUtils.mmTextUnicodeOrigin(errorMessage, spinner.context)
            false
        } else {
            textView.error = null
            true
        }
    }

    fun isRadioGroupHasSelectedButton(radioGroup: RadioGroup, errorMessage: String): Boolean {
        var lastRadioButton: RadioButton? = null
        if (radioGroup.childCount > 1) {
            lastRadioButton = radioGroup.getChildAt(radioGroup.childCount - 1) as RadioButton
        } else {
            lastRadioButton = radioGroup.getChildAt(radioGroup.childCount) as RadioButton
        }
        return if (radioGroup.checkedRadioButtonId == -1) {
            //NO RADIO BUTTON IS CHECKED
            lastRadioButton.error =
                SharedUtils.mmTextUnicodeOrigin(errorMessage, radioGroup.context)
            false
        } else {
            lastRadioButton.error = null
            true
        }
    }

    fun isEditTextInputEmailValid(
        etEmail: EditText,
        errorMessage: String = "Invalid Email"
    ): Boolean {
        return if (SharedUtils.isValidEmail(etEmail.text)) {
            etEmail.error = null
            true
        } else {
            etEmail.error = errorMessage
            etEmail.requestFocus()
            false
        }
    }
}


// TODO check MM font utility class
fun mmTextUnicodeOrigin(originalText: String, context: Context): String {
    return originalText /*if (isSupportUnicode(context)) {
        originalText
    } else {
        MMFontUtils.uni2zg(originalText)
    }*/
}