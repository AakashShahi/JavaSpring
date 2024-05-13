package com.example.demo.service.impl;

import com.example.demo.entity.Role;
import com.example.demo.pojo.RolePojo;
import com.example.demo.repository.RoleRepository;
import com.example.demo.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Repository
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService {
    private  final RoleRepository roleRespository ;
    @Override
    public List<Role> findAll() {
        return List.of();
    }

    @Override
    public Role findById(Integer id) {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }

    public Role saveData(RolePojo rolePojo){
        Role role  = new Role() ;
        role.setRoleName(rolePojo.getRoleName()); ;
        role.setRoleType(rolePojo.getRoleType()); ;
        roleRespository.save(role) ;
        return role;
    }
}