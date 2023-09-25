package com.example.lab5.ui.theme.ui.favorites.view

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.lab5.EventCard
import com.example.lab5.ui.events.view.AddEventCard
import com.example.lab5.ui.events.view.bottomBar

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FavScreen(navController: NavHostController) {
    Scaffold(
        bottomBar = {
            bottomBar(navController = navController)
        }
    ) { innerPading ->
        Column(
            modifier = Modifier
                .verticalScroll(state = rememberScrollState())
                .fillMaxSize()
        ) {
            Column(
                modifier = Modifier
                    .padding(vertical = 10.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Your favorites",
                    modifier = Modifier.padding(start = 10.dp, top = 10.dp, bottom = 10.dp),
                    fontSize = 30.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.Bold
                )
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(10.dp) // Space between cards
                ) {
                    val eventCard1 = EventCard(
                        "Title",
                        "Supporting Text",
                        "https://www.guatemala.com/fotos/2023/07/Concierto-de-Carin-Leon-en-Guatemala-2023.jpg"
                    )
                    AddEventCard(card = eventCard1, navController)

                    val eventCard2 = EventCard(
                        "Title",
                        "Supporting Text",
                        "https://www.soy502.com/sites/default/files/styles/escalar_image_inline/public/2023/Mar/25/hombres_g_guatemala_concierto_cantantes_famosos_credomatic.jpeg"
                    )
                    AddEventCard(card = eventCard2, navController)
                }
            }
        }
    }
}