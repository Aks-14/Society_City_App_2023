package com.example.societycity.bottomnav

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.societycity.screen.DailyNeedScreen
import com.example.societycity.screen.Discoverscreen
import com.example.societycity.screen.HomeScreen
import com.example.societycity.screen.MyProfileScreen
import com.example.societycity.screen.Popularscreen


@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun BottomNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Home.route
    ) {
        composable(route = BottomBarScreen.Home.route)
        {
            HomeScreen()
        }
        composable(route = BottomBarScreen.Discover.route)
        {
            Discoverscreen()
        }
        composable(route = BottomBarScreen.Popular.route)
        {
            Popularscreen()
        }
        composable(route = BottomBarScreen.DailyNeed.route)
        {
            DailyNeedScreen()
        }
        composable(route = BottomBarScreen.Profile.route)
        {
            MyProfileScreen()
        }
    }
}