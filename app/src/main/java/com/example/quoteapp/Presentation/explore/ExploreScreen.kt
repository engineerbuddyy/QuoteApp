package com.example.quoteapp.Presentation.explore

import androidx.compose.animation.core.*
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.quoteapp.data.model.QuoteCategory
import com.example.quoteapp.data.model.QuoteModel
import com.example.quoteapp.ui.theme.Bold35
import com.example.quoteapp.ui.theme.DarkRedBurgundy
import com.example.quoteapp.ui.theme.DarkRedMaroon
import com.example.quoteapp.ui.theme.Normal12

@Composable
fun ExploreScreen(
    viewModel: ExploreViewModel = viewModel()
) {
    val uiState by viewModel.uiState.collectAsState()

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(12.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        item {
            Text(
                "Explore",
                style = MaterialTheme.typography.Bold35,
            )
        }

        item {
            Text(
                "Find quotes that inspire you",
                style = MaterialTheme.typography.Normal12.copy(color = Color.Black.copy(alpha = 0.8f))
            )
        }

        item {
            Spacer(modifier = Modifier.height(4.dp))
        }

        // Category Chips
        item {
            CategoryChipsRow(
                selectedCategory = uiState.selectedCategory,
                onCategorySelected = { category ->
                    viewModel.onCategorySelected(category)
                }
            )
        }

        item {
            Text(
                text = "${uiState.quotes.size} quotes found",
                style = MaterialTheme.typography.Normal12.copy(color = Color.Black.copy(alpha = 0.6f)),
                modifier = Modifier.padding(start = 4.dp)
            )
        }

        // Quotes List - With Animation
        if (uiState.quotes.isEmpty()) {
            item {
                EmptyState()
            }
        } else {
            items(
                count = uiState.quotes.size,
                key = { index -> uiState.quotes[index].hashCode() }
            ) { index ->
                AnimatedQuoteCard(
                    quote = uiState.quotes[index],
                    index = index
                )
            }
        }
    }
}

@Composable
fun AnimatedQuoteCard(quote: QuoteModel, index: Int) {
    var isVisible by remember { mutableStateOf(false) }

    LaunchedEffect(Unit) {
        kotlinx.coroutines.delay(index * 50L)
        isVisible = true
    }

    val offsetY by animateFloatAsState(
        targetValue = if (isVisible) 0f else 100f,
        animationSpec = spring(
            dampingRatio = Spring.DampingRatioMediumBouncy,
            stiffness = Spring.StiffnessMedium
        ),
        label = "slideUp"
    )

    val alpha by animateFloatAsState(
        targetValue = if (isVisible) 1f else 0f,
        animationSpec = tween(durationMillis = 400),
        label = "fadeIn"
    )

    val scale by animateFloatAsState(
        targetValue = if (isVisible) 1f else 0.9f,
        animationSpec = spring(
            dampingRatio = Spring.DampingRatioMediumBouncy,
            stiffness = Spring.StiffnessMedium
        ),
        label = "scaleIn"
    )

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .graphicsLayer {
                translationY = offsetY
                this.alpha = alpha
                scaleX = scale
                scaleY = scale
            }
    ) {
        QuoteCard(quote = quote)
    }
}

@Composable
fun CategoryChipsRow(
    selectedCategory: QuoteCategory,
    onCategorySelected: (QuoteCategory) -> Unit
) {
    LazyRow(
        contentPadding = PaddingValues(horizontal = 12.dp),
        horizontalArrangement = Arrangement.spacedBy(12.dp),
        modifier = Modifier.fillMaxWidth()
    ) {
        items(QuoteCategory.values().size) { index ->
            val category = QuoteCategory.values()[index]
            CategoryChip(
                category = category,
                isSelected = category == selectedCategory,
                onClick = { onCategorySelected(category) },
                animationDelay = index * 300
            )
        }
    }
}

