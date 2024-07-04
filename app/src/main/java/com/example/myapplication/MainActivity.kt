package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalFoundationApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Box(
                modifier = with(Modifier) {
                    fillMaxSize()
                        .paint(
                            painterResource(id = R.drawable.background),
                            contentScale = ContentScale.Crop
                        )
                })
            {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = with(Modifier) {
                        fillMaxWidth()
                    })
                {
                    Image(
                        painter = painterResource(R.drawable.ms_logo),
                        contentDescription = "",
                        modifier = Modifier
                            .size(150.dp)
                    )
                    Text(
                        text = "Choose your hero",
                        textAlign = TextAlign.Center,
                        fontSize = 8.em,
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                    )
                    Spacer(modifier = Modifier.height(40.dp))
                    val lazyListState: LazyListState = rememberLazyListState()
                    LazyRow(
                        modifier = Modifier.fillMaxSize(),
                        state = lazyListState,
                        flingBehavior = rememberSnapFlingBehavior(lazyListState),
                        verticalAlignment = Alignment.CenterVertically
                    )
                    {
                        item {
                            Spacer(modifier = Modifier.width(66.dp))
                            Box(
                                modifier = with(Modifier) {
                                fillMaxSize()
                                    .paint(
                                        painterResource(id = R.drawable.ironman_portrait),
                                    )
                                    .clickable(
                                            onClick = {
                                                val navigate = Intent(this@MainActivity, IMActivity::class.java)
                                                startActivity(navigate)
                                            },
                                    )
                            }
                            )
                            {
                                Text(
                                    text = "IRON MAN",
                                    textAlign = TextAlign.Left,
                                    fontSize = 6.em,
                                    color = Color.White,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier.offset(x = 10.dp, y = 440.dp)
                                )
                            }
                            Spacer(modifier = Modifier.width(33.dp))
                        }
                        item {
                            Spacer(modifier = Modifier.width(33.dp))
                            Box(
                                modifier = with(Modifier) {
                                    fillMaxSize()
                                        .paint(
                                            painterResource(id = R.drawable.thor_portrait),
                                        )
                                        .clickable(
                                            onClick = {
                                                val navigate = Intent(this@MainActivity, MTActivity::class.java)
                                                startActivity(navigate)
                                            },
                                        )
                                }
                            )
                            {
                                Text(
                                    text = "MIGHTY THOR",
                                    textAlign = TextAlign.Left,
                                    fontSize = 6.em,
                                    color = Color.White,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier.offset(x = 10.dp, y = 440.dp)
                                )
                            }
                            Spacer(modifier = Modifier.width(33.dp))
                        }
                        item {
                            Spacer(modifier = Modifier.width(33.dp))
                            Box(
                                modifier = with(Modifier) {
                                    fillMaxSize()
                                        .paint(
                                            painterResource(id = R.drawable.captainamerica_portrait),
                                        )
                                        .clickable(
                                            onClick = {
                                                val navigate = Intent(this@MainActivity, CAActivity::class.java)
                                                startActivity(navigate)
                                            },
                                        )
                                }
                            )
                            {
                                Text(
                                    text = "CAPTAIN AMERICA",
                                    textAlign = TextAlign.Left,
                                    fontSize = 6.em,
                                    color = Color.White,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier.offset(x = 10.dp, y = 440.dp)
                                )
                            }
                            Spacer(modifier = Modifier.width(66.dp))
                        }
                    }
                }
            }
        }
    }
}

