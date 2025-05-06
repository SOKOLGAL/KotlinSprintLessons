package org.example.lesson_14

fun main() {

    val cargo1 = Cargo("Cargo1", 45, 400000)
    val icebreaker1 = Icebreaker("Icebreaker1", 40, 500)
    val liner1 = Liner("Liner1", 60, 200000, 2500)

    cargo1.outputInfo()
    println()
    icebreaker1.outputInfo()
    println()
    liner1.outputInfo()
}

open class BasicLiner(
    val name: String,
    val speed: Int,
    val loadCapacity: Int,
    val chopIce: Boolean = false,
) {
    fun systemsCheck() {
//        println("Проверка систем завершена")
    }
    open fun outputInfo() {
        println(name)
        println(speed)
        println(loadCapacity)
        println(chopIce)
    }

}

class Cargo(
    name: String,
    speed: Int,
    loadCapacity: Int,
) : BasicLiner(name, speed, loadCapacity) {
}

class Icebreaker(
    name: String,
    speed: Int,
    loadCapacity: Int,
    ) : BasicLiner(name, speed, loadCapacity, chopIce = true) {
}

class Liner(
    name: String,
    speed: Int,
    loadCapacity: Int,
    val capacity: Int,
) : BasicLiner(name, speed, loadCapacity) {
    override fun outputInfo() {
        super.outputInfo()
        println(capacity)
    }
}