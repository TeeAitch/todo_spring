package com.eco.todo.service.user;

import java.util.List;
import java.util.UUID;

import com.eco.todo.model.user.User;
import com.eco.todo.repository.user.UserRepository;

import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public List<User> findAllUser(){
        return userRepository.findAll();
    }

    public User findUserById(UUID id){
        return userRepository.findById(id).orElse(null);
    }

}
