package com.example.demo.service.impl;

import com.example.demo.entity.Ground;
import com.example.demo.pojo.GroundPojo;
import com.example.demo.repository.GroundRepository;
import com.example.demo.service.GroundService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public List<Ground> getAll() {
        return groundRepository.findAll();
    }

    @Override
    public Optional<Ground> findById(Integer id){
        return groundRepository.findById(id);
    }

    @Override
    public boolean deletedById(Integer id) {
        groundRepository.deleteById(id);
        return false;
    }

}
