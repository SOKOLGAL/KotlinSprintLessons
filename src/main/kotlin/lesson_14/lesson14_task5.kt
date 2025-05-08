package org.example.lesson_14

fun main() {

}

open class Chat() {
    val chatMessage: MutableList<Chat> = mutableListOf()

    fun addMessage(id: Int, message: String) {
       var parentMessageId: Int = 1
        parentMessageId++
    }

    fun addThreadMessage(parentMessageId: Int, idChild: Int, messageChild: String) {

    }

    fun printChat(id: Int, idChild: Int, parentMessageId: Int) {
        .groupBy(id)
        .groupBy(parentMessageId)
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