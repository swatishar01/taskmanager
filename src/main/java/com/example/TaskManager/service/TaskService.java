package com.example.TaskManager.service;
import com.example.TaskManager.model.Task;
import com.example.TaskManager.database.TaskDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class TaskService {
    // This service class can contain
    // business logic related to tasks, such as validation, processing, etc.
    // It can also interact with the TaskDatabase repository to perform CRUD operations.
    // For example, you can inject the TaskDatabase repository here and use it to manage tasks.
    // Example:

    private  final TaskDatabase taskDatabase;
    @Autowired
     public TaskService(TaskDatabase taskDatabase)
     {
         this.taskDatabase = taskDatabase;
     }


     // Method to get all tasks
     public List<Task> getAllTasks()
     {
         return taskDatabase.findAll();
     }




     // Method to find a task by ID
     public Optional<Task> getTaskById(Long id)
     {
         return taskDatabase.findById(id);
     }

     // Method to delete a task by ID
     public void deleteTask(Long id)
     {
         taskDatabase.deleteById(id);
     }

     //create anew task
        public Task createTask(Task task)
        {
            // You can add any business logic or validation here before saving the task
            // For example, you might want to check if the task title is not empty
            if (task.getTitle() == null || task.getTitle().isEmpty())
            {
                throw new IllegalArgumentException("Task title cannot be empty");

            }
            return taskDatabase.save(task);
        }
        // Update an existing task
        public Task updateTask(Task task)
        {
            // You can add any business logic or validation here before updating the task
            // For example, you might want to check if the task exists
            if (task.getId() == null || !taskDatabase.existsById(task.getId()))
            {
                throw new IllegalArgumentException("Task does not exist");
            }
            return taskDatabase.save(task);
        }
}
