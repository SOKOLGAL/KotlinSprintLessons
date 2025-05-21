package org.example.lesson_17

fun main() {

    val ship = Ship()

    println(ship.name)
    ship.name = "Восточный берег"
    println(ship.name)

}

class Ship() {
    private var changeName: Boolean = false
    var name = "Победа"
        set(value) {
            println("Предупреждение! Имя корабля менять нельзя!")
        }
    val averageSpeed = 50
    val homePort = "Кронштад"
}