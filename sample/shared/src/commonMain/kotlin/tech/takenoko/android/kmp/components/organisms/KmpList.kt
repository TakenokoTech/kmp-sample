package tech.takenoko.android.kmp.components.organisms

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
internal fun KmpList(messages: List<String>) {
    Column {
        messages.forEach { message ->
            Text(message)
        }
    }
}
