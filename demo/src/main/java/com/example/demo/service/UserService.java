package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.pojo.UserPojo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserService {
        void saveUser(UserPojo userPojo) ;
        List<User> getAll() ;
}
