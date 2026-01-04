package com.example.todos.model

import kotlinx.serialization.Serializable

data class Success(val todos: List<Todo>)

@Serializable
data class Todo(
    var userId: Int,
    var id: Int,
    var title: String,
    var completed: Boolean
)
