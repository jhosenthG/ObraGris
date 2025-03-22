package com.example.obragris.ui.screens.homeScreen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.obragris.ui.components.BottomBarComponent
import com.example.obragris.ui.components.CardProjectComponent

@Composable
fun homeScreen(navController: NavController) {
        Scaffold(
            bottomBar = {
                BottomBarComponent(navController)
            },
        ) { Box(modifier = Modifier.padding(it)) {
            cardHomeScreen()
        }
        }
    }







@Composable
fun cardHomeScreen() {
    LazyColumn(
       modifier = Modifier.padding(10.dp)) {
        items(50) {
            Spacer(modifier = Modifier.height(10.dp))
            CardProjectComponent()
        }
    }
}