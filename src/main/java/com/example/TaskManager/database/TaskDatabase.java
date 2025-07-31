package com.example.TaskManager.database;
import com.example.TaskManager.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository

public interface TaskDatabase extends  JpaRepository<Task, Long> {
    // This interface will automatically provide CRUD operations for Task entities
    // No additional methods are needed unless specific queries are required
    // JpaRepository provides methods like save(), findById(), findAll(), deleteById(), etc.
    // You can define custom query methods here if needed, for example:

}
