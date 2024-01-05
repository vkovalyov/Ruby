package com.wonderers.codex.data.place.repository

import com.wonderers.codex.data.place.model.Place
import com.wonderers.codex.common.model.PlaceId
import com.wonderers.codex.common.model.RegionId

interface PlaceRepository {

    suspend fun getPlacesByRegion(regionId: RegionId): List<Place>

    suspend fun getPlaceByIdFromCache(placeId: PlaceId): Place?
}
