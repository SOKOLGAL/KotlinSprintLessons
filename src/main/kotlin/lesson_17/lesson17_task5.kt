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
    val passwordLength: Int = password.length
    val star = '*'.toString()
    val stars = star.repeat(passwordLength)
    var changePassword: String = password
        get() {
            field
            return stars
        }
        set(value) {
            println("Вы не можете изменить пароль")
        }

    var changeLogin = login
        set(value) {
            field = value
            println("Логин успешно изменён")
        }

    val change = false
}