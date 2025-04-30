package org.example.lesson_11

fun main() {

    val user1: Room = Room(
    )
    println("Введите ваше имя:")
    println("Выберете статус:")
    user1.addUser(
        nickname = readln(),
        textBadge = readln()
    )

    println("Для изменения статуса введите имя и новый статус:")
    user1.statusUpdate(
        nickname = readln(),
        textBadge = readln()
    )

    println("Статус изменён")

}

class Room(
    val cover: String = "Картинка",
    val roomName: String = "Комната просто поболтать",
    val listOfParticipants: String = "",
) {

    fun addUser(nickname: String, textBadge: String): String {
        return nickname; textBadge
    }

    fun statusUpdate(nickname: String, textBadge: String): String {
        return textBadge
    }
}

class Participant(
    var id: Int,
    val avatar: String = "Ава",
    var nickname: String,
    var textBadge: String = "микрофон выключен",
) {
}