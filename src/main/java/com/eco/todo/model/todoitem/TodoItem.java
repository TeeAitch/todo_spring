package com.eco.todo.model.todoitem;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
public class TodoItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @NotBlank(message = "Title is required")
    @Column(nullable = false)
    private String title;
    
    private String content;
    
    @Column(nullable = false)
    private boolean completed;

}
