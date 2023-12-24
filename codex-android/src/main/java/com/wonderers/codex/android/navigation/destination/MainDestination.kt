package com.wonderers.codex.android.navigation.destination

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.wonderers.codex.android.ui.main.MainScreen

const val RouteMain = "Main"

fun NavGraphBuilder.mainScreen(
    onPlaceClicked: () -> Unit
) {
    composable(RouteMain) {
        MainScreen(onPlaceClicked)
    }
}
