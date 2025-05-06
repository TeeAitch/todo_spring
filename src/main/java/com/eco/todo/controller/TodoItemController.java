package com.eco.todo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import com.eco.todo.model.todoitem.*;
import com.eco.todo.service.TodoItemService;

@RestController
public class TodoItemController {
    private final TodoItemService todoItemService;

    public TodoItemController(TodoItemService service){
        this.todoItemService = service;
    }
    @GetMapping("/")
    public List<TodoItem> getMethodName() {
        return todoItemService.getAllItem();
    }   
}
