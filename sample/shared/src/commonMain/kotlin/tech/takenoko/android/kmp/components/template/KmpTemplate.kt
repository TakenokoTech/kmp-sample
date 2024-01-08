package tech.takenoko.android.kmp.components.template

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.KeyboardArrowRight
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import tech.takenoko.android.kmp.components.organisms.KmpButton
import tech.takenoko.android.kmp.components.organisms.KmpCard
import tech.takenoko.android.kmp.components.organisms.KmpHeader
import tech.takenoko.android.kmp.components.organisms.KmpList
import tech.takenoko.android.kmp.components.organisms.KmpListItem

@Composable
internal fun KmpTemplate() {
    Column(
        modifier = Modifier.padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(4.dp),
    ) {
        KmpHeader()
        KmpCard(
            modifier = Modifier.fillMaxWidth(),
            elevation = 4.dp,
        ) {
            KmpList(
                items = (1..3).map {
                    KmpListItem(
                        message = "text-$it",
                        icon = Icons.Outlined.KeyboardArrowRight,
                    )
                },
            )
        }
        Spacer(modifier = Modifier.height(8.dp))
        KmpCard(modifier = Modifier.fillMaxWidth()) {
            Text(text = "Material Card.")
        }
        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            val cardModifier = KmpCard.cardModifier.weight(1.0F)
            val cardContent = @Composable { text: String, icon: ImageVector ->
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.spacedBy(4.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Icon(
                        imageVector = icon,
                        contentDescription = text,
                        modifier = Modifier.size(18.dp),
                    )
                    Text(
                        modifier = Modifier,
                        fontSize = 12.sp,
                        textAlign = TextAlign.Center,
                        text = text,
                    )
                }
            }
            KmpCard(modifier = cardModifier) { cardContent("Cart", Icons.Outlined.ShoppingCart) }
            KmpCard(modifier = cardModifier) { cardContent("Account", Icons.Outlined.Person) }
            KmpCard(modifier = cardModifier) { cardContent("Settings", Icons.Outlined.Settings) }
        }
        Spacer(modifier = Modifier.height(8.dp))
        KmpButton(modifier = Modifier.fillMaxWidth())
    }
}
