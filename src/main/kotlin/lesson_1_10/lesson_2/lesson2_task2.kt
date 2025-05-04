package org.example.lesson1_10.lesson_2

fun main() {

    val employees = 50
    val salaryEmployee = 30000
    val interns = 30
    val salaryInterns = 20000

    val salaryEmployees = employees * salaryEmployee
    val totalSalary = salaryEmployees + interns * salaryInterns
    val averageSalary = totalSalary / (employees + interns)

    println(salaryEmployees)
    println(totalSalary)
    println(averageSalary)

}