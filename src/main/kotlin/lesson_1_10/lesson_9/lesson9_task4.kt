package org.example.lesson1_10.lesson_9

fun main() {

    println("Введите 5 названий ингредиентов блюда в одной строке, разделяя их запятыми (с пробелом):")

    val fiveNamesOfIngredients = readln()
    val listIngredients = fiveNamesOfIngredients.split(", ")
    val newList: Any = listIngredients.sorted()

    println("Список ингредиентов: $newList")

}