package com.fivebb.shared.utils
import android.text.Editable
import android.text.TextWatcher
import android.view.KeyEvent
import android.widget.EditText

class PhoneNumberTextWatcher(private val edTxt: EditText) : TextWatcher {
    private var isDelete: Boolean = false

    init {
        edTxt.setOnKeyListener { v, keyCode, event ->
            if (keyCode == KeyEvent.KEYCODE_DEL) {
                isDelete = true
            }
            false
        }
    }

    override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {}

    override fun beforeTextChanged(s: CharSequence, start: Int, count: Int,
                                   after: Int) {
    }

    override fun afterTextChanged(s: Editable) {

        if (isDelete) {
            isDelete = false
            return
        }
        var value: String? = s.toString()
        if (value != null && value.isNotEmpty()) {
            val phoneNoAfterSpace = SharedUtils.addSpaceInPhoneNumber(value)
            edTxt.removeTextChangedListener(this)
            edTxt.setText(phoneNoAfterSpace)
            edTxt.setSelection(edTxt.text.toString().length)
            edTxt.addTextChangedListener(this)
        } else {
            edTxt.removeTextChangedListener(this)
            edTxt.setText("")
            edTxt.addTextChangedListener(this)
        }

    }

    companion object {

        private val TAG = PhoneNumberTextWatcher::class.java
                .simpleName
    }

}
