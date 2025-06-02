package org.example.lesson_21

fun main() {

    val character = Character("Ivolga")
    character.runningSpeed()
    character.jumpingHeight()
    character.increasingStrength()
    character.maxCategory()

}

class Character(
    val name: String,
    var experiment: Int = 0,
    val key: String = "",
    val value: Int = 0,
) : Skills {

    val listOfSkills = mutableListOf()

    override fun runningSpeed() {
        val key = "Скорость бега"
        val value = 100
    }

    override fun jumpingHeight() {
        val key = "Высота прыжка"
        val value = 75
    }

    override fun increasingStrength() {
        val key = "Увеличение силы"
        val value = 150
    }
}

interface Skills : Map<String, Int> {
    fun runningSpeed()
    fun jumpingHeight()
    fun increasingStrength()
}

fun Character.maxCategory(): String {

    return key
}