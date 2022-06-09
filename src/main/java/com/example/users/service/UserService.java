package com.example.users.service;

import com.example.users.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;
import java.util.Optional;

public interface UserService extends UserDetailsService {

    public  List<User> findAll();


    User save(User user);

    Optional<User> findById(Long id);

    void delete(Long id);
}
