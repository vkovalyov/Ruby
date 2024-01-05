package com.wonderers.codex.android.di

import android.content.Context
import com.wonderers.codex.data.place.repository.PlaceRepository
import com.wonderers.codex.data.place.repository.mock.MockPlaceRepository
import com.wonderers.codex.data.region.repository.RegionRepository
import com.wonderers.codex.data.region.repository.mock.MockRegionRepository
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

fun setUpDi(appContext: Context) = startKoin {
    androidLogger()
    androidContext(appContext)
    modules(
        placeModule,
        regionModule
    )
}

private val placeModule = module {
    singleOf<PlaceRepository>(::MockPlaceRepository)
}

private val regionModule = module {
    singleOf<RegionRepository>(::MockRegionRepository)
}
