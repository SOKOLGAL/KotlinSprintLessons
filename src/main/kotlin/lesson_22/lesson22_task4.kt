package org.example.lesson_22

import org.example.lesson_22.MainScreenViewModel.MainScreenState

fun main() {

    val mainScreenViewModel = MainScreenViewModel(MainScreenState("Загружаемые данные"))
    println(mainScreenViewModel.changingState())
    mainScreenViewModel.loadData()

}

class MainScreenViewModel(
    val mainScreenState: MainScreenState,
) {

    data class MainScreenState(
        var data: String,
        val isLoading: Boolean = false,
    ) {}

    fun loadData() {
        val listOfStates = listOf("Отсутствие данных", "Загрузка данных", "Наличие загруженных данных")
        for (i in listOfStates) {
            mainScreenState.data = i
            println(mainScreenState)
        }
    }

    fun changingState(): MainScreenState {
        return mainScreenState.copy(isLoading = true)
    }
}