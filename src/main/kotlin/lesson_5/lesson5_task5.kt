package org.example.lesson_5

fun main() {

    println("Примите участие в лотерее! Введите по очереди три числа от 0 до 42:")
    val number1 = readln().toInt()
    val number2 = readln().toInt()
    val number3 = readln().toInt()
    val example1 = (1..42).random()
    val example2 = (1..42).random()
    val example3 = (1..42).random()
    val num = listOf(number1, number2, number3)
    val winNum = listOf(example1, example2, example3)
    val result = num.intersect(winNum)

    if (number1 in result && number2 in result && number3 in result) {
        println("Поздравляем! Вы отгадали все числа и выиграли джекпот!")
    } else
        if ((number1 in result && number2 in result && number3 !in result) ||
            (number1 in result && number2 !in result && number3 in result) ||
            (number1 !in result && number2 in result && number3 in result))
        {
            println("Вы отгадали два числа и получаете крупный приз!")
        } else
            if ((number1 == example1 || number1 == example2 || number1 == example3) ||
                (number2 == example1 || number2 == example2 || number2 == example3) ||
                (number3 == example1 || number3 == example2 || number3 == example3))
            {
                println("Вы отгадали одно число и получаете утешительный приз!")
            } else {
                println("Вы не угадали ни одного числа!")
            }

    println("Для победы нужны были числа: $example1, $example2 и $example3!")

}