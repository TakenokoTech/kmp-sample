package tech.takenoko.android.kmp.library

class AndroidPlatform : SharedPlatform {
    override val name: String = "Android ${android.os.Build.VERSION.SDK_INT}"
}

actual fun getPlatform(): SharedPlatform = AndroidPlatform()
