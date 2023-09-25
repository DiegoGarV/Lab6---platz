package com.example.lab5.ui.theme.navigation.model

import androidx.compose.runtime.Composable
import androidx.navigation.compose.composable
import androidx.navigation.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.lab5.ui.details.view.DetailScreen
import com.example.lab5.ui.events.view.EventScreen
import com.example.lab5.ui.places.view.PlacesScreen
import com.example.lab5.ui.profile.view.ProfileScreen

@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = AppSreens.EventScreen.route){
        composable(route = AppSreens.EventScreen.route){
            EventScreen(navController)
        }
        composable(route = AppSreens.DetailScreen.route){
            DetailScreen(navController)
        }
        composable(route = AppSreens.PlacesScreen.route){
            PlacesScreen(navController)
        }
        composable(route = AppSreens.ProfileScreen.route){
            ProfileScreen(navController)
        }
    }
}
