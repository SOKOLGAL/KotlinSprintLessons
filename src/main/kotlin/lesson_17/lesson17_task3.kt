package org.example.lesson_17

fun main() {

    val folder = Folder()

    println("Название папки: ${folder.name}")
    println("Количество файлов: ${folder.numberOfFiles}")

}

class Folder() {

    var name: String = "Корпоратив 2025"
        get() {
            if (secret) {
                return "Скрытая папка"
            } else {
                return field
            }
        }
    var numberOfFiles = 74
        get() {
            if (secret) {
                return 0
            } else {
                return field
            }
        }
    var secret: Boolean = true
}