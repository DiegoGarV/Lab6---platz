package com.example.lab5

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.lab5.ui.theme.Lab5Theme
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import coil.compose.AsyncImage
import coil.request.ImageRequest
import androidx.compose.ui.graphics.painter.Painter

data class EventCard(val nombre:String, val descripcion: String, val url: String)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab5Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //EventScreen()           //visualización de todos los eventos
                    //PlacesScreen()          //información de los lugares
                    //DetailScreen()          //información del evento
                    //ProfileScreen()         //información del perfil
                }
            }
        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EventScreen() {
    Column(
        modifier = Modifier.verticalScroll(state= rememberScrollState())
    ){
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
                IconButton(onClick = { },
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
            fontWeight= FontWeight.Bold
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
                val eventCard1 = EventCard("Title","Supporting Text","https://www.guatemala.com/fotos/2023/07/Concierto-de-Carin-Leon-en-Guatemala-2023.jpg")
                AddEventCard(card = eventCard1)

                val eventCard2 = EventCard("Title","Supporting Text","https://www.soy502.com/sites/default/files/styles/escalar_image_inline/public/2023/Mar/25/hombres_g_guatemala_concierto_cantantes_famosos_credomatic.jpeg")
                AddEventCard(card = eventCard2)
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(10.dp) // Space between cards
            ) {

                val eventCard3 = EventCard("Title","Supporting Text","https://elcomercio.pe/resizer/-Wbs7K9E4_IBjvb964N7M0WXRFM=/580x330/smart/filters:format(jpeg):quality(75)/cloudfront-us-east-1.images.arcpublishing.com/elcomercio/EDJZ67RFW5CQVFWHZUW5IOBPCE.jpg")
                AddEventCard(card = eventCard3)

                val eventCard4 = EventCard("Title","Supporting Text","https://www.guatemala.com/fotos/2023/07/Concierto-de-Rauw-Alejandro-en-Guatemala.jpg")
                AddEventCard(card = eventCard4)
            }
        }
        //End Placeholder

        Text(
            text = "All Concerts",
            modifier = Modifier.padding(start = 20.dp, top = 10.dp),
            fontSize = 30.sp,
            color = Color.Black,
            fontWeight= FontWeight.Bold
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
            val eventCard5 = EventCard("Title","Supporting Text","https://elcomercio.pe/resizer/-Wbs7K9E4_IBjvb964N7M0WXRFM=/580x330/smart/filters:format(jpeg):quality(75)/cloudfront-us-east-1.images.arcpublishing.com/elcomercio/EDJZ67RFW5CQVFWHZUW5IOBPCE.jpg")
            AddEventCard(card = eventCard5)

            val eventCard6 = EventCard("Title","Supporting Text","https://www.soy502.com/sites/default/files/styles/escalar_image_inline/public/2023/Mar/25/hombres_g_guatemala_concierto_cantantes_famosos_credomatic.jpeg")
            AddEventCard(card = eventCard6)
        }

    }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun PlacesScreen(){
    val listaPaises = listOf("Luis Miguel Chile", "Luis Miguel Las Vegas", "Luis Miguel New York", "Luis Miguel Anaheim","Luis Miguel San Diego")
    val listaLugares = listOf("Movistar Arena (Santiago)", "Park MGM", "NYCB Theatre at Westburry", "Honda Center","Pechanga Arena")

    LazyColumn (
        modifier = Modifier.fillMaxSize()
    ) {

        itemsIndexed(listaPaises) { i, city ->
            val lugar = listaLugares[i]
            val letra = listaPaises[i][12]
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                circLetra(letter = letra)

                Column {
                    Text(
                        text = city,
                        color = MaterialTheme.colorScheme.onSurface,
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp
                    )
                    Text(
                        text = lugar,
                        color = MaterialTheme.colorScheme.onSurface,
                        fontSize = 14.sp
                    )
                }

                Spacer(modifier = Modifier.width(90.dp))

                Image(
                    painter = painterResource(id = R.drawable.triangulo),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(15.dp)
                )
            }
            Divider(
                modifier = Modifier
                    .padding(horizontal = 16.dp)
                    .fillMaxWidth()
                    .height(1.dp)
            )
        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun DetailScreen(){
    Column(
        modifier = Modifier.fillMaxSize()
    ){
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(340.dp)
                .background(Color.LightGray)
        ) {
            Text(
                text="Lugar",
                modifier= Modifier.padding(top=300.dp,start=10.dp),
                fontSize = 20.sp,
                overflow = TextOverflow.Ellipsis
            )
        }
        Text(
            text="Title",
            modifier= Modifier.padding(top=10.dp,start=10.dp),
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            overflow = TextOverflow.Ellipsis
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Image(
                painter = painterResource(id = android.R.drawable.ic_menu_my_calendar),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(50.dp)
            )

            //Spacer(modifier = Modifier.width(5.dp))

            Text(
                text = "Fecha",
                color = MaterialTheme.colorScheme.onSurface,
                fontSize = 18.sp
            )

            Spacer(modifier = Modifier.width(200.dp))

            Text(
                text = "Hora",
                color = MaterialTheme.colorScheme.onSurface,
                fontSize = 18.sp
            )
        }
        Text(
            text="About",
            modifier= Modifier.padding(start=10.dp),
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            overflow = TextOverflow.Ellipsis
        )
        Text(
            text="Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.",
            modifier= Modifier.padding(start=10.dp),
            fontSize = 16.sp,
            overflow = TextOverflow.Ellipsis
        )
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun ProfileScreen(){
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
                .background(Color.LightGray)
        ) {
            Image(
                painter = painterResource(id = R.drawable.profile_background),
                contentDescription = null,
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .fillMaxSize()
            )
            Image(
                painter = painterResource(id = R.drawable.profile_pic), // Imagen superpuesta
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .align(Alignment.Center)
                    .padding(16.dp)
            )
            Text(
                text = "Diego García",
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(10.dp),
                color = Color.White,
                fontSize = 30.sp,
                overflow = TextOverflow.Ellipsis
            )
        }
        Column {
            for(i in 1..4){
                rowMaker(num = i)
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
        Column() {

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

@Composable
fun circLetra(letter: Char) {
    Canvas(
        modifier = Modifier
            .size(40.dp)
            .padding(end = 16.dp)
    ) {
        drawCircle(
            color = Color(0xFF33A8FF),
            center = center,
            radius = size.minDimension / 2
        )

        val paint = androidx.compose.ui.graphics.Paint().asFrameworkPaint()
        paint.textAlign = android.graphics.Paint.Align.CENTER
        paint.color = Color.Black.toArgb()
        paint.textSize = 12.sp.toPx()

        drawContext.canvas.nativeCanvas.drawText(
            letter.toString(),
            center.x,
            center.y + paint.textSize / 3,
            paint
        )
    }
}

@Composable
fun rowMaker(num: Int){
    val imagen: Painter = when (num) {
        1 -> painterResource(id = R.drawable.profile_guy)
        2 -> painterResource(id = android.R.drawable.ic_lock_idle_lock)
        3 -> painterResource(id = R.drawable.notifications)
        4 -> painterResource(id = android.R.drawable.star_off)
        else -> painterResource(id = android.R.drawable.ic_dialog_alert)
    }
    val texto: String = when (num) {
        1 -> "Edit Profile"
        2 -> "Reset Password"
        3 -> "Notifications"
        4 -> "Favorites"
        else -> "Error"
    }
    val imagen2: Painter = when(num) {
        3 -> painterResource(id = R.drawable.switch_off)
        else -> painterResource(id = R.drawable.triangulo)
    }
    val tam: Int = when(num) {
        3 -> 60
        else -> 20
    }
    val tam2: Int = when(num) {
        3 -> 60
        else -> 90
    }

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ){
        Image(
            painter = imagen,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(50.dp)
        )

        Text(
            text = texto,
            color = MaterialTheme.colorScheme.onSurface,
            fontSize = 18.sp
        )

        Spacer(modifier = Modifier.width(tam2.dp))

        Image(
            painter = imagen2,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(tam.dp)
        )
    }
    Divider(
        modifier = Modifier
            .padding(horizontal = 16.dp)
            .fillMaxWidth()
            .height(1.dp)
    )
}



