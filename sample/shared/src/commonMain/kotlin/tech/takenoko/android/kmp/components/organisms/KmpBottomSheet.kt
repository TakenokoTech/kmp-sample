package tech.takenoko.android.kmp.components.organisms

import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.graphics.Color

@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun KmpBottomSheet(
    showState: MutableState<Boolean>,
    content: @Composable ColumnScope.() -> Unit,
) {
    val sheetState = rememberModalBottomSheetState()
    if (showState.value) {
        ModalBottomSheet(
            onDismissRequest = { showState.value = false },
            sheetState = sheetState,
            containerColor = Color.White,
            content = content,
        )
    }
}
