package com.coffee.recipes.mobile.ui

data class CoffeeRecipe(
    val name: String,
    val about: String,
    val ingredients: List<String>,
    val equipment: List<String>,
    val steps: List<StepRecipe>,
    val imagePath: Int
)

data class StepRecipe(
    val nameStep: String,
    val contentStep:String
)
