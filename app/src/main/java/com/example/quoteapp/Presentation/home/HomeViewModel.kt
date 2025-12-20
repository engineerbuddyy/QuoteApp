package com.example.quoteapp.Presentation.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.quoteapp.data.repository.QuoteRepositoryImpl
import com.example.quoteapp.domain.repository.QuoteRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class HomeViewModel(
    private val repository: QuoteRepository = QuoteRepositoryImpl()
): ViewModel() {

    private val _uiState=MutableStateFlow(HomeUiState())
    val uiState: StateFlow<HomeUiState> = _uiState.asStateFlow()

    init{
        loadHomeData()
    }

    private fun loadHomeData(){

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



}