package org.example.lesson_17

fun main() {

    val user = User(
        login = "DonnaRosa",
        password = "AuntCharlie"
    )

    user.changePassword = "CharlieAunt"
    println(user.changePassword)
    user.changeLogin = "O!DonnaRosa"

}

class User(
    var login: String,
    val password: String,
) {
    var changePassword: String = password
        get() {
            return "*".repeat(field.length)
        }
        set(value) {
            println("Вы не можете изменить пароль")
        }

    var changeLogin: String = login
        set(value) {
            field = value
            println("Логин успешно изменён")
        }
}