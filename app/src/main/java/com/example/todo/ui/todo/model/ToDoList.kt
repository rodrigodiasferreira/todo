package com.example.todo.ui.todo.model

import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.persistentListOf

data class ToDoList(
    val toDos: ImmutableList<ToDo> = persistentListOf(),
)
