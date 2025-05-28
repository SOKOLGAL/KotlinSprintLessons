package org.example.lesson_20

fun main() {

    val listOfString: MutableList<String> = mutableListOf(
        "Джек Воробей", "Гектор Барбаросса",
        "Уилл Тёрнер", "Элизабет Суонн", "Джошими Гиббс"
    )
    val listOfLambda = listOfString.map { name ->
        println("Нажат элемент: $name")
    }

    val filterIndexListOfLambda = listOfLambda.filterIndexed { index, s -> (index % 2 == 0) }

    println(filterIndexListOfLambda)

}