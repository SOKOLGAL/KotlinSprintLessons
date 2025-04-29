package org.example.lesson_11

fun main() {

}

class RecipeCategories(
    val id: Int,
    val categoryName: String,
    val descriptionCategory: String,
    val photoCategory: Unit,
    val categoryInFavorites: Boolean = false,
) {

}

class Recipe(
    val id: Int,
    val categoryName: String,
    val methodOfPreparation: String,
    val photoRecipe: Unit,
    val recipeInFavorites: Boolean = false,
) {

}

class Ingredients(
    val id: Int,
    val ingredientName: String,
    val photoIngredient: Unit,
    val appearInRecipes: String,
    val quantity: Int,
    val numberOfServings: Int,
    val ingredientNameInFavorites: Boolean = false,
) {

}