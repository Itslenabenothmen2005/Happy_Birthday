// Fichier : MainActivity.kt
package com.example.happy_birthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
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

                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        // Petit texte gris (l'étiquette)
                        Text(
                            text = "BirthdayCardPreview",
                            fontSize = 14.sp,
                            color = Color.Gray
                        )
                        // Grand texte
                        BirthdayCard(name = "James")
                    }
                }
            }
        }
    }
}

@Composable
fun BirthdayCard(
    name: String,
    modifier: Modifier = Modifier
) {
    Text(
        text = "Hello $name!",
        fontSize = 36.sp,
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    Happy_BirthdayTheme {
        BirthdayCard("James")
    }
}