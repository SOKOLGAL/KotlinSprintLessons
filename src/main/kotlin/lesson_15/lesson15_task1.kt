package org.example.lesson_15

fun main() {

    val crucian = Crucian("Карась")
    val gull = Gull("Чайка")
    val duck = Duck("Утка")
    crucian.floating()
    gull.flying()
    gull.floating()
    duck.flying()
    duck.floating()

}

abstract class Creatures(
    val name: String,
) : floating {
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
) : Creatures(name), flying {
    override fun flying() {
        println("$name летает")
    }

    override fun floating() {
        println("$name плавает")
    }
}

class Duck(
    name: String,
) : Creatures(name), flying {
    override fun flying() {
        println("$name летает")
    }

    override fun floating() {
        println("$name плавает")
    }
}

interface flying {
    fun flying()
}

interface floating {
    fun floating()
}