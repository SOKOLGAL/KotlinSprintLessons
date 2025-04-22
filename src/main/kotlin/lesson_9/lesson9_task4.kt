package org.example.lesson_9

fun main() {

    println("Введите 5 названий ингредиентов блюда в одной строке, разделяя их запятыми (с пробелом):")
    val fiveNamesOfIngredients = readln()
    val listIngredients = fiveNamesOfIngredients.toMutableList()
    val newList: Any = listIngredients.sorted()

// мука, яйца, сахар, яблоки, ваниль

    println("Список ингредиентов: $newList")

}