package com.example.lab5.ui.theme.navigation.model

sealed class AppSreens(val route: String){
    object EventScreen: AppSreens("eventos")
    object DetailScreen: AppSreens("detalles")
    object PlacesScreen: AppSreens("lugares")
    object ProfileScreen: AppSreens("perfil")
}
