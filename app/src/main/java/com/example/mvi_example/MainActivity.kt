package com.example.mvi_example

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.mvi_example.ui.screen.loginScreen.LoginScreen
import com.example.mvi_example.ui.theme.MviExampleTheme

/**
 *  [MainActivity]
 *  We are not creating separate files for different screens e.g. [LoginScreen].
 *  All the screens are composed in
 */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MviExampleTheme {
                RenderScreen()
            }
        }
    }

    @Composable
    fun RenderScreen(){
        LoginScreen()
    }

    @Preview
    @Composable
    fun ScreenPreview() {
        RenderScreen()
    }
}


