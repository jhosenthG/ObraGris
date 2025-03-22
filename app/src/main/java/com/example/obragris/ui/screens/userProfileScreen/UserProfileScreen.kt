package com.example.obragris.ui.screens.userProfileScreen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun userProfileScreen() {
    Box (modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center){
        Text(text = "User Profile Screen", style = MaterialTheme.typography.headlineLarge)
    }
}