@Composable
fun CategoryChip(
    category: QuoteCategory,
    isSelected: Boolean,
    onClick: () -> Unit,
    animationDelay: Int = 0
) {
    val infiniteTransition = rememberInfiniteTransition(label = "rainbow")
    val animatedOffset by infiniteTransition.animateFloat(
        initialValue = 0f,
        targetValue = 1f,
        animationSpec = infiniteRepeatable(
            animation = tween(
                durationMillis = 4000,
                easing = LinearEasing,
                delayMillis = animationDelay
            ),
            repeatMode = RepeatMode.Restart
        ),
        label = "rainbowOffset"
    )

    val rainbowColors = listOf(
        Color(0xFFFF0080), Color(0xFFFF0000), Color(0xFFFF8000), Color(0xFFFFFF00),
        Color(0xFF00FF00), Color(0xFF00FFFF), Color(0xFF0080FF), Color(0xFF8000FF),
        Color(0xFFFF0080)
    )

    val gradientBrush = Brush.sweepGradient(
        colors = rainbowColors,
        center = androidx.compose.ui.geometry.Offset(animatedOffset * 1000f, animatedOffset * 1000f)
    )

    if (isSelected) {
        Surface(
            modifier = Modifier
                .clip(RoundedCornerShape(20.dp))
                .clickable(onClick = onClick),
            color = DarkRedBurgundy,
            shape = RoundedCornerShape(20.dp)
        ) {
            Row(
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 10.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Icon(
                    imageVector = getCategoryIcon(category),
                    contentDescription = null,
                    tint = Color.White,
                    modifier = Modifier.size(18.dp)
                )
                Spacer(modifier = Modifier.width(6.dp))
                Text(
                    text = category.name.lowercase().replaceFirstChar { it.uppercase() },
                    style = MaterialTheme.typography.bodyMedium,
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    } else {
        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(20.dp))
                .border(
                    width = 2.dp,
                    brush = gradientBrush,
                    shape = RoundedCornerShape(20.dp)
                )
                .clickable(onClick = onClick)
                .background(Color.Transparent)
        ) {
            Row(
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 10.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Icon(
                    imageVector = getCategoryIcon(category),
                    contentDescription = null,
                    tint = MaterialTheme.colorScheme.onSurfaceVariant,
                    modifier = Modifier.size(18.dp)
                )
                Spacer(modifier = Modifier.width(6.dp))
                Text(
                    text = category.name.lowercase().replaceFirstChar { it.uppercase() },
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    fontWeight = FontWeight.Normal
                )
            }
        }
    }
}

@Composable
fun QuoteCard(quote: QuoteModel) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
        shape = RoundedCornerShape(16.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Text(
                text = "\"${quote.text}\"",
                style = MaterialTheme.typography.bodyLarge,
                color = MaterialTheme.colorScheme.onSurface
            )

            Spacer(modifier = Modifier.height(12.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "— ${quote.author}",
                    style = MaterialTheme.typography.bodyMedium,
                    fontWeight = FontWeight.SemiBold,
                    color = MaterialTheme.colorScheme.primary
                )

                Surface(
                    color = MaterialTheme.colorScheme.secondaryContainer,
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Text(
                        text = quote.category.name.lowercase().replaceFirstChar { it.uppercase() },
                        style = MaterialTheme.typography.labelSmall,
                        color = MaterialTheme.colorScheme.onSecondaryContainer,
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                    )
                }
            }
        }
    }
}

@Composable
fun EmptyState() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = null,
                tint = MaterialTheme.colorScheme.onSurfaceVariant,
                modifier = Modifier.size(64.dp)
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "No quotes found",
                style = MaterialTheme.typography.titleMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
            Text(
                text = "Try selecting a different category",
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.7f),
                textAlign = TextAlign.Center
            )
        }
    }
}

@Composable
fun getCategoryIcon(category: QuoteCategory) = when (category) {
    QuoteCategory.ALL -> Icons.Default.Home
    QuoteCategory.LIFE -> Icons.Default.Favorite
    QuoteCategory.MOTIVATION -> Icons.Default.ThumbUp
    QuoteCategory.LOVE -> Icons.Default.FavoriteBorder
    QuoteCategory.WISDOM -> Icons.Default.Info
    QuoteCategory.HUMOR -> Icons.Default.Face
    QuoteCategory.COURAGE -> Icons.Default.AccountCircle
    QuoteCategory.LEADERSHIP -> Icons.Default.Person
    QuoteCategory.EDUCATION -> Icons.Default.Build
    QuoteCategory.SUCCESS -> Icons.Default.Star
    QuoteCategory.PHILOSOPHY -> Icons.Default.Create
}