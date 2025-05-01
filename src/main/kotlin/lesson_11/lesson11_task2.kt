package org.example.lesson_11

fun main() {

    val user3: User2 = User2(
        id = 3,
        login = "LittlePrince",
        password = "Ro_Sa_Exup",
        mail = "littleprince@mail.ru",
    )

    user3.outputInUserInformation()
    println("Заполните блок о себе:")
    user3.bio = readln()
    println("Для изменения пароля введите текущий пароль:")
    user3.changePassword(passwordCurrent = readln())
    user3.password = readln()
    println("Пароль изменён")
    user3.outputInUserInformation()

}

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val mail: String,
    var bio: String = "",
) {

    fun outputInUserInformation() {
        println(id)
        println(login)
        println(password)
        println(mail)
        println(bio)
    }

    fun setBio(bio: String): String {
        return bio
    }

    fun changePassword(passwordCurrent: String) {
        if (passwordCurrent == password) {
            println("Введите новый пароль:")
            password
        }
    }
}