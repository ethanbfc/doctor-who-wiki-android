package com.ethanmurray.doctorwhowiki

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.ethanmurray.doctorwhowiki.destinations.SplashScreenDestination
import com.ramcosta.composedestinations.DestinationsNavHost
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.navigate
import com.ramcosta.composedestinations.rememberNavHostEngine

@Destination
@Composable
fun RootScreen() {
    val navHostEngine = rememberNavHostEngine()
    val navController = rememberNavController()

    DestinationsNavHost(
        navGraph = NavGraphs.root,
        engine = navHostEngine,
        navController = navController
    )

    navController.navigate(SplashScreenDestination)
}
