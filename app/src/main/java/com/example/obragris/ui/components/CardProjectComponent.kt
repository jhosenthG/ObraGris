package com.example.obragris.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun cardProjectComponent() {
    Card(modifier = Modifier) {
        Column(modifier = Modifier) {
            Row(modifier = Modifier) {
                Column(modifier = Modifier) {
                    Text(text = "Project Name")
                    Text(text = "Project Description")
                }

                Column(modifier = Modifier) {
                    Button(onClick = { /*TODO*/ }) {
                    }
                }

            }
        }
    }
}


@Preview
@Composable
fun cardProjectComponentPreview() {

}