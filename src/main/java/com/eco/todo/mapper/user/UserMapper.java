package com.eco.todo.mapper.user;

import org.mapstruct.Mapper;

import com.eco.todo.dto.user.UserResponseDto;
import com.eco.todo.model.user.*;

@Mapper
public interface UserMapper {
    public User toEntity (UserResponseDto dto);
    public UserResponseDto toDto(User user);
}
