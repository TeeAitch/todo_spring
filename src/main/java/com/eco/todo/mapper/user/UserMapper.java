package com.eco.todo.mapper.user;

import org.springframework.stereotype.Component;

import com.eco.todo.dto.user.UserResponseDto;
import com.eco.todo.model.user.*;

@Component
public class UserMapper {
    public User toEntity (UserResponseDto dto){
        User user = new User();
        user.setUsername(dto.getUsername());
        user.setLastName(dto.getLastName());
        user.setFirstName(dto.getFirstName());
        return user;
    }

    public UserResponseDto toDto(User user){
        UserResponseDto dto = new UserResponseDto();
        dto.setFirstName(user.getFirstName());
        dto.setLastName(user.getLastName());
        dto.setUsername(user.getUsername());
        return dto;
    }
}
