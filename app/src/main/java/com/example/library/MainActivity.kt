package com.example.library

import android.content.res.Configuration
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.example.components.Button
import com.example.library.ui.theme.LibraryTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LibraryTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Content()
                }
            }
        }
    }
}


@Composable
fun Content(){
    val context = LocalContext.current
    Surface(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
    ) {
        Column {
            Button(text = "Hola", onClick = {
                Toast.makeText(
                    context,
                    "Showing toast....",
                    Toast.LENGTH_SHORT
                ).show()
            })
            androidx.compose.material.Button(onClick = {
                Toast.makeText(
                    context,
                    "Showing toast....",
                    Toast.LENGTH_SHORT
                ).show()
            }) {
                Text(text = "Press here")
            }
        }
    }

}

@Preview(
    name = "Light theme"
)
@Preview(
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    name = "Dark Mode"
)
@Composable
fun DefaultPreview() {
    LibraryTheme {
        Content()
    }
}