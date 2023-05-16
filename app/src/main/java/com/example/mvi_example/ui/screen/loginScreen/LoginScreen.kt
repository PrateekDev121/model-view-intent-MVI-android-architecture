package com.example.mvi_example.ui.screen.loginScreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.State
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import com.example.mvi_example.helper.StatusBoolean
import com.example.mvi_example.screenState.LoginScreenState

/**
 * This [LoginScreen], is the demo screen which will be de displayed for login the user.
 */


@Composable
fun LoginScreen(
    onUseNameChange: (String) -> Unit,
    onPasswordChange: (String) -> Unit,
    onLoginButtonClick: () -> Unit,
    screenState: State<LoginScreenState>,
    navToDest1: () -> Unit
) {
    LoginScreenContent(
        onUseNameChange,
        onPasswordChange,
        onLoginButtonClick,
        screenState,
        navToDest1
    )
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreenContent(
    onUseNameChange: (String) -> Unit,
    onPasswordChange: (String) -> Unit,
    onLoginButtonClick: () -> Unit,
    screenState: State<LoginScreenState>,
    navToDest1: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 10.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        OutlinedTextField(
            value = screenState.value.userName,
            onValueChange = { onUseNameChange(it) },
            label = { Text("Username") },
            enabled = !screenState.value.isLoggingInProcess,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp),
        )
        Spacer(modifier = Modifier.padding(vertical = 10.dp))
        OutlinedTextField(
            value = screenState.value.passWord,
            visualTransformation = PasswordVisualTransformation(),
            onValueChange = { onPasswordChange(it) },
            label = { Text("Password") },
            enabled = !screenState.value.isLoggingInProcess,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp),
        )
        Spacer(modifier = Modifier.padding(vertical = 20.dp))
        Button(
            onClick = { onLoginButtonClick() },
            modifier = Modifier.fillMaxWidth(.8f),
            enabled = !screenState.value.isLoggingInProcess,
            shape = RoundedCornerShape(5.dp)
        ) {
            Text(text = "Login")
        }

        if (screenState.value.isLoggingInProcess)
            CircularProgressIndicator()

        LaunchedEffect(key1 = screenState.value.isLoginSuccessful) {
            when (screenState.value.isLoginSuccessful) {
                StatusBoolean.TRUE -> navToDest1()
                else -> {}
            }
        }
    }
}


