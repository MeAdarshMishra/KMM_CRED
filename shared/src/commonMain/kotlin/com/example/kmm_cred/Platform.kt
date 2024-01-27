package com.example.kmm_cred

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform