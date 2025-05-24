package org.example.lesson_19

import org.example.lesson_19.Aquarium.*

fun main() {

    println("Вы можете добавить в свой аквариум рыб:")

    val typesOfFish = listOf(GUPPY, ANGELFISH, GOLDFISH, SIAMESE_FIGHTING_FISH)

    for (i in typesOfFish) {
        when (i) {
            GUPPY -> GUPPY.getNameFish()
            ANGELFISH -> ANGELFISH.getNameFish()
            GOLDFISH -> GOLDFISH.getNameFish()
            SIAMESE_FIGHTING_FISH -> SIAMESE_FIGHTING_FISH.getNameFish()
        }
    }

}

enum class Aquarium {
    GUPPY,
    ANGELFISH,
    GOLDFISH,
    SIAMESE_FIGHTING_FISH;

    fun getNameFish() {
        when (this) {
            GUPPY -> println("Гуппи")
            ANGELFISH -> println("Скалярия")
            GOLDFISH -> println("Золотая рыбка")
            SIAMESE_FIGHTING_FISH -> println("Петушок")
        }
    }
}