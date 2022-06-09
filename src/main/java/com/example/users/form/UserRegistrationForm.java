package com.example.users.form;

import lombok.*;

@Data
@Builder
public class UserRegistrationForm {
    private Long id;
    private String username;
    private String password;
}
