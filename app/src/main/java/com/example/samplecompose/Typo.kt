package com.example.samplecompose
import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

private val Karla = FontFamily(
    Font(R.font.karla),
    Font(R.font.karla_italic, FontWeight.Thin),
    Font(R.font.karla_regular, FontWeight.W500),
    Font(R.font.karla_bold, FontWeight.Bold)
)
val Typography = Typography(
    h1 = TextStyle(
        fontFamily = Karla,
        fontSize = 30.sp
    ),
    body1 = TextStyle(
        fontFamily = Karla,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    body2 = TextStyle(
        fontFamily = Karla,
        fontSize = 14.sp,
        lineHeight = 20.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
)