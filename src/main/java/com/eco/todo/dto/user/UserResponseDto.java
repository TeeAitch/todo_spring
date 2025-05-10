package com.eco.todo.dto.user;

import java.time.LocalDate;
import java.util.UUID;

import lombok.Data;

@Data
public class UserResponseDto {
    private UUID id;
    private String username;
    private String firstName;
    private String lastName;
    private String password;
    private LocalDate birthday;
    private String email;
    private String role;
}
