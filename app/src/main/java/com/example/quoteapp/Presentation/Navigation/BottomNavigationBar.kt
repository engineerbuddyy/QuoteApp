package com.example.quoteapp.Presentation.Navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.quoteapp.Presentation.QuoteScreen
import androidx.compose.foundation.layout.*

//@Composable
//fun FloatingNavigationBar(navController: NavController) {
//    val screenWidth = LocalConfiguration.current.screenWidthDp.dp
//    val barWidth = screenWidth * 0.65f // 85% of screen width
//
//    Box(
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(bottom = 16.dp), // floating above system nav
//        contentAlignment = Alignment.BottomCenter
//    ) {
//        Row(
//            modifier = Modifier
//                .width(barWidth)
//                .shadow(8.dp, RoundedCornerShape(40.dp))
//                .clip(RoundedCornerShape(40.dp))
//                .background(Color.White.copy(0.8f))
//                .padding(vertical = 4.dp, horizontal = 16.dp),
//            horizontalArrangement = Arrangement.SpaceEvenly,
//            verticalAlignment = Alignment.CenterVertically
//        ) {
//            val items = listOf(
//                BottomNavModel.Home,
//                BottomNavModel.Explore,
//                BottomNavModel.Saved
//            )
//
//            val navBackStackEntry by navController.currentBackStackEntryAsState()
//            val currentRoute = navBackStackEntry?.destination?.route
//
//            items.forEach { item ->
//                NavigationBarItem(
//                    selected = currentRoute == item.route,
//                    onClick = {
//                        navController.navigate(item.route) {
//                            navController.graph.startDestinationRoute?.let { route ->
//                                popUpTo(route) { saveState = true }
//                            }
//                            launchSingleTop = true
//                            restoreState = true
//                        }
//                    },
//                    icon = { Icon(imageVector = item.icon, contentDescription = item.title) },
//                    label = { Text(item.title) },
//                    alwaysShowLabel = false
//                )
//            }
//        }
//    }
//}

import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.IntOffset
import kotlin.math.roundToInt

@Composable
fun FloatingNavigationBar(navController: NavController) {
    val configuration = LocalConfiguration.current
    val density = LocalDensity.current
    val screenWidth = configuration.screenWidthDp.dp
    val barWidth = screenWidth * 0.65f
    val barHeight = 56.dp // approximate height of the bar
    val bottomPadding = 16.dp

    // Convert dp to px
    val screenWidthPx = with(density) { screenWidth.toPx() }
    val barWidthPx = with(density) { barWidth.toPx() }
    val bottomPaddingPx = with(density) { bottomPadding.toPx() }

    val shiftLeftPx = with(density) { 70.dp.toPx() } // adjust 40.dp as needed
    var offsetX by remember { mutableStateOf((screenWidthPx - barWidthPx) / 2f - shiftLeftPx) }
    var offsetY by remember { mutableStateOf(0f) } // will adjust in LaunchedEffect

    val items = listOf(
        QuoteScreen.Home,
        QuoteScreen.Explore,
        QuoteScreen.Saved
    )

    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(bottom = bottomPadding),
        contentAlignment =  Alignment.BottomCenter
    ) {
        Box(
            modifier = Modifier
                .offset { IntOffset(offsetX.roundToInt(), offsetY.roundToInt()) }
                .pointerInput(Unit) {
                    detectDragGestures { change, dragAmount ->
                        change.consume()
                        offsetX += dragAmount.x
                        offsetY += dragAmount.y
                    }
                }
        ) {
            Row(
                modifier = Modifier
                    .width(barWidth)
                    .shadow(8.dp, RoundedCornerShape(40.dp))
                    .clip(RoundedCornerShape(40.dp))
                    .background(Color.White.copy(alpha = 0.85f))
                    .padding(vertical = 8.dp, horizontal = 20.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                items.forEach { item ->
                    NavigationBarItem(
                        selected = currentRoute == item.route,
                        onClick = {
                            navController.navigate(item.route) {
                                navController.graph.startDestinationRoute?.let { route ->
                                    popUpTo(route) { saveState = true }
                                }
                                launchSingleTop = true
                                restoreState = true
                            }
                        },
                        icon = { Icon(item.icon, contentDescription = item.title) },
                        label = { Text(item.title) },
                        alwaysShowLabel = false
                    )
                }
            }
        }
    }
}
