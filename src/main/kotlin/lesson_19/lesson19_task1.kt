package org.example.lesson_19

fun main() {

    println("Вы можете добавить в свой аквариум рыб:")
    for (i in Aquarium.values()) {
        i.getNameFish()
    }
    println(Aquarium.entries)

}

enum class Aquarium(var nameFish: String) {
    GUPPY("Гуппи"),
    ANGELFISH("Скалярия"),
    GOLDFISH("Золотая рыбка"),
    SIAMESE_FIGHTING_FISH("Петушок");
    fun getNameFish() {
        when (this) {
            GUPPY -> println("Гуппи")
            ANGELFISH -> println("Скалярия")
            GOLDFISH -> println("Золотая рыбка")
            SIAMESE_FIGHTING_FISH -> println("Петушок")
        }
    }
}