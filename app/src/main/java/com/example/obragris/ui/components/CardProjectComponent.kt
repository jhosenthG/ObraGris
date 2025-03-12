package com.example.obragris.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.obragris.R
import com.example.obragris.ui.theme.White

@Composable
fun CardProjectComponent() {
    //Modification for projects
    var imageCardProject: Painter = painterResource(R.drawable.icon_default_project)
    var titleCardProject: String = "Project Name"
    var descriptionCardProject: String = "Project Description"

    //Card Component
    ElevatedCard (
        elevation = CardDefaults.cardElevation(
            defaultElevation = 6.dp),colors = CardDefaults.cardColors(White), modifier = Modifier) {

        Column(modifier = Modifier.padding(16.dp)) {
            Row(modifier = Modifier) {
                Image(modifier = Modifier.clip(RoundedCornerShape(10.dp)).size(85.dp),contentScale = ContentScale.Crop,
                    painter = imageCardProject,
                    contentDescription = "Project Image"
                )
                Column(modifier = Modifier. padding(start = 15.dp)) {
                    Text(titleCardProject, fontSize = 20.sp)
                    Text(descriptionCardProject)
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
fun CardProjectComponentPreview() {
CardProjectComponent()
}