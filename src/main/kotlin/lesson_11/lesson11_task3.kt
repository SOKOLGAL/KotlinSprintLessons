package org.example.lesson_11

fun main() {

    val user1: Room = Room ()

    user1.addUser()

    user1.statusUpdate()

    Participant()


}

class Room(
    val cover: String = "Картинка",
    val roomName: String = "Комната просто поболтать",
    val listOfParticipants: List<String> = listOf(""),
) {

    fun addUser(avatar: String, nickname: String, textBadge: String) {

        println("Для участия в $roomName заполните след данные:")

        println("Список участников комнаты: $listOfParticipants")

        println("Получены следующие данные:")
        println(cover)
        println(roomName)
        println(listOfParticipants)
        println(avatar)
        println(nickname)
        println(textBadge)

    }

    fun statusUpdate(nickname: String, textBadge: String) {
        println("Для изменения статуса введите имя:")
        readln()
        println("Изменить статус:")
        listOf(readln())
        println("Статус изменён")
    }

}

class Participant(
    val avatar: String = "Ава",
    var nickname: String,
    var textBadge: List<String> = listOf("разговаривает", "микрофон выключен", "пользователь заглушен"),
) {
    println("Введите ваше имя:")
    nickname = readln()

    println("Добавьте аватар:")
    avatar = readln()

    println("Выберете статус:")
    textBadge = listOf(readln())

}