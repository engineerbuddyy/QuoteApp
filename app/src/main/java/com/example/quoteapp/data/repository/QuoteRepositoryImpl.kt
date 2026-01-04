package com.example.quoteapp.data.repository


import com.example.quoteapp.data.local.QuoteDao
import com.example.quoteapp.data.model.QuoteCategoryModel
import com.example.quoteapp.data.model.QuoteModel
import com.example.quoteapp.data.source.BannerData
import com.example.quoteapp.data.source.QuoteCategoryData
import com.example.quoteapp.data.source.QuoteData
import com.example.quoteapp.data.toEntity
import com.example.quoteapp.data.toModel
import com.example.quoteapp.domain.repository.QuoteRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class QuoteRepositoryImpl(
    private val dao: QuoteDao
) : QuoteRepository {

    override fun getBanners() = BannerData.getBanners()

    override fun getAllQuotes() = QuoteData.getQuotes()

    override fun getLatestQuotes(limit: Int): List<QuoteModel> =
        getAllQuotes().shuffled().take(limit)

    override fun getTrendingQuotes(limit: Int): List<QuoteModel> =
        getAllQuotes().shuffled().take(limit)


    override fun getCategories(): List<QuoteCategoryModel> = QuoteCategoryData.getCategories()

    override suspend fun toggleFavourite(quote: QuoteModel) {
        dao.insertQuote(quote.toEntity())
        dao.updateFavorite(quote.id, !quote.isFavorite)
    }

    override fun getFavourites(): Flow<List<QuoteModel>> {
        return dao.getFavoriteQuotes().map { entities ->
            entities.map { it.toModel() }
        }


    }
}

