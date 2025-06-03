package org.example.lesson_22

fun main() {

    val employeeOfCompany = EmployeeOfCompany(
        "Фёдоров Пётр Петрович",
        43,
        "менеджер отдела продаж"
    )
    val (name, age, jobTitle) = employeeOfCompany

    println(name)
    println(age)
    println(jobTitle)

}

data class EmployeeOfCompany(
    val name: String,
    val age: Int,
    val jobTitle: String
) {}