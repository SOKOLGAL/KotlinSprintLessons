package org.example.lesson_20

fun main() {

    val playerGame = PlayerGame("Вулкан")

    val openDoor: (PlayerGame) -> String

    openDoor = {
        when (playerGame.presenceOfKey) {
            true -> "Игрок открыл дверь"
            false -> "Дверь закрыта"
        }
    }

    println(openDoor(playerGame))

}

class PlayerGame(
    val name: String,
    val presenceOfKey: Boolean = true,
) {
}