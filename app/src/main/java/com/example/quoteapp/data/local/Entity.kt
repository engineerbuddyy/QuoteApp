package com.example.quoteapp.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey



@Entity(tableName="quote_app")
data class QuoteEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,

    val text: String,
    val author: String,
    val category: String,
    val isFavorite: Boolean = false

)