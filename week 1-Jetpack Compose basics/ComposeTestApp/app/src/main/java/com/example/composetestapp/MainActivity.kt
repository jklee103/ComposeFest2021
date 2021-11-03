package com.example.composetestapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composetestapp.ui.theme.ComposeTestAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { //안에 xml 대신할 composable 넣기
            ComposeTestAppTheme {
                MyApp()
            }
        }
    }
}

@Composable
private fun MyApp(){
    Surface(color = MaterialTheme.colors.background) {
        Greeting(name = "Android")
    }
}
@Composable
fun Greeting(name: String) {
    Surface(color = MaterialTheme.colors.primary) { //background color
        Text(text = "Hello $name!", modifier = Modifier.padding(24.dp)) //modifier가 뭐,,이것저것 지정
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyApp()
}