package com.example.happy_birthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.happy_birthday.ui.theme.Happy_BirthdayTheme
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {
            Happy_BirthdayTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->
//pour les mettre en méme niveau
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding),
                        contentAlignment = Alignment.Center
                    ) {
                        Column(
                            horizontalAlignment = Alignment.Start
                        ) {
                            Text(
                                text = "BirthdayCardPreview",
                                fontSize = 14.sp,
                                color = Color.Gray
                            )
                            GreetingText(message = "Happy Birthday Sam!")
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun GreetingText(message: String, modifier: Modifier = Modifier) {
    Text(
        text = message,
        fontSize = 100.sp,
        lineHeight= 116.sp,
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    Happy_BirthdayTheme {
        GreetingText(message = "Happy Birthday Sam!")
    }
}