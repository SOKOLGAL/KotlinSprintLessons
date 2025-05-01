package org.example.lesson_11

fun main() {

}

class RecipeCategories(
    val id: Int,
    val listOfRecipe: List<Recipe> = listOf(),
    val categoryName: String,
    val descriptionCategory: String,
    val recipe: Recipe,
    val photoCategory: Unit,
    val categoryInFavorites: Boolean = false,
) {
}

class Recipe(
    val id: Int,
    val categoryName: String,
    val methodOfPreparation: List<String> = listOf("", "", ""),
    val photoRecipe: Unit,
    val ingredient: Ingredient,
    val listOfIngredients: List<Ingredient> = listOf(),
    val recipeInFavorites: Boolean = false,
) {
}

class Ingredient(
    val id: Int,
    val ingredientName: String,
    val photoIngredient: Unit,
    val appearInRecipes: String,
    val quantity: Int,
    val numberOfServings: Int,
    val ingredientNameInFavorites: Boolean = false,
) {
}