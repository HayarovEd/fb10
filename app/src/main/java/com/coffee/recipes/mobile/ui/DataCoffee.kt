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
    ),
    CoffeeRecipe(
        name = "Cold Brew in a Mason Jar",
        about = "Making cold brew is a simple process. All you need is coarsely ground coffee, cold water, and a long steeping time. This is why you can make it in just a mason jar in your kitchen.\nKeep in mind that the longer the coffee steeps, the stronger the flavor will be. If you over-steep, you may get a bitter, over-extracted result. But you can’t go wrong if you combine coffee and water in a 1:5 ratio and let it steep for 12 to 24 hours.\nReady to get started? Below we have listed the supplies and ingredients along with the steps to help you make smooth, sweet cold brew in your kitchen.",
        ingredients = listOf(
            "Coarsely ground coffee (5 ounces)",
            "Cold filtered water (24 ounces)",
        ),
        equipment = listOf(
            "Mason jar (32 oz)",
            "Strainer, sieve, or coffee filter",
            "Stirring spoon",
        ),
        steps = listOf(
            StepRecipe(
                nameStep = "1. Add coffee grounds to the jar.",
                contentStep = "Grind your beans coarsely, and then measure out the grounds. For 24 ounces of water, we measured 5 ounces of grounds. This goes directly into the bottom of the mason jar.\nIf you want to make more cold brew, just remember the 5:1 water to coffee ratio and adjust accordingly"
            ),
            StepRecipe(
                nameStep = "2. Add half the water and stir.",
                contentStep = "Fill the mason jar with half a cup of cold water, then stir the mixture, making sure all grounds are wet."
            ),
            StepRecipe(
                nameStep = "3. Add the rest of the water.",
                contentStep = "Add the remaining half cup of cold water to the mixture in the mason jar and stir again."
            ),
            StepRecipe(
                nameStep = "4. Refrigerate and steep.",
                contentStep = "Put the lid on the mason jar and place it in the refrigerator. Allow the jar to steep there for 12-24 hours. Remember, the longer the steeping time, the deeper the flavors develop. Overnight steeping is suggested if you want your cold brew first thing in the morning."
            ),
            StepRecipe(
                nameStep = "5. Strain out the grounds.",
                contentStep = "Once your cold brew has steeped, strain out the grounds using a fine strainer or coffee filter. The purpose of this step is to keep grounds out of your cold brew. This is especially important if you’ve made a large batch, as you don’t want to store finished cold brew with grounds in it."
            ),
            StepRecipe(
                nameStep = "6. Enjoy!",
                contentStep = "Your cold brew is ready to serve! Keep in mind that cold brew can taste very strong. Even though it doesn’t have any acidity or bitterness, you might still want a more mellow flavor. If this is the case for you, we suggest adding a little more cold water, milk, or half-and-half to your freshly poured cup until it tastes just right."
            ),
            StepRecipe(
                nameStep = "7. Store in the refrigerator.",
                contentStep = "If you have leftover cold brew, store it in the refrigerator in a clean, airtight container. It will last up to two weeks."
            ),
        ),
        imagePath = R.drawable.cold_brew
    ),
    CoffeeRecipe(
        name = "Espresso With a French Press",
        about = "Traditional espresso is made by pushing hot water through tightly packed, finely ground coffee using at least nine bars of pressure, which is nine times the atmospheric pressure present at sea level. You won’t be able to exert that kind of pressure using a French press, so you won’t be producing a fully authentic shot of espresso. Don’t worry, though: your French press espresso will come out strong, dark, and smooth.",
        ingredients = listOf(
            "Espresso beans",
            "Water",
        ),
        equipment = listOf(
            "French press",
            "Espresso cups",
        ),
        steps = listOf(
            StepRecipe(
                nameStep = "1. Prepare the French Press",
                contentStep = "Start by taking the lid and filter out of your French press. You’ll want the filter pushed up to the lid."
            ),
            StepRecipe(
                nameStep = "2. Boil the water.",
                contentStep = "Put the water on to boil. You want it to be just below boiling temperature, around 195° F, when you add it to the French press. To easily achieve this, you can let the water boil and then take it off the heat to cool for a few seconds."
            ),
            StepRecipe(
                nameStep = "3. Pre-warm the glass.",
                contentStep = "While the water is boiling, you may want to pre-warm your French press so that the glass doesn’t crack. Glass doesn’t conduct heat well, so sudden temperature changes can cause even tempered, heat-resistant glass to crack or shatter. Pour warm to hot water into the glass container and let it sit for a few minutes."
            ),
            StepRecipe(
                nameStep = "4. Grind and measure the beans.",
                contentStep = "To brew traditional French press coffee, you want a medium grind that won’t get stuck in or come through the metal filter. Classic espresso is made with finely ground beans. To brew espresso in a French press, you’ll want a grind level between these two. Too coarse and your espresso will be weak. Too fine and your filter will get stuck or your espresso will come out very silty. Grind your beans to a medium-fine consistency.\nFor espresso-strength French press coffee, you’ll want to double the ratio of coffee grounds to water. This will be about 2 tablespoons of grounds for each cup of water."
            ),
            StepRecipe(
                nameStep = "5. Let the coffee bloom.",
                contentStep = "Pour a little hot water onto your beans, moving in a circle. Wait a few seconds to allow them to bloom, releasing their delicious oils and aromas."
            ),
            StepRecipe(
                nameStep = "6. Pour in the water.",
                contentStep = "Pour in the rest of the water. Keep in mind that a shot of espresso is only one ounce, so you won’t need as much water as you would when brewing typical French press coffee. Don’t stir, as this can cause your grounds to fall out of suspension and alter the extraction."
            ),
            StepRecipe(
                nameStep = "7. Let the espresso brew.",
                contentStep = "Rest the lid and filter on top of the French press. Make sure the filter is above the grounds and water. Leave the espresso to brew for three or four minutes. If you want it even stronger, you can leave it to brew for longer, but don’t leave it too long, or it may become over-extracted and bitter."
            ),
            StepRecipe(
                nameStep = "8. Filter and enjoy!",
                contentStep = "When your espresso has finished brewing, plunge the filter down halfway. Then pull it back to the top and plunge it to the bottom. This will create a small layer of foam on the top of the espresso, approximating the crema found on a traditional espresso shot. Pour it into an espresso cup and drink it right away."
            ),
        ),
        imagePath = R.drawable.espresso_with_french_press
    ),
    CoffeeRecipe(
        name = "Authentic Cortadito Coffee",
        about = "",
        ingredients = listOf(
            "",
            "",
            "",
            ""
        ),
        equipment = listOf(
            "",
            "",
            "",
            "",
            ""
        ),
        steps = listOf(
            StepRecipe(
                nameStep = "",
                contentStep = ""
            ),
            StepRecipe(
                nameStep = "",
                contentStep = ""
            ),
            StepRecipe(
                nameStep = "",
                contentStep = ""
            ),
            StepRecipe(
                nameStep = "",
                contentStep = ""
            ),
            StepRecipe(
                nameStep = "",
                contentStep = ""
            ),
        ),
        imagePath = R.drawable.cortadito_coffee
    ),
    CoffeeRecipe(
        name = "Authentic Cortadito Coffee",
        about = "",
        ingredients = listOf(
            "",
            "",
            "",
            ""
        ),
        equipment = listOf(
            "",
            "",
            "",
            "",
            ""
        ),
        steps = listOf(
            StepRecipe(
                nameStep = "",
                contentStep = ""
            ),
            StepRecipe(
                nameStep = "",
                contentStep = ""
            ),
            StepRecipe(
                nameStep = "",
                contentStep = ""
            ),
            StepRecipe(
                nameStep = "",
                contentStep = ""
            ),
            StepRecipe(
                nameStep = "",
                contentStep = ""
            ),
        ),
        imagePath = R.drawable.cortadito_coffee
    ),
    CoffeeRecipe(
        name = "Authentic Cortadito Coffee",
        about = "",
        ingredients = listOf(
            "",
            "",
            "",
            ""
        ),
        equipment = listOf(
            "",
            "",
            "",
            "",
            ""
        ),
        steps = listOf(
            StepRecipe(
                nameStep = "",
                contentStep = ""
            ),
            StepRecipe(
                nameStep = "",
                contentStep = ""
            ),
            StepRecipe(
                nameStep = "",
                contentStep = ""
            ),
            StepRecipe(
                nameStep = "",
                contentStep = ""
            ),
            StepRecipe(
                nameStep = "",
                contentStep = ""
            ),
        ),
        imagePath = R.drawable.cortadito_coffee
    ),
    CoffeeRecipe(
        name = "Authentic Cortadito Coffee",
        about = "",
        ingredients = listOf(
            "",
            "",
            "",
            ""
        ),
        equipment = listOf(
            "",
            "",
            "",
            "",
            ""
        ),
        steps = listOf(
            StepRecipe(
                nameStep = "",
                contentStep = ""
            ),
            StepRecipe(
                nameStep = "",
                contentStep = ""
            ),
            StepRecipe(
                nameStep = "",
                contentStep = ""
            ),
            StepRecipe(
                nameStep = "",
                contentStep = ""
            ),
            StepRecipe(
                nameStep = "",
                contentStep = ""
            ),
        ),
        imagePath = R.drawable.cortadito_coffee
    ),
    CoffeeRecipe(
        name = "Authentic Cortadito Coffee",
        about = "",
        ingredients = listOf(
            "",
            "",
            "",
            ""
        ),
        equipment = listOf(
            "",
            "",
            "",
            "",
            ""
        ),
        steps = listOf(
            StepRecipe(
                nameStep = "",
                contentStep = ""
            ),
            StepRecipe(
                nameStep = "",
                contentStep = ""
            ),
            StepRecipe(
                nameStep = "",
                contentStep = ""
            ),
            StepRecipe(
                nameStep = "",
                contentStep = ""
            ),
            StepRecipe(
                nameStep = "",
                contentStep = ""
            ),
        ),
        imagePath = R.drawable.cortadito_coffee
    ),
    CoffeeRecipe(
        name = "Authentic Cortadito Coffee",
        about = "",
        ingredients = listOf(
            "",
            "",
            "",
            ""
        ),
        equipment = listOf(
            "",
            "",
            "",
            "",
            ""
        ),
        steps = listOf(
            StepRecipe(
                nameStep = "",
                contentStep = ""
            ),
            StepRecipe(
                nameStep = "",
                contentStep = ""
            ),
            StepRecipe(
                nameStep = "",
                contentStep = ""
            ),
            StepRecipe(
                nameStep = "",
                contentStep = ""
            ),
            StepRecipe(
                nameStep = "",
                contentStep = ""
            ),
        ),
        imagePath = R.drawable.cortadito_coffee
    ),
)