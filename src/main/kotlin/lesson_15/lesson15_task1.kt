package org.example.lesson_15

fun main() {

    val crucian = Crucian("Карась")
    val gull = Gull("Чайка")
    val duck = Duck("Утка")
    crucian.floating()
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

    override fun floating() {
        println("$name плавает")
    }
}

class Gull(
    name: String,
) : Creatures(name) {
    override fun flying() {
        println("$name летает")
    }

    override fun floating() {
        println("$name плавает")
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