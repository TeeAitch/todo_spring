package com.eco.todo.mapper.user;

import org.mapstruct.Mapper;

import com.eco.todo.dto.user.RegisterUserDto;
import com.eco.todo.model.user.Users;

@Mapper(componentModel = "spring")
public interface RegisterUserMapper{
    Users toEntity(RegisterUserDto registerUserDto);
    RegisterUserDto toDto(Users user);
}