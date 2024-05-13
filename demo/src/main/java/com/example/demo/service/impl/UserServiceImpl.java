package com.example.demo.service.impl;

import com.example.demo.entity.User;
import com.example.demo.pojo.UserPojo;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Repository
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRespository;

    @Override
    public void saveUser(UserPojo userPojo) {
        User user = new User() ;
        user.setId(userPojo.getId());
        user.setName(userPojo.getUsername());
        userRespository.save(user) ;
    }

    @Override
    public List<User> getAll() {
        return userRespository.findAll();
    }
}
