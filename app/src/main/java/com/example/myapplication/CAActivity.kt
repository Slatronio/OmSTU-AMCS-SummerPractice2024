package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import coil.ImageLoader
import coil.compose.rememberAsyncImagePainter

class CAActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Box(
                modifier = with(Modifier) {
                    fillMaxSize()
                        .paint(
                            painterResource(id = R.drawable.captainamerica_portrait),
                            contentScale = ContentScale.Crop
                        )
                }
            )
            {
                Column(
                    modifier = with(Modifier) {
                        fillMaxWidth()
                    }
                )
                {
                    Spacer(modifier = Modifier.height(40.dp))
                    Row(
                        modifier = with(Modifier) {
                            fillMaxWidth()
                        }
                    )
                    {
                        IconButton(onClick = {
                            val navigate = Intent(this@CAActivity, MainActivity::class.java)
                            startActivity(navigate)
                        },
                            modifier = Modifier.size(75.dp)) {
                            Icon(
                                Icons.Default.KeyboardArrowLeft,
                                contentDescription = "",
                                tint = Color.White
                            )
                        }
                        Spacer(modifier = Modifier.width(215.dp))
                        Image(
                            painter = rememberAsyncImagePainter(
                                model = "https://i.pinimg.com/736x/8c/ad/a7/8cada7cc0bedada637842c145b6e5cae.jpg",
                                ImageLoader(LocalContext.current)
                            ),
                            contentDescription = "hero logo",
                            alignment = Alignment.TopEnd,
                            modifier = Modifier
                                .size(75.dp)
                        )
                    }
                    Spacer(modifier = Modifier.height(500.dp))
                    Text(
                        text = "CAPTAIN AMERICA",
                        textAlign = TextAlign.Left,
                        fontSize = 10.em,
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.offset(x = 20.dp)
                    )
                    Text(
                        text = "Aka Captain Icicle",
                        textAlign = TextAlign.Left,
                        fontSize = 6.em,
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.offset(x = 20.dp, y = 20.dp)
                    )
                }

            }
        }
    }
}
