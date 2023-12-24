package com.wonderers.codex.android.ui.place.list

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.wonderers.codex.android.MockPlace
import com.wonderers.codex.android.MyApplicationTheme
import com.wonderers.codex.android.mockPlaces
import com.wonderers.codex.android.ui.place.common.PlaceImage
import com.wonderers.codex.android.ui.place.common.PlaceTitle

@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    MyApplicationTheme(darkTheme = false) {
        PlacesList(
            onPlaceClicked = {}
        )
    }
}

@Composable
fun PlacesList(onPlaceClicked: () -> Unit) {
    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .padding(top = 16.dp, bottom = 48.dp),
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        for (place in mockPlaces) {
            PlaceCard(place, onPlaceClicked)
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun PlaceCard(place: MockPlace, onPlaceClicked: () -> Unit) {
    Card(onClick = onPlaceClicked) {
        PlaceImage(place.previewImageRes)
        PlaceTitle(place)
    }
}
