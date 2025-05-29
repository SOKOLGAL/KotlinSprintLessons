package org.example.lesson_20

fun main() {

    println("Введите ваше имя:")

    val userName: String = readLine().toString()

    val printStringWithLambda: (String) -> String

    printStringWithLambda = {
        "С наступающим Новым Годом, $it"
    }

    println(printStringWithLambda(userName))

}