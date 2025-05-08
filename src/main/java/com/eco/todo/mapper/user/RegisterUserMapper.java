package com.eco.todo.mapper.user;

import org.mapstruct.Mapper;

import com.eco.todo.dto.user.RegisterUserDto;
import com.eco.todo.model.user.User;

@Mapper(componentModel = "spring")
public interface RegisterUserMapper{
    User toEntity(RegisterUserDto registerUserDto);
    RegisterUserDto toDto(User user);
}