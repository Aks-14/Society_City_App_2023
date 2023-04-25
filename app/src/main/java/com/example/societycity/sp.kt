package com.example.societycity


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.societycity.ui.theme.blue
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


@Composable
fun SplashScreen(navController: NavController) {
    var isVisible by remember { mutableStateOf(true) }

    val coroutineScope = rememberCoroutineScope()

    LaunchedEffect(Unit) {
        coroutineScope.launch {
            delay(2000) // delay for 2 seconds
            isVisible = false
            navController.navigate("start_page")
        }
    }

        Column(
            modifier = Modifier.background(color = blue)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            if (isVisible) {
            Image(
                painterResource(id = R.drawable.logo), "App Logo",
                Modifier
                    .width(102.dp)
                    .height(102.dp)
                )
            Spacer(modifier = Modifier.height(23.dp))

             Text(text = "Society City",
                 fontSize = 32.sp,
                 color = Color.White,
                 )
            Modifier.height(40.dp).width(197.dp)


            Spacer(modifier = Modifier.height(90.dp))

            Text(text = "Your Society Your Security",
                fontSize = 16.sp,
                color = Color.White,
            )
            Modifier.height(48.dp).width(207.dp)

            Spacer(modifier = Modifier.height(0.dp))

            Text(text ="Make a crime free nation",
                fontSize = 16.sp,
                color = Color.White,
            )
            Modifier.height(48.dp).width(207.dp)
        }
    }
}

@Composable
fun MyApp() {
    val navController = rememberNavController()

    NavHost(navController, startDestination = "splash_screen") {
        composable("splash_screen") { SplashScreen(navController) }
        composable("start_page") { StartPage(navController) }
        composable("first_page") { FirstPage(navController) }
//        composable("main_home") { MainScreen(navController) }
    }
}
