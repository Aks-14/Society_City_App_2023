package com.example.societycity

sealed class NavigationItem(var route: String, var icon: Int, var title: String)
{
    object Home : NavigationItem("home", R.drawable.baseline_home_24, "Home")
    object Profile : NavigationItem("profile", R.drawable.profile_person_outline, "Profile")
    object Settings : NavigationItem("settings", R.drawable.discover_24, "Settings")
    object Share : NavigationItem("share", R.drawable.search, "Share")
    object Contact : NavigationItem("contact", R.drawable.star_border_24, "Contact")
}
