package com.example.societycity.bottomnav

import com.example.societycity.R


sealed class BottomBarScreen(
    val route: String,
    val title: String,
    val icon: Int,
    val icon_focused: Int
) {

    // for home
    object Home: BottomBarScreen(
        route = "home",
        title = "Home",
        icon = R.drawable.baseline_home_24,
        icon_focused = R.drawable.baseline_home_24
    )

    // for discover
    object Discover: BottomBarScreen(
        route = "discover",
        title = "Discover",
        icon = R.drawable.discover_24,
        icon_focused = R.drawable.discover_24
    )

    // for popular
    object Popular: BottomBarScreen(
        route = "popular",
        title = "Popular",
        icon = R.drawable.star_border_24,
        icon_focused = R.drawable.star_border_24
    )

    // for dailyneed
    object DailyNeed: BottomBarScreen(
        route = "dailyNeed",
        title = "Daily Need",
        icon = R.drawable.grid_view_dailyneeds,
        icon_focused = R.drawable.grid_view_dailyneeds
    )
    // for profile
    object Profile: BottomBarScreen(
        route = "myprofile",
        title = "My Profile",
        icon = R.drawable.profile_person_outline,
        icon_focused = R.drawable.profile_person_outline
    )
}
