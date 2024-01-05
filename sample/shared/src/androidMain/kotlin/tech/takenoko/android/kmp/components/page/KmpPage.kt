package tech.takenoko.android.kmp.components.page

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import tech.takenoko.android.kmp.components.template.KmpTemplate
import tech.takenoko.android.kmp.theme.KmpTheme

@Composable
fun KmpPage() {
    KmpTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background,
        ) {
            KmpTemplate()
        }
    }
}

@Preview
@Composable
fun DefaultPreview() {
    KmpPage()
}
