package com.marvel.navigation

import android.content.Context
import android.content.Intent
import androidx.annotation.StringRes

object Actions {
    private fun internalIntent(context: Context, @StringRes action: Int) =
        Intent(context.getString(action)).setPackage(context.packageName)

    fun openHomeIntent(context: Context) = internalIntent(context, R.string.openHome)

    fun openDetailIntent(context: Context) = internalIntent(context, R.string.openDetail)
}
