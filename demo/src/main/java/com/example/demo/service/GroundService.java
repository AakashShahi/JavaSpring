package com.example.demo.service;

import com.example.demo.entity.Ground;
import com.example.demo.pojo.GroundPojo;

import java.util.List;
import java.util.Optional;

public interface GroundService {
    void saveData(GroundPojo groundPojo);
    Optional<Ground> findById(Integer id);
    boolean deletedById(Integer id);
    List<Ground> getAll();
}