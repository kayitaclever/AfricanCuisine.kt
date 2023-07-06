
import java.time.Duration
open class AfricanCuisine(val originOfCuisine: String, val nameOfCuisine: String) {
    val ingredients = mutableMapOf<String, String>()
    var preparationTime = 0
    open fun describeCuisine(): String {
        return "$nameOfCuisine is mostly prepared in $originOfCuisine"
    }
}
open class MoroccanRecipe(originOfCuisine: String, nameOfCuisine: String) : AfricanCuisine(originOfCuisine, nameOfCuisine) {
    override fun describeCuisine(): String {
        return super.describeCuisine()
    }
    open fun preparationOfCuisine(ingredient: String, quantity: String): String {
        if (ingredient in ingredients.keys && quantity in ingredients.values) {
            ingredients[ingredient] = quantity
        } else {
            ingredients[ingredient] = quantity

        }
        return  "$nameOfCuisine is prepared using the following ingredients: $ingredients"
     }
    open fun timeOfPreparation(timeTaken: Int): String {
        val totalTime = preparationTime + timeTaken
        val convert = Duration.ofSeconds(totalTime.toLong()).toString()
        return "$nameOfCuisine from $originOfCuisine, which is prepared using $ingredients, takes $convert to prepare"
    }
}
class EthiopianRecipe(originOfCuisine: String, nameOfCuisine: String) : MoroccanRecipe(originOfCuisine, nameOfCuisine) {
    override fun describeCuisine(): String {
        return super.describeCuisine()
    }
    override fun preparationOfCuisine(ingredient: String, quantity: String): String {
        return super.preparationOfCuisine(ingredient, quantity)
    }
    override fun timeOfPreparation(timeTaken: Int): String {
        return super.timeOfPreparation(timeTaken)
    }
}
class NigerianRecipe(originOfCuisine: String, nameOfCuisine: String) : MoroccanRecipe(originOfCuisine, nameOfCuisine) {
    override fun describeCuisine(): String {
        return super.describeCuisine()
    }
    override fun preparationOfCuisine(ingredient: String, quantity: String): String {
        return super.preparationOfCuisine(ingredient, quantity)
    }
    override fun timeOfPreparation(timeTaken: Int): String {
        return super.timeOfPreparation(timeTaken)
    }
}
fun main() {
    val africanCuisine = AfricanCuisine("Kenya", "chafua")
    println(africanCuisine.describeCuisine())
    val moroccanRecipe = MoroccanRecipe("morocco", "Harira")
    println(moroccanRecipe.describeCuisine())
    println(moroccanRecipe.preparationOfCuisine("tomatoes", "0.5kgs"))
    println(moroccanRecipe.preparationOfCuisine("lentilas", "10gs"))
    println(moroccanRecipe.preparationOfCuisine("lentils", "0.5gs"))
    println(moroccanRecipe.timeOfPreparation(4500))
    val ethiopianRecipe = EthiopianRecipe("ethiopia", "Injera")
    println(ethiopianRecipe.describeCuisine())
    ethiopianRecipe.preparationOfCuisine("teff flour", "3kgs")
    println(ethiopianRecipe.preparationOfCuisine("ghee", "0.5gs"))
    val nigerianRecipe = NigerianRecipe("Nigeria", "fufu")
    nigerianRecipe.describeCuisine()
    nigerianRecipe.preparationOfCuisine("cassava", "2 cups")
    println(nigerianRecipe.preparationOfCuisine("olive oil", "1 teaspoon"))
    println(nigerianRecipe.timeOfPreparation(2000))
}






