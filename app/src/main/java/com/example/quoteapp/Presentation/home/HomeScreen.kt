package com.example.quoteapp.Presentation.home

import BannerSlider
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.quoteapp.ui.theme.Medium16
import com.example.quoteapp.ui.theme.Normal12
import com.example.quoteapp.ui.theme.Normal8
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.quoteapp.data.model.QuoteCategoryModel
import com.example.quoteapp.data.model.QuoteModel
import com.example.quoteapp.data.source.BannerData
import com.example.quoteapp.ui.theme.Bold35
import com.example.quoteapp.ui.theme.Medium14

// Gradient color palette
val gradientList = listOf(
    Color(0xFFEF5350), // red
    Color(0xFFAB47BC), // purple
    Color(0xFF42A5F5), // blue
    Color(0xFF26A69A), // teal
    Color(0xFF66BB6A), // green
    Color(0xFFFFA726)  // orange
)


@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    onNavigateToExplore: () -> Unit,
    viewModel: HomeViewModel = viewModel()
) {

    val state = viewModel.uiState.collectAsState().value

    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .padding(12.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp),

        ) {

        item {
            Text(
                "Explore",
                style = MaterialTheme.typography.Bold35,
            )
        }

        item {
            Text(
                "Awesome Quotes from our Community",
                style = MaterialTheme.typography.Normal12.copy(color = Color.Black.copy(alpha = 0.8f))
            )
        }

        item {
            BannerSlider(bannerList = state.banners)
        }

        item {
            SectionHeader(
                startTxt = "Latest Quotes", endText = "View All",
                onNavigate = {
                    onNavigateToExplore()
                }
            )
        }

        item {
            LazyRow(
                horizontalArrangement = Arrangement.spacedBy(12.dp),
                contentPadding = PaddingValues(horizontal = 12.dp)
            ) {
                items(state.latestQuotes.size) { index ->
                    val top = gradientList.random()
                    val bottom = gradientList.random().copy(alpha = 0.7f)

                    QuotesCard(
                        quoteModel = state.latestQuotes[index],
                        backgroundColors = listOf(top, bottom)
                    )
                }
            }
        }

        item {
            SectionHeader(
                startTxt = "Categories", endText = "View All",
                onNavigate = {
                    onNavigateToExplore()
                }
            )
        }

        item {
            LazyRow(
                horizontalArrangement = Arrangement.spacedBy(12.dp),
                contentPadding = PaddingValues(horizontal = 16.dp)
            ) {
                items(state.categories.size) { index ->
                    QuotesCategoryCard(
                        quoteCategory = state.categories[index],
                        color = state.categories[index].color
                    )
                }
            }
        }

        item {
            SectionHeader(
                startTxt = "Trending Quotes", endText = "View All",
                onNavigate = {}
            )
        }

        item {

            LazyRow(
                horizontalArrangement = Arrangement.spacedBy(12.dp),
                contentPadding = PaddingValues(horizontal = 12.dp)
            ) {
                items(state.trendingQuotes.size) { index ->
                    val top = gradientList.random()
                    val bottom = gradientList.random().copy(alpha = 0.7f)

                    TrendingQuotesCard(
                        trendingquoteModel = state.trendingQuotes[index],
                        backgroundColors = listOf(top, bottom)
                    )
                }
            }
        }

    }
}

@Composable
fun QuotesCategoryCard(
    modifier: Modifier = Modifier,
    color: Color,
    quoteCategory: QuoteCategoryModel
) {
    Card(
        modifier = modifier
            .width(120.dp)
            .clip(RoundedCornerShape(16.dp))
            .clickable {

            },
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(color.copy(alpha = 0.08f))
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Surface(
                modifier = Modifier
                    .size(44.dp)
                    .clip(CircleShape)
                    .background(color.copy(alpha = 0.5f))
            ) {
                Icon(
                    Icons.Default.Favorite,
                    "",
                    Modifier
                        .size(44.dp)
                        .padding(12.dp),
                    tint = color
                )
            }
            Spacer(modifier = Modifier.height(8.dp))

            Text(quoteCategory.name, style = MaterialTheme.typography.Medium14)
            Spacer(modifier = Modifier.height(8.dp))

        }

    }

}


@Composable
fun QuotesCard(
    modifier: Modifier = Modifier,
    quoteModel: QuoteModel,
    backgroundColors: List<Color>
) {
    Card(
        modifier = modifier
            .width(200.dp)
            .height(240.dp)
            .clip(RoundedCornerShape(16.dp))
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    brush = Brush.linearGradient(backgroundColors)
                )
                .padding(12.dp)
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                CircleShapeComponent(alpha = 0.1f, color = Color.White)
                SpacerWeight1f()
                Icon(Icons.Default.Share, contentDescription = "Share", tint = Color.White)
                Spacer(modifier = Modifier.width(8.dp))
                Icon(Icons.Default.FavoriteBorder, contentDescription = "Fav", tint = Color.White)
            }

            SpacerWeight1f()

            Text(
                text = quoteModel.text,
                style = MaterialTheme.typography.Normal12.copy(Color.White, lineHeight = 16.sp)
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                "- ${quoteModel.author}",
                style = MaterialTheme.typography.Normal8.copy(
                    Color.White,
                    fontStyle = FontStyle.Italic,
                    lineHeight = 16.sp
                ),
                modifier = modifier.padding(4.dp)
            )
        }
    }
}

@Composable
fun TrendingQuotesCard(
    modifier: Modifier = Modifier,
    trendingquoteModel: QuoteModel,
    backgroundColors: List<Color>
) {
    Card(
        modifier = modifier
            .width(200.dp)
            .height(240.dp)
            .clip(RoundedCornerShape(16.dp))
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    brush = Brush.linearGradient(backgroundColors)
                )
                .padding(12.dp)
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                CircleShapeComponent(alpha = 0.1f, color = Color.White)
                SpacerWeight1f()
                Icon(Icons.Default.Share, contentDescription = "Share", tint = Color.White)
                Spacer(modifier = Modifier.width(8.dp))
                Icon(Icons.Default.FavoriteBorder, contentDescription = "Fav", tint = Color.White)
            }

            SpacerWeight1f()

            Text(
                text = trendingquoteModel.text,
                style = MaterialTheme.typography.Normal12.copy(Color.White, lineHeight = 16.sp)
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                "- ${trendingquoteModel.author}",
                style = MaterialTheme.typography.Normal8.copy(
                    Color.White,
                    fontStyle = FontStyle.Italic,
                    lineHeight = 16.sp
                ),
                modifier = modifier.padding(4.dp)
            )
        }
    }
}


@Composable
fun RowScope.SpacerWeight1f() {
    Spacer(modifier = Modifier.weight(1f))
}

@Composable
fun ColumnScope.SpacerWeight1f() {
    Spacer(modifier = Modifier.weight(1f))
}

@Composable
fun CircleShapeComponent(alpha: Float, color: Color) {
    Surface(
        modifier = Modifier
            .size(32.dp)
            .clip(CircleShape),
        color = color.copy(alpha = alpha)
    ) {}
}

@Composable
fun SectionHeader(
    modifier: Modifier = Modifier,
    startTxt: String,
    endText: String,
    onNavigate: () -> Unit = {} //Lambda function
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            startTxt,
            style = MaterialTheme.typography.Medium16,
        )
        Text(
            endText,
            style = MaterialTheme.typography.Medium16,
            modifier = Modifier.clickable { onNavigate() }
        )
    }
}
