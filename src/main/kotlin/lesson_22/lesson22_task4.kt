package org.example.lesson_22

import org.example.lesson_22.ViewModel.MainScreenState

fun main() {

    val viewModel: ViewModel = ViewModel(MainScreenState("Загружаемые данные"))
    println(viewModel.stateStorage.changingState())
    viewModel.mainScreenViewModel.loadData()

}

class MainScreenViewModel(
    val mainScreenState: MainScreenState,
) {
    fun loadData() {
        val listOfStates = listOf("Отсутствие данных", "Загрузка данных", "Наличие загруженных данных")
        for (i in listOfStates) {
            mainScreenState.data = i
            println(mainScreenState)
        }
    }
}

class ViewModel(
    val mainScreenState: MainScreenState,
) {
    val mainScreenViewModel = MainScreenViewModel(
        mainScreenState = this.mainScreenState
    )
    val stateStorage = StateStorage(
        mainScreenState = this.mainScreenState
    )

    data class MainScreenState(
        var data: String,
        val isLoading: Boolean = false,
    ) {}
}

data class StateStorage(
    val mainScreenState: MainScreenState,
) {
    fun changingState(): MainScreenState {
        return mainScreenState.copy(isLoading = true)
    }
}