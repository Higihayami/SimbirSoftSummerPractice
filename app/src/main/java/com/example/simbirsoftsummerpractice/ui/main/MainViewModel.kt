package com.example.simbirsoftsummerpractice.ui.main

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.simbirsoftsummerpractice.data.repository.TaskRepository
import com.example.simbirsoftsummerpractice.model.Task
import kotlinx.coroutines.launch

class MainViewModel(application: Application) : AndroidViewModel(application) {
    private val repository: TaskRepository = TaskRepository(application)

    fun insertTasksFromJson() {
        viewModelScope.launch {
            repository.insertTasksFromJson()
        }
    }

    suspend fun getAllTasks(): List<Task> {
        return repository.getAllTasks()
    }

    suspend fun getAllTasksByDate(startDate: Long, endDate: Long): List<Task> {
        return repository.getTasksForDate(startDate, endDate)
    }
}