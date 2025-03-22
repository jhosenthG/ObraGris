package com.example.obragris.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.obragris.ui.navigation.Router.HomeScreen
import com.example.obragris.ui.navigation.Router.NewReportScreen
import com.example.obragris.ui.navigation.Router.UserProfileScreen
import com.example.obragris.ui.screens.homeScreen.homeScreen
import com.example.obragris.ui.screens.newReportScreen.newReportScreen
import com.example.obragris.ui.screens.userProfileScreen.userProfileScreen

@Composable
fun NavigationWrapper() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = HomeScreen ) {
        composable<HomeScreen>{
            homeScreen(navController)
        }
        composable<NewReportScreen>{
            newReportScreen()
        }
        composable<UserProfileScreen>{
            userProfileScreen()
        }
    }
}
