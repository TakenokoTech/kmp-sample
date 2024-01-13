package tech.takenoko.android.kmp.components.organisms

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun KmpCard(
    modifier: Modifier = KmpCard.cardModifier,
    contentModifier: Modifier = KmpCard.contentModifier,
    elevation: Dp = 0.dp,
    onClick: (() -> Unit)? = null,
    content: @Composable ColumnScope.() -> Unit,
) {
    val colors = CardDefaults.elevatedCardColors(containerColor = Color.White)
    val elev = CardDefaults.cardElevation(defaultElevation = elevation)
    val column = @Composable { Column(modifier = contentModifier, content = content) }

    if (onClick == null) {
        ElevatedCard(
            modifier = modifier,
            colors = colors,
            elevation = elev,
            content = { column() },
        )
    } else {
        ElevatedCard(
            modifier = modifier,
            colors = colors,
            elevation = elev,
            onClick = { onClick.invoke() },
            content = { column() },
        )
    }
}

object KmpCard {
    val cardModifier = Modifier
    val contentModifier = Modifier.padding(8.dp).fillMaxWidth()
}
