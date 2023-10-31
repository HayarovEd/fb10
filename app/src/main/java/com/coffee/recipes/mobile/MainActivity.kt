package com.coffee.recipes.mobile

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.coffee.recipes.mobile.ui.MockScreen
import com.coffee.recipes.mobile.ui.theme.CoffeeRecipesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CoffeeRecipesTheme {
                MockScreen()
            }
        }
    }
}

//MaterialTheme.colorScheme.background
