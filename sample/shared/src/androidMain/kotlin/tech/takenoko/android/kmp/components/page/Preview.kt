package tech.takenoko.android.kmp.components.page

import androidx.compose.runtime.Composable
import tech.takenoko.android.kmp.components.organisms.KmpButton
import tech.takenoko.android.kmp.components.organisms.KmpHeader
import tech.takenoko.android.kmp.components.organisms.KmpList
import tech.takenoko.android.kmp.components.organisms.KmpListItem

// @Preview
@Composable
private fun KmpButton_Preview() {
    KmpButton()
}

// @Preview
@Composable
private fun KmpHeader_Preview() {
    KmpHeader()
}

// @Preview
@Composable
private fun KmpListView_Preview() {
    KmpList((0..100).map { KmpListItem("text-$it") })
}
