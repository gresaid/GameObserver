package com.gresaid.gameobserver.utils

import android.content.Context

fun getJsonDataFromAsset(context: Context, data: String): String {
    return context.assets.open(data).bufferedReader().use { it.readText() }
}
