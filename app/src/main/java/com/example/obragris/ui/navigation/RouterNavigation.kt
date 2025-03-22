package com.example.obragris.ui.navigation

import androidx.compose.ui.graphics.vector.ImageVector
import kotlinx.serialization.Serializable

sealed class Router {
    //Principal Screens.
    @Serializable data object HomeScreen : Router()
    @Serializable data object NewReportScreen : Router()
    @Serializable data object UserScreen : Router()

    //Routing Screen List and Form.
    @Serializable data object ReportFormScreen : Router()
    @Serializable data object ReportTaskScreen : Router()
    @Serializable data object ListTaskReportScreen : Router()
    @Serializable data object ListReportScreen : Router()
}


data class NavigationBottomBar(
    val route: Router,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
    val iconTextId: Int
)