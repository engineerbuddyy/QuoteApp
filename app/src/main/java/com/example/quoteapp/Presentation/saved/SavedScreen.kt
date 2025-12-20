package com.example.quoteapp.Presentation.saved

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun SavedScreen() {

    Box(
        modifier = Modifier.fillMaxSize()
            .background(Color.Yellow.copy(0.4f))
    ){
        Text(text = "Saved Screen")


    }
}