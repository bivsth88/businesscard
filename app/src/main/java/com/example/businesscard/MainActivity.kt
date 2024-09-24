package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                BusinessCard()
            }
        }
    }
}

@Composable
fun BusinessCard() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFE0E0D1)), // Light green background
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(R.drawable.android_logo), // Replace with your Android logo
            contentDescription = null,
            modifier = Modifier
                .size(100.dp)
                .padding(16.dp),
            contentScale = ContentScale.FillHeight
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Jennifer Doe",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = "Android Developer Extraordinaire",
            fontSize = 18.sp,
            color = Color(0xFF4CAF50) // Green text
        )

        Spacer(modifier = Modifier.height(32.dp))

        ContactInfo()
    }
}

@Composable
fun ContactInfo() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(
                painter = painterResource(id = R.drawable.ic_phone),
                contentDescription = "Phone",
                modifier = Modifier.size(24.dp),
                tint = Color.Black
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "+11 (123) 444 555 666", fontSize = 16.sp)
        }

        Spacer(modifier = Modifier.height(16.dp))

        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(
                painter = painterResource(id = R.drawable.ic_twitter),
                contentDescription = "Twitter",
                modifier = Modifier.size(24.dp),
                tint = Color.Black
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "@AndroidDev", fontSize = 16.sp)
        }

        Spacer(modifier = Modifier.height(16.dp))

        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(
                painter = painterResource(id = R.drawable.ic_email),
                contentDescription = "Email",
                modifier = Modifier.size(24.dp),
                tint = Color.Black
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "jen.doe@android.com", fontSize = 16.sp)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    BusinessCard()
}
