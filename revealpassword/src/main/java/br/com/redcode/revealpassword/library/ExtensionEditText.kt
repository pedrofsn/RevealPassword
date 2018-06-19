package br.com.redcode.revealpassword.library

import android.text.method.PasswordTransformationMethod
import android.widget.EditText

/**
 * Created by pedrofsn on 17/10/2017.
 */

fun EditText.alterarVisibilidadeSenha(): Boolean {
    if (transformationMethod == null) {
        setTransformationMethod(PasswordTransformationMethod())
        return true
    } else {
        setTransformationMethod(null)
        return false
    }
}