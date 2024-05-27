package com.ethanmurray.doctorwhowiki

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.ethanmurray.doctorwhowiki.ui.resources.RootTheme
import com.ethanmurray.doctorwhowiki.ui.screens.splash.SplashScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RootTheme {
                SplashScreen()
            }
        }
    }
}

// API: https://api.catalogopolis.xyz/docs/
