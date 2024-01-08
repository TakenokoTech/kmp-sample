package tech.takenoko.android.kmp.components.organisms

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

@Composable
internal fun KmpList(items: List<KmpListItem>) {
    items.forEach { item ->
        Row(
            horizontalArrangement = Arrangement.spacedBy(4.dp),
        ) {
            item.icon?.let { Icon(imageVector = it, "icon") }
            item.message?.let { Text(it) }
        }
    }
}

internal data class KmpListItem(
    val message: String?,
    val icon: ImageVector? = null,
)
