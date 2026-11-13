package ru.yandex.practicum.contacts

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun PlaylistHost(navController: NavHostController = rememberNavController()) {
    val navigateToSearch: () -> Unit = {
        navController.navigate(Screen.Search.route)
    }

    val navigateToSettings: () -> Unit = {
        navController.navigate(Screen.Settings.route)
    }

    @Suppress("UNUSED_VARIABLE")
    val navigateToMain: () -> Unit = {
        navController.navigate(Screen.Main.route) {
            popUpTo(Screen.Main.route) { inclusive = true }
        }
    }

    NavHost(
        navController = navController,
        startDestination = Screen.Main.route
    ) {
        composable(Screen.Main.route) {
            MainScreen(
                onSearchClick = navigateToSearch,
                onSettingsClick = navigateToSettings
            )
        }

        composable(Screen.Search.route) {
            SearchScreen(
                onBackClick = { navController.popBackStack() }
            )
        }

        composable(Screen.Settings.route) {
            SettingsScreen(
                onBackClick = { navController.popBackStack() }
            )
        }
    }
}