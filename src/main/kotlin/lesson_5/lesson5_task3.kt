package org.example.lesson_5

fun main() {

    println("Примите участие в лотерее! Введите по очереди два числа от 0 до 42:")
    val number1 = readln().toInt()
    val number2 = readln().toInt()
    val winNum1 = 20
    val winNum2 = 35

    if ((number1 == winNum1 || number1 == winNum2) && (number2 == winNum1 || number2 == winNum2)) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if (number1 == winNum1 || number1 == winNum2 || number2 == winNum1 || number2 == winNum2) {
        println("Вы выиграли утешительный приз!")
    }  else {println("Неудача!")}
    println("Для победы нужны были числа: $winNum1 и $winNum2!")

}