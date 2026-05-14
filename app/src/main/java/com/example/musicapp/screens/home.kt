package com.example.musicapp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.PlayCircleFilled
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.dropShadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.example.musicapp.ui.theme.MusicAppTheme

@Composable
fun homescreen(){
    Box(modifier = Modifier.fillMaxSize().background(color = Color(0xFFE7DEFC))) {
        Column(modifier = Modifier
            .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally

        ) {

            Column(

                modifier = Modifier

                    .padding(top = 50.dp)
                    .size(height = 125.dp, width = 300.dp)
                    .clip(RoundedCornerShape(20.dp))
                    .background(Color(0xFF8259F6)),
                horizontalAlignment = Alignment.Start
            ) {
                Row(
                    modifier = Modifier

                        .padding(top = 10.dp, start = 10.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween

                ) {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = "Menu",
                        tint = Color(0xFFFFFFFF),
                        modifier = Modifier.padding(end = 4.dp)
                    )
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "Search",
                        tint = Color(0xFFFFFFFF),
                        modifier = Modifier.padding(end = 4.dp)
                    )
                }
                Text(
                    modifier = Modifier.padding(top = 10.dp, start = 10.dp,),
                    text = "Good Morning!"
                )
                Text(
                    modifier = Modifier.padding(10.dp),
                    text = "Juan Faustro"
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 8.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.Bottom
            ) {
                Text(
                    modifier = Modifier
                        .padding(10.dp),
                    text = "Albums"
                )
                Text(
                    modifier = Modifier
                        .padding(10.dp),
                    text = "see more"
                )

            }
            LazyRow(
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                modifier = Modifier.padding(horizontal = 16.dp)
            ) {
                items(count = 10) {
                            Box(
                                modifier = Modifier
                                    .size(width = 180.dp, height = 200.dp)
                                    .clip(RoundedCornerShape(24.dp))
                                    .background(Color.Gray)

                            ) {
                                Row(
                                    modifier = Modifier
                                        .align(Alignment.BottomCenter)
                                        .padding(8.dp)
                                        .fillMaxWidth()
                                        .clip(RoundedCornerShape(16.dp))
                                        .background(Color(0xFF1E1136).copy(alpha = 0.9f))
                                        .padding(horizontal = 12.dp, vertical = 10.dp),
                                    horizontalArrangement = Arrangement.SpaceBetween,
                                    verticalAlignment = Alignment.CenterVertically
                                ){
                                    Column(modifier = Modifier.weight(1f)){
                                        Text(
                                            text = "Tales of Ithiria",
                                            color = Color.White,
                                            maxLines = 1
                                        )
                                        Text(
                                            text = "Haggard",
                                            color = Color.LightGray,
                                            maxLines = 1
                                        )
                                    }
                                    Box(
                                        modifier = Modifier
                                            .size(32.dp)
                                            .clip(CircleShape)
                                            .background(Color.White),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Icon(
                                            imageVector = Icons.Filled.PlayArrow,
                                            contentDescription = "Play",
                                            tint = Color(0xFF1E1136)
                                        )
                                    }
                                }
                            }
                }


            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()

                    .padding(horizontal = 16.dp, vertical = 8.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    modifier = Modifier
                        .padding(10.dp),
                    text = "Recently Played"
                )
                Text(
                    modifier = Modifier
                        .padding(10.dp),
                    text = "see more"
                )
            }
            LazyColumn(
                modifier = Modifier.weight(1f),
                contentPadding = PaddingValues(bottom = 100.dp)
            ){
                items(count = 5) {
                    Card(
                        modifier = Modifier.padding(vertical = 4.dp, horizontal = 16.dp)
                    ) {
                        Row(
                            modifier = Modifier
                                .size(height = 60.dp, width = 300.dp)
                                .clip(RoundedCornerShape(10.dp))
                                .background(color = Color.White)
                                .padding(start = 10.dp),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically

                        ) {
                            Box(
                                modifier = Modifier
                                    .clip(RoundedCornerShape(10.dp))
                                    .size(45.dp)
                                    .background(Color.Gray)
                            ) {
                            }
                            Column(modifier = Modifier.weight(1f)) {
                                Text(
                                    modifier = Modifier.padding(start = 10.dp),
                                    text = "Song Title"
                                )
                                Text(
                                    modifier = Modifier.padding(start = 10.dp),
                                    text = "Juan Faustro"
                                )
                            }
                            Icon(
                                imageVector = Icons.Default.MoreVert,
                                contentDescription = "Search",
                                tint = Color(0xFF5E5E5E),
                                modifier = Modifier.padding(end = 4.dp)
                            )
                        }

                    }
                }
            }
        }

        Box(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 16.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(72.dp)
                    .clip(RoundedCornerShape(32.dp))
                    .background(color = Color(0xFF1E1136)),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {

                Row(
                    modifier = Modifier.padding(start = 12.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .size(48.dp)
                            .clip(RoundedCornerShape(12.dp))
                            .background(Color.Gray)
                    )

                    Column(
                        modifier = Modifier.padding(start = 12.dp),
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = "Tales of Ithiria",
                            color = Color.White,
                            maxLines = 1
                        )
                        Text(
                            text = "Haggard",
                            color = Color.LightGray,
                            maxLines = 1
                        )
                    }
                }

                Box(
                    modifier = Modifier
                        .padding(end = 16.dp)
                        .size(40.dp)
                        .clip(CircleShape)
                        .background(Color.White),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = Icons.Filled.PlayArrow,
                        contentDescription = "Play",
                        tint = Color(0xFF1E1136)
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {

        homescreen()

}