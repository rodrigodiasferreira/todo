package com.example.todo.ui.todo.list

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.todo.ui.theme.ToDoTheme
import com.example.todo.ui.todo.model.ToDoList
import com.example.todo.ui.todo.sample.todoListSample

@Composable
fun ToDoListCompose(
    modifier: Modifier = Modifier,
    todoList: ToDoList,
) {
    LazyColumn(modifier = modifier) {
        items(todoList.toDos) { task ->
            ToDoItem(toDo = task)
        }
    }
}

@Preview
@Composable
private fun ToDoListPreview() {
    ToDoTheme {
        ToDoListCompose(
            todoList = todoListSample()
        )
    }
}