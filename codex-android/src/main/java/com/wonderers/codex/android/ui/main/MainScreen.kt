package com.wonderers.codex.android.ui.main

import androidx.compose.material3.BottomSheetScaffold
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import com.wonderers.codex.android.ui.place.list.PlacesList
import com.wonderers.codex.android.ui.place.map.PlacesMap

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(
    onPlaceClicked: () -> Unit
) {
    BottomSheetScaffold(
        sheetContent = {
            PlacesList(onPlaceClicked = onPlaceClicked)
        },
        content = {
            PlacesMap()
        }
    )
}
