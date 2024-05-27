package com.ethanmurray.doctorwhowiki.ui.resources

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.sp
import com.ethanmurray.doctorwhowiki.R

object InternalTypography {
    private val fontFamilyPoppins = FontFamily(
        Font(R.font.poppins_extra_light, FontWeight.ExtraLight, FontStyle.Normal),
        Font(R.font.poppins_light, FontWeight.Light, FontStyle.Normal),
        Font(R.font.poppins_regular, FontWeight.Normal, FontStyle.Normal),
        Font(R.font.poppins_medium, FontWeight.Medium, FontStyle.Normal),
        Font(R.font.poppins_semi_bold, FontWeight.SemiBold, FontStyle.Normal),
        Font(R.font.poppins_bold, FontWeight.Bold, FontStyle.Normal),
        Font(R.font.poppins_italic, FontWeight.Normal, FontStyle.Italic)
    )

    val display1 = TextStyle(
        fontFamily = fontFamilyPoppins,
        fontWeight = FontWeight.SemiBold,
        fontSize = 88.sp,
        lineHeight = 105.6.sp,
        letterSpacing = (-0.5).sp
    )

    val display2 = TextStyle(
        fontFamily = fontFamilyPoppins,
        fontWeight = FontWeight.Normal,
        fontSize = 24.sp,
        lineHeight = 26.4.sp,
        letterSpacing = (-0.1).sp
    )

    val display3 = TextStyle(
        fontFamily = fontFamilyPoppins,
        fontWeight = FontWeight.SemiBold,
        fontSize = 44.sp,
        lineHeight = 52.8.sp,
        letterSpacing = (-0.1).sp
    )

    val title1 = TextStyle(
        fontFamily = fontFamilyPoppins,
        fontWeight = FontWeight.SemiBold,
        fontSize = 32.sp,
        lineHeight = 28.8.sp
    )

    val title2 = TextStyle(
        fontFamily = fontFamilyPoppins,
        fontWeight = FontWeight.SemiBold,
        fontSize = 24.sp,
        lineHeight = 28.8.sp
    )

    val title3 = TextStyle(
        fontFamily = fontFamilyPoppins,
        fontWeight = FontWeight.SemiBold,
        fontSize = 20.sp,
        lineHeight = 28.8.sp
    )

    val subhead = TextStyle(
        fontFamily = fontFamilyPoppins,
        fontWeight = FontWeight.Normal,
        fontSize = 15.sp,
        lineHeight = 21.sp,
        letterSpacing = 0.1.sp
    )

    val subheadMedium = TextStyle(
        fontFamily = fontFamilyPoppins,
        fontWeight = FontWeight.Medium,
        fontSize = 15.sp,
        lineHeight = 21.sp,
        letterSpacing = 0.1.sp
    )

    val subheadBold = TextStyle(
        fontFamily = fontFamilyPoppins,
        fontWeight = FontWeight.SemiBold,
        fontSize = 15.sp,
        lineHeight = 21.sp,
        letterSpacing = 0.1.sp
    )

    val body = TextStyle(
        fontFamily = fontFamilyPoppins,
        fontWeight = FontWeight.Normal,
        fontSize = 17.sp,
        lineHeight = 23.8.sp,
        letterSpacing = 0.1.sp
    )

    val bodyMedium = TextStyle(
        fontFamily = fontFamilyPoppins,
        fontWeight = FontWeight.Medium,
        fontSize = 17.sp,
        lineHeight = 23.8.sp,
        letterSpacing = 0.1.sp
    )

    val bodyBold = TextStyle(
        fontFamily = fontFamilyPoppins,
        fontWeight = FontWeight.SemiBold,
        fontSize = 17.sp,
        lineHeight = 23.8.sp,
        letterSpacing = 0.1.sp
    )

    val link = TextStyle(
        fontFamily = fontFamilyPoppins,
        fontWeight = FontWeight.SemiBold,
        fontSize = 17.sp,
        lineHeight = 20.4.sp,
        letterSpacing = 0.1.sp,
        textDecoration = TextDecoration.Underline
    )

    val footnote = TextStyle(
        fontFamily = fontFamilyPoppins,
        fontWeight = FontWeight.Medium,
        fontSize = 12.sp,
        lineHeight = 18.2.sp,
        letterSpacing = 0.1.sp
    )

    val caption = TextStyle(
        fontFamily = fontFamilyPoppins,
        fontWeight = FontWeight.Medium,
        fontSize = 13.sp,
        lineHeight = 15.6.sp,
        letterSpacing = 0.1.sp
    )

    val typography = Typography(
        titleLarge = title1,
        titleMedium = title2,
        titleSmall = title3,
        bodyMedium = body,
        displayLarge = display1,
        displayMedium = display2,
        displaySmall = display3
    )
}