package com.example.chapter2_challenge.utils

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatEditText
import androidx.appcompat.widget.AppCompatRadioButton
import androidx.appcompat.widget.AppCompatTextView

class CustomRadioButton(context: Context, attributeSet: AttributeSet): AppCompatRadioButton(context, attributeSet) {

    init {
        applyFont()
    }

    private fun applyFont() {
        val regularTypeFace: Typeface =
            Typeface.createFromAsset(context.assets, "Nunito-Regular.ttf")

        typeface = regularTypeFace
    }
}