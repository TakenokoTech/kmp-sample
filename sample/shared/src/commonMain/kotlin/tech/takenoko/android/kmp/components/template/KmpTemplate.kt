package tech.takenoko.android.kmp.components.template

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import tech.takenoko.android.kmp.components.organisms.KmpButton
import tech.takenoko.android.kmp.components.organisms.KmpHeader
import tech.takenoko.android.kmp.components.organisms.KmpList

@Composable
internal fun KmpTemplate() {
    Column {
        KmpHeader()
        KmpButton()
        KmpList(messages = (0..100).map { "text-$it" })
    }
}
