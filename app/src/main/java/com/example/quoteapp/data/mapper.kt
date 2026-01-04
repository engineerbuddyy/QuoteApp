package com.example.quoteapp.data

import com.example.quoteapp.data.local.QuoteEntity
import com.example.quoteapp.data.model.QuoteCategory
import com.example.quoteapp.data.model.QuoteModel

fun QuoteEntity.toModel()= QuoteModel(
    id = id,
    text = text,
    author = author,
    category = QuoteCategory.valueOf(category) ,
    isFavorite = isFavorite
)

fun QuoteModel.toEntity()= QuoteEntity(
    id = id,
    text = text,
    author = author,
    category = category.name,
    isFavorite = isFavorite
)
