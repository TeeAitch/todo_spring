package com.eco.todo.dto.user;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class RegisterUserDto {
    @NotBlank(message = "{user.username.required}")
    private String username;
    @NotBlank(message = "firstname is Required")
    private String firstName;
    @NotBlank(message = "lastname is Required")
    private String lastName;
    @NotBlank(message = "password is Required")
    private String password;
    @NotBlank(message = "birthday is Required")
    private LocalDate birthday;
    @NotBlank(message = "email is Required")
    private String email;
}