package com.example.chapter2_challenge.utils

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.appcompat.widget.AppCompatRadioButton
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.content.ContextCompat
import com.example.chapter2_challenge.R

class CustomButton(context: Context, attributeSet: AttributeSet): AppCompatButton(context, attributeSet) {

    init {
        applyFont()
    }

    private fun applyFont() {
        val regularTypeFace: Typeface =
            Typeface.createFromAsset(context.assets, "Nunito-Bold.ttf")

        typeface = regularTypeFace

        setTextColor(ContextCompat.getColor(context, R.color.white))
        setBackgroundColor(ContextCompat.getColor(context, R.color.red_300_normal))
    }
}