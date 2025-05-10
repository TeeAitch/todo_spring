package com.eco.todo.mapper.user;
import com.eco.todo.dto.user.LoginUserDto;
import com.eco.todo.model.user.*;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface LoginUserMapper {
    
    @Mapping(source = "username", target = "username")
    @Mapping(source = "password", target = "password")
    Users toEntity(LoginUserDto loginUserDto);

    LoginUserDto toDto(Users user);
}
