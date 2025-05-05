package org.example.lesson_13

fun main() {

    val newContact1 = NewContactCreate(
        name = "Мария",
        phoneNumber = "88009009050".toLong(),
        company = "Вчерашние новости"
    )
    val newContact2 = NewContactCreate(
        name = "Константин",
        phoneNumber = "88005005050".toLong(),
        company = "null"
    )
    val newContact3 = NewContactCreate(
        name = "Петр",
        phoneNumber = "88004681357".toLong(),
        company = ""
    )
    val newContact4 = NewContactCreate(
        name = "Дмитрий",
        phoneNumber = "88001000100".toLong(),
        company = "Зеленый луг"
    )
    val newContact5 = NewContactCreate(
        name = "Екатерина",
        phoneNumber = "88007770077".toLong(),
        company = ""
    )
    val contactList = listOf(newContact1, newContact2, newContact3, newContact4, newContact5)
//    company ?: "<не указано>
    val  listOfAllCompanies = contactList.map {
        it.company
    }
    println(listOfAllCompanies.toString())
}

class NewContactCreate(
    val name: String?,
    val phoneNumber: Long?,
    val company: String?,
) {
}