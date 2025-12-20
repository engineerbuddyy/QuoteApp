package com.example.quoteapp.Presentation.Navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.quoteapp.Presentation.explore.ExploreScreen
import com.example.quoteapp.Presentation.home.HomeScreen
import com.example.quoteapp.Presentation.QuoteScreen
import com.example.quoteapp.Presentation.saved.SavedScreen


@Composable
fun AppNavGraph(navController: NavHostController, modifier: Modifier) {
    NavHost(modifier = modifier, navController = navController, startDestination = QuoteScreen.Home.route){
       composable(QuoteScreen.Home.route){
           HomeScreen(onNavigateToExplore = {
               navController.navigate(QuoteScreen.Explore.route)
           })
       }

       composable(QuoteScreen.Explore.route){
           ExploreScreen()

       }
       composable(QuoteScreen.Saved.route){
           SavedScreen()
       }

   }


}