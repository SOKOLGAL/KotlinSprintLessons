package org.example.lesson_11

fun main() {

    val member: Room = Room(
        cover = "обложка",
        name = "Piter",
        listOfParticipants = listOf("Kate", "Volga", "Nico"),
        textBadge = listOf("")
    )

}

class Room(
    val cover: String,
    val name: String,
    var listOfParticipants: List<String>,
    val textBadge: List<String> = listOf("разговаривает", "микрофон выключен", "пользователь заглушен"),
) {

    fun addMember(name: String): List<String> {
        listOfParticipants = listOf(readln())
    return participants
    }

    fun statusUpdate() {

    }

}