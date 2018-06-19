package br.com.redcode.revealpassword.library

import android.content.Context
import android.support.annotation.DrawableRes
import android.support.v7.widget.AppCompatImageView
import android.util.AttributeSet
import android.widget.EditText
import android.widget.FrameLayout


/**
 * Created by pedrofsn on 02/11/2017.
 */
class EditTextWithImageForRevealPassword : FrameLayout {

    lateinit var frameLayout: FrameLayout
    lateinit var imageViewVisualizePassword: AppCompatImageView
    lateinit var editTextPassword: EditText

    private var isPasswordVisible: Boolean = false
    private var editTextHint: String? = null

    constructor(context: Context) : super(context) {
        initialize()
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        getDataFromXML(attrs)
        initialize()
    }

    constructor(context: Context, attrs: AttributeSet, style: Int) : super(context, attrs, style) {
        getDataFromXML(attrs)
        initialize()
    }

    private fun getDataFromXML(attrs: AttributeSet) {
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.EditTextWithImageForRevealPassword, 0, 0)
        try {
            editTextHint = typedArray.getString(R.styleable.EditTextWithImageForRevealPassword_hint) ?: context.getString(R.string.password)
        } finally {
            typedArray.recycle()
        }
    }

    private fun initialize() {
        val view = inflate(context, R.layout.ui_revealpassword, null)
        addView(view)

        frameLayout = view.findViewById(R.id.frameLayout)
        imageViewVisualizePassword = view.findViewById(R.id.imageViewVisualizePassword)
        editTextPassword = view.findViewById(R.id.editTextPassword)

        populate()
    }

    private fun populate() {
        changeHint(editTextHint)
        imageViewVisualizePassword.setOnClickListener { isPasswordVisible = editTextPassword.showOrHidePassword() }
    }

    fun changeHint(label: String?) {
        label?.let { editTextPassword.hint = label }
    }

    fun changeIcon(@DrawableRes icon: Int?) {
        icon?.let { imageViewVisualizePassword.setBackgroundResource(icon) }
    }

}