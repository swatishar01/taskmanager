package com.example.TaskManager.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Objects;



@Entity
public class Task
{
    @Id   //marking this field as the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto-generating the primary key value
    private Long id;
    private String title;
    private String description;
    private String status;
    //default constructor
    public Task()
    {
    }
    //parameterized constructor
    public Task(String title, String description, String status)
    {
        this.title = title;
        this.description = description;
        this.status = status;
    }

    //constructor with id
    public Task(Long id, String title, String description, String status)
    {
        this.id = id;
        this.title = title;
        this.description = description;
        this.status = status;
    }
//getter and setter methods
    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }


    // Overriding equals, hashCode, and toString methods for better object comparison and representation

    @Override

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task task)) return false;
        return Objects.equals(id, task.id) &&
                Objects.equals(title, task.title) &&
                Objects.equals(description, task.description) &&
                Objects.equals(status, task.status);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, status);
    }
    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

}
