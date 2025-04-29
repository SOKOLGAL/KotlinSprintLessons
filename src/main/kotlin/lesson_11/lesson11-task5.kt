package org.example.lesson_11

fun main() {
    val user1: ForumWork()
ForumMember()
}

class ForumWork() {

}

class ForumMember(
    var userId: Int,
    var userName: String,
) {
    fun setId(id: Int) = apply { this.userId =  (1..1000).random() }
    fun setName(userName: String) = apply { this.userName = userName }

}

class ForumMessage(
    val authorId: Int,
    val message: String,
) {

}