package com.example.todo.ui.todo.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.todo.ui.theme.ToDoTheme
import com.example.todo.ui.todo.add.AddToDoItemCompose
import com.example.todo.ui.todo.list.ToDoListCompose
import com.example.todo.ui.todo.model.ToDo
import com.example.todo.ui.todo.model.ToDoList
import com.example.todo.ui.todo.sample.todoListSample

@Composable
fun ToDoScreen(
    modifier: Modifier = Modifier,
    todoList: ToDoList,
    onAddClicked: (ToDo) -> Unit,
) {
    Column (modifier = modifier.padding(all = 8.dp)) {
        AddToDoItemCompose (
            modifier = Modifier.padding(bottom = 8.dp)
        ) {
            onAddClicked(it)
        }
        ToDoListCompose(todoList = todoList)
    }
}

@Preview
@Composable
private fun ToDoListPreview() {
    ToDoTheme {
        ToDoScreen(
            todoList = todoListSample()
        ) { }
    }
}
