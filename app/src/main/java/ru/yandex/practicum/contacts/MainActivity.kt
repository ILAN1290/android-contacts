package ru.yandex.practicum.contacts

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.foundation.background
import androidx.compose.ui.res.stringResource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Icon
import androidx.compose.material3.Button
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.ButtonDefaults
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PlaylistHost()
        }
    }
}

@Composable
fun MainScreen(
    onSearchClick: () -> Unit,
    onSettingsClick: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF0F2F5))
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
                .background(Color(0xFF3F51B5)),
            contentAlignment = Alignment.CenterStart
        ) {
            androidx.compose.material3.Text(
                text = "Playlist maker",
                color = Color.White,
                fontSize = 20.sp,
                modifier = Modifier.padding(16.dp)
            )
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White, RoundedCornerShape(12.dp))
                .padding(16.dp)
        ) {
            Column {
                MenuItem(Icons.Default.Search, stringResource(R.string.menu_search), onSearchClick)
                Divider()
                MenuItem(Icons.Default.List, stringResource(R.string.playlist), onSearchClick)
                Divider()
                MenuItem(Icons.Default.Favorite, stringResource(R.string.favorites), onSearchClick)
                Divider()
                MenuItem(Icons.Default.Settings, stringResource(R.string.settings), onSettingsClick)
            }
        }
    }
}

@Composable
fun MenuItem(
    icon: ImageVector,
    title: String,
    onClick: () -> Unit
) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
        contentPadding = PaddingValues(0.dp),
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = icon,
                contentDescription = null,
                tint = Color.Black,
                modifier = Modifier.size(24.dp)
            )
            Spacer(modifier = Modifier.width(16.dp))
            androidx.compose.material3.Text(
                text = title,
                modifier = Modifier.weight(1f),
                fontSize = 16.sp,
                color = Color.Black
            )
            Icon(
                imageVector = Icons.Default.ChevronRight,
                contentDescription = null,
                tint = Color.Gray,
                modifier = Modifier.size(24.dp)
            )
        }
    }
}

@Composable
fun Divider() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(1.dp)
            .background(Color(0xFFEEEEEE))
    )
}