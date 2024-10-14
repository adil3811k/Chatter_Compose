package com.example.chattercompose

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.chattercompose.auth.signin.SigInScreen
import com.example.chattercompose.rout.MainScree
import com.example.chattercompose.rout.SignIn
import com.example.chattercompose.rout.SignOut


@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    val navController = rememberNavController()
    Scaffold {innerpadding->
        NavHost(navController = navController, startDestination = SignIn, modifier = modifier.padding(innerpadding)){
            composable<SignIn> {
                SigInScreen()
            }
            composable<SignOut> {

            }
            composable<MainScree> {

            }
        }
    }
}

