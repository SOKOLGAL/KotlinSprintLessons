package org.example.lesson_14

fun main() {

    val chat = Chat()

    println("Для начала обсуждения введите ваше имя и сообщение:")
    chat.addMessage(
        authorOfMessage = readln(),
        message = readln()
    )

    println("Для продолжения обсуждения введите ваше сообщение:")
    chat.addThreadMessage(
        parentMessageId = chat.parentMessageId,
        messageChild = readln()
    )
    println("Для продолжения обсуждения введите ваше сообщение:")
    chat.addThreadMessage(
        parentMessageId = chat.parentMessageId,
        messageChild = readln()
    )

    println("Для продолжения обсуждения введите ваше сообщение:")
    chat.addThreadMessage(
        parentMessageId = chat.parentMessageId,
        messageChild = readln()
    )

    chat.printChat()

}

open class Chat() {
    var id = 0
    var parentMessageId = 0
    val chatMessage: MutableList<Chat> = mutableListOf()
    val chatChildMessage: MutableList<Chat> = mutableListOf()
    var idChild = chatChildMessage.size + 1

    fun addMessage(authorOfMessage: String, message: String) {
        id++
        parentMessageId++
        chatMessage.add(id)
        chatMessage.add(authorOfMessage)
        chatMessage.add(message)
    }

    fun addThreadMessage(parentMessageId: Int, messageChild: String) {
        idChild++
        chatChildMessage.add(idChild)
        chatChildMessage.add(parentMessageId)
        chatChildMessage.add(messageChild)
    }

    fun printChat() {
        println("${chatMessage.groupBy { id }} \n ${chatChildMessage.groupBy { idChild }}")
    }
}

open class Message(
    val id: Int = 0,
    var authorOfMessage: String,
) {
}

class ChildMessage(
    id: Int = 0,
    authorOfMessage: String,
) : Message(id, authorOfMessage) {
    val parentMessageId: Int = 0
}