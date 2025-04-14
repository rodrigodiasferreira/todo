package com.example.todo.ui.todo.sample

import com.example.todo.ui.todo.model.ToDo
import com.example.todo.ui.todo.model.ToDoList
import kotlinx.collections.immutable.persistentListOf

fun todoListSample() = ToDoList(
    toDos = persistentListOf(
        ToDo("Do Groceries"),
        ToDo("Gym"),
        ToDo("Mather Thesis"),
        ToDo("Hair Cut"),
        ToDo("Feed dog"),
        ToDo("Shower"),
        ToDo("Fix sink"),
        ToDo("Math"),
        ToDo("Taxes declaration"),
        ToDo("Finish the TODO List Implementation"),
    )
)