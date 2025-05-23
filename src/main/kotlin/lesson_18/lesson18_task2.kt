package org.example.lesson_18

fun main() {

    val sidesDice1 = SidesDice(
        4
    )
    val sidesDice2 = SidesDice(
        6
    )
    val sidesDice3 = SidesDice(
        8
    )

    val list = arrayOf<Dice>(sidesDice1, sidesDice2, sidesDice3)

    showAllDiceRolls(list)

}

fun showAllDiceRolls(dice: Array<Dice>) {
    dice.forEach {
        it.diceThrower()
    }
}

abstract class Dice {
    abstract fun diceThrower()
}

class SidesDice(
    val numberOfFaces: Int,
) : Dice() {

    override fun diceThrower() {
        val drop: Int = (1..numberOfFaces).random()
        println("Выпало $drop")
    }
}