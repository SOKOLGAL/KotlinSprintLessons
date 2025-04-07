package org.example.lesson_3

fun main() {

    var from = "E2"
    var where = "E4"
    var moveNumber = 1

    println("[$from-$where; $moveNumber]")

    from = "D2"
    where = "D"+(2.toInt() + 1)
    moveNumber++

    println("[$from-$where; $moveNumber]")

}