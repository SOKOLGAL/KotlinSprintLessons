package org.example.lesson_11

fun main() {

}

class ForumWork(
    val forumList: MutableList<ForumMember> = mutableListOf(),
    val forumMessage: MutableList<ForumMessage> = mutableListOf(),
) {
        fun createNewUser(userName: String): ForumMember {
            println("Для регистрации на ФОРУМе введите ваше имя:")
            forumList.add(ForumMember(userId = (1..1000).random(), userName = readln()))
            return ForumMember(userId = (1..1000).random(), userName = println().toString())
        }

        fun createNewMessage(userId: Int) {
            val charPool: List<Char> = ('a'..'z') + ('A'..'Z')
//            val new1 = (1..STRING_LENGTH)
//                .map { Random.nextInt(0, charPool.size).let {charPool[it]}.joinToString("") }
            val new = List(STRING_LENGTH) { charPool.random()}.joinToString("")

        }

        fun printThread(userName: String, message: String) {
            return println("$userName: $message")
        }
    }

const val STRING_LENGTH = 10

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