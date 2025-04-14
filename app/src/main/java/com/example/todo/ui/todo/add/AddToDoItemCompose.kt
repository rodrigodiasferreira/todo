package com.example.todo.ui.todo.add

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.todo.ui.theme.ToDoTheme
import com.example.todo.ui.todo.model.ToDo

@Composable
fun AddToDoItemCompose(
    modifier: Modifier = Modifier,
    onAddClicked: (ToDo) -> Unit,
) {
    var taskName by remember { mutableStateOf("") }
    Row(
        modifier = modifier.fillMaxWidth(),
    ) {
        TextField(
            modifier = Modifier
                .weight(1f)
                .padding(end = 8.dp),
            value = taskName,
            onValueChange = { taskName = it },
            label = { Text("Enter task") },
        )
        Button(
            modifier = Modifier
                .align(alignment = Alignment.CenterVertically),
            onClick = {
                onAddClicked(ToDo(taskName))
                taskName = ""
            }
        ) {
            Text("Add ToDo")
        }


    }
}

@Preview
@Composable
private fun ToDoListPreview() {
    ToDoTheme {
        AddToDoItemCompose { }
    }
}