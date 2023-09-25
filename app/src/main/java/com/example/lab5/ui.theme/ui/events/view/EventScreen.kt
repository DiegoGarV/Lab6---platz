package com.example.lab5.ui.events.view

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.lab5.EventCard
import com.example.lab5.R

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EventScreen(navController: NavHostController) {
    Column(
        modifier = Modifier.verticalScroll(state= rememberScrollState())
    ) {
        TopAppBar(
            title = { Text(text = "TodoEventos") },
            modifier = Modifier
                .fillMaxSize()
                .statusBarsPadding(),
            colors = TopAppBarDefaults.smallTopAppBarColors(
                containerColor = MaterialTheme.colorScheme.primary,
                titleContentColor = MaterialTheme.colorScheme.onPrimary,
                navigationIconContentColor = MaterialTheme.colorScheme.onPrimary
            ),
            actions = {
                IconButton(
                    onClick = { },
                )
                {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_tres_puntos),
                        modifier = Modifier
                            .size(30.dp),
                        contentDescription = null
                    )
                }
            }

        )
        Text(
            text = "Your favorites",
            modifier = Modifier.padding(start = 20.dp, top = 16.dp),
            fontSize = 30.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold
        )
        /*LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            modifier = Modifier.padding(start=20.dp),
            content = {
                items(4) { i ->
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(10.dp)
                    ){
                        Text(text="Item $i")
                    }
                }
            }
        ) */

        //Placeholders
        Column(
            modifier = Modifier
                .padding(vertical = 10.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(10.dp) // Space between cards
            ) {
                val eventCard1 = EventCard(
                    "Title",
                    "Supporting Text",
                    "https://www.guatemala.com/fotos/2023/07/Concierto-de-Carin-Leon-en-Guatemala-2023.jpg"
                )
                AddEventCard(card = eventCard1)

                val eventCard2 = EventCard(
                    "Title",
                    "Supporting Text",
                    "https://www.soy502.com/sites/default/files/styles/escalar_image_inline/public/2023/Mar/25/hombres_g_guatemala_concierto_cantantes_famosos_credomatic.jpeg"
                )
                AddEventCard(card = eventCard2)
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(10.dp) // Space between cards
            ) {

                val eventCard3 = EventCard(
                    "Title",
                    "Supporting Text",
                    "https://elcomercio.pe/resizer/-Wbs7K9E4_IBjvb964N7M0WXRFM=/580x330/smart/filters:format(jpeg):quality(75)/cloudfront-us-east-1.images.arcpublishing.com/elcomercio/EDJZ67RFW5CQVFWHZUW5IOBPCE.jpg"
                )
                AddEventCard(card = eventCard3)

                val eventCard4 = EventCard(
                    "Title",
                    "Supporting Text",
                    "https://www.guatemala.com/fotos/2023/07/Concierto-de-Rauw-Alejandro-en-Guatemala.jpg"
                )
                AddEventCard(card = eventCard4)
            }
        }
        //End Placeholder

        Text(
            text = "All Concerts",
            modifier = Modifier.padding(start = 20.dp, top = 10.dp),
            fontSize = 30.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold
        )
        Column(
            modifier = Modifier
                .padding(vertical = 10.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(10.dp) // Space between cards
            ) {
                val eventCard5 = EventCard(
                    "Title",
                    "Supporting Text",
                    "https://elcomercio.pe/resizer/-Wbs7K9E4_IBjvb964N7M0WXRFM=/580x330/smart/filters:format(jpeg):quality(75)/cloudfront-us-east-1.images.arcpublishing.com/elcomercio/EDJZ67RFW5CQVFWHZUW5IOBPCE.jpg"
                )
                AddEventCard(card = eventCard5)

                val eventCard6 = EventCard(
                    "Title",
                    "Supporting Text",
                    "https://www.soy502.com/sites/default/files/styles/escalar_image_inline/public/2023/Mar/25/hombres_g_guatemala_concierto_cantantes_famosos_credomatic.jpeg"
                )
                AddEventCard(card = eventCard6)
            }

        }
    }
}



@Composable
fun AddEventCard(card: EventCard) {

    val nombre = card.nombre
    val image = card.url
    val descripcion = card.descripcion

    Card(
        modifier = Modifier
            .padding(10.dp),
        shape = RoundedCornerShape(15.dp)
    ) {
        Column{

            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .data(image)
                    .size(450, 450)
                    .build(),

                contentDescription = null
            )
        }
        Column(modifier = Modifier.padding(8.dp)) {
            Text(
                text = nombre,
                fontSize = 20.sp,
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                overflow = TextOverflow.Ellipsis
            )
        }
        Column(modifier = Modifier.padding(8.dp)) {
            Text(
                text = descripcion,
                fontSize = 15.sp,
                color = Color.Black,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}