package tech.takenoko.android.kmp.library

class SharedGreeting {
    private val platform: SharedPlatform = getPlatform()

    fun greet(): String {
        return "Hello Lib, ${platform.name}!"
    }
}
