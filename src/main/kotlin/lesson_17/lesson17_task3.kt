package org.example.lesson_17

fun main() {

    val folder = Folder()

    println(folder.name)

}

class Folder() {

    var name: String = "Корпоратив 2025"
        get() {
            if (secret == true) {
                name = "Скрытая папка"
                numberOfFiles = 0
                println("Количество файлов - $numberOfFiles")
            } else {
                name = field
                println("Количество файлов - $numberOfFiles")
            }
            return field
        }
    var numberOfFiles = 74
    var secret: Boolean = true
}