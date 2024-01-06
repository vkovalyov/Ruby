package com.wonderers.codex

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform