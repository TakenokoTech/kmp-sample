package tech.takenoko.android.kmp.library

interface SharedPlatform {
    val name: String
}

expect fun getPlatform(): SharedPlatform
