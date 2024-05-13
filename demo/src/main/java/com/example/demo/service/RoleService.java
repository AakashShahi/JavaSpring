package com.example.demo.service;

import com.example.demo.entity.Role;
import com.example.demo.pojo.RolePojo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleService {
    Role saveData(RolePojo rolePojo) ;
    List<Role> findAll();
    Role findById(Integer id);
    void deleteById(Integer id);
}
