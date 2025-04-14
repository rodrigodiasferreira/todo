package com.example.todo.ui.todo.viewmodel

import androidx.lifecycle.ViewModel
import com.example.todo.ui.todo.model.ToDo
import com.example.todo.ui.todo.model.ToDoList
import com.example.todo.ui.todo.sample.todoListSample
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.collections.immutable.toImmutableList
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class ToDoViewModel @Inject constructor(): ViewModel() {
    private val _todoList: MutableStateFlow<ToDoList> = MutableStateFlow(todoListSample())
    val todoList = _todoList.asStateFlow()

    fun addTask(toDo: ToDo) {
        val updatedTasks = _todoList.value.toDos + toDo
        updateStateFlowToDoList(updatedTasks)
    }

    private fun updateStateFlowToDoList(updatedToDos: List<ToDo>) {
        _todoList.value = _todoList.value.copy(
            toDos = updatedToDos.toImmutableList()
        )
    }
}