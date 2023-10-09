package com.gresaid.gameobserver.ui.theme

import androidx.compose.material3.Typography
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
    headlineMedium = TextStyle(
        fontFamily = fontFamilyModernist,
        fontWeight = FontWeight.Normal,
        fontSize = 20.sp,
        lineHeight = 26.sp,
        letterSpacing = 0.5.sp,
    ),
    bodySmall = TextStyle(
        fontFamily = fontFamilyModernist,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.5.sp,
    ),
    labelMedium = TextStyle(
        fontFamily = fontFamilyModernist,
        fontWeight = FontWeight.Normal,
        fontSize = 10.sp,
    ),
    bodyMedium = TextStyle(
        fontFamily = fontFamilyModernist,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.5.sp,
    ),
    headlineLarge = TextStyle(
        fontFamily = fontFamilyModernist,
        fontWeight = FontWeight.Bold,
        fontSize = 48.sp,
        lineHeight = 26.sp,
        letterSpacing = 0.5.sp,
    ),
)