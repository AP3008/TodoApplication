package com.app.todoapp.repository;

import com.app.todoapp.models.Task;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;;

public interface TaskRepository extends JpaRepository<Task, Long>{
    
}
