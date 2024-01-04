package tech.takenoko.android.kmp.sample

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform