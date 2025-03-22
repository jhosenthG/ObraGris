package com.example.obragris.ui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavController
import com.example.obragris.ui.navigation.Router

data class NavigationBottomBar (
    val title: String,
    val icon: ImageVector,
    val route: Router
)

val ListBottomBarItems = listOf<NavigationBottomBar>(
    NavigationBottomBar(
        title = "Menu",
        icon = Icons.Default.Home,
        route = Router.HomeScreen
    ),
    NavigationBottomBar(
        title = "Nuevo",
        icon = Icons.Default.Add,
        route = Router.NewReportScreen
    ),
    NavigationBottomBar(
        title = "Perfil",
        icon = Icons.Default.Person,
        route = Router.UserProfileScreen
    )
)

@Composable
fun BottomBarComponent(navController: NavController) {
    val selectedNavigationIndex = rememberSaveable {
        mutableIntStateOf(0)
    }

    NavigationBar(
        containerColor = Color.White
    ) {
        ListBottomBarItems.forEachIndexed { index, item ->
            NavigationBarItem(
                selected = selectedNavigationIndex.intValue == index,
                onClick = {
                    selectedNavigationIndex.intValue = index
                    navController.navigate(item.route)
                },
                icon = {
                    Icon(
                        imageVector = item.icon,
                        contentDescription = item.title
                    )
                },
                label = {
                    Text(
                        text = item.title,
                        color = if(index == selectedNavigationIndex.intValue) Color.Black else Color.Gray)
                },
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = Color.Black,
                    selectedTextColor = Color.Black,
                    indicatorColor = Color.White,
                    unselectedIconColor = Color.Gray,
                    unselectedTextColor = Color.Gray
                )
            )
    }
}
}