package org.example.lesson_19

fun main() {

    val tank = Tank("Т-90")

    tank.armingWithBlueCartridges()
    tank.armingWithGreenCartridges()
    tank.armingWithRedCartridges()
    tank.shotBLUE()
    tank.shotRED()
    tank.shotGREEN()

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

    fun armingWithBlueCartridges() {
        cartridgeTank = cartridges + Cartridges.BLUE.impactForce
    }

    fun armingWithGreenCartridges() {
        cartridgeTank = cartridges + Cartridges.GREEN.impactForce
    }

    fun armingWithRedCartridges() {
        cartridgeTank = cartridges + Cartridges.RED.impactForce
    }

    fun shotBLUE() {
//        val damage = cartridgeTank - Cartridges.BLUE.impactForce
        println("Нанесенный урон ${Cartridges.BLUE.impactForce}")
    }

    fun shotGREEN() {
//        val damage = cartridgeTank - Cartridges.GREEN.impactForce
        println("Нанесенный урон ${Cartridges.GREEN.impactForce}")
    }

    fun shotRED() {
//        val damage = cartridgeTank - Cartridges.RED.impactForce
        println("Нанесенный урон ${Cartridges.RED.impactForce}")
    }
}