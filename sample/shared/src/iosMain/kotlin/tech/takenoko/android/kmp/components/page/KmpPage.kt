package tech.takenoko.android.kmp.components.page

import androidx.compose.ui.window.ComposeUIViewController
import tech.takenoko.android.kmp.components.template.KmpTemplate
import tech.takenoko.android.kmp.interop.KmpLog

@Suppress("FunctionName", "unused")
fun KmpPage() = ComposeUIViewController {
    KmpLog.debug("KmpPage")
    KmpTemplate()
}

// @Suppress("ktlint:standard:function-naming")
// fun KmpButtonViewController() = ComposeUIViewController { KmpButton() }
//
// @Suppress("ktlint:standard:function-naming")
// fun KmpListViewController(messages: List<String>) = ComposeUIViewController { KmpList(messages) }
