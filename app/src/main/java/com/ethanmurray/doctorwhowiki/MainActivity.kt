package com.ethanmurray.doctorwhowiki

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.ethanmurray.doctorwhowiki.ui.resources.RootTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RootTheme {
                RootScreen()
            }
        }
    }
}

// API: https://api.catalogopolis.xyz/docs/
