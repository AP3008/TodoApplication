package com.app.todoapp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data //Uses Lombok to provide boiler plate code, i.e Getters and Setters
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private Long id; 
    private String title;
    private boolean completed;  


    
}

