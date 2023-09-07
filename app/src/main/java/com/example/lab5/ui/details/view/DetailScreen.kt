package com.example.lab5.ui.details.view

import android.R
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
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

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
                painter = painterResource(id = R.drawable.ic_menu_my_calendar),
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
