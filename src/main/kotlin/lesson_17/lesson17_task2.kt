package org.example.lesson_17

fun main() {

    val ship = Ship()
    println("Название корабля: ${ship.name}")
    ship.name = "Восточный берег"
    println("Название корабля: ${ship.name}")

}

class Ship(
) {
    var name: String = "Победа"
        get() = field
        set(value: String) {
            field != value
            println("Предупреждение! Имя корабля менять нельзя!")
        }
    val averageSpeed = 50
    val homePort: String = "Кронштад"

}