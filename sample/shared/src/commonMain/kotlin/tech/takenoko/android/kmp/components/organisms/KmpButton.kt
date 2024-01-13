package tech.takenoko.android.kmp.components.organisms

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
internal fun KmpButton(
    onClick: () -> Unit = {},
    modifier: Modifier = Modifier,
) {
    Button(onClick = onClick, modifier = modifier) {
        Text("Click me!")
    }
//    OutlinedButton(onClick = onClick) {
//        Text("Click me!")
//    }
}
