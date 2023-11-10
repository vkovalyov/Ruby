package com.wonderers.codex.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.BottomSheetScaffold
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.wonderers.codex.android.ui.components.PlaceImage
import com.wonderers.codex.android.ui.components.PlaceTitle

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
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "map") {
        composable("map") {
            BottomSheetScaffold(
                sheetContent = {
                    PlacesBottomSheet(
                        onPlaceClicked = { navController.navigate("place") }
                    )
                },
                content = {
                    MapStub()
                }
            )
        }
        composable("place") {
            PlaceDetails(place = mockPlaces.first())
        }
    }
}

@Composable
private fun PlacesBottomSheet(onPlaceClicked: () -> Unit) {
    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .padding(top = 16.dp, bottom = 48.dp),
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        for (place in mockPlaces) {
            PlaceCard(place, onPlaceClicked)
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun PlaceCard(place: MockPlace, onPlaceClicked: () -> Unit) {
    Card(onClick = onPlaceClicked) {
        PlaceImage(place.previewImageRes)
        PlaceTitle(place)
    }
}

@Composable
private fun MapStub() {
    Image(
        painter = painterResource(id = R.drawable.map_stub),
        contentDescription = null
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyApplicationTheme(darkTheme = false) {
        PlacesBottomSheet(
            onPlaceClicked = {}
        )
    }
}
