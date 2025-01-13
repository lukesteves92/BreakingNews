package com.course.breakingnews

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            App()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DetailsScreenPreview() {
    DetailsScreen()
}

@Preview(showBackground = true)
@Composable
fun ComponentsPreview() {
    BreakingNewsTopBar(onClick = {})
}

@Preview
@Composable
fun AppAndroidPreview() {
    App()
}