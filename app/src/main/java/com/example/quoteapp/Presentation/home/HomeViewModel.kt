package com.example.quoteapp.Presentation.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.quoteapp.data.model.QuoteModel
import com.example.quoteapp.data.repository.QuoteRepositoryImpl
import com.example.quoteapp.domain.repository.QuoteRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class HomeViewModel(
    private val repository: QuoteRepository
) : ViewModel() {

    private val _uiState = MutableStateFlow(HomeUiState())
    val uiState: StateFlow<HomeUiState> = _uiState.asStateFlow()

    init {
        loadHomeData()
    }

    private fun loadHomeData() {

        viewModelScope.launch {

            _uiState.value = HomeUiState(isLoading = true)

            _uiState.value = HomeUiState(
                isLoading = false,
                banners = repository.getBanners(),
                latestQuotes = repository.getLatestQuotes(10),
                trendingQuotes = repository.getTrendingQuotes(10),
                categories = repository.getCategories()
            )
        }


    }

    fun onHeartClick(quote: QuoteModel) {
        viewModelScope.launch {
            repository.toggleFavourite(quote)

            _uiState.value = _uiState.value.copy(
                latestQuotes = _uiState.value.latestQuotes.map {
                    if (it.id == quote.id) {
                        it.copy(isFavorite = !it.isFavorite)
                    } else {
                        it
                    }
                },
                trendingQuotes=_uiState.value.trendingQuotes.map{
                    if(it.id==quote.id){
                        it.copy(isFavorite = !it.isFavorite)
                    }else{
                        it
                    }
                }
            )

        }
    }


}