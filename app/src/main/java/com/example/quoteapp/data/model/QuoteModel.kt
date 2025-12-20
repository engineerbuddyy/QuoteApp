package com.example.quoteapp.data.model

data class QuoteModel(
    val id: Int,
    val text: String,
    val author: String,
    val category: QuoteCategory
)

enum class QuoteCategory {
    ALL, LIFE, MOTIVATION, LOVE, WISDOM, HUMOR, COURAGE, LEADERSHIP, EDUCATION, PHILOSOPHY,SUCCESS
}
