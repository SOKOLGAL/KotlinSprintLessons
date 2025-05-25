package org.example.lesson_19

fun main() {

    println(
        "Введите имя и пол пользователя. " +
                "Если пол мужской введите 1, если пол женский введите 2"
    )

    val human1 = Human(
        name = readLine(),
        gender = readLine()
    )
    val human2 = Human(
        name = readLine(),
        gender = readLine()
    )
    val human3 = Human(
        name = readLine(),
        gender = readLine()
    )
    val human4 = Human(
        name = readLine(),
        gender = readLine()
    )
    val human5 = Human(
        name = readLine(),
        gender = readLine()
    )

    val list = listOf(human1, human2, human3, human4, human5)

    for (i in list) {
        println("${i.name}, ${i.gender} ")
    }

}

enum class Gender(
    val id: Int,
    val genderName: String,
) {
    MALE(1, "мужской"),
    FEMALE(2, "женский");

    override fun toString(): String {
        return genderName
    }
}

fun getGender(gender: Gender): String {
    return when (gender) {
        Gender.MALE -> "мужской"
        Gender.FEMALE -> "женский"
    }
}

class Human(
    val name: String?,
    var gender: Gender,
) {
}