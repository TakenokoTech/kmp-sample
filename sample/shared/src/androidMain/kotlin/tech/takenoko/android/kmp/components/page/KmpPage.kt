package tech.takenoko.android.kmp.components.page

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import tech.takenoko.android.kmp.components.template.KmpBottomTemplate
import tech.takenoko.android.kmp.components.template.KmpTemplate
import tech.takenoko.android.kmp.theme.KmpTheme

@Composable
fun KmpPage() {
    KmpTheme {
        KmpTemplate()
    }
}

@Preview
@Composable
fun KmpPagePreview() {
    KmpPage()
}

@Preview
@Composable
fun KmpBottomTemplatePreview() {
    KmpBottomTemplate()
}
