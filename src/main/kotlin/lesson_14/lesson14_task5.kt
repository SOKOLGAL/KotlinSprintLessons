package org.example.lesson_14

fun main() {

    val message = Message()
    val messageChild = ChildMessage()

}

open class Chat() {
    val chatMessage: MutableList<Chat> = mutableListOf()

    fun addMessage(id: Int, message: String) {
    }

    fun addThreadMessage(parentMessageId: Int, idChild: Int, messageChild: String) {
    }

    fun printChat(id: Int, idChild: Int, parentMessageId: Int) {
    }
}

class Message(
    val id: Int,
    val message: String,
    ) : Chat() {
}

class ChildMessage(
    val idChild: Int,
    val messageChild: String,
) : Chat() {
}