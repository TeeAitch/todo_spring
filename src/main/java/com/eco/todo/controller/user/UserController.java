package com.eco.todo.controller.user;

import com.eco.todo.service.user.UserService;
import com.eco.todo.model.user.*;
import com.eco.todo.dto.user.*;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;




@RestController
@RequestMapping("/api/users")
public class UserController {
    
    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
        
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.findAllUser();
    }

    @PostMapping
    public ResponseEntity<UserResponseDto> createUser(@RequestBody String entity) {
        //TODO: process POST request
        
        return entity;
    }
    
    
}
