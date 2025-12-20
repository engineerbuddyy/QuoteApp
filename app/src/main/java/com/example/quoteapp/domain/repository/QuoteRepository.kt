package com.example.quoteapp.domain.repository

import com.example.quoteapp.data.model.BannerModel
import com.example.quoteapp.data.model.QuoteCategoryModel
import com.example.quoteapp.data.model.QuoteModel


interface  QuoteRepository {

    fun getBanners():List<BannerModel>

    fun  getAllQuotes():List<QuoteModel>

    fun getLatestQuotes(limit:Int):List<QuoteModel>

    fun getTrendingQuotes(limit:Int):List<QuoteModel>

    fun getCategories():List<QuoteCategoryModel>


}