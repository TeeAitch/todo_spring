package com.eco.todo.service;

import com.eco.todo.model.todoitem.*;
import com.eco.todo.repository.TodoItemRepository;

import lombok.AllArgsConstructor;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TodoItemService {

    private final TodoItemRepository todoItemrepository;

    public List<TodoItem> getAllItem(){
        return todoItemrepository.findAll();
    }
    public TodoItem getItemById(UUID Id){ 
        return todoItemrepository.findById(Id).orElse(null);
    }
    public List<TodoItem> getNotCompletedItems(){
        return todoItemrepository.findByCompletedFalse();
    }
}
