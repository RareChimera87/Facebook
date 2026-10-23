package me.SantiagoReina.facebook

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import me.SantiagoReina.facebook.ui.screens.FacebookLoginScreen
import me.SantiagoReina.facebook.ui.screens.FacebookRegisterScreen
import me.SantiagoReina.facebook.ui.screens.FeedScreen
import me.SantiagoReina.facebook.ui.screens.RecoverPassScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            val myNavController = rememberNavController()

            NavHost(navController = myNavController, startDestination = "login", modifier = Modifier.fillMaxSize()) {
                composable(route="login"){ FacebookLoginScreen(onClickRegister = {
                    myNavController.navigate("register")
                }, onClickIniciarSesion = { myNavController.navigate("feed")},
                    onClickOlvidasteContrasena = { myNavController.navigate("recoverPass") }) }
                composable(route="register") { FacebookRegisterScreen(onClickBack = {
                    myNavController.popBackStack()
                }) }
                composable(route="feed") { FeedScreen() }
                composable(route="recoverPass") { RecoverPassScreen(onClickEnviar = {
                    myNavController.popBackStack()
                }) }
            }
        }
    }
}
