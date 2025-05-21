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
    val star = '*'

    var changePassword: String = password
        get() {
            field
//            for (i in COEFFICIENT_FOR_STARS until passwordLength) {
//                                    println(star)
//            }
            return star.toString()
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

const val COEFFICIENT_FOR_STARS = 1