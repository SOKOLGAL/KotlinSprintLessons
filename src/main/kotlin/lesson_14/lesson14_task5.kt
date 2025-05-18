package org.example.lesson_14

fun main() {

    val chat = Chat()

    println("Для начала обсуждения введите ваше имя и сообщение:")
    chat.addMessage(
        author = readln(),
        text = readln()
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
    val messageList: MutableList<Message> = mutableListOf()
    val childMessageList: MutableList<ChildMessage> = mutableListOf()
    var idChild = childMessageList.size + 1

    fun addMessage(author: String, text: String) {
        val newMessage = Message(
            id = id++,
            author = author,
            text = text
        )
        messageList.add(newMessage)
        parentMessageId++
    }

    fun addThreadMessage(parentMessageId: Int, messageChild: String) {
        val newThreadMessage = ChildMessage(
            id = idChild,
            author = "",
            parentMessageId = parentMessageId,
            idChild = childMessageList.size + 1,
            text = messageChild
        )
        childMessageList.add(newThreadMessage)
    }

    fun printChat() {
        val ids = messageList.groupBy { it.id }
        val parentMessageIds = childMessageList.groupBy { it.parentMessageId }

        for (id in ids) {
            for (messageList in id.value) {
                println(messageList.text)
            }
        }
        for (parentMessageId in parentMessageIds) {
            for (childMessageList in parentMessageId.value) {
                println("   ${childMessageList.text}")
            }
        }
    }
}

open class Message(
    val id: Int = 0,
    var author: String,
    val text: String,
) {
}

class ChildMessage(
    id: Int,
    author: String,
    val parentMessageId: Int,
    val idChild: Int,
    text: String,
) : Message(id, author, text) {
}