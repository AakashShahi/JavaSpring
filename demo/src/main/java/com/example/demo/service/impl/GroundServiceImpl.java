package com.example.demo.service.impl;

import com.example.demo.entity.Ground;
import com.example.demo.pojo.GroundPojo;
import com.example.demo.repository.GroundRepository;
import com.example.demo.service.GroundService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class GroundServiceImpl implements GroundService {

    private final GroundRepository groundRepository;


    @Override
    public void saveData(GroundPojo groundPojo) {
        Ground ground = new Ground();
        ground.setId(groundPojo.getId());
        ground.setGroundName(groundPojo.getGroundName());
        groundRepository.save(ground);
    }
}
