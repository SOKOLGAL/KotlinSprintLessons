package org.example.lesson_22

import org.example.lesson_22.MainScreenViewModel.MainScreenState

fun main() {

    val mainScreenViewModel = MainScreenViewModel(MainScreenState("Загружаемые данные"))
    println(mainScreenViewModel.stateStorage.changingState())
    mainScreenViewModel.loadData()

}

class MainScreenViewModel(
    val mainScreenState: MainScreenState,
) {
    val stateStorage = StateStorage(
        mainScreenState = this.mainScreenState
    )

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
}

data class StateStorage(
    val mainScreenState: MainScreenState,
) {
    fun changingState(): MainScreenState {
        return mainScreenState.copy(isLoading = true)
    }
}