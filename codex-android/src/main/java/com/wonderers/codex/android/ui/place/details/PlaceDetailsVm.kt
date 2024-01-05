package com.wonderers.codex.android.ui.place.details

import androidx.lifecycle.ViewModel
import com.wonderers.codex.common.model.PlaceId
import com.wonderers.codex.android.common.util.hideIn
import com.wonderers.codex.android.common.util.launch
import com.wonderers.codex.data.place.model.Place
import com.wonderers.codex.data.place.repository.PlaceRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.update
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class PlaceDetailsVm : ViewModel(), KoinComponent {

    private val placeRepository by inject<PlaceRepository>()

    private val _uiState = MutableStateFlow<PlaceDetailsUiState>(PlaceDetailsUiState.Loading)
    val uiState = _uiState.hideIn(this)

    init {
        loadPlace()
    }

    private fun loadPlace() = launch {
        val id = PlaceId("1")
        placeRepository.getPlaceByIdFromCache(id)
            ?.let { place ->
                _uiState.update {
                    PlaceDetailsUiState.Loaded(
                        placeDetails = convertToUiModel(place)
                    )
                }
            }
            ?: run {
                _uiState.update {
                    PlaceDetailsUiState.Error(
                        errorMessage = "Place with id=$id is not found =("
                    )
                }
            }
    }

    private fun convertToUiModel(place: Place) = with(place) {
        PlaceDetailsUiModel(
            id = id,
            title = title,
            typeName = type.name,
            distance = "1000m",
            previewImage = previewImage,
            description = description,
            references = references
        )
    }
}
