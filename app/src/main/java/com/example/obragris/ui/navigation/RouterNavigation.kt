package com.example.obragris.ui.navigation

import kotlinx.serialization.Serializable

sealed class Router {
    @Serializable data object HomeScreen : Router()
    @Serializable data object NewReportScreen : Router()
    @Serializable data object UserProfileScreen : Router()
}



