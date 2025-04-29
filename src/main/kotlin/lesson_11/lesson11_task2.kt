package org.example.lesson_11

fun main() {

    val user3: User2 = User2(
        id = 3,
        login = "LittlePrince",
        password = "Ro_Sa_Exup",
        mail = "littleprince@mail.ru",
    )

    user3.outputInUserInformation()
    user3.setBio()
    user3.changePassword()
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

    fun setBio() {
        println("Заполните блок о себе:")
        bio = readln()
    }

    fun changePassword() {
        println("Для изменения пароля введите текущий пароль:")
        val passwordCurrent = readln()

        if (passwordCurrent == password) {
            println("Введите новый пароль:")
            password = readln()
            println("Пароль изменён")
        }
//        else println("Ошибка")
    }
}