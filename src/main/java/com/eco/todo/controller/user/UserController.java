package com.eco.todo.controller.user;

import com.eco.todo.service.user.UserService;

import lombok.AllArgsConstructor;

import com.eco.todo.model.user.*;
import com.eco.todo.repository.user.UserRepository;
import com.eco.todo.dto.user.*;
import com.eco.todo.mapper.user.RegisterUserMapper;
import com.eco.todo.mapper.user.UserMapper;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@AllArgsConstructor
@RequestMapping("/api/users")
public class UserController {
    
    private final UserService userService;
    private final UserRepository userRepository;
    private final RegisterUserMapper registerUserMapper;
    private final UserMapper userMapper;

    @GetMapping
    public List<Users> getAllUsers() {
        return userService.findAllUser();
    }

    @PostMapping
    public ResponseEntity<UserResponseDto> createUser(
        RegisterUserDto registerUserDto,
        UriComponentsBuilder uriBuilder
        ){
        Users user = registerUserMapper.toEntity(registerUserDto);

        Users savedUser = userRepository.save(user);

        var userDto = userMapper.toDto(savedUser);

        var uri = uriBuilder.path("/users/{id}").buildAndExpand(userDto.getId()).toUri();
        
        return ResponseEntity.created(uri).body(userDto);
    } 
}
