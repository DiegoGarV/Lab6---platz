package com.example.lab5.ui.profile.view

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.lab5.R

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun ProfileScreen(navController: NavHostController){
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
                RowMaker(num = i)
            }
        }
    }
}

@Composable
fun RowMaker(num: Int){
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
