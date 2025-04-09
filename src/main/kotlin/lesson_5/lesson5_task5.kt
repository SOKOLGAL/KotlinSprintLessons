package org.example.lesson_5

fun main() {

    println("Примите участие в лотерее! Введите по очереди три числа от 0 до 42:")
    val number1 = readln().toInt()
    val number2 = readln().toInt()
    val number3 = readln().toInt()
//    val example1 = (1..42).random()
//    val example2 = (1..42).random()
//    val example3 = (1..42).random()
//    val exNum1 = example1
//    val exNum2 = example2
//    val exNum3 = example3
    getNumber1().toInt()
    getNumber2().toInt()
    getNumber3().toInt()
    val numFromUser1 = getNumber1().toInt()
    val numFromUser2 = getNumber2().toInt()
    val numFromUser3 = getNumber3().toInt()

//        print (numFromUser1, numFromUser2, numFromUser3)
    printNumFromUser(numFromUser1, numFromUser2, numFromUser3)

//    val winNum1 = example1
//    val winNum2 = example2
//    val winNum3 = example3
//    println(example1)
//    println(example2)
//    println(example3)

//    if (number1 == winNum1 && number2 == winNum2) {
//        println("Поздравляем! Вы выиграли главный приз!")
//    } else if (number1 == winNum1 && number2 !== winNum2) {
//        println("Вы выиграли утешительный приз!")
//    }else if (number1 !== winNum1 && number2 == winNum2) {
//        println("Вы выиграли утешительный приз!")
//    } else println("Неудача!")
}

fun getNumber1() = readln().toInt()
fun getNumber2() = readln().toInt()
fun getNumber3() = readln().toInt()
fun printNumFromUser(numFromUser1: Int?, numFromUser2: Int?, numFromUser3: Int?) {
    println("$numFromUser1, $numFromUser2, $numFromUser3")
}