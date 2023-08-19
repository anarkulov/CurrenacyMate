package com.elixir.currencymate

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform