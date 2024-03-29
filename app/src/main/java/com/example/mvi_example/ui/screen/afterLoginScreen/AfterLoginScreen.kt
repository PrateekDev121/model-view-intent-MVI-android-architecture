package com.example.mvi_example.ui.screen.afterLoginScreen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

/**
 * This [AfterLoginScreen] ,is the demo screen which will be de displayed after login is successful
 */

val screenName = "After Login Screen"

@Composable
fun AfterLoginScreen() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text(text = screenName)
    }

}

@Preview
@Composable
fun PreviewScreen() {
    AfterLoginScreen()
}