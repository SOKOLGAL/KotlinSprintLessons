package org.example.lesson_11

fun main() {
    println("Введите ваше имя:")
    val userName = readln()

}

class ForumWork(
    val forumList: List<String> = listOf(),
    val user: User,
) {
    data class ForumMember(
        var userId: Int,
        var userName: String,
    ) {
        fun createNewUser(userName: String): Int {
            apply { this.userId = (1..1000).random() }
            apply { this.userName = userName }
            return userId
        }
    }

    data class ForumMessage(
        val authorId: Int,
        val message: String,
    ) {
        fun createNewMessage(userId: Int): String {
            return message
        }

        fun printThread(userName: String, message: String) {
            return println("$userName: $message")
        }
    }
}