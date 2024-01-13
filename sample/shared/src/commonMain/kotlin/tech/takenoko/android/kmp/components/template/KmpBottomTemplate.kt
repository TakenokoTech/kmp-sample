package tech.takenoko.android.kmp.components.template

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import tech.takenoko.android.kmp.components.organisms.KmpButton
import tech.takenoko.android.kmp.components.organisms.KmpCard

@Composable
internal fun KmpBottomTemplate() {
    Column(
        modifier = Modifier.navigationBarsPadding().fillMaxWidth(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            "Bottom sheet",
            style = MaterialTheme.typography.headlineSmall,
            fontWeight = FontWeight.Bold,
        )
        Spacer(modifier = Modifier.height(16.dp))
        LazyRow(
            contentPadding = PaddingValues(16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            val modifier = Modifier.width(150.dp).height(200.dp)
            val bgColor = Color(0xFFEDEDED)
            item {
                KmpCard(modifier, isBorder = true) {
                    Column(
                        modifier = Modifier.padding(8.dp).fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                    ) {
                        Icon(
                            Icons.Default.ThumbUp,
                            "",
                            modifier = Modifier.size(48.dp),
                            tint = MaterialTheme.colorScheme.secondary,
                        )
                        Spacer(Modifier.height(16.dp))
                        Text("aaaaaaaaaaa")
                        Text("aaaaaaaaaaa")
                        Spacer(Modifier.weight(1.0F))
                        KmpButton()
                    }
                }
            }
            item {
                KmpCard(modifier, bgColor = bgColor, onClick = {}) {}
            }
            item {
                KmpCard(modifier, bgColor = bgColor, onClick = {}) {}
            }
            item {
                KmpCard(modifier, bgColor = bgColor, onClick = {}) {}
            }
            item {
                KmpCard(modifier, bgColor = bgColor, onClick = {}) {}
            }
        }
    }
}
