package com.wonderers.codex.android

import android.app.Application
import com.wonderers.codex.android.di.setUpDi
import org.koin.core.context.startKoin

class CodexApp : Application() {

    override fun onCreate() {
        super.onCreate()
        setUpDi(this)
    }
}
