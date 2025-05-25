package org.example.lesson_19

fun main() {

    val tank = Tank("Т-90")
    tank.armingWithBlueCartridges()
    tank.armingWithRedCartridges()
    tank.armingWithGreenCartridges()
    println(Cartridges.BLUE.impactForce)
    Cartridges.GREEN.impactForce
    Cartridges.RED.impactForce

}

enum class Cartridges(val impactForce: Int) {
    BLUE(5) {
        override fun shotCartridges(): String {
            return "Стрельба Синими патронами"
        }
    },
    GREEN(10) {
        override fun shotCartridges(): String {
            return "Стрельба Зелёными патронами"
        }
    },
    RED(20) {
        override fun shotCartridges(): String {
            return "Стрельба Красными патронами"
        }
    };

    abstract fun shotCartridges(): String

}


class Tank(
    val name: String,
    var cartridges: Int = 0,
) {

    fun armingWithBlueCartridges() {
        armament(
            cartridges = Cartridges.BLUE
        )
    }

    fun armingWithGreenCartridges() {
        armament(
            cartridges = Cartridges.GREEN
        )
    }

    fun armingWithRedCartridges() {
        armament(
            cartridges = Cartridges.RED
        )
    }

//    fun shot() {
//        when (cartridges) {
//            Cartridges.BLUE -> cartridges = Cartridges.BLUE.impactForce
//            Cartridges.GREEN -> cartridges = Cartridges.GREEN.impactForce
//            Cartridges.RED -> cartridges = Cartridges.RED.impactForce
//        }
//    }
}

fun armament(cartridges: Cartridges) {
    when (cartridges) {
        Cartridges.BLUE -> println("Танк вооружен синими патронами")
        Cartridges.GREEN -> println("Танк вооружен зелёными патронами")
        Cartridges.RED -> println("Танк вооружен красными патронами")
    }
}