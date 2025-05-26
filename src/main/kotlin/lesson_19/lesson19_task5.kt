package org.example.lesson_19

fun main() {

    println("Введите имя и пол пользователя")

    val human1 = Human(
        name = readLine(),
        gender = getGender(gender = readLine().toString())
    )
    val human2 = Human(
        name = readLine(),
        gender = getGender(gender = readLine().toString())
    )
    val human3 = Human(
        name = readLine(),
        gender = getGender(gender = readLine().toString())
    )
    val human4 = Human(
        name = readLine(),
        gender = getGender(gender = readLine().toString())
    )
    val human5 = Human(
        name = readLine(),
        gender = getGender(gender = readLine().toString())
    )

    val list = listOf(human1, human2, human3, human4, human5)

    for (i in list) {
        println("${i.name}, ${i.gender} ")
    }

}

enum class Gender(
    val genderName: String,
) {
    MALE("мужской"),
    FEMALE("женский"),
    NOBODY("неизвестен");

    override fun toString(): String {
        return genderName
    }
}

fun getGender(gender: String): Gender {
    return when (gender) {
        "мужской" -> Gender.MALE
        "женский" -> Gender.FEMALE
        else -> {Gender.NOBODY}
    }
}

class Human(
    val name: String?,
    var gender: Gender,
) {
}