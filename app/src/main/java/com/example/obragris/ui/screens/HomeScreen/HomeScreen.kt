package com.example.obragris.ui.screens.HomeScreen

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.obragris.ui.components.CardProjectComponent

@Composable
fun homeScreen() {
    LazyColumn {
        items(50) {
            Spacer(modifier = Modifier.height(10.dp))
            CardProjectComponent()
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeScreenPreview() {
    homeScreen()
}