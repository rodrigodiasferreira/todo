package com.example.todo.sample

import com.example.todo.ui.todo.model.ToDo
import com.example.todo.ui.todo.sample.todoListSample
import com.google.common.truth.Truth
import kotlinx.collections.immutable.ImmutableList
import org.junit.Test

class ToDoListSampleDataTest {

    @Test
    fun `Given ToDo List Sample, When invoke to generate sample list, Then should have ToDo Do Groceries`() {
        // Given

        // When
        val todoListSample = todoListSample()
        // Then
        Truth.assertThat(todoListSample.toDos).isInstanceOf(ImmutableList::class.java)
        Truth.assertThat(todoListSample.toDos).contains(ToDo("Do groceries"))
    }

}