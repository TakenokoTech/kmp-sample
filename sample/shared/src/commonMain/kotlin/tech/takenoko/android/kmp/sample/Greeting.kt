package tech.takenoko.android.kmp.sample

import tech.takenoko.android.kmp.library.SharedGreeting

class Greeting {
    fun greet(): String {
        return SharedGreeting().greet()
    }
}
