package org.example.lesson_21

import java.io.File

fun main() {

    val wordsFile: File = File("words.txt")

    wordsFile.createNewFile()
    wordsFile.writingWordToFile("HeLlO")
    println(wordsFile.readLines())

}

fun File.writingWordToFile(words: String) {
    val word = words.lowercase()
    appendText(word)
}