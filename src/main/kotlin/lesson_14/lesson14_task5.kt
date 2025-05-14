package org.example.lesson_14

fun main() {

    val chat = Chat()

    println("Для начала обсуждения введите ваше имя:")
    val message1 = Message(
        authorOfMessage = readln(),
    )

    println("${message1.authorOfMessage} введите сообщение:")
    message1.message = readln()
    chat.addMessage(
        authorOfMessage = message1.authorOfMessage,
        message = message1.message
    )

    println("Для продолжения обсуждения ${message1.message} введите ваше имя:")
    val messageChild1 = ChildMessage(
        authorOfMessage = readln(),
    )

    println(
        "${messageChild1.authorOfMessage} введите сообщение " +
                "для продолжения обсуждения ${message1.message}:"
    )
    messageChild1.messageChild = readln()
    chat.addThreadMessage(
        messageChild = messageChild1.messageChild
    )

    println("Для продолжения обсуждения ${message1.message} введите ваше имя:")
    val messageChild2 = ChildMessage(
        authorOfMessage = readln(),
    )

    println(
        "${messageChild2.authorOfMessage} введите сообщение " +
                "для продолжения обсуждения ${message1.message}:"
    )
    messageChild2.messageChild = readln()
    chat.addThreadMessage(
        messageChild = messageChild2.messageChild
    )

    println(
        "${messageChild2.authorOfMessage} введите сообщение " +
                "для продолжения обсуждения ${message1.message}:"
    )
    messageChild2.messageChild = readln()
    chat.addThreadMessage(
        messageChild = messageChild2.messageChild
    )

    chat.printChat()

}

open class Chat() {
    var id = 0
    var parentMessageId = 0
    val idChild = 0
    val chatMessage: MutableList<Any> = mutableListOf()
    val chatChildMessage: MutableList<Any> = mutableListOf()

    fun addMessage(authorOfMessage: String, message: String): Int {
        id++
        parentMessageId++
        chatMessage.add(id)
        chatMessage.add(authorOfMessage)
        chatMessage.add(message)
        return parentMessageId
    }

    fun addThreadMessage(messageChild: String) {
        var idChild = 0
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
    var message: String = ""
}

class ChildMessage(
    id: Int = 0,
    authorOfMessage: String,
) : Message(id, authorOfMessage) {
    val idChild: Int = 0
    var messageChild: String = ""
}