package tech.takenoko.android.kmp.sample

import kotlin.test.Test
import kotlin.test.assertTrue

class GreetingTest {
    @Test
    fun testExample() {
        assertTrue(Greeting().greet().contains("Hello"), "Check 'Hello' is mentioned")
    }
}
