package com.example.quoteapp.Presentation.saved

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.quoteapp.Presentation.home.QuotesCard
import com.example.quoteapp.Presentation.home.gradientList
import com.example.quoteapp.data.repository.QuoteRepositoryImpl
import com.example.quoteapp.domain.repository.QuoteRepository

@Composable
fun SavedScreen(
    repository: QuoteRepository
) {
    val viewModel: SavedViewModel = viewModel(
        factory = SavedViewModelFactory(repository)
    )
    val quotes = viewModel.savedQuotes.collectAsState().value

    LazyColumn {
        items(quotes.size) { index ->
            QuotesCard(
                quoteModel = quotes[index],
                backgroundColors = gradientList.shuffled().take(2),
                onHeartClick = {
                    viewModel.onHeartClick(quotes[index])
                }
            )
        }
    }
}
