package com.coffee.recipes.mobile.ui

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.coffee.recipes.mobile.ui.theme.md_theme_light_onTertiaryContainer
import com.coffee.recipes.mobile.ui.theme.md_theme_light_tertiaryContainer

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun MockScreen(
    modifier: Modifier = Modifier,
) {
    val pagerState = rememberPagerState(initialPage=0)
    Box(modifier = modifier.fillMaxWidth()) {
        HorizontalPager(
            modifier = modifier.fillMaxWidth(),
            state = pagerState,
            pageCount = recipes.size
        ) {
            RecipeElement(coffeeRecipe = recipes[it])
        }
        Row (
            modifier = modifier
                .wrapContentHeight()
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
                .padding(bottom = 8.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            repeat(recipes.size) { iteration ->
                val color = if (pagerState.currentPage == iteration) md_theme_light_tertiaryContainer else md_theme_light_onTertiaryContainer
                Box(
                    modifier = Modifier
                        .padding(2.dp)
                        .clip(CircleShape)
                        .background(color)
                        .size(16.dp)
                )
            }
        }
    }

}