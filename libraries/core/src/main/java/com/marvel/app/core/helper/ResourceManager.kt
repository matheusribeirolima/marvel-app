package com.marvel.app.core.helper

import android.content.Context
import android.graphics.drawable.Drawable
import androidx.annotation.ColorRes
import androidx.annotation.DimenRes
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.core.content.ContextCompat

class ResourceManager constructor(private val context: Context) {

    fun getString(@StringRes stringRes: Int): String {
        return context.getString(stringRes)
    }

    fun getString(@StringRes stringRes: Int, vararg formatArgs: Any): String {
        return context.getString(stringRes, formatArgs)
    }

    fun getDrawable(@DrawableRes drawableRes: Int): Drawable? {
        return ContextCompat.getDrawable(context, drawableRes)
    }

    fun getDimension(@DimenRes dimensionRes: Int): Float {
        return context.resources.getDimension(dimensionRes)
    }

    fun getDimensionPixelSize(@DimenRes dimensionRes: Int): Int {
        return context.resources.getDimensionPixelSize(dimensionRes)
    }

    fun getColor(@ColorRes colorRes: Int): Int {
        return ContextCompat.getColor(context, colorRes)
    }
}
