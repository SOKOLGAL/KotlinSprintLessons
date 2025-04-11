package org.example.lesson_5

fun main() {

    println("Примите участие в лотерее! Введите по очереди три числа от 0 до 42:")
    val number1 = readln().toInt()
    val number2 = readln().toInt()
    val number3 = readln().toInt()
    val example1 = 3
//        (1..42).random()
    val example2 = 4
//        (1..42).random()
    val example3 = 5
//        (1..42).random()
    val winNum1 = example1
    val winNum2 = example2
    val winNum3 = example3
    val num = listOf(number1, number2, number3)
    val winNum = listOf(example1, example2, example3)
    val result = num.intersect(winNum)

    println(result)
    if (num == winNum) {
        println("Поздравляем! Вы отгадали все числа и выиграли джекпот!")
    } else
        if (number1 == winNum1 || number1 == winNum2 || number1 == winNum3
        && number2 !== winNum1 || number2 !== winNum2 || number2 !== winNum3 &&
        number1 !== winNum1 || number1 !== winNum2 && number2 == winNum1 || number2 == winNum2) {
        println("Вы отгадали два числа и получаете крупный приз!")
      }      else
            if (number1 == winNum1 || number1 == winNum2 || number1 == winNum3
                && number2 !== winNum1 || number2 !== winNum2 || number2 !== winNum3 &&
                number1 !== winNum1 || number1 !== winNum2 && number2 == winNum1 || number2 == winNum2) {
                println("Вы отгадали одно число и получаете утешительный приз!")
    }  else {println("Вы не угадали ни одного числа!")}

    println("Для победы нужны были числа: $example1, $example2 и $example3!")

}