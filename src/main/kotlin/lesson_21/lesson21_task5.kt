package org.example.lesson_21

fun main() {

    val experiencePoints = mapOf(
        "Скорость бега" to 50,
        "Высота прыжка" to 100,
        "Бой" to 120,
        "Магия" to 150,
        "Выживание" to 150,
        "Увеличение силы" to 75
    )

    println(experiencePoints.maxCategory())

}

fun Map<String, Int>.maxCategory(): String {
    return this.maxBy { it.value }.key
}