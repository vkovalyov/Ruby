package com.wonderers.codex.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.BottomSheetScaffold
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Content()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun Content() {
    BottomSheetScaffold(
        sheetContent = {
            PlacesBottomSheet()
        },
        content = {
            MapStub()
        }
    )
}

@Composable
private fun PlacesBottomSheet() {
    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .padding(top = 16.dp, bottom = 48.dp),
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        for (place in mockPlaces) {
            Card {
                Image(
                    modifier = Modifier
                        .fillMaxWidth()
                        .aspectRatio(16f / 10f),
                    painter = painterResource(id = place.previewImageRes),
                    contentScale = ContentScale.Crop,
                    contentDescription = null
                )
                Column(
                    modifier = Modifier.padding(8.dp),
                ) {
                    Row {
                        Text(
                            text = place.type.name,
                            color = MaterialTheme.colorScheme.primary
                        )
                        Text(text = " • ")
                        Text(
                            text = "${place.distance}m",
                            color = MaterialTheme.colorScheme.primary
                        )
                    }
                    Text(
                        text = place.title,
                        style = MaterialTheme.typography.headlineMedium
                    )
                }
            }
        }
    }
}

@Composable
private fun MapStub() {
    Image(
        painter = painterResource(id = R.drawable.map_stub),
        contentDescription = null
    )
}

@Preview
@Composable
fun DefaultPreview() {
    MyApplicationTheme {
        MapStub()
    }
}
