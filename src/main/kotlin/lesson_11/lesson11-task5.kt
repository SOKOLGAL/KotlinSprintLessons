package org.example.lesson_11

fun main() {

    ForumWork.Builder(
        userName = readln(),
        userId = (1..1000).random(),
        message = readln()
    )

}

class ForumWork(
    val forumList: List<ForumMember> = listOf(),
) {
    data class Builder(
        var userName: String,
        var userId: Int,
        var message: String,
    ) {
        fun createNewUser(userName: String): Int {
            apply { this.userName = userName }
            apply { this.userId = (1..1000).random() }
            return userId
        }

        fun createNewMessage(userId: Int): String {
            apply { this.message = message }
            return message
        }

        fun printThread(userName: String, message: String) {
            return println("$userName: $message")
        }
    }
}

class ForumMember(
    var userId: Int,
    var userName: String,
) {
}

class ForumMessage(
    val authorId: Boolean,
    val message: String,
) {
}