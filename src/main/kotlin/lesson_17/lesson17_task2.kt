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
        get() {
            if (changeName == false) {
                println("Предупреждение! Имя корабля менять нельзя!")
                return field
            }
            return field
        }
    val averageSpeed = 50
    val homePort = "Кронштад"
}