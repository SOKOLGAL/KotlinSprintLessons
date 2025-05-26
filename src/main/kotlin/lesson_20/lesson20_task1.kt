package org.example.lesson_20

fun main() {

    println("Введите ваше имя:")

    val userName: String = readLine().toString()

    val printStringWithLambda: (String) -> Unit

    printStringWithLambda = {
        println("С наступающим Новым Годом, $it")
    }

    printStringWithLambda(userName)

}