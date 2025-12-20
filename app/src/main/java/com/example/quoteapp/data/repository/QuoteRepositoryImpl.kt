package com.example.quoteapp.data.repository


import com.example.quoteapp.data.model.QuoteCategoryModel
import com.example.quoteapp.data.model.QuoteModel
import com.example.quoteapp.data.source.BannerData
import com.example.quoteapp.data.source.QuoteCategoryData
import com.example.quoteapp.data.source.QuoteData
import com.example.quoteapp.domain.repository.QuoteRepository

class QuoteRepositoryImpl : QuoteRepository{

    override fun getBanners()= BannerData.getBanners()

    override fun getAllQuotes()= QuoteData.getQuotes()

    override fun getLatestQuotes(limit:Int): List<QuoteModel> =
        getAllQuotes()
            .shuffled()
            .take(limit)

    override fun getTrendingQuotes(limit: Int): List<QuoteModel> =
        getAllQuotes()
            .shuffled()
            .take(limit)


    override fun getCategories(): List<QuoteCategoryModel> =
        QuoteCategoryData.getCategories()

}

