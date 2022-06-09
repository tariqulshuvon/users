package com.example.users.model;

import lombok.Getter;

public enum UserRole {
    ADMIN(1L, "ADMIN"),
    USER(2L, "USER");

    @Getter
    private Long id;

    @Getter
    private String name;

    UserRole(Long id, String name) {

        this.id = id;
        this.name = name;
    }
}
