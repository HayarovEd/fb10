package com.coffee.recipes.mobile.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.coffee.recipes.mobile.R
import com.coffee.recipes.mobile.ui.theme.md_theme_light_onPrimary
import com.coffee.recipes.mobile.ui.theme.md_theme_light_onPrimaryContainer


@Preview
@Composable
fun SampleRecipeElement() {
    RecipeElement(coffeeRecipe = recipes.first())
}

@Composable
fun RecipeElement(
    modifier: Modifier = Modifier,
    coffeeRecipe: CoffeeRecipe
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(color = md_theme_light_onPrimary)
            .verticalScroll(rememberScrollState())
            .padding(horizontal = 5.dp, vertical = 10.dp)
    ) {
        Text(
            modifier = modifier.fillMaxWidth(),
            text = coffeeRecipe.name,
            color = md_theme_light_onPrimaryContainer,
            fontSize = 20.sp,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = modifier.height(15.dp))
        Image(
            modifier = modifier.fillMaxWidth(),
            painter = painterResource(id = coffeeRecipe.imagePath),
            contentDescription = "",
            contentScale = ContentScale.FillWidth
        )
        Spacer(modifier = modifier.height(5.dp))
        Text(
            text = coffeeRecipe.about,
            fontSize = 12.sp
        )
        Spacer(modifier = modifier.height(5.dp))
        NeededElements(
            name = stringResource(id = R.string.ingredients),
            elements = coffeeRecipe.ingredients
        )
        Spacer(modifier = modifier.height(5.dp))
        NeededElements(
            name = stringResource(id = R.string.equipment),
            elements = coffeeRecipe.equipment
        )
        Spacer(modifier = modifier.height(5.dp))
        Text(
            text = stringResource(id = R.string.guided_steps),
            fontSize = 18.sp,
            fontWeight = FontWeight(600)
        )
        coffeeRecipe.steps.forEach { step ->
            Spacer(modifier = modifier.height(5.dp))
            Step(
                title = step.nameStep,
                content = step.contentStep
            )
        }
    }
}


@Composable
private fun Step(
    modifier: Modifier = Modifier,
    title: String,
    content: String
) {
    Text(
        text = title,
        fontSize = 16.sp,
        fontWeight = FontWeight(600)
    )
    Spacer(modifier = modifier.height(3.dp))
    Text(
        text = content,
        fontSize = 16.sp,
        fontWeight = FontWeight(400)
    )
}