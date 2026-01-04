package com.example.quoteapp.Presentation.Navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.quoteapp.Presentation.explore.ExploreScreen
import com.example.quoteapp.Presentation.home.HomeScreen
import com.example.quoteapp.Presentation.QuoteScreen
import com.example.quoteapp.Presentation.saved.SavedScreen
import com.example.quoteapp.data.local.QuoteDatabaseProvider
import com.example.quoteapp.data.repository.QuoteRepositoryImpl


@Composable
fun AppNavGraph(navController: NavHostController, modifier: Modifier) {
    val context = LocalContext.current

    // Create DAO ONCE
    val dao = remember {
        QuoteDatabaseProvider
            .getDatabase(context)
            .quoteDao()
    }

    // Single repository instance
    val repository = remember {
        QuoteRepositoryImpl(dao)
    }


    NavHost(modifier = modifier, navController = navController, startDestination = QuoteScreen.Home.route){
       composable(QuoteScreen.Home.route){
           HomeScreen(onNavigateToExplore = {
               navController.navigate(QuoteScreen.Explore.route)
           },
               repository = repository
           )
       }

       composable(QuoteScreen.Explore.route){
           ExploreScreen(
               repository = repository
           )

       }
       composable(QuoteScreen.Saved.route){
           SavedScreen(
               repository = repository
           )
       }

   }


}