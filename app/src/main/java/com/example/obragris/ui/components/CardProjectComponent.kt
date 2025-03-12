package com.example.obragris.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.obragris.R

@Composable
fun cardProjectComponent(modifier: Modifier = Modifier) {
    var ImageCardProject = painterResource(R.drawable.icon_default_project)
    Card(modifier = Modifier) {

        Column(modifier = Modifier.padding(10.dp)) {
            Row(modifier = Modifier) {
                Image(modifier = Modifier.clip(RoundedCornerShape(10.dp)).size(100.dp),contentScale = ContentScale.Crop,
                    painter = ImageCardProject,
                    contentDescription = "Project Image"
                )
                Column(modifier = Modifier. padding(start = 10.dp)) {
                    Text(text = "Project Name")
                    Text(text = "Project Description")
                }
            }
            Row(modifier = Modifier.padding(top = 10 .dp).fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                Text(text = "Registros: 35")
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Ver más")
                }

            }

        }
    }
}


@Preview
@Composable
fun cardProjectComponentPreview() {
cardProjectComponent()
}