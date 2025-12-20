package com.example.quoteapp.Presentation.explore

import com.example.quoteapp.data.model.QuoteCategory
import com.example.quoteapp.data.model.QuoteModel

data class ExploreUiState(
    val isLoading :Boolean =false,
    val searchQuery: String = "",
    val selectedCategory: QuoteCategory = QuoteCategory.ALL,
    val quotes: List<QuoteModel> = emptyList(),
    val errorMessage: String? = null
)