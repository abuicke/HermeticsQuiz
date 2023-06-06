package com.gravitycode.hermeticsquiz

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gravitycode.hermeticsquiz.ui.theme.HermeticsQuizTheme
import dagger.hilt.android.AndroidEntryPoint
import java.util.concurrent.ThreadPoolExecutor
import javax.inject.Inject

// TODO: Set app icon
@AndroidEntryPoint
class MainActivity : ComponentActivity() {

//    @Inject lateinit var networkExecutor: ThreadPoolExecutor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HermeticsQuizTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TreeOfLife()
                }
            }
        }
    }
}

@Composable
fun TreeOfLife() {
    Image(
        painter = painterResource(R.drawable.tree_of_life),
        contentDescription = "Blank Tree of Life",
        modifier = Modifier
            // Set image size to 40 dp
            .size(40.dp)
            .background(Color.Yellow)
    )
}

@Preview
@Composable
fun TreeOfLifePreview() {
    TreeOfLife()
}