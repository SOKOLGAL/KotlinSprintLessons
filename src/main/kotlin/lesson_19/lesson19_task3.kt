package org.example.lesson_19

fun main() {

    val spaceShip = SpaceShip("Другая галактика")
    spaceShip.landing()

}

class SpaceShip(
    val name: String,
    val takeOff: Boolean = true,
    val land: Boolean = true,
    val shootFromAsteroid: Boolean = true,
) {

    fun takingOff() {
// TODO здесь нужна информация о дополнительной логике
    }

    fun landing() {
        when (false) {
            false -> TODO()
            true -> TODO()
        }
    }

    fun shootingFromAsteroid() {}
}