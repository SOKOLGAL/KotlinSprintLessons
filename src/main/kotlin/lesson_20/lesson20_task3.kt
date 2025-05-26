package org.example.lesson_20

fun main() {

    val player = Player("Вулкан")

    val openDoor: (Player) -> String

    openDoor = {
        when (player.presenceOfKey) {
            true -> println("Игрок открыл дверь").toString()
            false -> println("Дверь закрыта").toString()
        }
    }

    openDoor(player)

}

class Player(
    val name: String,
    val presenceOfKey: Boolean = true,
) {
}