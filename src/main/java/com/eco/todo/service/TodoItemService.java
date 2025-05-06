package com.eco.todo.service;

import com.eco.todo.model.todoitem.*;
import com.eco.todo.repository.TodoItemRepository;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

@Service
public class TodoItemService {

    TodoItemRepository todoItemrepository;

    public TodoItemService(TodoItemRepository repository){
        this.todoItemrepository = repository;
    }
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
