package com.example.quoteapp.data.model

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector

data class QuoteCategoryModel(
    val id: Int,
    val name: String,
    val category: QuoteCategory,
    val icon: ImageVector,
    val color: Color
)
