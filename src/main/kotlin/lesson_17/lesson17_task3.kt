package org.example.lesson_17

fun main() {

    val folder = Folder()
    folder.secret

}

class Folder() {
    val name: String = "Корпоратив 2025"
    var numberOfFiles = 74
    var secret: Boolean = true
        get() {
            if (field == false) {
                println(name)
                println(numberOfFiles)
            } else if (true) {
                println("Скрытая папка")
                numberOfFiles = 0
                println("Количество файлов - $numberOfFiles")
            }
            return field
        }
}