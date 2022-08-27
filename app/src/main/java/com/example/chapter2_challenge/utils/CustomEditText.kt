package com.example.chapter2_challenge.utils

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatEditText
import androidx.appcompat.widget.AppCompatTextView

class CustomEditText(context: Context, attributeSet: AttributeSet): AppCompatEditText(context, attributeSet) {

    init {
        applyFont()
    }

    private fun applyFont() {
        val regularTypeFace: Typeface =
            Typeface.createFromAsset(context.assets, "Nunito-Regular.ttf")

        typeface = regularTypeFace
    }
}