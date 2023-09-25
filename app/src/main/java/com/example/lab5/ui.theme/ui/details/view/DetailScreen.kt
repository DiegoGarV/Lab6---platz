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
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
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
import androidx.navigation.NavHostController
import com.example.lab5.ui.theme.navigation.model.AppSreens

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailScreen(navController: NavHostController){
    Scaffold(
        topBar = {
            TopAppBar(

                modifier = Modifier
                    .fillMaxWidth()
                    .statusBarsPadding(),
                colors = TopAppBarDefaults.smallTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    titleContentColor = MaterialTheme.colorScheme.onPrimary,
                    navigationIconContentColor = MaterialTheme.colorScheme.onPrimary
                ),
                navigationIcon = {
                    IconButton(onClick = { navController.navigate(route = AppSreens.EventScreen.route) })
                    {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_menu_revert),
                            modifier = Modifier
                                .size(30.dp),
                            contentDescription = null
                        )
                    }
                },
                title = { Text(text = "Go Back") }
            )
        }
    ) { innerPading ->
        Column(
            modifier = Modifier.verticalScroll(state = rememberScrollState())
        ) {

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(300.dp)
                    .background(Color.LightGray)
            ) {
                Text(
                    text = "Lugar",
                    modifier = Modifier.padding(top = 260.dp, start = 10.dp),
                    fontSize = 20.sp,
                    overflow = TextOverflow.Ellipsis
                )
            }
            Text(
                text = "Title",
                modifier = Modifier.padding(top = 10.dp, start = 10.dp),
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
            ) {
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
                text = "About",
                modifier = Modifier.padding(start = 10.dp),
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                overflow = TextOverflow.Ellipsis
            )
            Text(
                text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.",
                modifier = Modifier.padding(start = 10.dp),
                fontSize = 16.sp,
                overflow = TextOverflow.Ellipsis
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Button(
                    onClick = {},
                    modifier = Modifier
                        .width(170.dp)
                ) {
                    Text("Favorite")
                }
                Button(
                    onClick = {},
                    modifier = Modifier
                        .width(170.dp)
                ) {
                    Text("Buy")
                }
            }
        }
    }
}
