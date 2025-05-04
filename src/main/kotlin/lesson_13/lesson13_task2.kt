package org.example.lesson_13

fun main() {
    val newContact1 = NewContactAdd(
        name = readln(),
        phoneNumber = readln().toLong(),
        company = readln()
    )
    newContact1.contactCard()
}

class NewContactAdd(
    val name: String?,
    val phoneNumber: Long?,
    val company: String? = null,
) {
    val replacement: String = company ?: "<не указано>"

    fun contactCard() {
        println("- Имя: $name\n- Номер: $phoneNumber\n- Компания: $replacement")
    }
}