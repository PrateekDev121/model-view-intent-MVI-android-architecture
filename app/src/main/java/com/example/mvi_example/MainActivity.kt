package com.example.mvi_example

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.mvi_example.ui.screen.loginScreen.LoginScreen
import com.example.mvi_example.ui.theme.MviExampleTheme
import com.example.mvi_example.viewmodels.LoginScreenViewModel

/**
 *  [MainActivity]
 *  We are not creating separate files for different screens e.g. [LoginScreen].
 *  All the screens are composed in
 */
class MainActivity : ComponentActivity() {


    val loginScreenViewModel : LoginScreenViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContent {
            MviExampleTheme {
                val navController = rememberNavController()
                val appState = remember { AppState(navController) }

                MviExample(appState)
            }
        }
    }

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun MviExample(appState: AppState) {
        Scaffold { padding ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(padding)
            ) {
                    MviExampleNavHost(navHostController = appState.navHostController,loginScreenViewModel)
            }
        }
    }
}




