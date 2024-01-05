package tech.takenoko.android.kmp.components.template

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import tech.takenoko.android.kmp.components.organisms.KmpButton
import tech.takenoko.android.kmp.components.organisms.KmpCard
import tech.takenoko.android.kmp.components.organisms.KmpHeader
import tech.takenoko.android.kmp.components.organisms.KmpList

@Composable
internal fun KmpTemplate() {
    Column {
        KmpHeader()
        KmpCard(modifier = Modifier.fillMaxWidth()) {
            Text(text = "This is a Material Card.")
            Text(text = "This is a Material Card.")
            Text(text = "This is a Material Card.")
            KmpButton()
            KmpList(messages = (0..3).map { "text-$it" })
        }
    }
}
