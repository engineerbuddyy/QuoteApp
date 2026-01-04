package com.example.quoteapp.Presentation.saved

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.quoteapp.data.model.QuoteModel
import com.example.quoteapp.domain.repository.QuoteRepository
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class SavedViewModel(
    private val repository: QuoteRepository
) : ViewModel() {
    val savedQuotes = repository.getFavourites()
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), emptyList())


    fun onHeartClick(quote: QuoteModel) {
        viewModelScope.launch {
            repository.toggleFavourite(quote)
        }
    }
}
