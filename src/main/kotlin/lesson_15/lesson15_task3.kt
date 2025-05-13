package org.example.lesson_15

fun main() {

    val administrator = Administrator(
        userId = 1,
        name = "Admin",
    )
    val regularUser = RegularUser(
        userId = 1,
        name = "Intern",
    )

    administrator.readForum()
    regularUser.whiteMessage()
    administrator.whiteMessage()
    regularUser.readForum()
    regularUser.whiteMessage()
    administrator.deleteMessage()
    administrator.deleteUser()

}

abstract class User(
    val userId: Int,
    val name: String,
) {
    abstract fun readForum()
    abstract fun whiteMessage()
}

class RegularUser(
    userId: Int,
    name: String,
) : User(userId, name) {
    override fun readForum() {
        println("Пользователь $name читает сообщения форума")
    }

    override fun whiteMessage() {
        println("Пользователь $name пишет сообщение")
    }
}

class Administrator(
    userId: Int,
    name: String,
    val removal: Boolean = true,
) : User(userId, name), removing {
    override fun readForum() {
        println("Администратор $name читает сообщения форума")
    }

    override fun whiteMessage() {
        println("Администратор $name пишет сообщение")
    }

    override fun deleteMessage() {
        println("Администратор $name удалил сообщение")
    }

    override fun deleteUser() {
        println("Администратор $name удалил пользователя")
    }
}

interface removing {
    fun deleteMessage() {}
    fun deleteUser() {}
}