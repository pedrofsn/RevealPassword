package br.com.redcode.revealpassword.library

import android.content.Context
import android.util.AttributeSet
import android.widget.EditText
import android.widget.FrameLayout
import android.widget.ImageView


/**
 * Created by pedrofsn on 02/11/2017.
 */
class UiCampoSenha : FrameLayout {

    private lateinit var imageView: ImageView
    private lateinit var editText: EditText

    var isSenhaVisivel: Boolean = false
    var hint: String? = context.getString(R.string.password)

    constructor(context: Context) : super(context) {
        inicializar()
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        obterDadosXML(attrs)
        inicializar()
    }

    constructor(context: Context, attrs: AttributeSet, style: Int) : super(context, attrs, style) {
        obterDadosXML(attrs)
        inicializar()
    }

    private fun obterDadosXML(attrs: AttributeSet) {
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.UICampoSenha, 0, 0)
        try {
            typedArray.getString(R.styleable.UICampoSenha_hint)?.let { hint = it }
        } finally {
            typedArray.recycle()
        }
    }

    private fun inicializar() {
        val view = inflate(context, R.layout.ui_campo_senha, null);
        addView(view)

        imageView = view.findViewById(R.id.imageViewVisualizarSenha)
        editText = view.findViewById(R.id.editTextSenha)

        popular()
    }

    private fun popular() {
        alterarLabel(hint)
        imageView.setOnClickListener { isSenhaVisivel = editText.alterarVisibilidadeSenha() }
    }


    fun alterarLabel(label: String?) {
        label?.let { editText.setHint(it) }
    }

}