package org.example.lesson_18

fun main() {

    val dice = Dice()
    val fourSidesDice = FourSidesDice()
    val sixSidesDice = SixSidesDice()
    val eightSidesDice = EightSidesDice()

    val list = arrayOf<Dice>(fourSidesDice, sixSidesDice, eightSidesDice)

    showAllDiceRolls(list)

}

fun showAllDiceRolls(dice: Array<Dice>) {
    dice.forEach {
        it.diceThrower()
    }
}

open class Dice {
    open fun diceThrower() {}
}

class FourSidesDice(
    val numberOfFaces: Int = 4,
) : Dice() {

    override fun diceThrower() {
        val drop: Int = (1..numberOfFaces).random()
        println("Выпало $drop")
    }
}

class SixSidesDice(
    val numberOfFaces: Int = 6,
) : Dice() {

    override fun diceThrower() {
        val drop: Int = (1..numberOfFaces).random()
        println("Выпало $drop")
    }
}

class EightSidesDice(
    val numberOfFaces: Int = 8,
) : Dice() {

    override fun diceThrower() {
        val drop: Int = (1..numberOfFaces).random()
        println("Выпало $drop")
    }
}