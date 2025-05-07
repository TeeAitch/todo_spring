package com.eco.todo.service.user;

import java.util.List;
import java.util.UUID;

import com.eco.todo.dto.user.RegisterUserDto;
import com.eco.todo.dto.user.UserResponseDto;
import com.eco.todo.mapper.user.RegisterUserMapper;
import com.eco.todo.mapper.user.UserMapper;
import com.eco.todo.model.user.User;
import com.eco.todo.repository.user.UserRepository;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    UserRepository userRepository;
    RegisterUserMapper registerUserMapper;
    UserMapper userMapper;
    
    public UserService(
        UserRepository userRepository,
        RegisterUserMapper registerUserMapper, 
        UserMapper userMapper
    ){
        this.userRepository = userRepository;
        this.registerUserMapper = registerUserMapper;
        this.userMapper = userMapper;
    }

    public List<User> findAllUser(){
        return userRepository.findAll();
    }

    public User findUserById(UUID id){
        return userRepository.findById(id).orElse(null);
    }

    public UserResponseDto createUser(RegisterUserDto registerUserDto){
        User user = registerUserMapper.toEntity(registerUserDto);

        User savedUser = userRepository.save(user);

        return userMapper.toDto(savedUser);
    }
    
}
