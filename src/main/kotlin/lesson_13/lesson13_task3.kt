package org.example.lesson_13

fun main() {
    
    val contactList: MutableList<NewContactCreate> = mutableListOf(NewContactCreate(
        name = TODO(),
        phoneNumber = TODO(),
        company = TODO()
    ))
    var newContact = NewContactCreate(
        name = "Мария",
        phoneNumber = "88009009050".toLong(),
        company = "Вчерашние новости"
    )
    newContact = NewContactCreate(
        name = "Константин",
        phoneNumber = "88005005050".toLong(),
        company = "null"
    )
    newContact = NewContactCreate(
        name = "Петр",
        phoneNumber = "88004681357".toLong(),
        company = ""
    )
    newContact = NewContactCreate(
        name = "Дмитрий",
        phoneNumber = "88001000100".toLong(),
        company = "Зеленый луг"
    )
    newContact = NewContactCreate(
        name = "Екатерина",
        phoneNumber = "88007770077".toLong(),
        company = ""
    )
       for (i in 0 .. 5) {
           contactList.add(MutableList(5) {newContact})
       }
        
        
        
        
//     val contactList = listOf(newContact1, newContact2, newContact3, newContact4, newContact5)

//    val contactList1: MutableList<NewContactCreate> = mutableListOf()
//    val contactList1: MutableList<NewContactCreate> = mutableListOf(newContact1,newContact2,newContact3,newContact4,newContact5)


    val listOfAllCompanies = contact.map {
        it.company
    }
    println(listOfAllCompanies.toString())
}

class NewContactCreate(
    val name: String?,
    val phoneNumber: Long?,
    val company: String?,
) {
//    val contactList: MutableList<NewContactCreate> = mutableListOf()

    val replacement: String = company ?: "<не указано>"
}