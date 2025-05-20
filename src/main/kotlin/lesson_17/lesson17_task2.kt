package org.example.lesson_17

fun main() {

    val ship = Ship(
        name = "Победа",
        averageSpeed = 50,
        homePort = "Кронштад"
    )

    println(ship.name)
    ship.name = "Восточный берег"
    println(ship.name)

}

class Ship(
    var name: String,
    val averageSpeed: Int,
    val homePort: String,
) {
    var nameShip: String = name
        get() {
            if (field != name) {
                println("Предупреждение! Имя корабля менять нельзя!")
                return field
            } else return field
        }
}