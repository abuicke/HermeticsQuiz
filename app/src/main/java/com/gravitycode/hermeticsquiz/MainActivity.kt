package com.gravitycode.hermeticsquiz

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import coil.compose.AsyncImage
import com.gravitycode.hermeticsquiz.ui.theme.HermeticsQuizTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HermeticsQuizTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    TreeOfLife()
                }
            }
        }
    }
}

@Composable
fun TreeOfLife() {
    AsyncImage(
        // TODO: Probably need to replace this with a custom drawn Tree for easy modification.
        model = "https://i.imgur.com/JqN3q0H.jpg",
        contentDescription = null
    )
}

@Preview(//showBackground = true
)
@Composable
fun TreeOfLifePreview() {
    TreeOfLife()
}