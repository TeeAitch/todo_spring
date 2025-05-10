package com.eco.todo.mapper.user;

import org.mapstruct.Mapper;

import com.eco.todo.dto.user.UserResponseDto;
import com.eco.todo.model.user.*;

@Mapper(componentModel = "spring")
public interface UserMapper {
    public Users toEntity (UserResponseDto dto);
    public UserResponseDto toDto(Users user);
}
