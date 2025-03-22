package com.example.obragris.ui.screens.newReportScreen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun newReportScreen() {
    Box (modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center){
        Text(text = "New Report Screen", style = MaterialTheme.typography.headlineLarge)
    }
}