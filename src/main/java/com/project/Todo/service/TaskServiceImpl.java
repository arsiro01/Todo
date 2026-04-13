package com.project.Todo.service;

import com.project.Todo.entity.Task;
import com.project.Todo.enums.Status;

import java.util.List;

public interface TaskServiceImpl {
    Task createTask(Task task);
    List<Task> getAllTasks();
    Task getTaskById(Long id);
    Task updateTask(Long id, Task updatedTask);
    void deleteTask(Long id);
    Status taskStatus(Long id);
}
