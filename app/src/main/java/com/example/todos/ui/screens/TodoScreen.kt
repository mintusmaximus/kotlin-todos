package com.example.todos.ui.screens

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.todos.ui.components.TodoList
import com.example.todos.viewmodel.TodoUIState

@Composable
fun TodoScreen(
    modifier: Modifier = Modifier,
    uiState: TodoUIState
) {
    when (uiState) {
        is TodoUIState.Loading -> LoadingScreen()
        is TodoUIState.Success -> TodoList(modifier, todos = uiState.todos)
        is TodoUIState.Error -> ErrorScreen()
    }
}

@Composable
fun LoadingScreen() {
    Text("Loading")
}

@Composable
fun ErrorScreen() {
    Text("Error retreiving data from API")
}
