package com.eco.todo.dto.user;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class LoginUserDto {
    @NotBlank(message = "{user.username.required}")
    private String username;
    @NotBlank(message = "{user.password.required}")
    private String password;
}
