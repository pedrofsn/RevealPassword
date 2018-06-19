package br.com.redcode.revealpassword.library

import android.text.method.PasswordTransformationMethod
import android.widget.EditText

/**
 * Created by pedrofsn on 17/10/2017.
 */

fun EditText.showOrHidePassword(): Boolean {
    if (transformationMethod == null) {
        transformationMethod = PasswordTransformationMethod()
        return true
    } else {
        transformationMethod = null
        return false
    }
}