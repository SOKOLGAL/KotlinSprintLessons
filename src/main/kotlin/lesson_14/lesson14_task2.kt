package org.example.lesson_14

fun main() {
    val cargo1 = CargoShip("Cargo1", 45, 400000, "активирует погрузочный кран")
    val icebreaker1 = IcebreakerShip("Icebreaker1", 40, 500, "открывает ворота со стороны кармы")
    val liner1 = LinerShip("Liner1", 60, 200000, "выдвигает горизонтальный трап со шкафута", 2500)

    cargo1.outputInfo()
    println()
    icebreaker1.outputInfo()
    println()
    liner1.outputInfo()

}

open class BasicShip(
    val name: String,
    val speed: Int,
    val loadCapacity: Int,
    val loadingMethod: String,
    val chopIce: Boolean = false,
) {
    open fun outputInfo() {
        println(name)
        println(speed)
        println(loadCapacity)
        println(loadingMethod)
        println(chopIce)
    }
}

class CargoShip(
    name: String,
    speed: Int,
    loadCapacity: Int,
    loadingMethod: String,
) : BasicShip(name, speed, loadCapacity, loadingMethod) {
    fun methodOfLoading() {
        println("Для погрузки $name активирует погрузочный кран")
    }
}

class IcebreakerShip(
    name: String,
    speed: Int,
    loadCapacity: Int,
    loadingMethod: String,
) : BasicShip(name, speed, loadCapacity, loadingMethod, chopIce = true) {

}

class LinerShip(
    name: String,
    speed: Int,
    loadCapacity: Int,
    loadingMethod: String,
    val capacity: Int,
) : BasicShip(name, speed, loadCapacity, loadingMethod) {
    override fun outputInfo() {
        super.outputInfo()
        println(capacity)
    }
}