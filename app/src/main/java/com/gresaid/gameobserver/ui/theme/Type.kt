package com.gresaid.gameobserver.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.gresaid.gameobserver.R

val fontFamilyModernist = FontFamily(
    Font(R.font.modernist_regular, FontWeight.Normal),
    Font(R.font.modernist_bold, FontWeight.Bold)
)

// Set of Material typography styles to start with
val Typography = Typography(
    h2 = TextStyle(
        fontFamily = fontFamilyModernist,
        fontWeight = FontWeight.Normal,
        fontSize = 20.sp,
        lineHeight = 26.sp,
        letterSpacing = 0.5.sp,
    ),
    body2 = TextStyle(
        fontFamily = fontFamilyModernist,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.5.sp,
    ),
    body1 = TextStyle(
        fontFamily = fontFamilyModernist,
        fontWeight = FontWeight.Normal,
        fontSize = 10.sp,
    ),
    h3 = TextStyle(
        fontFamily = fontFamilyModernist,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.5.sp,
    ),
    h1 = TextStyle(
        fontFamily = fontFamilyModernist,
        fontWeight = FontWeight.Bold,
        fontSize = 48.sp,
        lineHeight = 26.sp,
        letterSpacing = 0.5.sp,
    ),
)
