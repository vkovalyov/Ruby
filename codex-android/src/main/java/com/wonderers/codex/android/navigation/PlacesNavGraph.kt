package com.wonderers.codex.android.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.wonderers.codex.android.navigation.destination.RouteMain
import com.wonderers.codex.android.navigation.destination.mainScreen
import com.wonderers.codex.android.navigation.destination.navigateToPlaceDetails
import com.wonderers.codex.android.navigation.destination.placeDetails

@Composable
fun PlacesNavGraph() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = RouteMain) {
        mainScreen(
            onPlaceClicked = { navController.navigateToPlaceDetails() }
        )
        placeDetails()
    }
}
