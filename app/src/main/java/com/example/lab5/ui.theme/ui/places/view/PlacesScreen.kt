package com.example.lab5.ui.places.view

import android.annotation.SuppressLint
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.lab5.R

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun PlacesScreen(navController: NavHostController){
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
                CircLetra(letter = letra)

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

@Composable
fun CircLetra(letter: Char) {
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

        val paint = Paint().asFrameworkPaint()
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