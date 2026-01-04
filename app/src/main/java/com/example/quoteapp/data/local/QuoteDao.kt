package com.example.quoteapp.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow


@Dao
interface QuoteDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertQuote(quote: QuoteEntity)

    @Query("SELECT * FROM quote_app")
    suspend fun getAllQuotes(): List<QuoteEntity>


    @Query("""
        SELECT * FROM quote_app
        ORDER BY RANDOM()
        LIMIT :limit
    """)
    suspend fun getLatestQuotes(limit: Int): List<QuoteEntity>

    // ⭐ FAVORITE
    @Query("""
        UPDATE quote_app
        SET isFavorite = :isFavorite 
        WHERE id = :quoteId
    """)
    suspend fun updateFavorite(
        quoteId: Int,
        isFavorite: Boolean
    )

    // ⭐ GET ONLY FAVORITES
    @Query("SELECT * FROM quote_app WHERE isFavorite = 1")
    fun getFavoriteQuotes(): Flow<List<QuoteEntity>>



}
