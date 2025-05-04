package org.example.lesson1_10.lesson_9

fun main() {

    val amountForOneDishMutableList = mutableListOf(2, 50, 15)
    println("Какое количество порций омлета хотите приготовить?")
    val numberOfServings = readln().toInt()
    val amountForOneDishMutableList1 = amountForOneDishMutableList.map {
        it * numberOfServings
    }
    println("На $numberOfServings порций вам понадобится: " +
            "яиц - ${amountForOneDishMutableList1[0]}шт., " +
            "молока - ${amountForOneDishMutableList1[1]}мл, " +
            "сливочного масла - ${amountForOneDishMutableList1[2]}гр.")

}