package com.example.dbfinance.nav

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraph
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.dbfinance.screen.AddDataScreen
import com.example.dbfinance.screen.AddPengeluaran
import com.example.dbfinance.screen.GetDataScreen
import com.example.dbfinance.screen.Home
import com.example.dbfinance.util.PengeluaranViewModel
import com.example.dbfinance.util.SharedViewModel
import com.example.dbfinance.util.pengeluaran

@Composable
fun NavGraph(
    navController: NavHostController,
    sharedViewModel: SharedViewModel,
    pengeluaranViewModel: PengeluaranViewModel
) {
    NavHost(
        navController = navController,
        startDestination = Screens.Home.route
    ) {
        // main screen
        composable(
            route = Screens.Home.route
        ) {
            Home(
                navController = navController,
            )
        }
        // get data screen
        composable(
            route = Screens.GetDataScreen.route
        ) {
            GetDataScreen(
                navController = navController,
                sharedViewModel = sharedViewModel
            )
        }
        // add data screen
        composable(
            route = Screens.AddDataScreen.route
        ) {
            AddDataScreen(
                navController = navController,
                sharedViewModel = sharedViewModel
            )
        }
        //add Pengeluaran
        composable(
            route = Screens.AddPengeluaran.route
        ) {
            AddPengeluaran(
                navController = navController,
                pengeluaranViewModel = pengeluaranViewModel
            )
        }
    }
}