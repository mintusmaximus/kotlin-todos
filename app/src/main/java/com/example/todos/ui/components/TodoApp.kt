package com.example.todos.ui.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.todos.ui.screens.TodoScreen
import com.example.todos.viewmodel.TodoViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TodoApp(modifier: Modifier = Modifier, todoViewModel: TodoViewModel = viewModel()) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Todos") }
            )
        }
    ) { innerPadding ->
        TodoScreen(
            modifier = modifier.padding(innerPadding),
            uiState = todoViewModel.todoUIState
        )
    }
}