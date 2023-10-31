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
        name = "Mocha",
        about = "For many coffee lovers with a sweet tooth, chocolate and coffee make the perfect marriage. Combine smooth, foamy milk with bold espresso and sweet, creamy chocolate, and you have a mocha. This has been a popular drink at many coffee shops for years, but paying your favorite barista to make them can add up quickly.\nLuckily, mochas are easy to make at home, and you can add as many decadent toppings as you desire. Typically served with milk froth on top, mochas can be jazzed up with whipped cream, sprinkles, or cocoa powder.\nHere, we will show you how to make a café mocha easily in your kitchen.",
        ingredients = listOf(
            "1.5-2 ounces of espresso or strong coffee",
            "8 ounces milk",
            "2 tablespoons chocolate syrup",
            "Toppings (optional)"
        ),
        equipment = listOf(
            "Espresso-making device (Moka pot or espresso machine)",
            "Milk steaming device (milk steamer or microwave/stovetop and a whisk)",
        ),
        steps = listOf(
            StepRecipe(
                nameStep = "1. Prepare your coffee.",
                contentStep = "Pull your shot, set up your Moka pot, or brew a concentrated cup of coffee using your favorite brewing method. With espresso, we prefer pulling short ristretto shots for mochas because the concentrated flavor holds up well to chocolate. This will yield about 1.5 ounces of liquid. With strong coffee, we recommend about 2 ounces."
            ),
            StepRecipe(
                nameStep = "2. Heat your milk.",
                contentStep = "Add eight ounces of milk to a microwave-safe bowl or cup. Heat for 1 minute and remove from the microwave. Alternatively, you can heat milk in a pan on the stovetop. Keep the heat at medium and stir frequently, turning off the burner before the milk begins to boil.\nWe think the perfect temperature for a mocha is between 160-170° Fahrenheit. You can make it hotter or colder if you like, but don’t burn the milk, and we wouldn’t recommend going below 140°."
            ),
            StepRecipe(
                nameStep = "3. Froth your milk.",
                contentStep = "If you have a milk frother, this step will be easy. Otherwise, you can froth your milk using a whisk. Place it between your palms and roll it back and forth until you create enough foam."
            ),
            StepRecipe(
                nameStep = "4. Add chocolate syrup.",
                contentStep = "Pour 2 tablespoons of your favorite chocolate syrup into the bottom of a coffee mug. For an extra coffee shop look, drizzle syrup along the inner edges of the cup."
            ),
            StepRecipe(
                nameStep = "5. Add the espresso.",
                contentStep = "Pour your brewed espresso or strong coffee into the mug. Stir to dissolve the chocolate."
            ),
            StepRecipe(
                nameStep = "6. Add the hot milk and foam.",
                contentStep = "Holding back the foam, pour the steamed milk into the espresso. Top with foam and embellish with whipped cream, chocolate syrup, or sprinkles. For an extra coffee flavor, sprinkle on some homemade espresso powder!"
            ),
        ),
        imagePath = R.drawable.mocha_at_home
    ),
    CoffeeRecipe(
        name = "Vietnamese Iced Coffee",
        about = "Vietnamese iced coffee, also called Cà Phê Sữa Đá’, is known for being strong, sweet, and refreshing. Luckily, you don’t have to fly to Vietnam (or your favorite coffee shop) to enjoy it. It’s very easy to make at home using just a few simple ingredients. You can buy a Vietnamese coffee press, but you can also use a coffee brewing method that you already own.\nFor this guide, we’re using a drip coffee machine, but you can also use a pour-over, French press, or Chemex. Make sure you buy Vietnamese ground coffee if you want it to be authentically chocolatey and rich.\nReady to get started? The ingredients and supplies you need are listed below. Then we’ll show you how to make this international coffee delight.",
        ingredients = listOf(
            "Two to three tablespoons Vietnamese ground coffee OR a dark roast coffee",
            "Eight ounces of cold filtered water",
            "One to two spoonfuls of sweetened condensed milk (to taste)",
            "1/2 cup of ice (or coffee ice cubes)"
        ),
        equipment = listOf(
            "Glass",
            "Drip coffee maker, preferably with cold coffee settings OR Vietnamese phin",
        ),
        steps = listOf(
            StepRecipe(
                nameStep = "1. Set up your glass.",
                contentStep = "Put the half cup of ice into the glass you are drinking your iced coffee from. Then place this directly under the pour spout, if you can. If you are using a carafe instead, put the glass aside for later."
            ),
            StepRecipe(
                nameStep = "2. Set up your brewer.",
                contentStep = "Scoop two to three tablespoons of the Vietnamese ground coffee into your coffee filter. If you want to make multiple servings, just add more, sticking to the proportion of eight ounces of water for every two to three tablespoons of coffee."
            ),
            StepRecipe(
                nameStep = "3. Start brewing.",
                contentStep = "If your machine has an iced coffee option, select it and let the brewing begin! Otherwise, brew a cup of coffee as usual, straight onto the ice. Once it has finished brewing, remove the glass from under the drip spout."
            ),
            StepRecipe(
                nameStep = "4. Add sweetened condensed milk.",
                contentStep = "Drizzle a spoonful of the sweetened condensed milk over the coffee and ice. Add one more spoonful if you want it sweeter. Stir vigorously and enjoy!"
            ),
        ),
        imagePath = R.drawable.vietnamese_iced_coffee_home
    ),
    CoffeeRecipe(
        name = "Iced Latte",
        about = "For an iced drink, we won’t be steaming the milk because the iced latte has a feel all its own. It could also be a bit of a health risk, as there’s a small risk that steamed milk could grow unhealthy bacteria when introduced to the ice.\nNow that we know all this, we can see that the iced latte is a pretty simple drink. The most important part is the coffee itself, as everything else is added after the coffee is brewed. So, let’s make an iced latte!",
        ingredients = listOf(
            "Milk of your choosing",
            "Freshly ground coffee beans",
            "Ice cubes",
        ),
        equipment = listOf(
            "Coffee machine or other brewing method",
            "Coffee cup",
        ),
        steps = listOf(
            StepRecipe(
                nameStep = "1. Prepare your coffee to be brewed.",
                contentStep = "Whether you want to use strong coffee or espresso is up to you. We prefer espresso, as the notes shine through when combined with milk. We recommend not using flavored coffee. If you want to make a flavored drink, you can add syrup at the end.\nIf you need to heat water because you are brewing your coffee manually, heat it to just below boiling or let it sit for a minute after boiling. The water should be between 195 and 205 degrees. Boiling water will burn the coffee, taking away the delicacy of the drink."
            ),
            StepRecipe(
                nameStep = "2. Brew your coffee.",
                contentStep = "Whatever extraction or brew method you choose, you should brew the coffee in a receptacle that has been preheated as close to the temperature of the coffee as possible. This is to avoid shocking the coffee, which causes a bit of a stale flavor."
            ),
            StepRecipe(
                nameStep = "3. Transfer your coffee to your cup.",
                contentStep = "It is time to start constructing! Pour your espresso into the bottom of the cup you’re using for your drink."
            ),
            StepRecipe(
                nameStep = "4. Put in the desired amount of ice.",
                contentStep = "Of course, to make an iced latte you’re going to need ice! Are you the type who wants ice to the top, or do you prefer just a few cubes? This step is totally up to you!"
            ),
            StepRecipe(
                nameStep = "5. Pour your milk.",
                contentStep = "We recommend eight to 10 ounces of milk, but you can put in as much or as little as you’d like. The reason we prefer this specific amount is because we think that it is the perfect ratio of coffee to milk. If you want to make a larger drink and maintain the ratio of coffee to milk, you can always add more coffee!"
            ),
        ),
        imagePath = R.drawable.iced_latte_home
    ),
    CoffeeRecipe(
        name = "Caffee Con Leche",
        about = "Café con leche isn’t a very common drink on American cafe menus, though it’s similar to a latte. Those who know this Spanish drink love the combination of bold espresso taste, creamy steamed milk, and distinctive foam topping. This light brown froth, made by whipping sugar and espresso, is called espuma.\nCafé con leche, which means “coffee with milk” in Spanish, is a traditional Spanish and Cuban style coffee. Follow along with us as we make the perfect café con leche at home, and teach you to do the same!",
        ingredients = listOf(
            "Filtered water",
            "Finely-ground Cuban coffee",
            "10-12 ounces of milk",
            "2 tablespoons sugar (to taste)"
        ),
        equipment = listOf(
            "Moka pot or espresso machine",
            "Spoon and whisk",
            "A heating element for the milk; steamer, microwave, stovetop",
            "Creamer or small bowl",
        ),
        steps = listOf(
            StepRecipe(
                nameStep = "1. Prepare the espresso.",
                contentStep = "Time to start making café con leche at home! We’re using a Moka pot, but if you’re using a different method, prepare your espresso as usual.\nFill the bottom compartment with water and add coffee grounds to the filter basket. Screw the top compartment on and place the Moka pot on the stove. Use medium heat to avoid scorching your coffee."
            ),
            StepRecipe(
                nameStep = "2. Heat the milk.",
                contentStep = "Heat the milk using a milk steamer, stovetop, or microwave. You don’t need to froth the milk; it just needs to be hot. Make sure not to boil the milk."
            ),
            StepRecipe(
                nameStep = "3. Add the espresso & milk to your coffee cup.",
                contentStep = "Pull or pour your espresso shots into your coffee mug. Add the hot milk and stir well. You’ll want a ratio of about 2/3 milk and 1/3 espresso."
            ),
            StepRecipe(
                nameStep = "4. Make the espuma.",
                contentStep = "This step is optional, but it’s a fun addition! This sugary foam, called espuma, is traditional in Cuban café con leche but is less common in other countries.\nPour 2 tablespoons of sugar into a small bowl or creamer. Add an equal amount of espresso and whisk vigorously. You want the sugar to dissolve and the mixture to form a light brown froth. Pour this mixture on top of your café con leche and enjoy your tasty treat!"
            ),
        ),
        imagePath = R.drawable.iced_latte_home
    ),
    CoffeeRecipe(
        name = "Café Bustelo Like a Pro",
        about = "If you’re a fan of espresso but don’t own an espresso maker or machine, we’re here to help! Using a simple drip coffee machine, you can quickly brew a concentrated cup of Café Bustelo espresso. This dark Cuban coffee comes finely-ground and ready to brew.\nIn this guide, we’ll show you how to make Café Bustelo in your drip coffee maker. This method is easy, inexpensive, and, best of all, delicious!",
        ingredients = listOf(
            "Café Bustelo ground coffee",
            "Cold filtered water",
        ),
        equipment = listOf(
            "Drip coffee maker",
            "Basket Coffee Filter (#4)",
        ),
        steps = listOf(
            StepRecipe(
                nameStep = "1. Add water to your coffee machine.",
                contentStep = "Add cold water to the water reservoir in the back of the machine. Café Bustelo recommends that you add six ounces of cold water for every tablespoon of coffee."
            ),
            StepRecipe(
                nameStep = "2. Set up the filter and coffee.",
                contentStep = "Put a #4 basket-shaped filter into the filter basket. Then add one tablespoon of coffee, making sure to spread the grounds evenly. If you’re making more espresso or want it to be stronger, add more coffee to taste."
            ),
            StepRecipe(
                nameStep = "3. Start brewing.",
                contentStep = "Turn your machine on and let it brew. This may take up to 10 minutes, depending on your coffee maker."
            ),
            StepRecipe(
                nameStep = "4. Serve and enjoy!",
                contentStep = "Pour your espresso into small cups or demitasses. Espresso is often drunk black, but you can add sugar or cream if you prefer. If you want to get creative, try making a homemade creamer or coffee syrup! For the most authentic experience, enjoy your Café Bustelo espresso on your deck or patio with a few friends. This is a social coffee drink!"
            ),
        ),
        imagePath = R.drawable.cafe_bustelo_like_pro
    ),
    CoffeeRecipe(
        name = "Matcha Latte",
        about =  "If you’re not familiar with matcha lattes, this delightful drink is a Japanese-inspired latte with a base of matcha tea and lightly sweetened milk. While it may look like plain green tea, matcha is a finely ground powder of specially grown and harvested leaves of the Camellia sinensis plant native to Asia. It’s a popular choice for tea lovers and has many health benefits, too.\nThough this latte is traditionally prepared using special Japanese tea sets, using the items you have handy will work just as well. Here, we’ll show you how to easily make it at home. Gather the below ingredients and let’s get started!",
        ingredients = listOf(
            "1 1/2 teaspoons matcha powder",
            "1 tablespoon hot water",
            "3/4 cup hot milk",
            "Honey or sweetener to taste"
        ),
        equipment = listOf(
            "Small whisk",
            "Coffee cup",
        ),
        steps = listOf(
            StepRecipe(
                nameStep = "1. Heat the water.",
                contentStep = "The first step to making a matcha latte at home is to heat the water in a kettle on the stovetop or in the microwave for about 2 minutes. It needs to be hot, but not boiling."
            ),
            StepRecipe(
                nameStep = "2. Mix the matcha powder with the hot water.",
                contentStep = "In a coffee cup, whisk together the hot water and matcha powder."
            ),
            StepRecipe(
                nameStep = "3. Heat the milk.",
                contentStep = "Using a milk steamer, stovetop pan, or microwave-safe jar, heat the milk until it’s hot but not boiling."
            ),
            StepRecipe(
                nameStep = "4. Combine.",
                contentStep = "Pour the hot milk into the matcha mixture and stir thoroughly."
            ),
            StepRecipe(
                nameStep = "5. If desired, sweeten to taste.",
                contentStep = "Add a spoonful of honey, sugar, or your favorite alternative sweetener to the cup. Stir and enjoy!\nIf you delight in the flavor of matcha, you may have found a healthy and straightforward ritual to liven up any time of your day. Changing up the recipe to your liking allows you to make it as indulgent or as clean as you like it."
            ),
        ),
        imagePath = R.drawable.mocha_at_home
    ),
    CoffeeRecipe(
        name = "Chai Tea Latte",
        about = "It’s easy to leave lattes and cappuccinos in the hands of the experts, but they’re surprisingly easy to make at home. While we love a good coffee shop and appreciate our favorite baristas, sometimes you just want to do things yourself. With a few grocery store ingredients and basic kitchen equipment, you can amaze your tastebuds — and your friends.\nToday, we are going to teach you how to make a chai tea latte. This is a simple drink, consisting of just chai tea and hot milk. Before we go any further, let’s learn more about chai.",
        ingredients = listOf(
            "4 oz. chai tea",
            "4 oz. milk",
            "Sugar (to taste)",
            "1 shot of espresso (optional)"
        ),
        equipment = listOf(
            "Small saucepan",
            "A cup",
            "A whisk or small jar (optional)",
        ),
        steps = listOf(
            StepRecipe(
                nameStep = "1. Make or heat the chai.",
                contentStep = "If you’re using tea leaves, heat water and steep the chai. If you’re using a concentrate, heat it over low to medium heat in a small saucepan. You’ll want your chai to be around the same temperature as the milk, so we recommend 160-170 degrees Fahrenheit. Once the chai is ready, add sugar to taste."
            ),
            StepRecipe(
                nameStep = "2. Heat the milk.",
                contentStep = "Over low to medium heat in the same small saucepan, heat the milk. You’ll want to heat it to around 160-170 degrees, well below boiling. You can go even cooler if you like. The lower the temperature, the softer the drink will feel."
            ),
            StepRecipe(
                nameStep = "3. Froth the milk (optional).",
                contentStep = "Pour the milk into a different container to whisk it to create froth. You can do this by placing the whisk in between your hands and rolling it back and forth as if you were starting a fire."
            ),
            StepRecipe(
                nameStep = "4. Combine.",
                contentStep = "Pour the milk, chai, and espresso shots into a cup. If you want to go over the top, sprinkle on some cinnamon to give it that cafe look and feel."
            ),
        ),
        imagePath = R.drawable.chai_tea_latte
    ),
    CoffeeRecipe(
        name = "Arabic Coffee",
        about = "One of the fun aspects of trying different coffees is learning about different cultures of the world. In many cultures, drinking coffee is a traditional social activity, and Arabic coffee is no different. This coffee is prepared by boiling it on the stovetop in a small pot called a briki. When ready, it’s transferred to an ornate coffee pot called a dallah for serving. Although there are many versions, Arabic coffee is typically served strong and unsweetened, flavored only by cardamom.\nInstead of having a well-defined recipe with exact measurements, this way of making coffee is passed down through Arabic families as taught by the matriarch or patriarch. Using a “heaping spoonful” to measure coffee and the serving cup to measure water is a common way to begin. Below, we will walk you through how to make traditional Arabic coffee at home.",
        ingredients = listOf(
            "2 tablespoons of finely-ground coffee",
            "1 tablespoon of ground cardamom",
            "1/4 cup of water",
            "Sugar (to taste)"
        ),
        equipment = listOf(
            "Small pot or Turkish briki",
            "Small coffee cup or demitasse",
            "Strainer (optional)",
            "Coffee and spice grinder (optional)",
        ),
        steps = listOf(            StepRecipe(
                nameStep = "1. Set up the briki coffee pot.",
                contentStep = "The first step in preparing Arabic coffee is to set up the coffee pot. Pour water and sugar (if desired) into pan or briki. Over medium heat, bring to a boil."
            ),
            StepRecipe(
                nameStep = "2. Add coffee and cardamom.",
                contentStep = "Once your water boils, carefully add the ground coffee and cardamom."
            ),
            StepRecipe(
                nameStep = "3. Return to a boil.",
                contentStep = "Stay close, as this happens quickly. When the mixture foams, briefly lift it off the heat, allowing the foam to subside."
            ),
            StepRecipe(
                nameStep = "4. Repeat.",
                contentStep = "Return the briki to the heat and allow the mixture to foam again. Then remove it, letting the foam settle. Do this at least twice to achieve the right foam texture."
            ),
            StepRecipe(
                nameStep = "5. Serve and enjoy.",
                contentStep = "Your Arabic coffee is now ready to drink! Carefully pour it into small cups or a serving carafe. Use a strainer if desired."
            ),
        ),
        imagePath = R.drawable.arabic_coffee
    ),
)