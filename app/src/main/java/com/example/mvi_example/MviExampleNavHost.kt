package com.example.mvi_example

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.mvi_example.screenState.LoginScreenState
import com.example.mvi_example.ui.screen.afterLoginScreen.AfterLoginScreen
import com.example.mvi_example.ui.screen.loginScreen.LoginScreen
import com.example.mvi_example.viewmodels.LoginScreenViewModel

@Composable
fun MviExampleNavHost(
    navHostController: NavHostController,
    loginScreenViewModel: LoginScreenViewModel
) {

    NavHost(navController = navHostController, startDestination = "loginScreen") {

        composable("loginScreen") {

            val screenState =
                loginScreenViewModel.screenState.collectAsState(initial = LoginScreenState.initialState)

            LoginScreen(
                { value -> loginScreenViewModel.onUsernameEdit(value) },
                { value -> loginScreenViewModel.onPasswordEdit(value) },
                { loginScreenViewModel.onLoginClicked() },
                screenState,
                { navHostController.navigate("afterLoginScreen")}
            )
        }

        composable("afterLoginScreen") {
            AfterLoginScreen()
        }
    }
}