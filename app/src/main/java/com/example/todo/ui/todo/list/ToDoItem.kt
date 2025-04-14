package com.example.todo.ui.todo.list

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.todo.ui.theme.ToDoTheme
import com.example.todo.ui.todo.model.ToDo

@Composable
fun ToDoItem(
    modifier: Modifier = Modifier,
    toDo: ToDo,
) {
    Column (modifier = modifier) {
        Row(modifier = modifier
            .fillMaxWidth()
            .padding(all = 8.dp)
        ) {
            Text(
                text = toDo.taskName
            )
        }
        HorizontalDivider(thickness = 1.dp)
    }
}

@Preview
@Composable
private fun TaskItemPreview() {
    ToDoTheme {
        ToDoItem(
            toDo = ToDo(
                taskName = "Do groceries"
            )
        )
    }
}