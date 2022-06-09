package com.example.users.service.impl;

import com.example.users.model.Role;
import com.example.users.repository.RoleRepository;
import com.example.users.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleRepository roleRepository;





    @Override
    public Role findById(Long id) {
        return roleRepository.getById(id);
    }
}
