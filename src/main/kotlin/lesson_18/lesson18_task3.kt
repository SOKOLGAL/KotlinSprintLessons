package org.example.lesson_18

fun main() {

    val tamagotchi = Tamagotchi()
    val fox = Fox()
    val dog = Dog()
    val cat = Cat()

    val list = arrayOf<Tamagotchi>(fox, dog, cat)

    fun eatingFood() {
        for (i in list) {
            i.eating()
        }
    }

    eatingFood()

}

open class Tamagotchi {
    open fun eating() {}
}

class Fox(
    val name: String = "Лиса",
    val eatFood: String = "ест ягоды",
) : Tamagotchi() {

    override fun eating() {
        println("$name -> $eatFood")
    }
}

class Dog(
    val name: String = "Собака",
    val eatFood: String = "ест кости",
) : Tamagotchi() {

    override fun eating() {
        println("$name -> $eatFood")
    }
}

class Cat(
    val name: String = "Кошка",
    val eatFood: String = "ест рыбу",
) : Tamagotchi() {

    override fun eating() {
        println("$name -> $eatFood")
    }
}