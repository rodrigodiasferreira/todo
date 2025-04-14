package com.example.todo.ui.todo.screen

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.todo.ui.todo.viewmodel.ToDoViewModel

@Composable
fun ToDoScreenRouter(
    modifier: Modifier = Modifier,
    viewModel: ToDoViewModel = hiltViewModel(),
) {
    val todoList by viewModel.todoList.collectAsStateWithLifecycle()
    ToDoScreen(
        modifier = modifier,
        todoList = todoList,
    ) {
        viewModel.addTask(it)
    }
}