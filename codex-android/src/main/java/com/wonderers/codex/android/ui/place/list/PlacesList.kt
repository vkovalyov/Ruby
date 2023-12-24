package com.wonderers.codex.android.ui.place.list

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.wonderers.codex.android.MyApplicationTheme
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
    val vm = viewModel<PlacesListVm>()
    val uiState by vm.uiState.collectAsStateWithLifecycle()
    PlacesList(uiState, onPlaceClicked)
}

@Composable
private fun PlacesList(
    uiState: PlacesListUiState,
    onPlaceClicked: () -> Unit
) {
    when (uiState) {
        is PlacesListUiState.Loaded -> {
            Column(
                modifier = Modifier
                    .verticalScroll(rememberScrollState())
                    .padding(top = 16.dp, bottom = 48.dp),
                verticalArrangement = Arrangement.spacedBy(24.dp)
            ) {
                for (place in uiState.places) {
                    PlaceCard(place, onPlaceClicked)
                }
            }
        }

        else -> {
            // TODO support error and loading states
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun PlaceCard(place: PlaceItemUiModel, onPlaceClicked: () -> Unit) {
    Card(onClick = onPlaceClicked) {
        with(place) {
            PlaceImage(previewImage)
            PlaceTitle(
                placeName = title,
                typeName = typeName,
                distance = distance
            )
        }
    }
}
