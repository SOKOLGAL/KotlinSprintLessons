package org.example.lesson_17

fun main() {

    val ship = Ship(
        name = "Победа"
    )

    println(ship.name)
    ship.newName = "Восточный берег"
    println(ship.name)

}

class Ship(
    val name: String,
) {
    private val changeName: Boolean = false

    var newName = name
        set(value) {
            println("Предупреждение! Имя корабля менять нельзя!")
        }
    val averageSpeed = 50
    val homePort = "Кронштад"
}