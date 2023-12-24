package com.wonderers.codex.android.ui.place.details

import com.wonderers.codex.android.common.model.CodexImage
import com.wonderers.codex.android.common.model.PlaceId
import com.wonderers.codex.android.data.place.model.PlaceReference

sealed interface PlaceDetailsUiState {

    data class Loaded(val placeDetails: PlaceDetailsUiModel) : PlaceDetailsUiState

    data object Loading : PlaceDetailsUiState

    data class Error(val errorMessage: String) : PlaceDetailsUiState
}

data class PlaceDetailsUiModel(
    val id: PlaceId,
    val title: String,
    val typeName: String,
    val distance: String,
    val previewImage: CodexImage,
    val description: String,
    val references: List<PlaceReference>
)
