package org.example.lesson_19

fun main() {

    val tank = Tank("Т-90")

    tank.armingCartridges(Cartridges.BLUE)
    tank.armingCartridges(Cartridges.GREEN)
    tank.armingCartridges(Cartridges.RED)
    tank.armingCartridges(Cartridges.GREEN)
    tank.shooting(Cartridges.BLUE)
    tank.shooting(Cartridges.RED)
    tank.shooting(Cartridges.GREEN)

}

enum class Cartridges(val impactForce: Int) {
    BLUE(5),
    GREEN(10),
    RED(20),
}

class Tank(
    val name: String,
    var cartridges: Int = 0,
    var cartridgeTank: Int = 0,
) {

    fun armingCartridges(cartridges: Cartridges): MutableList<Cartridges> {
        val listOfCartridges = mutableListOf(cartridges)
        when (cartridges) {
            Cartridges.BLUE -> listOfCartridges.add(Cartridges.BLUE)
            Cartridges.GREEN -> listOfCartridges.add(Cartridges.GREEN)
            Cartridges.RED -> listOfCartridges.add(Cartridges.RED)
        }
        return listOfCartridges
    }

    fun shooting(cartridges: Cartridges): MutableList<Cartridges> {
        val listOfCartridges = mutableListOf(cartridges)
        when (cartridges) {
            Cartridges.BLUE -> listOfCartridges.remove(Cartridges.BLUE)
            Cartridges.GREEN -> listOfCartridges.remove(Cartridges.GREEN)
            Cartridges.RED -> listOfCartridges.remove(Cartridges.RED)
        }
        when (cartridges) {
            Cartridges.BLUE -> println("Нанесенный урон ${Cartridges.BLUE.impactForce}")
            Cartridges.GREEN -> println("Нанесенный урон ${Cartridges.GREEN.impactForce}")
            Cartridges.RED -> println("Нанесенный урон ${Cartridges.RED.impactForce}")
        }
        return listOfCartridges
    }
}