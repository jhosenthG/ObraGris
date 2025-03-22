package com.example.obragris

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.obragris.ui.navigation.NavigationWrapper
import com.example.obragris.ui.theme.ObraGrisTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ObraGrisTheme {
                NavigationWrapper()
                }
            }
        }
    }
