package com.example.demo.controller;

import com.example.demo.pojo.GroundPojo;
import com.example.demo.repository.GroundRepository;
import com.example.demo.service.GroundService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ground")
@RequiredArgsConstructor

public class GroundController {
    private final GroundService groundService;
    @PostMapping("/save")

    public void save(@RequestBody GroundPojo groundPojo){

        this.groundService.saveData(groundPojo);

    }
}
























