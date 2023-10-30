package com.coffee.recipes.mobile.ui

import com.coffee.recipes.mobile.R

val recipes = listOf(
    CoffeeRecipe(
        name = "Authentic Cortadito Coffee",
        about = "If you’d like to change up your espresso fix, a Cortadito is an easy and sweet way to try something new. This is a popular Cuban coffee drink traditionally served as a dessert coffee or as a morning cup of sweet heaven. As part of daily Cuban life, it has also become a mainstay in the restaurants and cafes of South Florida.\nCortadito means “short cut” in Spanish, as the milk essentially “cuts” the strong espresso. Basically, this is a shot of Cuban espresso mixed with steamed milk. The distinctive light brown topping, called espuma, is made with whipped sugar and espresso. For a more decadent drink, use evaporated milk instead of regular.\nReady to get started? We’re going to show you how to make a Cortadito in five simple steps. You’ll be able to enjoy this sweet and strong delight whenever you wish!",
        ingredients = listOf(
            "Filtered water",
            "Finely-ground Cuban coffee",
            "4 teaspoons white sugar (to taste)",
            "1-2 ounces milk or evaporated milk, warmed"
        ),
        equipment = listOf(
            "Moka pot or other espresso maker",
            "Demitasse or small coffee cup",
            "Small saucepan or microwavable bowl",
            "Creamer, small bowl, or cup",
            "Spoon and whisk"
        ),
        steps = listOf(
            StepRecipe(
                nameStep = "1. Prepare your espresso.",
                contentStep = "The classic method uses a Moka pot, which is what we’re doing here. If you’re using a different method, prepare your espresso as usual.\nFill the bottom section with filtered water up to the safety release valve. Fill the filter basket with finely-ground coffee, leveled off but not packed. Place filter into the bottom section and then attach the top section.\nPlace on stove and turn on to medium heat. You don’t want to rush the process or overcook the coffee."
            ),
            StepRecipe(
                nameStep = "2. Warm your milk.",
                contentStep = "Warm the milk or evaporated milk on the stovetop or in the microwave. Be careful not to scorch it – you want it hot but not boiling."
            ),
            StepRecipe(
                nameStep = "3. Prepare your espuma.",
                contentStep = "Place 4 teaspoons (to taste) of sugar in a creamer or small bowl. Once about an ounce of espresso appears in the top of your Moka pot, remove it from the heat. Pour it over the sugar and then return the pot to the stove to finish brewing.\nWhisk the sugar and espresso until the sugar dissolves and a layer of light brown foam appears."
            ),
            StepRecipe(
                nameStep = "4. Combine the espresso and milk.",
                contentStep = "Once the rest of the espresso is brewed and ready, remove from heat. Pour the espresso into your coffee cup. Add the warm milk to each mug so there is a 1:1 ratio of espresso to milk."
            ),
            StepRecipe(
                nameStep = "5. Top with espuma and enjoy!",
                contentStep = "Grab a friend and enjoy a sweet coffee moment together! We hope you enjoyed learning how to make a Cortadito coffee at home. This drink is as delicious as it is easy to make."
            ),
        ),
        imagePath = R.drawable.cortadito_coffee
    )
)