package org.example.lesson_10

fun main() {

    var playerWins = 0

    do {
        val moveComp = getThrowOfDice()
        println("Сейчас ход компьютера, бросаем кости, выпало $moveComp")

        val movePlayer = getThrowOfDice()
        println("Сейчас ход игрока, бросаем кости, выпало $movePlayer")

        when {
            (moveComp > movePlayer) -> println("Победила машина")
            (moveComp < movePlayer) -> {
                println("Победило человечество")
                playerWins++
            }

            else -> println("Победила дружба")
        }
    } while (isContinueConfirmed())


    println("Игра завершена. Выигрышных партий $playerWins")

}

fun getThrowOfDice(): Int = (1..6).random()

fun isContinueConfirmed(): Boolean {

    println("Хотите бросить кости еще раз? Введите да или нет")
    val continuationOfGame = readln()

    return continuationOfGame.lowercase() == "да"
}