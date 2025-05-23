package org.example.lesson_19

import org.example.lesson_19.Aquarium.*

fun main() {

    println("Вы можете добавить в свой аквариум рыб:")

    val typesOfFish = listOf(GUPPY, ANGELFISH, GOLDFISH, SIAMESE_FIGHTING_FISH)

    for (i in typesOfFish) {
        when (i) {
            GUPPY -> getNameFish(
                aquarium = GUPPY
            )
            ANGELFISH -> getNameFish(
                aquarium = ANGELFISH
            )
            GOLDFISH -> getNameFish(
                aquarium = GOLDFISH
            )
            SIAMESE_FIGHTING_FISH -> getNameFish(
                aquarium = SIAMESE_FIGHTING_FISH
            )
        }
    }

}

enum class Aquarium {
    GUPPY,
    ANGELFISH,
    GOLDFISH,
    SIAMESE_FIGHTING_FISH,
}

fun getNameFish(aquarium: Aquarium) {
    when (aquarium) {
        GUPPY -> println("Гуппи")
        ANGELFISH -> println("Скалярия")
        GOLDFISH -> println("Золотая рыбка")
        SIAMESE_FIGHTING_FISH -> println("Петушок")
    }
}