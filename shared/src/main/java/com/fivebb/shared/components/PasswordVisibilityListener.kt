package com.fivebb.shared.components

import android.os.Build
import android.text.method.PasswordTransformationMethod
import android.view.MotionEvent
import android.view.View
import android.widget.EditText
import com.fivebb.shared.R

class PasswordVisibilityListener : View.OnTouchListener {
    //    private static final int DRAWABLE_BOTTOM = 3;

    private var isPasswordShown = false

    override fun onTouch(view: View, event: MotionEvent): Boolean {
        val etPassword = view as EditText
        if (event.action == MotionEvent.ACTION_UP) {
            if (event.rawX >= etPassword.right - etPassword.compoundDrawables[DRAWABLE_RIGHT].bounds.width()) {
                if (isPasswordShown) {
                    etPassword.setCompoundDrawablesWithIntrinsicBounds(null, null, view.getContext().resources.getDrawable(R.drawable.ic_visibility_off_24dp, view.getContext().theme), null)

                    etPassword.transformationMethod = PasswordTransformationMethod()
                } else {
                    etPassword.setCompoundDrawablesWithIntrinsicBounds(null, null, view.getContext().resources.getDrawable(R.drawable.ic_visibility_24dp, view.getContext().theme), null)

                    etPassword.transformationMethod = null
                }
                isPasswordShown = !isPasswordShown

                return false
            }
        }
        return false
    }
    companion object {

        //    private static final int DRAWABLE_LEFT = 0;
        //    private static final int DRAWABLE_TOP = 1;
        private val DRAWABLE_RIGHT = 2
    }

}
