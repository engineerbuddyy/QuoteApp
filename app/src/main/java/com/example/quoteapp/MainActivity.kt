package com.example.quoteapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.core.view.WindowCompat
import androidx.navigation.compose.rememberNavController
import com.example.quoteapp.Presentation.Navigation.AppNavGraph
import com.example.quoteapp.Presentation.Navigation.FloatingNavigationBar


import com.example.quoteapp.ui.theme.QuoteAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Enable edge-to-edge
        WindowCompat.setDecorFitsSystemWindows(window, false)
        enableEdgeToEdge()

        setContent {
            QuoteAppTheme {
                val navController = rememberNavController()

                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(
                            top = WindowInsets.statusBars.asPaddingValues().calculateTopPadding(),
                            bottom = WindowInsets.navigationBars.asPaddingValues().calculateBottomPadding()
                        )
                ) {
                    // Main navigation content
                    AppNavGraph(
                        modifier = Modifier.fillMaxSize(),
                        navController = navController
                    )

                    // Floating pill bar overlay
                    Box(
                        modifier = Modifier
                            .fillMaxSize(),
                      //  contentAlignment = Alignment.BottomCenter
                    ) {
                        FloatingNavigationBar(navController)
                    }
                }
            }
        }
    }
}