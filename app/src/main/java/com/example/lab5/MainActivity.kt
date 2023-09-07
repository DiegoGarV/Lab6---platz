package com.example.lab5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.lab5.ui.theme.Lab5Theme
import com.example.lab5.ui.events.view.EventScreen
import com.example.lab5.ui.places.view.PlacesScreen
import com.example.lab5.ui.details.view.DetailScreen
import com.example.lab5.ui.profile.view.ProfileScreen


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


