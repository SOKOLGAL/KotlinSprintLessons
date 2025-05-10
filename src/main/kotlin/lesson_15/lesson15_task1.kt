package org.example.lesson_15

fun main() {

    val crucian = Crucian("Карась")
    val gull = Gull("Чайка")
    val duck = Duck("Утка")
    crucian.floating()
    crucian.flying()
    gull.floating()
    gull.flying()
    duck.floating()
    duck.flying()

}

abstract class Creatures(
    val name: String,
) : MethodsOfTransportation {

}

class Crucian(
    name: String,
) : Creatures(name) {
    override fun flying() {
        println("$name плавает")
    }

    override fun floating() {
        println("$name не летает")
    }
}

class Gull(
    name: String,
) : Creatures(name) {
    override fun flying() {
        println("$name летает")
    }

    override fun floating() {
        println("$name умеет плавать")
    }
}

class Duck(
    name: String,
) : Creatures(name) {
    override fun flying() {
        println("$name летает")
    }

    override fun floating() {
        println("$name плавает")
    }
}

interface MethodsOfTransportation {
    fun flying()
    fun floating()
}