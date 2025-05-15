package org.example.lesson_16

fun main() {

    println("Для авторизации введите пароль:")
    val user = User(
        userPassword = readln()
    )
    println("Пароль введён верно: ${user.validation()}")

}

class User(
    val userPassword: String,
) {
    val login = "Superman"
    private val password = "Panther"

    fun validation(): Boolean {
        if (password == userPassword) {
            val validation = true
        }
        return true
    }
}