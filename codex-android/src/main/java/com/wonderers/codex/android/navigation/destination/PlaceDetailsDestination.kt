package com.wonderers.codex.android.navigation.destination

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.wonderers.codex.android.mockPlaces
import com.wonderers.codex.android.ui.place.details.PlaceDetails

const val RoutePlaceDetails = "PlaceDetails"

fun NavController.navigateToPlaceDetails() {
    navigate(RoutePlaceDetails)
}

fun NavGraphBuilder.placeDetails() {
    composable(RoutePlaceDetails) {
        PlaceDetails(place = mockPlaces.first())
    }
}
