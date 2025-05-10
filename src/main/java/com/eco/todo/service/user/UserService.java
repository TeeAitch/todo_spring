package com.eco.todo.service.user;

import java.util.List;
import java.util.UUID;

import com.eco.todo.model.user.Users;
import com.eco.todo.repository.user.UserRepository;

import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public List<Users> findAllUser(){
        return userRepository.findAll();
    }

    public Users findUserById(UUID id){
        return userRepository.findById(id).orElse(null);
    }

}
