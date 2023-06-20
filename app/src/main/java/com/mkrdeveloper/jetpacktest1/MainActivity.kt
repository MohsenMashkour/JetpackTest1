package com.mkrdeveloper.jetpacktest1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            FirstApp()
        }
    }
}

@Composable
fun FirstApp() {
    Surface(
        modifier = Modifier
            .height(150.dp)
            .width(250.dp)
            .padding(16.dp),
        shape = CutCornerShape(18.dp),
        color = Color.Green,
        border = BorderStroke(2.dp, color = Color.Red),
        shadowElevation = 8.dp
    ) {
        Text(
            text = "subscribe please", fontSize = 32.sp, modifier = Modifier.padding(10.dp)
        )
    }

}

@Preview(showBackground = true, name = "MKR DEVELOPER")
@Composable
fun AppPreview() {
    FirstApp()
}