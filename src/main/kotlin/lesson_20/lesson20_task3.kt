package org.example.lesson_20

fun main() {

    val player = Player("Вулкан")

    val openDoor: (Player) -> String

    openDoor = {
        when (player.presenceOfKey) {
            true -> "Игрок открыл дверь"
            false -> "Дверь закрыта"
        }
    }

    println(openDoor(player))

}

class Player(
    val name: String,
    val presenceOfKey: Boolean = true,
) {
}