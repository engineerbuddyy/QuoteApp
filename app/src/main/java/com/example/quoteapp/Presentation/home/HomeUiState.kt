package com.example.quoteapp.Presentation.home

import com.example.quoteapp.data.model.BannerModel
import com.example.quoteapp.data.model.QuoteCategoryModel
import com.example.quoteapp.data.model.QuoteModel

data class HomeUiState(
    val isLoading: Boolean = false,
    val banners: List<BannerModel> = emptyList(),
    val latestQuotes: List<QuoteModel> = emptyList(),
    val trendingQuotes: List<QuoteModel> = emptyList(),
    val categories: List<QuoteCategoryModel> = emptyList()
)
