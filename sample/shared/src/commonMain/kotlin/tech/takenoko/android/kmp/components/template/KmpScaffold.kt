package tech.takenoko.android.kmp.components.template

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

@Composable
internal fun KmpScaffold(
    content: @Composable (PaddingValues) -> Unit,
) {
    Scaffold(
        bottomBar = {
            BottomAppBar(
                containerColor = Color.White,
//                contentPadding = PaddingValues(0.dp),
            ) {
                val button = @Composable { image: ImageVector, text: String ->
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Icon(image, contentDescription = "")
                        Text(text)
                    }
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceAround,
                ) {
                    IconButton(
                        modifier = Modifier.size(64.dp),
                        onClick = { /* do something */ },
                    ) {
                        button(Icons.Filled.Home, "Home")
                    }
                    IconButton(
                        modifier = Modifier.size(64.dp),
                        onClick = { /* do something */ },
                    ) {
                        button(Icons.Filled.Home, "Home")
                    }
                    IconButton(
                        modifier = Modifier.size(64.dp),
                        onClick = { /* do something */ },
                    ) {
                        button(Icons.Filled.Home, "Home")
                    }
                }
            }
        },
        content = content,
    )
}
