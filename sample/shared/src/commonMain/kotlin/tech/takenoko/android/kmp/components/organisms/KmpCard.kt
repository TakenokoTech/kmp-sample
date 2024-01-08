package tech.takenoko.android.kmp.components.organisms

import androidx.compose.foundation.background
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
    onClick: () -> Unit = {},
    content: @Composable ColumnScope.() -> Unit,
) {
    ElevatedCard(
        modifier = modifier,
        colors = CardDefaults.elevatedCardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(defaultElevation = elevation),
        onClick = onClick,
    ) {
        Column(
            modifier = contentModifier,
            content = content,
        )
    }
}

object KmpCard {
    val cardModifier = Modifier
    val contentModifier = Modifier.padding(8.dp).fillMaxWidth()
}
