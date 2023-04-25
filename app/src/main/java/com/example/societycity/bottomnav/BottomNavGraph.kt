package com.example.societycity.bottomnav

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.customnavigationbar.bottomnav.BottomBarScreen
import com.example.societycity.bottomNavigationFile.*
import com.example.societycity.screen.HomeScreen


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