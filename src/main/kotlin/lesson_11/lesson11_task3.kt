package org.example.lesson_11

fun main() {

    val user1: Room = Room(
        nickname = "",
    )

    user1.addUser()

    user1.statusUpdate()

}

class Room(
    val cover: String = "Картинка",
    val roomName: String = "Комната просто поболтать",
    var nickname: String,
    var avatar: String = "Ава",
    var listOfParticipants: List<String> = listOf("Kate", "Volga", "Nico"),
    var textBadge: List<String> = listOf("разговаривает", "микрофон выключен", "пользователь заглушен"),
) {

    fun addUser() {
        println("Для участия в $roomName заполните след данные:")

        println("Введите ваше имя:")
        nickname = readln()

        println("Список участников комнаты: $listOfParticipants")

        println("Добавьте аватар:")
        avatar = readln()

        println("Выберете статус:")
        textBadge = listOf(readln())

        println("Получены следующие данные:")
        println(cover)
        println(roomName)
        println(nickname)
        println(avatar)
        println(listOfParticipants)
        println(textBadge)

    }

    fun statusUpdate() {
        println("Для изменения статуса введите имя:")
        nickname = readln()
        println("Изменить статус:")
        textBadge = listOf(readln())
        println("Статус изменён")
    }

}