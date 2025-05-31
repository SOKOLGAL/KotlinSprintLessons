package org.example.lesson_21

import java.io.File

fun main() {

    val wordsFile: File = File("words.txt")
    wordsFile.createNewFile()
    wordsFile.writingWordToFile(wordsFile)
    println(wordsFile.readLines())

}

fun File.writingWordToFile(wordsFile: File) {
    val newWord = readln().lowercase()
    this.appendText(newWord)
}