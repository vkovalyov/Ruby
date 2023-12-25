package com.wonderers.codex.android

import android.app.Application
import com.wonderers.codex.android.di.setUpDi

class CodexApp : Application() {

    override fun onCreate() {
        super.onCreate()
        setUpDi(this)
    }
}
