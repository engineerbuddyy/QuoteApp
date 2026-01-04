package com.example.quoteapp.Presentation.explore

import androidx.lifecycle.ViewModel
import com.example.quoteapp.data.model.QuoteCategory
import com.example.quoteapp.data.model.QuoteModel
import com.example.quoteapp.data.repository.QuoteRepositoryImpl
import com.example.quoteapp.domain.repository.QuoteRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow


class ExploreViewModel(
    private val repository: QuoteRepository
) : ViewModel() {

    private val _uiState = MutableStateFlow(ExploreUiState())
    val uiState: StateFlow<ExploreUiState> = _uiState.asStateFlow()

    private val allQuotes = repository.getAllQuotes()

    init {
        _uiState.value = _uiState.value.copy(
            quotes = allQuotes
        )
    }

//    fun onSearchQueryChange(query: String) {
//        _uiState.value = _uiState.value.copy(searchQuery = query)
//        filterQuotes()
//    }

    fun onCategorySelected(category: QuoteCategory) {
        _uiState.value = _uiState.value.copy(selectedCategory = category)
        filterQuotes()
    }

    private fun filterQuotes() {
        val query = _uiState.value.searchQuery.lowercase()
        val category = _uiState.value.selectedCategory

        val filtered = allQuotes.filter { quote ->
//            val matchesQuery =
//                quote.text.lowercase().contains(query) ||
//                        quote.author.lowercase().contains(query)

            // If category is ALL, show all quotes
            // Otherwise, filter by the selected category
            val matchesCategory = category == QuoteCategory.ALL || quote.category == category

            //matchesQuery &&  matchesCategory
            matchesCategory
        }

        _uiState.value = _uiState.value.copy(quotes = filtered)
    }
}

