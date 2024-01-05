package com.wonderers.codex.data.region.repository

import com.wonderers.codex.common.model.Coordinates
import com.wonderers.codex.data.region.model.Region

interface RegionRepository {

    suspend fun getRegionFromCache(): Region?

    suspend fun getRegionByCoordinates(coordinates: Coordinates): Region?

    suspend fun getRegions(): List<Region>
}
