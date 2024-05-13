package com.example.demo.controller;

import com.example.demo.entity.Ground;
import com.example.demo.pojo.GroundPojo;
import com.example.demo.service.GroundService;
import com.example.demo.shared.pojo.GlobalApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ground")
@RequiredArgsConstructor
public class GroundController {
    private final GroundService groundService;
//    @GetMapping("/get")
//    public List<Ground> getData(){
//        return this.groundService.getAll();
//    }
//
    @PostMapping("/save")

    public void save(@RequestBody GroundPojo groundPojo){

        this.groundService.saveData(groundPojo);
    }

    @DeleteMapping("/delete/(id)")
    public ResponseEntity<String> deleteData(@PathVariable Integer id){
        boolean deleted= this.groundService.deletedById(id);
        if(deleted){
            return ResponseEntity.ok("Ground with ID"+id+" has been deleted.");
        }
        else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Ground with ID"+id+"not found");
        }
    }

    @GetMapping
    public GlobalApiResponse<List<Ground>> getData(){
        return GlobalApiResponse.<List<Ground>>builder().data(this.groundService.getAll()).statusCode(200).message("data retreived sucessfully").build();
    }

}