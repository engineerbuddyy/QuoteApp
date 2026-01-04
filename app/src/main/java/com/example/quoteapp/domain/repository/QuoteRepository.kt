package com.example.quoteapp.domain.repository

import com.example.quoteapp.data.model.BannerModel
import com.example.quoteapp.data.model.QuoteCategoryModel
import com.example.quoteapp.data.model.QuoteModel
import kotlinx.coroutines.flow.Flow


interface  QuoteRepository {

    fun getBanners():List<BannerModel>

    fun  getAllQuotes():List<QuoteModel>

    fun getLatestQuotes(limit:Int):List<QuoteModel>

    fun getTrendingQuotes(limit:Int):List<QuoteModel>

    fun getCategories():List<QuoteCategoryModel>

    suspend fun toggleFavourite(quote: QuoteModel)

    fun getFavourites(): Flow<List<QuoteModel>>


}